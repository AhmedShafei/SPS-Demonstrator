/**
 * Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */

package org.n52.sps.sensor.wam;

import static org.n52.sps.tasking.TaskingRequestStatus.REJECTED;

import java.io.IOException;
import java.util.Calendar;

import javax.xml.namespace.QName;

import net.opengis.ows.x11.AbstractReferenceBaseType;
import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows.x11.MetadataType;
import net.opengis.ows.x11.ReferenceDocument;
import net.opengis.ows.x11.ReferenceGroupType;
import net.opengis.ows.x11.ReferenceType;
import net.opengis.sps.x20.DataAvailableType;
import net.opengis.sps.x20.DataAvailableType.DataReference;
import net.opengis.sps.x20.DescribeResultAccessResponseType.Availability;
import net.opengis.sps.x20.SPSMetadataType;
import net.opengis.sps.x20.StatusReportDocument;
import net.opengis.swe.x20.AbstractDataComponentType;
import net.opengis.swe.x20.DataRecordType;

import org.apache.xmlbeans.XmlException;
import org.n52.ows.exception.InvalidParameterValueException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.oxf.xmlbeans.tools.XMLBeansTools;
import org.n52.sps.sensor.SensorPlugin;
import org.n52.sps.sensor.SensorTaskService;
import org.n52.sps.sensor.SensorTaskStatus;
import org.n52.sps.sensor.model.ResultAccessDataServiceReference;
import org.n52.sps.sensor.model.SensorConfiguration;
import org.n52.sps.sensor.model.SensorTask;
import org.n52.sps.sensor.result.DataNotAvailable;
import org.n52.sps.sensor.wam.exec.WamTaskScheduler;
import org.n52.sps.sensor.wam.tasking.TextValuesDataRecordValidator;
import org.n52.sps.service.InternalServiceException;
import org.n52.sps.tasking.SubmitTaskingRequest;
import org.n52.sps.tasking.TaskingRequest;
import org.n52.sps.tasking.TaskingRequestStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WamTestSensor extends SensorPlugin {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(WamTestSensor.class);

	private WamTaskScheduler scheduler;

	public WamTestSensor(SensorTaskService sensorTaskService,
			SensorConfiguration configuration) throws InternalServiceException {
		super(sensorTaskService, configuration);
		scheduler = new WamTaskScheduler(sensorTaskService);
	}

	@Override
	public SensorTask submit(SubmitTaskingRequest submit,
			OwsExceptionReport owsExceptionReport) throws OwsException {
		LOGGER.debug("submit method called of procedure '{}'", getProcedure());
		SensorTask submitTask = sensorTaskService.createNewTask();
		submitTask.setParameterData(submit.getParameterData());
		scheduleAndAcceptTask(submit, submitTask);
		return submitTask;
	}

	private void scheduleAndAcceptTask(SubmitTaskingRequest submit,
			SensorTask submitTask) throws InvalidParameterValueException {
		try {
			// No actual need for the inputs now for the SPS
			DataRecordType[] validInputs = getValidInputs(submit);
			if (scheduler.schedule(submitTask)) {
				submitTask.setRequestStatus(TaskingRequestStatus.ACCEPTED);
				submitTask.setTaskStatus(SensorTaskStatus.INEXECUTION);
			} else {
				submitTask.setRequestStatus(TaskingRequestStatus.REJECTED);
				submitTask.setTaskStatus(SensorTaskStatus.FAILED);
			}
			submitTask.setEstimatedToC(null);
			submitTask.setPercentCompletion(0.0);
		} catch (InvalidParameterValueException e) {
			String format = "The given tasking parameters were not valid; %s";
			submitTask.addStatusMessage(String.format(format, e.getMessage()));
			submitTask.setRequestStatus(REJECTED);
			throw e;
		}
	}

	@Override
	public void updateSensorTaskStatus(SensorTask sensorTask,
			StatusReportDocument statusReport) {
		String taskStatus = statusReport.getStatusReport().getTaskStatus();
		Calendar updateTime = statusReport.getStatusReport().getUpdateTime();
		double percentCompletion = statusReport.getStatusReport()
				.getPercentCompletion();
		Calendar estimatedToC = statusReport.getStatusReport()
				.getEstimatedToC();
		sensorTask.setTaskStatusAsString(taskStatus);
		sensorTask.setUpdateTime(updateTime);
		sensorTask.setPercentCompletion(percentCompletion);
		sensorTask.setEstimatedToC(estimatedToC);

		this.getSensorTaskService().updateSensorTask(sensorTask);
	}

	private DataRecordType[] getValidInputs(TaskingRequest taskingrequest)
			throws InvalidParameterValueException {
		DataRecordType dataRecord = getTaskingParametersAsDataRecord();
		TextValuesDataRecordValidator validator = new TextValuesDataRecordValidator(
				dataRecord, taskingrequest);
		DataRecordType[] validInputs = validator.getValidDataRecords();
		return validInputs;
	}

	private DataRecordType getTaskingParametersAsDataRecord() {
		try {
			AbstractDataComponentType template = configuration
					.getTaskingParametersTemplate();
			return DataRecordType.Factory.parse(template.newInputStream());
		} catch (XmlException e) {
			throw new IllegalStateException(
					"Sensor's tasking parameters are no valid DataRecordType");
		} catch (IOException e) {
			throw new IllegalStateException(
					"Sensor's tasking parameters are no valid DataRecordType");
		}
	}

	@Override
	public void qualifyDataComponent(
			AbstractDataComponentType componentToQualify) {
		QName qname = new QName("http://www.opengis.net/swe/2.0", "DataRecord");
		XMLBeansTools.qualifySubstitutionGroup(componentToQualify, qname);
	}

	@Override
	public Availability getResultAccessibilityFor(SensorTask sensorTask) {
		WamTaskResultAccess resultAccess = createResultAccessGenerator(sensorTask);
		return resultAccess.getResultAccessibility();
	}

	private WamTaskResultAccess createResultAccessGenerator(
			SensorTask sensorTask) {
		return new WamTaskResultAccess(sensorTask,
				getResultAccessDataServiceReference());
	}

	public boolean isDataAvailable() {
		for (SensorTask sensorTask : sensorTaskService.getSensorTasks()) {
			if (createResultAccessGenerator(sensorTask).isDataAvailable()) {
				return true; // at lease one task must provide data
			}
		}
		return false;
	}

	public Availability getResultAccessibility() {
		long amountOfAvailableTasks = sensorTaskService
				.getAmountOfAvailableTasks();
		if (amountOfAvailableTasks == 0) {
			LanguageStringType languageMessage = LanguageStringType.Factory
					.newInstance();
			languageMessage
					.setStringValue("No tasks available which could provide result access information.");
			return new DataNotAvailable(languageMessage)
					.getResultAccessibility();
		}

		Availability availability = Availability.Factory.newInstance();
		DataAvailableType configuredServiceReference = availability
				.addNewAvailable().addNewDataAvailable();
		DataReference serviceReference = configuredServiceReference
				.addNewDataReference();
		createReferenceGroup(serviceReference.addNewReferenceGroup());

		// general configured result access
		return availability;
	}

	private void createReferenceGroup(ReferenceGroupType referenceGroup) {
		referenceGroup.setAbstractReferenceBaseArray(createReferences());
		for (AbstractReferenceBaseType referenceBase : referenceGroup
				.getAbstractReferenceBaseArray()) {
			// XXX check if there is a better way to qualify abstract element
			QName qname = new QName("http://www.opengis.net/ows/1.1",
					"Reference");
			XMLBeansTools.qualifySubstitutionGroup(referenceBase, qname);
		}
	}

	private ReferenceType[] createReferences() {
		ResultAccessDataServiceReference resultAccessInformation = getResultAccessDataServiceReference();
		ReferenceDocument referenceDoc = ReferenceDocument.Factory
				.newInstance();
		ReferenceType reference = referenceDoc.addNewReference();
		reference.setHref(resultAccessInformation.getReference());
		reference.setFormat(resultAccessInformation.getFormat());
		reference.setTitle(resultAccessInformation.getTitle());
		/*
		 * We override the role here as for a DescribeResultAccess with
		 * procedure a service reference shall inform about the data service
		 * used in gerenal. There is no concrete data request to retrieve data
		 * as it would be when a DescribeResultAccess with a task id would be
		 * send. => see table 41 in SPS spec. 2.0
		 */
		reference
				.setRole("http://www.opengis.net/spec/SPS/2.0/referenceType/ServiceURL");

		createAbstract(reference.addNewAbstract(),
				resultAccessInformation.getReferenceAbstract());
		createCodeType(reference.addNewIdentifier(),
				resultAccessInformation.getIdentifier());
		for (String dataAccessType : resultAccessInformation
				.getDataAccessTypes()) {
			createSpsMetadata(reference.addNewMetadata(), dataAccessType);
		}
		return new ReferenceType[] { reference };
	}

	private void createAbstract(LanguageStringType languageType,
			String referenceAbstract) {
		languageType.setStringValue(referenceAbstract);
	}

	private void createCodeType(CodeType identifierCodeType, String identifier) {
		identifierCodeType.setStringValue(identifier);
	}

	void createSpsMetadata(MetadataType metadata, String dataAccessType) {
		SPSMetadataType spsMetadata = SPSMetadataType.Factory.newInstance();
		spsMetadata.setDataAccessType(dataAccessType);
		metadata.addNewAbstractMetaData().set(spsMetadata);
		// XXX check if there is a better way to qualify abstract element
		QName qname = new QName("http://www.opengis.net/sps/2.0", "SPSMetadata");
		XMLBeansTools.qualifySubstitutionGroup(metadata.getAbstractMetaData(),
				qname);
	}
}
