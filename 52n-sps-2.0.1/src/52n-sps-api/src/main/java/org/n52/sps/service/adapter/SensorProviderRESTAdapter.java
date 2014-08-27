/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.service.adapter;

import net.opengis.swes.x20.DescribeSensorResponseDocument;

import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;

/**
 * Adapter interface for REST calls to SensorProvider service
 */
public interface SensorProviderRESTAdapter {

	public DescribeSensorResponseDocument describeSensor(String procedure)
			throws OwsException, OwsExceptionReport;
}
