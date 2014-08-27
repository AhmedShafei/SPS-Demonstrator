/*
 * An XML document type.
 * Localname: SensorTaskingParameters
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorTaskingParametersDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2.impl;
/**
 * A document containing one SensorTaskingParameters(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public class SensorTaskingParametersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorTaskingParametersDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorTaskingParametersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSORTASKINGPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorTaskingParameters");
    
    
    /**
     * Gets the "SensorTaskingParameters" element
     */
    public org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters getSensorTaskingParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters target = null;
            target = (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters)get_store().find_element_user(SENSORTASKINGPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SensorTaskingParameters" element
     */
    public void setSensorTaskingParameters(org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters sensorTaskingParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters target = null;
            target = (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters)get_store().find_element_user(SENSORTASKINGPARAMETERS$0, 0);
            if (target == null)
            {
                target = (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters)get_store().add_element_user(SENSORTASKINGPARAMETERS$0);
            }
            target.set(sensorTaskingParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "SensorTaskingParameters" element
     */
    public org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters addNewSensorTaskingParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters target = null;
            target = (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters)get_store().add_element_user(SENSORTASKINGPARAMETERS$0);
            return target;
        }
    }
    /**
     * An XML SensorTaskingParameters(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public static class SensorTaskingParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters
    {
        private static final long serialVersionUID = 1L;
        
        public SensorTaskingParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
