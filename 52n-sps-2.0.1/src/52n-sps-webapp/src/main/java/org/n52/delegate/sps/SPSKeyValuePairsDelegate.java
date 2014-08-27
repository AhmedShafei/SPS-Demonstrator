/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.delegate.sps;

import net.opengis.sps.x20.CapabilitiesDocument;
import net.opengis.sps.x20.GetCapabilitiesDocument;

import org.apache.xmlbeans.XmlObject;
import org.n52.delegate.DelegationHandler;
import org.n52.delegate.GetCapabilitiesConverter;
import org.n52.delegate.KeyValuePairsWrapper;
import org.n52.ows.exception.InvalidParameterValueException;
import org.n52.ows.exception.OperationNotSupportedException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.ows.service.parameter.KeyValuePairParameter;
import org.n52.oxf.xmlbeans.SwesXmlUtil;
import org.n52.sps.service.SensorPlanningService;
import org.n52.sps.service.adapter.BasicSensorPlannerRESTAdapter;
import org.n52.sps.service.adapter.BasicSensorPlannerRESTAdapterImpl;
import org.n52.sps.service.adapter.SensorProviderRESTAdapter;
import org.n52.sps.service.adapter.SensorProviderRESTAdapterImpl;
import org.n52.sps.service.core.BasicSensorPlanner;
import org.n52.sps.service.core.SensorProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SPSKeyValuePairsDelegate implements DelegationHandler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(SPSKeyValuePairsDelegate.class);

	private SensorPlanningService service;

	private KeyValuePairsWrapper kvpParser;

	public SPSKeyValuePairsDelegate(SensorPlanningService service,
			KeyValuePairsWrapper kvpParser) {
		this.service = service;
		this.kvpParser = kvpParser;
	}

	public XmlObject delegate() throws OwsException, OwsExceptionReport {
		String request = kvpParser
				.getMandatoryParameterValue(KeyValuePairParameter.REQUEST
						.name());
		if (request.isEmpty()) {
			throw new InvalidParameterValueException(
					KeyValuePairParameter.REQUEST.name());
		}

		BasicSensorPlannerRESTAdapter basicSensorPlannerRESTAdapter = new BasicSensorPlannerRESTAdapterImpl(
				service.getBasicSensorPlanner());
		SensorProviderRESTAdapter sensorProviderRESTAdapter = new SensorProviderRESTAdapterImpl(
				service.getSensorProvider());

		if (request.equalsIgnoreCase(BasicSensorPlanner.GET_CAPABILITIES)) {
			GetCapabilitiesConverter converter = new GetCapabilitiesConverter(
					kvpParser);
			GetCapabilitiesDocument getCapabilities = converter.convert();
			service.validateGetCapabilitiesParameters(getCapabilities);
			SwesXmlUtil.validateSwesRequest(getCapabilities);
			XmlObject capabilities = basicSensorPlannerRESTAdapter
					.getCapabilities(getCapabilities);
			service.interceptCapabilities((CapabilitiesDocument) capabilities);
			return capabilities;
		} else if (request
				.equalsIgnoreCase(BasicSensorPlanner.DESCRIBE_TASKING)) {
			String procedureId = kvpParser
					.getMandatoryParameterValue("procedureId");
			return basicSensorPlannerRESTAdapter.describeTasking(procedureId);
		} else if (request.equalsIgnoreCase(SensorProvider.DESCRIBE_SENSOR)) {
			String procedureId = kvpParser
					.getMandatoryParameterValue("procedureId");
			return sensorProviderRESTAdapter.describeSensor(procedureId);
		} else if (request.equalsIgnoreCase(BasicSensorPlanner.GET_STATUS)) {
			String taskId = kvpParser.getMandatoryParameterValue("taskId");
			return basicSensorPlannerRESTAdapter.getStatus(taskId);
		} else if (request.equalsIgnoreCase(BasicSensorPlanner.GET_TASK)) {
			String taskId = kvpParser.getMandatoryParameterValue("taskId");
			return basicSensorPlannerRESTAdapter.getTask(taskId);
		} else if (request
				.equalsIgnoreCase(BasicSensorPlanner.DESCRIBE_TASK_RESULT_ACCESS)) {
			String taskId = kvpParser.getMandatoryParameterValue("taskId");
			return basicSensorPlannerRESTAdapter
					.describeTaskResultAccess(taskId);
		} else if (request
				.equalsIgnoreCase(BasicSensorPlanner.DESCRIBE_SENSOR_RESULT_ACCESS)) {
			String procedureId = kvpParser
					.getMandatoryParameterValue("procedureId");
			return basicSensorPlannerRESTAdapter
					.describeSensorResultAccess(procedureId);
		}
		LOGGER.error("Could not find request delegate for request '{}'.",
				request);
		throw new OperationNotSupportedException(request);
	}
}