/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.service.adapter;

import net.opengis.sps.x20.DescribeResultAccessDocument;
import net.opengis.sps.x20.DescribeResultAccessType;
import net.opengis.sps.x20.DescribeResultAccessType.Target;
import net.opengis.sps.x20.DescribeTaskingDocument;
import net.opengis.sps.x20.DescribeTaskingType;
import net.opengis.sps.x20.GetCapabilitiesDocument;
import net.opengis.sps.x20.GetStatusDocument;
import net.opengis.sps.x20.GetStatusType;
import net.opengis.sps.x20.GetTaskDocument;
import net.opengis.sps.x20.GetTaskType;
import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.XmlObject;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.core.BasicSensorPlanner;

/**
 * BasicSensorPlannerRestAdapter Implementation
 */
public class BasicSensorPlannerRESTAdapterImpl implements
		BasicSensorPlannerRESTAdapter {

	private BasicSensorPlanner basicSensorPlanner;

	public BasicSensorPlannerRESTAdapterImpl(
			BasicSensorPlanner basicSensorPlanner) {
		this.basicSensorPlanner = basicSensorPlanner;
	}

	public XmlObject describeTasking(String procedure) throws OwsException,
			OwsExceptionReport {
		DescribeTaskingDocument describeTasking = DescribeTaskingDocument.Factory
				.newInstance();
		DescribeTaskingType type = DescribeTaskingType.Factory.newInstance();
		type.setProcedure(procedure);
		describeTasking.setDescribeTasking(type);
		return basicSensorPlanner.describeTasking(describeTasking);
	}

	public XmlObject getStatus(String sensorTaskId) throws OwsException,
			OwsExceptionReport {
		GetStatusDocument getStatus = GetStatusDocument.Factory.newInstance();
		GetStatusType type = GetStatusType.Factory.newInstance();
		type.setTask(sensorTaskId);
		getStatus.setGetStatus(type);
		return basicSensorPlanner.getStatus(getStatus);
	}

	public XmlObject getTask(String sensorTaskId) throws OwsException,
			OwsExceptionReport {
		GetTaskDocument getTask = GetTaskDocument.Factory.newInstance();
		GetTaskType type = GetTaskType.Factory.newInstance();
		String[] taskArray = { sensorTaskId };
		type.setTaskArray(taskArray);
		getTask.setGetTask(type);
		return basicSensorPlanner.getTask(getTask);
	}

	public XmlObject describeTaskResultAccess(String taskId)
			throws OwsException, OwsExceptionReport {
		DescribeResultAccessDocument describeTaskResultAccess = DescribeResultAccessDocument.Factory
				.newInstance();
		DescribeResultAccessType type = DescribeResultAccessType.Factory
				.newInstance();
		Target target = Target.Factory.newInstance();
		target.setTask(taskId);
		type.setTarget(target);
		describeTaskResultAccess.setDescribeResultAccess(type);
		return basicSensorPlanner
				.describeResultAccess(describeTaskResultAccess);
	}

	public XmlObject describeSensorResultAccess(String procedureId)
			throws OwsException, OwsExceptionReport {
		DescribeResultAccessDocument describeTaskResultAccess = DescribeResultAccessDocument.Factory
				.newInstance();
		DescribeResultAccessType type = DescribeResultAccessType.Factory
				.newInstance();
		Target target = Target.Factory.newInstance();
		target.setProcedure(procedureId);
		type.setTarget(target);
		describeTaskResultAccess.setDescribeResultAccess(type);
		return basicSensorPlanner
				.describeResultAccess(describeTaskResultAccess);
	}

	public XmlObject getCapabilities(GetCapabilitiesDocument getCapabilities)
			throws OwsException, OwsExceptionReport {
		return basicSensorPlanner.getCapabilities(getCapabilities);
	}

	public XmlObject submit(SubmitDocument submit) throws OwsException,
			OwsExceptionReport {
		return basicSensorPlanner.submit(submit);
	}

	public void updateSensorTaskStatus(StatusReportDocument statusReport)
			throws OwsException {
		basicSensorPlanner.updateSensorTaskStatus(statusReport);
	}
}