/*
 * An XML document type.
 * Localname: SensorInstanceData
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorInstanceDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2.impl;
/**
 * A document containing one SensorInstanceData(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public class SensorInstanceDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorInstanceDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorInstanceDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSORINSTANCEDATA$0 = 
        new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorInstanceData");
    
    
    /**
     * Gets the "SensorInstanceData" element
     */
    public org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData getSensorInstanceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData target = null;
            target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().find_element_user(SENSORINSTANCEDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SensorInstanceData" element
     */
    public void setSensorInstanceData(org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData sensorInstanceData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData target = null;
            target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().find_element_user(SENSORINSTANCEDATA$0, 0);
            if (target == null)
            {
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().add_element_user(SENSORINSTANCEDATA$0);
            }
            target.set(sensorInstanceData);
        }
    }
    
    /**
     * Appends and returns a new empty "SensorInstanceData" element
     */
    public org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData addNewSensorInstanceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData target = null;
            target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().add_element_user(SENSORINSTANCEDATA$0);
            return target;
        }
    }
    /**
     * An XML SensorInstanceData(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public static class SensorInstanceDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData
    {
        private static final long serialVersionUID = 1L;
        
        public SensorInstanceDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROCEDURE$0 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "Procedure");
        private static final javax.xml.namespace.QName SENSORPLUGINTYPE$2 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorPluginType");
        private static final javax.xml.namespace.QName REFERENCE$4 = 
            new javax.xml.namespace.QName("http://www.opengis.net/ows/1.1", "Reference");
        private static final org.apache.xmlbeans.QNameSet REFERENCE$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://www.opengis.net/ows/1.1", "ServiceReference"),
            new javax.xml.namespace.QName("http://www.opengis.net/ows/1.1", "Reference"),
        });
        
        
        /**
         * Gets the "Procedure" element
         */
        public org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure getProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure target = null;
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure)get_store().find_element_user(PROCEDURE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Procedure" element
         */
        public void setProcedure(org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure procedure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure target = null;
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure)get_store().find_element_user(PROCEDURE$0, 0);
                if (target == null)
                {
                    target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure)get_store().add_element_user(PROCEDURE$0);
                }
                target.set(procedure);
            }
        }
        
        /**
         * Appends and returns a new empty "Procedure" element
         */
        public org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure addNewProcedure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure target = null;
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure)get_store().add_element_user(PROCEDURE$0);
                return target;
            }
        }
        
        /**
         * Gets the "SensorPluginType" element
         */
        public java.lang.String getSensorPluginType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENSORPLUGINTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SensorPluginType" element
         */
        public org.apache.xmlbeans.XmlString xgetSensorPluginType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENSORPLUGINTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "SensorPluginType" element
         */
        public boolean isSetSensorPluginType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENSORPLUGINTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "SensorPluginType" element
         */
        public void setSensorPluginType(java.lang.String sensorPluginType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENSORPLUGINTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENSORPLUGINTYPE$2);
                }
                target.setStringValue(sensorPluginType);
            }
        }
        
        /**
         * Sets (as xml) the "SensorPluginType" element
         */
        public void xsetSensorPluginType(org.apache.xmlbeans.XmlString sensorPluginType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENSORPLUGINTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENSORPLUGINTYPE$2);
                }
                target.set(sensorPluginType);
            }
        }
        
        /**
         * Unsets the "SensorPluginType" element
         */
        public void unsetSensorPluginType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENSORPLUGINTYPE$2, 0);
            }
        }
        
        /**
         * Gets the "Reference" element
         */
        public net.opengis.ows.x11.ReferenceType getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.ows.x11.ReferenceType target = null;
                target = (net.opengis.ows.x11.ReferenceType)get_store().find_element_user(REFERENCE$5, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Reference" element
         */
        public void setReference(net.opengis.ows.x11.ReferenceType reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.ows.x11.ReferenceType target = null;
                target = (net.opengis.ows.x11.ReferenceType)get_store().find_element_user(REFERENCE$5, 0);
                if (target == null)
                {
                    target = (net.opengis.ows.x11.ReferenceType)get_store().add_element_user(REFERENCE$4);
                }
                target.set(reference);
            }
        }
        
        /**
         * Appends and returns a new empty "Reference" element
         */
        public net.opengis.ows.x11.ReferenceType addNewReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.ows.x11.ReferenceType target = null;
                target = (net.opengis.ows.x11.ReferenceType)get_store().add_element_user(REFERENCE$4);
                return target;
            }
        }
        /**
         * An XML Procedure(@http://www.52north.org/schemas/sps/v2).
         *
         * This is an atomic type that is a restriction of org.x52North.schemas.sps.v2.SensorInstanceDataDocument$SensorInstanceData$Procedure.
         */
        public static class ProcedureImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure
        {
            private static final long serialVersionUID = 1L;
            
            public ProcedureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ProcedureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName SEPARATOR$0 = 
                new javax.xml.namespace.QName("", "separator");
            
            
            /**
             * Gets the "separator" attribute
             */
            public java.lang.String getSeparator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATOR$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "separator" attribute
             */
            public org.apache.xmlbeans.XmlString xgetSeparator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEPARATOR$0);
                    return target;
                }
            }
            
            /**
             * True if has "separator" attribute
             */
            public boolean isSetSeparator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SEPARATOR$0) != null;
                }
            }
            
            /**
             * Sets the "separator" attribute
             */
            public void setSeparator(java.lang.String separator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATOR$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEPARATOR$0);
                    }
                    target.setStringValue(separator);
                }
            }
            
            /**
             * Sets (as xml) the "separator" attribute
             */
            public void xsetSeparator(org.apache.xmlbeans.XmlString separator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEPARATOR$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEPARATOR$0);
                    }
                    target.set(separator);
                }
            }
            
            /**
             * Unsets the "separator" attribute
             */
            public void unsetSeparator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SEPARATOR$0);
                }
            }
        }
    }
}
