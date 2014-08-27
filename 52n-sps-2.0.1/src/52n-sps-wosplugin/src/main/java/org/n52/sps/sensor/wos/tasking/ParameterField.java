/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wos.tasking;

import net.opengis.swe.x20.DataRecordType.Field;

enum ParameterField {
	PUMP_ID("pumpId", 1), STATION_ID("stationId", 1), ENERGY_CONSUMPTION(
			"energyConsumption", 1), ENERGY_COST("energyCost", 1), PUMP_SCHEDULE(
			"pumpSchedule", 1);
	private String fieldName;
	private int length;

	private ParameterField(String fieldName, int length) {
		this.fieldName = fieldName;
		this.length = length;
	}

	public String getFieldName() {
		return fieldName;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static ParameterField getField(Field field) {
		for (ParameterField parameterField : values()) {
			if (parameterField.fieldName.equalsIgnoreCase(field.getName())) {
				return parameterField;
			}
		}
		return null;
	}
}