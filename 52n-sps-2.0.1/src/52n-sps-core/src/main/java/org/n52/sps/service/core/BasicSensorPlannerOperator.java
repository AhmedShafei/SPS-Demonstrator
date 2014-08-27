/**
 * Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */

package org.n52.sps.service.core;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import net.opengis.ows.x11.OperationDocument.Operation;
import net.opengis.ows.x11.OperationsMetadataDocument.OperationsMetadata;
import net.opengis.sps.x20.CapabilitiesDocument;
import net.opengis.sps.x20.CapabilitiesType;
import net.opengis.sps.x20.DescribeResultAccessDocument;
import net.opengis.sps.x20.DescribeResultAccessResponseDocument;
import net.opengis.sps.x20.DescribeResultAccessResponseType;
import net.opengis.sps.x20.DescribeResultAccessType.Target;
import net.opengis.sps.x20.DescribeTaskingDocument;
import net.opengis.sps.x20.DescribeTaskingResponseDocument;
import net.opengis.sps.x20.DescribeTaskingResponseType;
import net.opengis.sps.x20.DescribeTaskingResponseType.TaskingParameters;
import net.opengis.sps.x20.GetCapabilitiesDocument;
import net.opengis.sps.x20.GetCapabilitiesType;
import net.opengis.sps.x20.GetStatusDocument;
import net.opengis.sps.x20.GetStatusResponseDocument;
import net.opengis.sps.x20.GetStatusResponseType;
import net.opengis.sps.x20.GetTaskDocument;
import net.opengis.sps.x20.GetTaskResponseDocument;
import net.opengis.sps.x20.GetTaskResponseType;
import net.opengis.sps.x20.GetTaskResponseType.Task;
import net.opengis.sps.x20.GetTaskType;
import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.sps.x20.SubmitDocument;
import net.opengis.sps.x20.SubmitResponseDocument;
import net.opengis.sps.x20.SubmitResponseType;
import net.opengis.swe.x20.AbstractDataComponentType;
import net.opengis.swes.x20.ExtensibleRequestType;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.n52.ows.exception.OptionNotSupportedException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.ows.service.binding.HttpBinding;
import org.n52.oxf.swes.exception.RequestExtensionNotSupportedException;
import org.n52.sps.sensor.SensorPlugin;
import org.n52.sps.sensor.StatusReportGenerator;
import org.n52.sps.sensor.model.SensorConfiguration;
import org.n52.sps.sensor.model.SensorTask;
import org.n52.sps.service.SpsOperator;
import org.n52.sps.service.adapter.RestURIConstant;
import org.n52.sps.tasking.SubmitTaskingRequest;
import org.n52.sps.util.xmlbeans.XmlHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicSensorPlannerOperator extends SpsOperator implements
		BasicSensorPlanner {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BasicSensorPlannerOperator.class);

	public DescribeResultAccessResponseDocument describeResultAccess(
			DescribeResultAccessDocument describeResultAccess)
			throws OwsException, OwsExceptionReport {
		LOGGER.debug("describeResultAccess: {}",
				describeResultAccess.xmlText(XmlHelper.DEBUG_OPTIONS));
		checkSupportingSwesRequestExtensions(describeResultAccess
				.getExtensibleRequest());
		DescribeResultAccessResponseDocument responseDocument = DescribeResultAccessResponseDocument.Factory
				.newInstance();
		DescribeResultAccessResponseType resultAccessResponse = responseDocument
				.addNewDescribeResultAccessResponse();
		Target target = describeResultAccess.getDescribeResultAccess()
				.getTarget();
		if (target.isSetProcedure()) {
			SensorPlugin sensor = getSensorInstance(target.getProcedure());
			resultAccessResponse.setAvailability(sensor
					.getResultAccessibility());
		} else {
			SensorTask sensorTask = getSensorTask(target.getTask());
			SensorPlugin sensor = getSensorInstance(sensorTask.getProcedure());
			resultAccessResponse.setAvailability(sensor
					.getResultAccessibilityFor(sensorTask));
		}
		return responseDocument;
	}

	public DescribeTaskingResponseDocument describeTasking(
			DescribeTaskingDocument describeTasking) throws OwsException,
			OwsExceptionReport {
		LOGGER.debug("describeTasking: {}",
				describeTasking.xmlText(XmlHelper.DEBUG_OPTIONS));
		checkSupportingSwesRequestExtensions(describeTasking
				.getExtensibleRequest());
		String procedure = describeTasking.getDescribeTasking().getProcedure();
		SensorPlugin sensorPlugin = getSensorInstance(procedure);
		SensorConfiguration sensorConfiguration = sensorPlugin
				.getSensorConfiguration();
		AbstractDataComponentType taskingParametersTemplate = sensorConfiguration
				.getTaskingParametersTemplate();
		DescribeTaskingResponseDocument responseDocument = DescribeTaskingResponseDocument.Factory
				.newInstance();
		DescribeTaskingResponseType describeTaskingResponse = responseDocument
				.addNewDescribeTaskingResponse();
		TaskingParameters taskingParameters = describeTaskingResponse
				.addNewTaskingParameters();
		taskingParameters.setAbstractDataComponent(taskingParametersTemplate);
		taskingParameters.setName(taskingParametersTemplate.getIdentifier());
		sensorPlugin.qualifyDataComponent(taskingParameters
				.getAbstractDataComponent());
		XmlCursor cursor = responseDocument.getDescribeTaskingResponse()
				.getTaskingParameters().getAbstractDataComponent().newCursor();
		insertInterconnectedResource(cursor, RestURIConstant.SUBMIT,
				BasicSensorPlanner.SUBMIT, true);
		return responseDocument;
	}

	public CapabilitiesDocument getCapabilities(
			GetCapabilitiesDocument getCapabilities) throws OwsException,
			OwsExceptionReport {
		LOGGER.debug("getCapabilities: {}",
				getCapabilities.xmlText(XmlHelper.DEBUG_OPTIONS));
		return handleGetCapabilitiesRequest(getCapabilities
				.getGetCapabilities2());
	}

	private CapabilitiesDocument handleGetCapabilitiesRequest(
			GetCapabilitiesType getCapabilities) throws OwsException {
		checkSupportingSpsRequestExtensions(getCapabilities.getExtensionArray());
		return CapabilitiesHelper
				.createSpsCapabilities(getSensorInstanceProvider());
	}

	public GetStatusResponseDocument getStatus(GetStatusDocument getStatus)
			throws OwsException, OwsExceptionReport {
		LOGGER.debug("getStatus: {}",
				getStatus.xmlText(XmlHelper.DEBUG_OPTIONS));
		checkSupportingSwesRequestExtensions(getStatus.getExtensibleRequest());
		String sensorTaskId = getStatus.getGetStatus().getTask();
		SensorTask sensorTask = getSensorTask(sensorTaskId);

		if (getStatus.getGetStatus().isSetSince()) {
			// REQ 55:
			// http://www.opengis.net/spec/SPS/2.0/req/GetStatus/service-metadata/since-parameter
			throw new OptionNotSupportedException("since");

			// if state logging shall be supported we have to make sure that
			// each state transistion
			// is been stored in the task repository
		}

		StatusReportGenerator statusReporter = StatusReportGenerator
				.createFor(sensorTask);
		GetStatusResponseDocument responseDocument = GetStatusResponseDocument.Factory
				.newInstance();
		GetStatusResponseType statusResponse = responseDocument
				.addNewGetStatusResponse();
		statusResponse.addNewStatus().setStatusReport(
				statusReporter.generateWithoutTaskingParameters());
		String resource = RestURIConstant.DESCRIBE_TASK_RESULT_ACCESS.replace(
				"{taskId}", sensorTaskId);
		XmlCursor cursor = responseDocument.getGetStatusResponse()
				.getStatusArray(0).getStatusReport().newCursor();
		insertInterconnectedResource(cursor, resource,
				BasicSensorPlanner.DESCRIBE_TASK_RESULT_ACCESS, true);
		return responseDocument;
	}

	public GetTaskResponseDocument getTask(GetTaskDocument getTask)
			throws OwsException, OwsExceptionReport {
		LOGGER.debug("getTask: {}", getTask.xmlText(XmlHelper.DEBUG_OPTIONS));
		checkSupportingSwesRequestExtensions(getTask.getExtensibleRequest());
		OwsExceptionReport owsExceptionReport = new OwsExceptionReport();
		GetTaskResponseDocument responseDocument = GetTaskResponseDocument.Factory
				.newInstance();
		GetTaskResponseType getTaskResponse = responseDocument
				.addNewGetTaskResponse();
		GetTaskType getTaskType = getTask.getGetTask();
		for (String taskId : getTaskType.getTaskArray()) {
			Task task = getTaskResponse.addNewTask();
			handleTaskContent(taskId, task, owsExceptionReport);
		}
		if (owsExceptionReport.containsExceptions()) {
			throw owsExceptionReport;
		}
		String resource = RestURIConstant.DESCRIBE_TASK_RESULT_ACCESS.replace(
				"{taskId}", getTaskType.getTaskArray(0));
		XmlCursor cursor = responseDocument.getGetTaskResponse()
				.getTaskArray(0).getTask().getStatusArray(0).getStatusReport()
				.newCursor();
		insertInterconnectedResource(cursor, resource,
				BasicSensorPlanner.DESCRIBE_TASK_RESULT_ACCESS, true);
		return responseDocument;
	}

	private void handleTaskContent(String taskId, Task task,
			OwsExceptionReport owsExceptionReport) {
		try {
			SensorTask sensorTask = getSensorTask(taskId);
			task.setTask(sensorTask.getTask());
		} catch (OwsException e) {
			owsExceptionReport.addOwsException(e);
		}
	}

	public SubmitResponseDocument submit(SubmitDocument submit)
			throws OwsException, OwsExceptionReport {
		LOGGER.debug("submit: {}", submit.xmlText(XmlHelper.DEBUG_OPTIONS));
		checkSupportingSwesRequestExtensions(submit.getExtensibleRequest());
		String procedure = submit.getSubmit().getProcedure();
		SensorPlugin sensor = getSensorInstance(procedure);
		SubmitTaskingRequest taskingRequest = new SubmitTaskingRequest(submit);
		SensorTask submitTask = sensor.submit(taskingRequest,
				new OwsExceptionReport());
		sensor.getSensorTaskService().updateSensorTask(submitTask);
		return createSubmitResponse(submitTask);
	}

	private SubmitResponseDocument createSubmitResponse(SensorTask submitTask)
			throws StatusInformationExpiredException {
		SubmitResponseDocument responseDocument = SubmitResponseDocument.Factory
				.newInstance();
		SubmitResponseType submitResponse = responseDocument
				.addNewSubmitResponse();
		StatusReportGenerator statusReporter = StatusReportGenerator
				.createFor(submitTask);
		submitResponse.addNewResult().setStatusReport(
				statusReporter.generateWithoutTaskingParameters());
		String taskId = submitResponse.getResult().getStatusReport().getTask();
		String resource = RestURIConstant.GET_TASK.replace("{taskId}", taskId);
		XmlCursor cursor = responseDocument.getSubmitResponse().getResult()
				.newCursor();
		insertInterconnectedResource(cursor, resource,
				BasicSensorPlanner.GET_TASK, true);
		return responseDocument;
	}

	public void updateSensorTaskStatus(StatusReportDocument statusReport)
			throws OwsException {
		LOGGER.debug("updateSensorTaskStatus: {}",
				statusReport.xmlText(XmlHelper.DEBUG_OPTIONS));
		String sensorTaskId = statusReport.getStatusReport().getTask();
		SensorTask sensorTask = getSensorTask(sensorTaskId);
		String procedure = statusReport.getStatusReport().getProcedure();
		SensorPlugin sensor = getSensorInstance(procedure);
		sensor.updateSensorTaskStatus(sensorTask, statusReport);
	}

	public void interceptCapabilities(CapabilitiesType capabilities,
			List<HttpBinding> httpBindings) {
		capabilities.getServiceIdentification().addNewProfile()
				.setStringValue(CORE_CONFORMANCE_CLASS);
		OperationsMetadata operationsMetadata = getOperationsMetadata(capabilities);
		addGetCapabilitiesOperation(operationsMetadata, httpBindings);
		addDescribeTaskingOperation(operationsMetadata, httpBindings);
		addSubmitOperation(operationsMetadata, httpBindings);
		addDescribeTaskResultAccessOperation(operationsMetadata, httpBindings);
		addDescribeSensorResultAccessOperation(operationsMetadata, httpBindings);
		addGetTaskOperation(operationsMetadata, httpBindings);
		addGetStatusOperation(operationsMetadata, httpBindings);
	}

	// A.S: For each operation in the GetCapabilities request, set HTTP METHOD +
	// REST URI
	private void addGetCapabilitiesOperation(
			OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation getCapabilitiesOperation = operationsMetadata
				.addNewOperation();
		getCapabilitiesOperation.setName(GET_CAPABILITIES);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.GET_CAPABILITIES);
		addSupportedBindings(getCapabilitiesOperation, httpBindings);
	}

	private void addDescribeTaskingOperation(
			OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation describeTaskingOperation = operationsMetadata
				.addNewOperation();
		describeTaskingOperation.setName(DESCRIBE_TASKING);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.DESCRIBE_TASKING);
		addSupportedBindings(describeTaskingOperation, httpBindings);
	}

	private void addSubmitOperation(OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation submitOperation = operationsMetadata.addNewOperation();
		submitOperation.setName(SUBMIT);
		httpBindings.get(0).setHttpMethod(HttpPost.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.SUBMIT);
		addSupportedBindings(submitOperation, httpBindings);
	}

	private void addDescribeTaskResultAccessOperation(
			OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation describeResultAccessOperation = operationsMetadata
				.addNewOperation();
		describeResultAccessOperation.setName(DESCRIBE_TASK_RESULT_ACCESS);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.DESCRIBE_TASK_RESULT_ACCESS);
		addSupportedBindings(describeResultAccessOperation, httpBindings);
	}

	private void addDescribeSensorResultAccessOperation(
			OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation describeResultAccessOperation = operationsMetadata
				.addNewOperation();
		describeResultAccessOperation.setName(DESCRIBE_SENSOR_RESULT_ACCESS);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.DESCRIBE_SENSOR_RESULT_ACCESS);
		addSupportedBindings(describeResultAccessOperation, httpBindings);
	}

	private void addGetTaskOperation(OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation getTaskOperation = operationsMetadata.addNewOperation();
		getTaskOperation.setName(GET_TASK);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.GET_TASK);
		addSupportedBindings(getTaskOperation, httpBindings);
	}

	private void addGetStatusOperation(OperationsMetadata operationsMetadata,
			List<HttpBinding> httpBindings) {
		Operation getStatusOperation = operationsMetadata.addNewOperation();
		getStatusOperation.setName(GET_STATUS);
		httpBindings.get(0).setHttpMethod(HttpGet.METHOD_NAME);
		httpBindings.get(0).setExternalDcpUrl(
				"http://" + getInetAddress() + ":8080/sps/rest"
						+ RestURIConstant.GET_STATUS);
		addSupportedBindings(getStatusOperation, httpBindings);
	}

	@Override
	public boolean isSupportingExtensions() {
		return false;
	}

	@Override
	protected void checkSupportingSpsRequestExtensions(XmlObject[] extensions) {
		OwsExceptionReport owsExceptionReport = new OwsExceptionReport();
		if (extensions != null && extensions.length > 0) {
			for (XmlObject extension : extensions) {
				RequestExtensionNotSupportedException e = new RequestExtensionNotSupportedException();
				e.addExceptionText("RequestExtension is not supported: "
						+ extension.xmlText());
				owsExceptionReport.addOwsException(e);
			}
		}
	}

	private void insertInterconnectedResource(XmlCursor cursor,
			String resource, String title, boolean includeNameSpace) {
		if (includeNameSpace) {
			cursor.insertNamespace("xlink", "http://www.w3.org/1999/xlink");
			cursor.insertNamespace("xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
		}
		String link = "http://" + getInetAddress() + ":8080/sps/rest"
				+ resource;
		cursor.insertAttributeWithValue("link", "http://www.w3.org/1999/xlink",
				link);
		cursor.insertAttributeWithValue("title",
				"http://www.w3.org/1999/xlink", title);
		cursor.dispose();
	}

	// A.S: GET Server Global IP Address
	private String getInetAddress() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "localhost";
		}
	}

	@Override
	protected void checkSupportingSwesRequestExtensions(
			ExtensibleRequestType extensibleRequest) throws OwsExceptionReport {
		if (extensibleRequest != null) {
			// operator does not support any extension
			OwsExceptionReport owsExceptionReport = new OwsExceptionReport();
			owsExceptionReport
					.addOwsException(new RequestExtensionNotSupportedException());
			throw owsExceptionReport;
		}
	}
}
