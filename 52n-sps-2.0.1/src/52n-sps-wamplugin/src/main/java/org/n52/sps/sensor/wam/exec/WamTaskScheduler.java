/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wam.exec;

import org.n52.ows.exception.InvalidParameterValueException;
import org.n52.sps.sensor.SensorTaskService;
import org.n52.sps.sensor.model.SensorTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scheduler responsible for updating Status of WAM tasks delegates
 */
public class WamTaskScheduler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(WamTaskScheduler.class);

	private SensorTask currentSensorTask;
	private SensorTaskService sensorTaskService;

	public WamTaskScheduler(SensorTaskService sensorTaskService) {
		this.sensorTaskService = sensorTaskService;
	}

	public boolean schedule(SensorTask sensorTask) {
		currentSensorTask = getUpdatedSensorTask(currentSensorTask);
		boolean schedulingPossible = isSchedulingPossible();
		if (schedulingPossible) {
			currentSensorTask = sensorTask;
			LOGGER.info("Executing task: {}", sensorTask);
		} else {
			sensorTask.addStatusMessage("Sensor is currently in execution.");
		}

		return schedulingPossible;
	}

	private SensorTask getUpdatedSensorTask(SensorTask sensorTask) {
		try {
			return sensorTaskService.getSensorTask(sensorTask.getTaskId());
		} catch (Exception e) {
			return null;
		}
	}

	private boolean isSchedulingPossible() {
		return currentSensorTask == null || !currentSensorTask.isExecuting();
	}

	public void cancel(String taskId) {
		// TODO cancel running simulation in case of a task with higher priority
	}
}