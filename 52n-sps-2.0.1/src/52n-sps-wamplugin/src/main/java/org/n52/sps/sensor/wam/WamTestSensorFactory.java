/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wam;

import org.n52.sps.sensor.SensorInstanceFactory;
import org.n52.sps.sensor.SensorPlugin;
import org.n52.sps.sensor.SensorTaskService;
import org.n52.sps.sensor.model.SensorConfiguration;
import org.n52.sps.service.InternalServiceException;

public class WamTestSensorFactory implements SensorInstanceFactory {

	public SensorPlugin createSensorPlugin(SensorTaskService sensorTaskService,
			SensorConfiguration sensorConfiguration)
			throws InternalServiceException {
		return new WamTestSensor(sensorTaskService, sensorConfiguration);
	}

	public String getPluginType() {
		return "WamMaintenanceSensor";
	}

}
