/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.service.adapter;

/**
 * REST Interface URIs
 */
public class RestURIConstant {
	public static final String GET_CAPABILITIES = "/capabilities/sps";
	public static final String DESCRIBE_TASKING = "/sensor/{procedureId}/taskings";
	public static final String DESCRIBE_SENSOR = "/sensor/{procedureId}/description";
	public static final String SUBMIT = "/task";
	public static final String DESCRIBE_TASK_RESULT_ACCESS = "/task/{taskId}/result";
	public static final String DESCRIBE_SENSOR_RESULT_ACCESS = "/sensor/{procedureId}/result";
	public static final String GET_STATUS = "/status/{taskId}";
	public static final String GET_TASK = "/task/{taskId}";
	public static final String INSERT_SENSOROFFERING = "/sensor";
	public static final String UPDATE_TASK_STATUS = "/task";

}
