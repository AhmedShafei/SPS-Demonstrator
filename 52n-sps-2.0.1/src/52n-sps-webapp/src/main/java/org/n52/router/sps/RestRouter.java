/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.router.sps;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.input.AutoCloseInputStream;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.n52.delegate.DelegationHandler;
import org.n52.delegate.KeyValuePairsWrapper;
import org.n52.delegate.gateway.GatewayKeyValuePairsDelegate;
import org.n52.delegate.gateway.GatewayXmlDelegate;
import org.n52.delegate.gateway.GatewayXmlValidationDelegate;
import org.n52.delegate.sps.SPSKeyValuePairsDelegate;
import org.n52.delegate.sps.SPSXmlDelegate;
import org.n52.delegate.sps.SPSXmlValidationDelegate;
import org.n52.ows.exception.NoApplicableCodeException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.oxf.swes.exception.InvalidRequestException;
import org.n52.sps.service.SensorPlanningService;
import org.n52.sps.service.admin.SpsAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;
import org.x52North.schemas.sps.v2.InsertSensorOfferingDocument;

/**
 * Router to route incoming REST requests to the appropriate SPS or gateway
 * delegates
 */
public class RestRouter {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RestRouter.class);

	private SensorPlanningService service;
	private HttpServletResponse response;
	private ModelAndView mav;
	private XmlObject xmlRequest;
	private XmlObject xmlResponse;
	private OwsExceptionReport exceptionReport;

	public RestRouter(SensorPlanningService service,
			HttpServletResponse response) {
		this.service = service;
		this.response = response;
		mav = new ModelAndView("xmlview", "response", null);
		exceptionReport = new OwsExceptionReport();
	}

	public SensorPlanningService getService() {
		return service;
	}

	public OwsExceptionReport getExceptionReport() {
		return exceptionReport;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public XmlObject getXmlResponse() {
		return xmlResponse;
	}

	public ModelAndView getMav() {
		return mav;
	}

	public XmlObject getXmlRequest() {
		return xmlRequest;
	}

	public void setXmlRequest(XmlObject xmlRequest) {
		this.xmlRequest = xmlRequest;
	}

	public void addResponseToMAV(XmlObject xmlResponse) {
		if (exceptionReport.getOwsExceptionsArray().length == 0) {
			mav.addObject(xmlResponse);
			response.setStatus(HttpStatus.OK.value());
		}
	}

	public ModelAndView delegateInsertRequestToSPSAdmin(InputStream payload) {
		try {
			xmlRequest = parseIncomingXmlObject(payload);
			if (!service.isSpsAdminAvailable()) {
				LOGGER.error("register (SensorOffering)");
				throw new NoApplicableCodeException(OwsException.BAD_REQUEST);
			} else {
				if (xmlRequest.schemaType() != InsertSensorOfferingDocument.type) {
					throw new InvalidRequestException(
							"Sent XML is not of type InsertSensorOffering.");
				}
				SpsAdmin spsAdminOperator = service.getSpsAdmin();
				String procedure = spsAdminOperator.insertSensorOffering(
						(InsertSensorOfferingDocument) xmlRequest,
						exceptionReport);
				mav.addObject(getSuccessResponse(procedure));
				response.setStatus(HttpStatus.OK.value());
			}
		} catch (XmlException e) {
			LOGGER.error("Could not parse request.", e);
			exceptionReport.addOwsException(new InvalidRequestException(e
					.getMessage()));
		} catch (IOException e) {
			LOGGER.error("Could not read request.", e);
			int code = HttpStatus.INTERNAL_SERVER_ERROR.value();
			exceptionReport
					.addOwsException(new NoApplicableCodeException(code));
		} catch (OwsException e) {
			LOGGER.error("Could not handle POST request.", e);
			exceptionReport.addOwsException(e);
		} catch (Throwable e) {
			LOGGER.error("Unexpected Error occured.", e);
			int code = HttpStatus.INTERNAL_SERVER_ERROR.value();
			exceptionReport
					.addOwsException(new NoApplicableCodeException(code));
		}
		return mav;
	}

	public void delegateGETRequestToSPS(KeyValuePairsWrapper parameters) {
		DelegationHandler spsKVPDelegate = new SPSKeyValuePairsDelegate(
				service, parameters);
		this.handleGetRequestDelegation(spsKVPDelegate);
	}

	public void delegateGETRequestToGateway(KeyValuePairsWrapper parameters) {
		DelegationHandler gatewayKVPDelegate = new GatewayKeyValuePairsDelegate(
				service, parameters);
		this.handleGetRequestDelegation(gatewayKVPDelegate);
	}

	public void delegatePostRequestToSPS(InputStream payload) {
		try {
			xmlRequest = parseIncomingXmlObject(payload);
			DelegationHandler spsXMLDelegate = new SPSXmlValidationDelegate(
					new SPSXmlDelegate(service, xmlRequest));
			this.handlePostRequestDelegation(spsXMLDelegate);
		} catch (XmlException e) {
			LOGGER.error("Could not parse request.", e);
			exceptionReport.addOwsException(new InvalidRequestException(e
					.getMessage()));
		} catch (IOException e) {
			LOGGER.error("Could not read request.", e);
			int code = HttpStatus.INTERNAL_SERVER_ERROR.value();
			exceptionReport
					.addOwsException(new NoApplicableCodeException(code));
		}
		addResponseToMAV(xmlResponse);
	}

	public void delegatePostRequestToGateway(XmlObject xmlRequest) {
		this.xmlRequest = xmlRequest;
		DelegationHandler gatewayXMLDelegate = new GatewayXmlValidationDelegate(
				new GatewayXmlDelegate(service, xmlRequest));
		this.handlePostRequestDelegation(gatewayXMLDelegate);
	}

	private void handleGetRequestDelegation(DelegationHandler delegate) {
		try {
			xmlResponse = delegate.delegate();
		} catch (OwsException e) {
			LOGGER.info("Could not handle KVP request.", e);
			exceptionReport.addOwsException(e);
		} catch (OwsExceptionReport e) {
			LOGGER.info("Could not handle KVP request.", e);
			exceptionReport = e;
		} catch (Throwable e) {
			LOGGER.error("Internal exception occured!", e);
			exceptionReport.addOwsException(new NoApplicableCodeException(
					OwsException.INTERNAL_SERVER_ERROR));
		}
		addResponseToMAV(xmlResponse);
	}

	public void delegatePutRequestToSPS(InputStream payload) {
		try {
			xmlRequest = parseIncomingXmlObject(payload);
			DelegationHandler spsXMLDelegate = new SPSXmlDelegate(service,
					xmlRequest);
			this.handlePostRequestDelegation(spsXMLDelegate);
		} catch (XmlException e) {
			LOGGER.error("Could not parse request.", e);
			exceptionReport.addOwsException(new InvalidRequestException(e
					.getMessage()));
		} catch (IOException e) {
			LOGGER.error("Could not read request.", e);
			int code = HttpStatus.INTERNAL_SERVER_ERROR.value();
			exceptionReport
					.addOwsException(new NoApplicableCodeException(code));
		}
	}

	private void handlePostRequestDelegation(DelegationHandler delegate) {
		try {
			xmlResponse = delegate.delegate();
		} catch (XmlException e) {
			LOGGER.error("Could not parse request.", e);
			exceptionReport.addOwsException(new InvalidRequestException(e
					.getMessage()));
		} catch (OwsException e) {
			LOGGER.info("Could not handle POST request.", e);
			exceptionReport.addOwsException(e);
		} catch (OwsExceptionReport e) {
			LOGGER.info("Could not handle POST request.", e);
			exceptionReport = e;
		} catch (Throwable e) {
			LOGGER.error("Unknown exception occured!", e);
			exceptionReport.addOwsException(new NoApplicableCodeException(
					OwsException.INTERNAL_SERVER_ERROR));
		}
	}

	private XmlObject parseIncomingXmlObject(InputStream payload)
			throws XmlException, IOException {
		return XmlObject.Factory.parse(new AutoCloseInputStream(payload));
	}

	private XmlObject getSuccessResponse(String procedure) throws XmlException {
		XmlObject successResponse = XmlObject.Factory.newInstance();

		XmlCursor cursor = successResponse.newCursor();
		cursor.toNextToken();
		cursor.beginElement("Success");
		cursor.insertNamespace("xlink", "http://www.w3.org/1999/xlink");
		cursor.insertNamespace("xsi",
				"http://www.w3.org/2001/XMLSchema-instance");
		cursor.insertAttributeWithValue("link", "http://www.w3.org/1999/xlink",
				"http://localhost:8080/sps/rest/sensor/" + procedure
						+ "/taskings/");
		cursor.insertAttributeWithValue("title",
				"http://www.w3.org/1999/xlink", "DescribeTasking");
		cursor.dispose();
		return successResponse;
	}
}