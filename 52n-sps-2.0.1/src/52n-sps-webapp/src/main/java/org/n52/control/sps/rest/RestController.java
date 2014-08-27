/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.control.sps.rest;

import java.io.InputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.sps.x20.SubmitDocument;
import net.opengis.sps.x20.SubmitResponseDocument;

import org.n52.control.sps.ServiceController;
import org.n52.delegate.KeyValuePairsWrapper;
import org.n52.ows.exception.OwsException;
import org.n52.ows.service.binding.HttpBinding;
import org.n52.ows.service.parameter.KeyValuePairParameter;
import org.n52.router.sps.RestRouter;
import org.n52.sps.service.InternalServiceException;
import org.n52.sps.service.SensorPlanningService;
import org.n52.sps.service.adapter.RestURIConstant;
import org.n52.sps.service.core.BasicSensorPlanner;
import org.n52.sps.service.core.SensorProvider;
import org.n52.sps.tasking.TaskingRequestStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * REST Interface controller
 */
@Controller
@RequestMapping(value = "/*")
public class RestController extends ServiceController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(RestController.class);

	@Autowired
	public RestController(SensorPlanningService service, HttpBinding httpBinding) {
		super(service, httpBinding);
		if (service.isSpsAdminAvailable()) {
			service.getSpsAdmin().setExtensionBinding(httpBinding);
		}
	}

	@RequestMapping(value = RestURIConstant.INSERT_SENSOROFFERING, method = RequestMethod.POST, headers = "content-type=application/xml; text/xml")
	public ModelAndView insertSensorOffering(InputStream payload,
			HttpServletResponse response) throws InternalServiceException {
		RestRouter restRouter = new RestRouter(service, response);
		ModelAndView mav = restRouter.delegateInsertRequestToSPSAdmin(payload);
		handleServiceExceptionReport(restRouter.getResponse(), mav,
				restRouter.getExceptionReport());
		response.setContentType("application/xml");
		LOGGER.debug(mav.toString());
		return mav;
	}

	@RequestMapping(value = RestURIConstant.GET_CAPABILITIES, method = RequestMethod.GET)
	private ModelAndView getCapabilities(
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.GET_CAPABILITIES);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.DESCRIBE_TASKING, method = RequestMethod.GET)
	private ModelAndView describeTasking(
			@PathVariable("procedureId") String procedureId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.DESCRIBE_TASKING);
		parameters.put("procedureId", procedureId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.DESCRIBE_SENSOR, method = RequestMethod.GET)
	private ModelAndView describeSensor(
			@PathVariable("procedureId") String procedureId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				SensorProvider.DESCRIBE_SENSOR);
		parameters.put("procedureId", procedureId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.GET_STATUS, method = RequestMethod.GET)
	private ModelAndView getStatus(@PathVariable("taskId") String taskId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.GET_STATUS);
		parameters.put("taskId", taskId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.GET_TASK, method = RequestMethod.GET)
	private ModelAndView getTask(@PathVariable("taskId") String taskId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.GET_TASK);
		parameters.put("taskId", taskId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.UPDATE_TASK_STATUS, method = RequestMethod.PUT)
	private void updateTaskStatus(InputStream payload,
			HttpServletResponse response, HttpServletRequest request) {
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegatePutRequestToSPS(payload);
		createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.DESCRIBE_TASK_RESULT_ACCESS, method = RequestMethod.GET)
	private ModelAndView describeTaskResultAccess(
			@PathVariable("taskId") String taskId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) throws OwsException {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.DESCRIBE_TASK_RESULT_ACCESS);
		parameters.put("taskId", taskId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.DESCRIBE_SENSOR_RESULT_ACCESS, method = RequestMethod.GET)
	private ModelAndView describeSensorResultAccess(
			@PathVariable("procedureId") String procedureId,
			@RequestParam Map<String, String> parameters,
			HttpServletResponse response) throws OwsException {
		parameters.put(KeyValuePairParameter.REQUEST.name(),
				BasicSensorPlanner.DESCRIBE_SENSOR_RESULT_ACCESS);
		parameters.put("procedureId", procedureId);
		KeyValuePairsWrapper kvpParser = new KeyValuePairsWrapper(parameters);
		RestRouter restRouter = new RestRouter(service, response);
		restRouter.delegateGETRequestToSPS(kvpParser);
		return createResponse(restRouter);
	}

	@RequestMapping(value = RestURIConstant.SUBMIT, method = RequestMethod.POST)
	private ModelAndView submit(InputStream payload,
			HttpServletResponse response, HttpServletRequest request)
			throws OwsException {
		// GET SPS SubmitResponseDocument
		RestRouter spsRestRouter = new RestRouter(service, response);
		spsRestRouter.delegatePostRequestToSPS(payload);

		// Check if SPS successfully created the SubmitResponseDocument and if
		// task Submit RequestStatus is accepted
		SubmitResponseDocument spsSubmitResponseDocument = (SubmitResponseDocument) spsRestRouter
				.getXmlResponse();
		if (spsRestRouter.getExceptionReport().getOwsExceptionsArray().length == 0
				&& isSubmitRequestAccepted(spsSubmitResponseDocument)) {
			// Submit request accepted, send it to the Gateway
			SubmitDocument spsSubmitRequestDocument = (SubmitDocument) spsRestRouter
					.getXmlRequest();
			return submitRequestToGateway(response, spsSubmitRequestDocument,
					spsSubmitResponseDocument);
		} else {
			return createResponse(spsRestRouter);
		}
	}

	private ModelAndView submitRequestToGateway(HttpServletResponse response,
			SubmitDocument spsSubmitRequestDocument,
			SubmitResponseDocument spsSubmitResponseDocument) {
		SubmitResponseDocument submitResponseDocument = null;

		// Create Gateway SubmitDocument
		SubmitDocument gatewaySubmitRequestDocument = createGatewaySubmitDocument(
				spsSubmitRequestDocument, spsSubmitResponseDocument);

		// GET Gateway StatusReportDocument
		RestRouter gatewayRestRouter = new RestRouter(service, response);
		gatewayRestRouter
				.delegatePostRequestToGateway(gatewaySubmitRequestDocument);

		// Check if Gateway successfully created the StatusReportDocument
		if (gatewayRestRouter.getExceptionReport().getOwsExceptionsArray().length == 0) {
			// Create SubmitResponseDocument
			StatusReportDocument gatewayStatusReportResponse = (StatusReportDocument) gatewayRestRouter
					.getXmlResponse();
			submitResponseDocument = createSubmitResponseDocument(
					spsSubmitResponseDocument, gatewayStatusReportResponse);
		}
		gatewayRestRouter.addResponseToMAV(submitResponseDocument);
		return createResponse(gatewayRestRouter);
	}

	private boolean isSubmitRequestAccepted(
			SubmitResponseDocument submitResponseDocument) {
		TaskingRequestStatus requestStatus = TaskingRequestStatus
				.getTaskingRequestStatus(submitResponseDocument
						.getSubmitResponse().getResult().getStatusReport()
						.getRequestStatus());
		return (requestStatus == TaskingRequestStatus.ACCEPTED);
	}

	private SubmitDocument createGatewaySubmitDocument(
			SubmitDocument gatewaySubmitDocument,
			SubmitResponseDocument spsSubmitResponseDocument) {
		String taskId = spsSubmitResponseDocument.getSubmitResponse()
				.getResult().getStatusReport().getTask();
		gatewaySubmitDocument.getSubmit().setProcedure(taskId);
		return gatewaySubmitDocument;
	}

	private SubmitResponseDocument createSubmitResponseDocument(
			SubmitResponseDocument SPSSubmitResponseDocument,
			StatusReportDocument gatewayStatusReportResponse) {
		// SET taskStatus
		SPSSubmitResponseDocument
				.getSubmitResponse()
				.getResult()
				.getStatusReport()
				.setTaskStatus(
						gatewayStatusReportResponse.getStatusReport()
								.getTaskStatus());
		// SET updateTime
		SPSSubmitResponseDocument
				.getSubmitResponse()
				.getResult()
				.getStatusReport()
				.setUpdateTime(
						gatewayStatusReportResponse.getStatusReport()
								.getUpdateTime());

		// SET percentCompletion
		SPSSubmitResponseDocument
				.getSubmitResponse()
				.getResult()
				.getStatusReport()
				.setPercentCompletion(
						gatewayStatusReportResponse.getStatusReport()
								.getPercentCompletion());

		// SET estimatedToC
		SPSSubmitResponseDocument
				.getSubmitResponse()
				.getResult()
				.getStatusReport()
				.setEstimatedToC(
						gatewayStatusReportResponse.getStatusReport()
								.getEstimatedToC());

		return SPSSubmitResponseDocument;
	}

	private ModelAndView createResponse(RestRouter restRouter) {
		ModelAndView mav = restRouter.getMav();
		handleServiceExceptionReport(restRouter.getResponse(), mav,
				restRouter.getExceptionReport());
		LOGGER.debug(mav.toString());
		return mav;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	}
}