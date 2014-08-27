/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.delegate.sps;

import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;
import org.n52.delegate.DelegationHandler;
import org.n52.ows.exception.NoApplicableCodeException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.SensorPlanningService;
import org.n52.sps.service.adapter.BasicSensorPlannerRESTAdapter;
import org.n52.sps.service.adapter.BasicSensorPlannerRESTAdapterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegator to dispatch incoming XML requests to the appropriate operation
 * handler of the {@link SensorPlanningService}. No validation takes place, so
 * if you want to only delegate validated requests decorate it with an
 * {@link SPSXmlValidationDelegate}.
 * 
 * @see SPSXmlValidationDelegate
 */
public class SPSXmlDelegate implements DelegationHandler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(SPSXmlDelegate.class);

	private SensorPlanningService service;

	private XmlObject request;

	public SPSXmlDelegate(SensorPlanningService service, XmlObject request) {
		this.service = service;
		this.request = request;
	}

	XmlObject getRequest() {
		return request;
	}

	SensorPlanningService getService() {
		return service;
	}

	public XmlObject delegate() throws OwsException, OwsExceptionReport {
		SchemaType schemaType = request.schemaType();

		BasicSensorPlannerRESTAdapter basicSensorPlannerRESTAdapter = new BasicSensorPlannerRESTAdapterImpl(
				service.getBasicSensorPlanner());

		if (schemaType == SubmitDocument.type) {
			SubmitDocument submit = (SubmitDocument) request;
			return basicSensorPlannerRESTAdapter.submit(submit);
		} else if (schemaType == StatusReportDocument.type) {
			StatusReportDocument statusReport = (StatusReportDocument) request;
			basicSensorPlannerRESTAdapter.updateSensorTaskStatus(statusReport);
			return null;
		} else {
			LOGGER.error("No delegation handler for '{}' request.", schemaType);
			throw new NoApplicableCodeException(OwsException.BAD_REQUEST);
		}
	}
}