/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wam.tasking;

import java.util.Arrays;

import net.opengis.swe.x20.CategoryType;
import net.opengis.swe.x20.CountType;
import net.opengis.swe.x20.DataRecordType;
import net.opengis.swe.x20.TextType;
import net.opengis.swe.x20.DataRecordType.Field;
import net.opengis.swe.x20.TimeType;

import org.n52.ows.exception.InvalidParameterValueException;
import org.n52.sps.tasking.TaskingRequest;
import org.n52.sps.util.encoding.EncodingException;
import org.n52.sps.util.encoding.text.TextEncoderDecoder;
import org.n52.sps.util.validation.InvalidComponentException;
import org.n52.sps.util.validation.SimpleSweComponentsValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextValuesDataRecordValidator {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(TextValuesDataRecordValidator.class);

	private DataRecordType template;
	private String[][] decodedInputs;
	private SimpleSweComponentsValidator validator;

	public TextValuesDataRecordValidator(DataRecordType template,
			TaskingRequest taskingrequest)
			throws InvalidParameterValueException {
		this.template = template;
		this.decodedInputs = decodeTextInputs(taskingrequest);
		this.validator = new SimpleSweComponentsValidator();
	}

	/**
	 * @param taskingRequest
	 *            the tasking request to decode.
	 * @return 2-dimensional Array containing decoded values and blocks.
	 * @throws InvalidParameterValueException
	 *             if the encoding used by the client is not supported by the
	 *             service or the provided values are not encoded correctly. REQ
	 *             5: <a href=
	 *             "http://www.opengis.net/spec/SPS/2.0/req/exceptions/InvalidTaskingParameters"
	 *             >http://www.opengis.net/spec/SPS/2.0/req/exceptions/
	 *             InvalidTaskingParameters</a>
	 */
	private String[][] decodeTextInputs(TaskingRequest taskingRequest)
			throws InvalidParameterValueException {
		try {
			TextEncoderDecoder encoder = taskingRequest.getTextEncoderDecoder();
			return encoder
					.decode(taskingRequest.getParameterData().getValues());
		} catch (EncodingException e) {
			throw new InvalidParameterValueException("taskingParameters");
		}
	}

	public DataRecordType[] getValidDataRecords()
			throws InvalidParameterValueException {
		DataRecordType[] validDatas = new DataRecordType[decodedInputs.length];
		for (int i = 0; i < decodedInputs.length; i++) {
			DataRecordType validData = DataRecordType.Factory.newInstance();
			validDatas[i] = parseValueBlockToValidDataRecordType(
					decodedInputs[i], validData);
			LOGGER.debug("valid data: {}", validDatas[i]);
		}
		return validDatas;
	}

	private DataRecordType parseValueBlockToValidDataRecordType(String[] block,
			DataRecordType validData) throws InvalidParameterValueException {
		LOGGER.debug("template: {}", template);
		int valueIdx = 0;
		for (Field field : template.getFieldArray()) {
			ParameterField parameterField = ParameterField.getField(field);
			if (isOptional(field)) {
				String value = block[valueIdx];
				if (isSetOptionalValue(value)) {
					String[] parameters = parseParameterValues(parameterField,
							block, ++valueIdx);
					validateAndSet(field, parameters, validData);
					valueIdx += parameterField.getLength();
				} else {
					// skip 'N' value
					++valueIdx;
				}
			} else {
				String[] parameters = parseParameterValues(parameterField,
						block, valueIdx);
				validateAndSet(field, parameters, validData);
				valueIdx += parameterField.getLength();
			}
		}
		return validData;
	}

	private boolean isOptional(Field field) {
		return field.getAbstractDataComponent().getOptional();
	}

	private boolean isSetOptionalValue(String value) {
		return "Y".equals(value);
	}

	private String[] parseParameterValues(ParameterField parameterField,
			String[] block, int valueIdx) {
		if (parameterField != null) {
			int offset = parameterField.getLength();
			return Arrays.copyOfRange(block, valueIdx, valueIdx + offset);
		}
		return new String[0];
	}

	private void validateAndSet(Field field, String[] parameters,
			DataRecordType validData) throws InvalidParameterValueException {
		try {
			String name = field.getName();
			String value = parameters[0];
			if (name.equalsIgnoreCase(ParameterField.IDASSET.getFieldName())) {
				TextType textToSet = validator.validateText(field, value);
				validData.addNewField().setAbstractDataComponent(textToSet);
			} else if (name.equalsIgnoreCase(ParameterField.IDMAINTENANCEPLAN
					.getFieldName())) {
				CountType countToSet = validator.validateCount(field, value);
				validData.addNewField().setAbstractDataComponent(countToSet);
			} else if (name.equalsIgnoreCase(ParameterField.PLANNEDDATE
					.getFieldName())) {
				TimeType timeToSet = validator.validateTime(field, value);
				validData.addNewField().setAbstractDataComponent(timeToSet);
			} else if (name.equalsIgnoreCase(ParameterField.DUEDATE
					.getFieldName())) {
				TimeType timeToSet = validator.validateTime(field, value);
				validData.addNewField().setAbstractDataComponent(timeToSet);
			} else if (name.equalsIgnoreCase(ParameterField.STATUS
					.getFieldName())) {
				TextType textToSet = validator.validateText(field, value);
				validData.addNewField().setAbstractDataComponent(textToSet);
			} else if (name.equalsIgnoreCase(ParameterField.TYPEOFMAINTENANCE
					.getFieldName())) {
				// Make sure that category value is either Ordinary or Emergency
				if (value.equalsIgnoreCase("Ordinary")
						|| value.equalsIgnoreCase("Emergency")) {
					CategoryType categoryToSet = validator.validateCategory(
							field, value);
					validData.addNewField().setAbstractDataComponent(
							categoryToSet);
				} else
					throw new InvalidComponentException(
							"Invalid TYPEOFMAINTENANCE");
			}
		} catch (InvalidComponentException e) {
			LOGGER.warn("Invalid component type.", e);
			throw new InvalidParameterValueException("taskingParameters");
		}
	}
}
