/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wos.exec;

import org.n52.sps.sensor.SensorTaskService;
import org.n52.sps.sensor.model.SensorTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Scheduler responsible for updating Status of WOS tasks delegates
 */
public class WosTaskScheduler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(WosTaskScheduler.class);

	private SensorTask currentSensorTask;
	private SensorTaskService sensorTaskService;

	public WosTaskScheduler(SensorTaskService sensorTaskService) {
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
			e.printStackTrace();
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