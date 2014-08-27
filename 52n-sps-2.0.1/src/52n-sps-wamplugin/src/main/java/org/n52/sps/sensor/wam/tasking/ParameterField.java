/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.sps.sensor.wam.tasking;

import net.opengis.swe.x20.DataRecordType.Field;

enum ParameterField {
	IDASSET("idAsset", 1), IDMAINTENANCEPLAN("idMaintenancePlan", 1), PLANNEDDATE(
			"plannedDate", 1), DUEDATE("dueDate", 1), STATUS("status", 1), TYPEOFMAINTENANCE(
			"typeOfMaintenance", 1);
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

	public static ParameterField getField(Field field) {
		for (ParameterField parameterField : values()) {
			if (parameterField.fieldName.equalsIgnoreCase(field.getName())) {
				return parameterField;
			}
		}
		return null;
	}
}