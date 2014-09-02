/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wos.tasking;

import java.util.Arrays;

import net.opengis.swe.x20.AbstractDataComponentType;
import net.opengis.swe.x20.CategoryType;
import net.opengis.swe.x20.CountType;
import net.opengis.swe.x20.DataArrayType;
import net.opengis.swe.x20.DataRecordType;
import net.opengis.swe.x20.DataRecordType.Field;
import net.opengis.swe.x20.QuantityType;
import net.opengis.swe.x20.TextType;
import net.opengis.swe.x20.TimeType;
import net.opengis.swe.x20.VectorType;
import net.opengis.swe.x20.VectorType.Coordinate;

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
			if (isOptional(field)) {
				String value = block[valueIdx];
				if (isSetOptionalValue(value)) {
					String[] parameters = parseParameterValues(block,
							++valueIdx);
					validateAndSet(field, parameters, validData);
					// Fix parameterField length to 1, since we no more have
					// dependency on parameterField
					valueIdx += 1;
				} else {
					// skip 'N' value
					++valueIdx;
				}
			} else {
				String[] parameters = parseParameterValues(block, valueIdx);
				validateAndSet(field, parameters, validData);
				// Fix parameterField length to 1, since we no more have
				// dependency on parameterField
				valueIdx += 1;
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

	private String[] parseParameterValues(String[] block, int valueIdx) {
		// Since we have all the Fields of length 1, fix the length offset
		// to 1 and remove the parameterField dependency
		int offset = 1;
		return Arrays.copyOfRange(block, valueIdx, valueIdx + offset);
	}

	private void validateAndSet(Field field, String[] parameters,
			DataRecordType validData) throws InvalidParameterValueException {
		try {
			AbstractDataComponentType type = field.getAbstractDataComponent();
			String value = parameters[0];
			if (type instanceof QuantityType) {
				QuantityType quantityToSet = validator.validateQuantity(field,
						value);
				validData.addNewField().setAbstractDataComponent(quantityToSet);
			} else if (type instanceof VectorType) {
				VectorType vectorValue = create2DQuantityVector(parameters);
				VectorType vectorTypeToSet = validator.validateQuantityVector(
						field, vectorValue);
				validData.addNewField().setAbstractDataComponent(
						vectorTypeToSet);
			} else if (type instanceof CountType) {
				CountType countToSet = validator.validateCount(field, value);
				validData.addNewField().setAbstractDataComponent(countToSet);
			} else if (type instanceof TimeType) {
				TimeType timeToSet = validator.validateTime(field, value);
				validData.addNewField().setAbstractDataComponent(timeToSet);
			} else if (type instanceof CategoryType) {
				CategoryType categoryToSet = validator.validateCategory(field,
						value);
				validData.addNewField().setAbstractDataComponent(categoryToSet);
			} else if (type instanceof DataArrayType) {
				DataArrayType dataArrayToSet = validator.validateDataArray(
						field, value);
				validData.addNewField()
						.setAbstractDataComponent(dataArrayToSet);
			} else if (type instanceof TextType) {
				TextType textToSet = validator.validateText(field, value);
				validData.addNewField().setAbstractDataComponent(textToSet);
			}

		} catch (InvalidComponentException e) {
			LOGGER.warn("Invalid component type.", e);
			throw new InvalidParameterValueException("taskingParameters");
		}
	}

	private VectorType create2DQuantityVector(String[] parameters) {
		VectorType vector = VectorType.Factory.newInstance();
		for (String parameter : parameters) {
			Coordinate coordinate = vector.addNewCoordinate();
			coordinate.addNewQuantity().setValue(Double.parseDouble(parameter));
		}
		return vector;
	}
}
