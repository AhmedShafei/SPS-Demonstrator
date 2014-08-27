/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.service.adapter;

import net.opengis.sps.x20.GetCapabilitiesDocument;
import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.XmlObject;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;

/**
 * Adapter interface for REST calls to BasicSensorPlanner service
 */
public interface BasicSensorPlannerRESTAdapter {

	public XmlObject describeTaskResultAccess(String taskId)
			throws OwsException, OwsExceptionReport;

	public XmlObject describeSensorResultAccess(String procedureId)
			throws OwsException, OwsExceptionReport;

	public XmlObject describeTasking(String procedure) throws OwsException,
			OwsExceptionReport;

	public XmlObject getStatus(String sensorTaskId) throws OwsException,
			OwsExceptionReport;

	public XmlObject getTask(String sensorTaskId) throws OwsException,
			OwsExceptionReport;

	public XmlObject getCapabilities(GetCapabilitiesDocument getCapabilities)
			throws OwsException, OwsExceptionReport;

	public XmlObject submit(SubmitDocument submit) throws OwsException,
			OwsExceptionReport;

	public void updateSensorTaskStatus(StatusReportDocument statusReport)
			throws OwsException;
}
