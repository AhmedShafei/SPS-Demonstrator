/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.service.adapter;

import net.opengis.swes.x20.DescribeSensorDocument;
import net.opengis.swes.x20.DescribeSensorResponseDocument;
import net.opengis.swes.x20.DescribeSensorType;

import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.core.SensorProvider;

/**
 * SensorProviderRestAdapter Implementation
 */
public class SensorProviderRESTAdapterImpl implements SensorProviderRESTAdapter {
	private static final String sensorDescribtionFormat = "http://www.opengis.net/sensorML/1.0.1";

	private SensorProvider sensorProvider;

	public SensorProviderRESTAdapterImpl(SensorProvider sensorProvider) {
		this.sensorProvider = sensorProvider;
	}

	public DescribeSensorResponseDocument describeSensor(String procedure)
			throws OwsException, OwsExceptionReport {
		DescribeSensorDocument describeSensor = DescribeSensorDocument.Factory
				.newInstance();
		DescribeSensorType type = DescribeSensorType.Factory.newInstance();
		type.setProcedure(procedure);
		type.setProcedureDescriptionFormat(SensorProviderRESTAdapterImpl.sensorDescribtionFormat);
		describeSensor.setDescribeSensor(type);
		return sensorProvider.describeSensor(describeSensor);
	}
}