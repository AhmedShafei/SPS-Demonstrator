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
package org.n52.sps.util.validation;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import net.opengis.swe.x20.AllowedValuesType;
import net.opengis.swe.x20.CategoryType;
import net.opengis.swe.x20.CountPropertyType;
import net.opengis.swe.x20.CountType;
import net.opengis.swe.x20.DataArrayType;
import net.opengis.swe.x20.DataArrayType.Encoding;
import net.opengis.swe.x20.DataRecordType.Field;
import net.opengis.swe.x20.QuantityType;
import net.opengis.swe.x20.TextEncodingType;
import net.opengis.swe.x20.TextType;
import net.opengis.swe.x20.TimeType;
import net.opengis.swe.x20.VectorType;
import net.opengis.swe.x20.VectorType.Coordinate;

import org.apache.xmlbeans.XmlString;

public class SimpleSweComponentsValidator {

	// A.S: modified validation method for SWE QuantityType
	public QuantityType validateQuantity(Field quantityField, String value)
			throws InvalidComponentException {
		try {
			double doubleVal = validateDoubleValue(value);
			return validateQuantity(getQuantity(quantityField), doubleVal);
		} catch (NumberFormatException e) {
			throw new InvalidComponentException(e.getMessage());
		}
	}

	public QuantityType validateQuantity(QuantityType quantityTemplate,
			double value) throws InvalidComponentException {
		if (quantityTemplate.isSetConstraint()) {
			AllowedValuesType allowedValues = quantityTemplate.getConstraint()
					.getAllowedValues();
			List<Double> intervalArray = allowedValues.getIntervalArray(0);
			validateAgainstInterval(value, intervalArray);
		}
		QuantityType quantityToSet = (QuantityType) quantityTemplate.copy();
		quantityToSet.setValue(value);
		return quantityToSet;
	}

	public VectorType validateQuantityVector(Field vectorField, VectorType value)
			throws InvalidComponentException {
		return validateQuantityVector(getVector(vectorField), value);
	}

	public VectorType validateQuantityVector(VectorType vectorTemplate,
			VectorType value) throws InvalidComponentException {
		Coordinate[] coords = vectorTemplate.getCoordinateArray();
		Coordinate[] coordsToCheck = value.getCoordinateArray();
		if (coords.length != coordsToCheck.length) {
			throw new InvalidComponentException("Different vector dimensions");
		}
		for (int i = 0; i < coords.length; i++) {
			validateQuantity(coords[i].getQuantity(), coordsToCheck[i]
					.getQuantity().getValue());
		}
		VectorType vectorToSet = (VectorType) vectorTemplate.copy();
		vectorToSet.setCoordinateArray(coordsToCheck);
		return vectorToSet;
	}

	// A.S: modified validation method for SWE CountType
	public CountType validateCount(Field countField, String value)
			throws InvalidComponentException {
		try {
			BigInteger intVal = BigInteger.valueOf(Long.parseLong(value));
			return validateCount(getCount(countField), intVal);
		} catch (NumberFormatException e) {
			throw new InvalidComponentException(e.getMessage());
		}
	}

	public CountType validateCount(CountType countTemplate, BigInteger value)
			throws InvalidComponentException {
		if (countTemplate.isSetConstraint()) {
			AllowedValuesType allowedValues = countTemplate.getConstraint()
					.getAllowedValues();
			List<BigInteger> intervalArray = allowedValues.getIntervalArray(0);
			validateAgainstInterval(value, intervalArray);
		}
		CountType countToSet = (CountType) countTemplate.copy();
		countToSet.setValue(value);
		return countToSet;
	}

	// A.S: added validation method for SWE TimeType
	public TimeType validateTime(Field timeField, String value)
			throws InvalidComponentException {
		try {
			validateTimeValue(value);
			return validateTime(getTime(timeField), value);
		} catch (IllegalArgumentException e) {
			throw new InvalidComponentException(e.getMessage());
		}
	}

	public TimeType validateTime(TimeType timeTemplate, String value)
			throws InvalidComponentException {
		TimeType timeToSet = (TimeType) timeTemplate.copy();
		timeToSet.setValue(value);
		return timeToSet;
	}

	// A.S: added validation method for SWE CategoryType
	public CategoryType validateCategory(Field categoryField, String value)
			throws InvalidComponentException {
		return validateCategory(getCategory(categoryField), value);
	}

	public CategoryType validateCategory(CategoryType categoryTemplate,
			String value) throws InvalidComponentException {
		CategoryType categoryToSet = (CategoryType) categoryTemplate.copy();
		categoryToSet.setValue(value);
		return categoryToSet;
	}

	// A.S: added validation method for SWE DataArray
	public DataArrayType validateDataArray(Field dataArrayField, String value)
			throws InvalidComponentException {
		try {
			String[] pumpSchedule = value.split("%%");
			for (String entry : pumpSchedule) {
				String[] entryParameters = entry.split(";");
				validateTimeValue(entryParameters[0]);
				validateDoubleValue(entryParameters[1]);
			}
			return validateDataArray(getDataArray(dataArrayField), value);
		} catch (NumberFormatException e1) {
			throw new InvalidComponentException(e1.getMessage());
		} catch (IllegalArgumentException e2) {
			throw new InvalidComponentException(e2.getMessage());
		}
	}

	public DataArrayType validateDataArray(DataArrayType dataArrayTemplate,
			String value) throws InvalidComponentException {
		DataArrayType dataArrayToSet = (DataArrayType) dataArrayTemplate.copy();
		Encoding encoding = Encoding.Factory.newInstance();
		CountPropertyType dataArrayElementCount = CountPropertyType.Factory
				.newInstance();
		XmlString xmlString = XmlString.Factory.newInstance();
		TextEncodingType textEncoding = TextEncodingType.Factory.newInstance();
		textEncoding.setBlockSeparator(" ");
		textEncoding.setTokenSeparator(";");
		encoding.setAbstractEncoding(textEncoding);
		dataArrayTemplate.setEncoding(encoding);
		CountType elementCount = CountType.Factory.newInstance();
		elementCount.setValue(BigInteger.valueOf(value.split("%%").length));
		dataArrayElementCount.setCount(elementCount);
		dataArrayToSet.setElementCount(dataArrayElementCount);
		xmlString.setStringValue(value);
		dataArrayToSet.addNewValues().set(xmlString);
		return dataArrayToSet;
	}

	// A.S: added validation method for SWE Text
	public TextType validateText(Field textField, String value)
			throws InvalidComponentException {
		return validateText(getText(textField), value);
	}

	public TextType validateText(TextType textTemplate, String value)
			throws InvalidComponentException {
		TextType textToSet = (TextType) textTemplate.copy();
		textToSet.setValue(value);
		return textToSet;
	}

	public void validateAgainstInterval(double value, List<Double> interval)
			throws InvalidComponentException {
		Double intervalBegin = interval.get(0);
		Double intervalEnd = interval.get(1);
		if (Double.compare(value, intervalBegin) <= 0
				&& Double.compare(value, intervalEnd) >= 0) {
			StringBuilder errorMsg = new StringBuilder();
			errorMsg.append(value).append(" is not in range [")
					.append(intervalBegin).append(",").append(intervalEnd)
					.append("].");
			throw new InvalidComponentException(errorMsg.toString());
		}
	}

	private void validateAgainstInterval(BigInteger value,
			List<BigInteger> interval) throws InvalidComponentException {
		BigInteger intervalBegin = interval.get(0);
		BigInteger intervalEnd = interval.get(1);
		if (intervalBegin.subtract(value).intValue() <= 0
				&& value.subtract(intervalEnd).intValue() >= 0) {
			StringBuilder errorMsg = new StringBuilder();
			errorMsg.append(value).append(" is not in range [")
					.append(intervalBegin).append(",").append(intervalEnd)
					.append("].");
			throw new InvalidComponentException(errorMsg.toString());
		}
	}

	// A.S: added validation method for Time string values
	private void validateTimeValue(String value)
			throws IllegalArgumentException {
		Calendar parseDateTime = DatatypeConverter.parseDateTime(value);
	}

	// A.S: added validation method for Double string values
	private double validateDoubleValue(String value)
			throws NumberFormatException {
		return Double.parseDouble(value);
	}

	public QuantityType getQuantity(Field field) {
		return (QuantityType) field.getAbstractDataComponent();
	}

	public CountType getCount(Field field) {
		return (CountType) field.getAbstractDataComponent();
	}

	public VectorType getVector(Field field) {
		return (VectorType) field.getAbstractDataComponent();
	}

	public TimeType getTime(Field field) {
		return (TimeType) field.getAbstractDataComponent();
	}

	public CategoryType getCategory(Field field) {
		return (CategoryType) field.getAbstractDataComponent();
	}

	public DataArrayType getDataArray(Field field) {
		return (DataArrayType) field.getAbstractDataComponent();
	}

	public TextType getText(Field field) {
		return (TextType) field.getAbstractDataComponent();
	}

}
