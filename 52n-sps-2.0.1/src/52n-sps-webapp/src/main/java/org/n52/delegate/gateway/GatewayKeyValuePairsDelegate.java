/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.delegate.gateway;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.n52.adapter.gateway.GatewayAdapter;
import org.n52.adapter.gateway.GatewayAdapterImpl;
import org.n52.delegate.DelegationHandler;
import org.n52.delegate.KeyValuePairsWrapper;
import org.n52.ows.exception.InvalidParameterValueException;
import org.n52.ows.exception.OperationNotSupportedException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.ows.service.parameter.KeyValuePairParameter;
import org.n52.sps.service.SensorPlanningService;
import org.n52.sps.service.core.BasicSensorPlanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayKeyValuePairsDelegate implements DelegationHandler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(GatewayKeyValuePairsDelegate.class);

	private SensorPlanningService service;

	private KeyValuePairsWrapper kvpParser;

	public GatewayKeyValuePairsDelegate(SensorPlanningService service,
			KeyValuePairsWrapper kvpParser) {
		this.service = service;
		this.kvpParser = kvpParser;
	}

	public SensorPlanningService getService() {
		return service;
	}

	public XmlObject delegate() throws OwsException, OwsExceptionReport,
			XmlException {
		String request = kvpParser
				.getMandatoryParameterValue(KeyValuePairParameter.REQUEST
						.name());
		GatewayAdapter gatewayAdapter = new GatewayAdapterImpl();
		if (request.isEmpty()) {
			throw new InvalidParameterValueException(
					KeyValuePairParameter.REQUEST.name());
		}

		if (request.equalsIgnoreCase(BasicSensorPlanner.GET_STATUS)) {
			String taskId = kvpParser.getMandatoryParameterValue("taskId");
			return gatewayAdapter.getStatus(taskId);
		} else if (request.equalsIgnoreCase(BasicSensorPlanner.GET_TASK)) {
			String taskId = kvpParser.getMandatoryParameterValue("taskId");
			return gatewayAdapter.getTask(taskId);
		}
		LOGGER.error("Could not find request delegate for request '{}'.",
				request);
		throw new OperationNotSupportedException(request);
	}
}