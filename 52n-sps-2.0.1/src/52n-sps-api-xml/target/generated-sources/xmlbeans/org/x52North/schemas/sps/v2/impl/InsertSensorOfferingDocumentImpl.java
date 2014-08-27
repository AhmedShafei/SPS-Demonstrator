/*
 * An XML document type.
 * Localname: InsertSensorOffering
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.InsertSensorOfferingDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2.impl;
/**
 * A document containing one InsertSensorOffering(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public class InsertSensorOfferingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument
{
    private static final long serialVersionUID = 1L;
    
    public InsertSensorOfferingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTSENSOROFFERING$0 = 
        new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "InsertSensorOffering");
    
    
    /**
     * Gets the "InsertSensorOffering" element
     */
    public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering getInsertSensorOffering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering target = null;
            target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering)get_store().find_element_user(INSERTSENSOROFFERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InsertSensorOffering" element
     */
    public void setInsertSensorOffering(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering insertSensorOffering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering target = null;
            target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering)get_store().find_element_user(INSERTSENSOROFFERING$0, 0);
            if (target == null)
            {
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering)get_store().add_element_user(INSERTSENSOROFFERING$0);
            }
            target.set(insertSensorOffering);
        }
    }
    
    /**
     * Appends and returns a new empty "InsertSensorOffering" element
     */
    public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering addNewInsertSensorOffering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering target = null;
            target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering)get_store().add_element_user(INSERTSENSOROFFERING$0);
            return target;
        }
    }
    /**
     * An XML InsertSensorOffering(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public static class InsertSensorOfferingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering
    {
        private static final long serialVersionUID = 1L;
        
        public InsertSensorOfferingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SENSOROFFERINGDATA$0 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorOfferingData");
        private static final javax.xml.namespace.QName SENSORINSTANCEDATA$2 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorInstanceData");
        private static final javax.xml.namespace.QName SENSORDESCRIPTIONDATA$4 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorDescriptionData");
        private static final javax.xml.namespace.QName SENSORTASKINGPARAMETERSSET$6 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorTaskingParametersSet");
        private static final javax.xml.namespace.QName SENSORSETUP$8 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorSetup");
        
        
        /**
         * Gets the "SensorOfferingData" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData getSensorOfferingData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData)get_store().find_element_user(SENSOROFFERINGDATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SensorOfferingData" element
         */
        public void setSensorOfferingData(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData sensorOfferingData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData)get_store().find_element_user(SENSOROFFERINGDATA$0, 0);
                if (target == null)
                {
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData)get_store().add_element_user(SENSOROFFERINGDATA$0);
                }
                target.set(sensorOfferingData);
            }
        }
        
        /**
         * Appends and returns a new empty "SensorOfferingData" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData addNewSensorOfferingData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData)get_store().add_element_user(SENSOROFFERINGDATA$0);
                return target;
            }
        }
        
        /**
         * Gets the "SensorInstanceData" element
         */
        public org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData getSensorInstanceData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData target = null;
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().find_element_user(SENSORINSTANCEDATA$2, 0);
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
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().find_element_user(SENSORINSTANCEDATA$2, 0);
                if (target == null)
                {
                    target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().add_element_user(SENSORINSTANCEDATA$2);
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
                target = (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData)get_store().add_element_user(SENSORINSTANCEDATA$2);
                return target;
            }
        }
        
        /**
         * Gets array of all "SensorDescriptionData" elements
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[] getSensorDescriptionDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SENSORDESCRIPTIONDATA$4, targetList);
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[] result = new org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SensorDescriptionData" element
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData getSensorDescriptionDataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData)get_store().find_element_user(SENSORDESCRIPTIONDATA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SensorDescriptionData" element
         */
        public int sizeOfSensorDescriptionDataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENSORDESCRIPTIONDATA$4);
            }
        }
        
        /**
         * Sets array of all "SensorDescriptionData" element
         */
        public void setSensorDescriptionDataArray(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[] sensorDescriptionDataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sensorDescriptionDataArray, SENSORDESCRIPTIONDATA$4);
            }
        }
        
        /**
         * Sets ith "SensorDescriptionData" element
         */
        public void setSensorDescriptionDataArray(int i, org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData sensorDescriptionData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData)get_store().find_element_user(SENSORDESCRIPTIONDATA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sensorDescriptionData);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SensorDescriptionData" element
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData insertNewSensorDescriptionData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData)get_store().insert_element_user(SENSORDESCRIPTIONDATA$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SensorDescriptionData" element
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData addNewSensorDescriptionData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData)get_store().add_element_user(SENSORDESCRIPTIONDATA$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "SensorDescriptionData" element
         */
        public void removeSensorDescriptionData(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENSORDESCRIPTIONDATA$4, i);
            }
        }
        
        /**
         * Gets the "SensorTaskingParametersSet" element
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet getSensorTaskingParametersSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet)get_store().find_element_user(SENSORTASKINGPARAMETERSSET$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SensorTaskingParametersSet" element
         */
        public void setSensorTaskingParametersSet(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet sensorTaskingParametersSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet)get_store().find_element_user(SENSORTASKINGPARAMETERSSET$6, 0);
                if (target == null)
                {
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet)get_store().add_element_user(SENSORTASKINGPARAMETERSSET$6);
                }
                target.set(sensorTaskingParametersSet);
            }
        }
        
        /**
         * Appends and returns a new empty "SensorTaskingParametersSet" element
         */
        public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet addNewSensorTaskingParametersSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet target = null;
                target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet)get_store().add_element_user(SENSORTASKINGPARAMETERSSET$6);
                return target;
            }
        }
        
        /**
         * Gets the "SensorSetup" element
         */
        public org.apache.xmlbeans.XmlObject getSensorSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SENSORSETUP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SensorSetup" element
         */
        public boolean isSetSensorSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENSORSETUP$8) != 0;
            }
        }
        
        /**
         * Sets the "SensorSetup" element
         */
        public void setSensorSetup(org.apache.xmlbeans.XmlObject sensorSetup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SENSORSETUP$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SENSORSETUP$8);
                }
                target.set(sensorSetup);
            }
        }
        
        /**
         * Appends and returns a new empty "SensorSetup" element
         */
        public org.apache.xmlbeans.XmlObject addNewSensorSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SENSORSETUP$8);
                return target;
            }
        }
        
        /**
         * Unsets the "SensorSetup" element
         */
        public void unsetSensorSetup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENSORSETUP$8, 0);
            }
        }
        /**
         * An XML SensorDescriptionData(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public static class SensorDescriptionDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData
        {
            private static final long serialVersionUID = 1L;
            
            public SensorDescriptionDataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROCEDUREDESCRIPTIONFORMAT$0 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "ProcedureDescriptionFormat");
            private static final javax.xml.namespace.QName DOWNLOADLINK$2 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "DownloadLink");
            
            
            /**
             * Gets the "ProcedureDescriptionFormat" element
             */
            public java.lang.String getProcedureDescriptionFormat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDESCRIPTIONFORMAT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ProcedureDescriptionFormat" element
             */
            public org.apache.xmlbeans.XmlAnyURI xgetProcedureDescriptionFormat()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROCEDUREDESCRIPTIONFORMAT$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ProcedureDescriptionFormat" element
             */
            public void setProcedureDescriptionFormat(java.lang.String procedureDescriptionFormat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCEDUREDESCRIPTIONFORMAT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCEDUREDESCRIPTIONFORMAT$0);
                    }
                    target.setStringValue(procedureDescriptionFormat);
                }
            }
            
            /**
             * Sets (as xml) the "ProcedureDescriptionFormat" element
             */
            public void xsetProcedureDescriptionFormat(org.apache.xmlbeans.XmlAnyURI procedureDescriptionFormat)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PROCEDUREDESCRIPTIONFORMAT$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PROCEDUREDESCRIPTIONFORMAT$0);
                    }
                    target.set(procedureDescriptionFormat);
                }
            }
            
            /**
             * Gets the "DownloadLink" element
             */
            public java.lang.String getDownloadLink()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOWNLOADLINK$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "DownloadLink" element
             */
            public org.apache.xmlbeans.XmlAnyURI xgetDownloadLink()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DOWNLOADLINK$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "DownloadLink" element
             */
            public void setDownloadLink(java.lang.String downloadLink)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOWNLOADLINK$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOWNLOADLINK$2);
                    }
                    target.setStringValue(downloadLink);
                }
            }
            
            /**
             * Sets (as xml) the "DownloadLink" element
             */
            public void xsetDownloadLink(org.apache.xmlbeans.XmlAnyURI downloadLink)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DOWNLOADLINK$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DOWNLOADLINK$2);
                    }
                    target.set(downloadLink);
                }
            }
        }
        /**
         * An XML SensorTaskingParametersSet(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public static class SensorTaskingParametersSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet
        {
            private static final long serialVersionUID = 1L;
            
            public SensorTaskingParametersSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SINGLEPARAMETERSET$0 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SingleParameterSet");
            private static final javax.xml.namespace.QName MULTIPLEPARAMETERSETS$2 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "MultipleParameterSets");
            
            
            /**
             * Gets the "SingleParameterSet" element
             */
            public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet getSingleParameterSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet)get_store().find_element_user(SINGLEPARAMETERSET$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "SingleParameterSet" element
             */
            public boolean isSetSingleParameterSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SINGLEPARAMETERSET$0) != 0;
                }
            }
            
            /**
             * Sets the "SingleParameterSet" element
             */
            public void setSingleParameterSet(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet singleParameterSet)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet)get_store().find_element_user(SINGLEPARAMETERSET$0, 0);
                    if (target == null)
                    {
                      target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet)get_store().add_element_user(SINGLEPARAMETERSET$0);
                    }
                    target.set(singleParameterSet);
                }
            }
            
            /**
             * Appends and returns a new empty "SingleParameterSet" element
             */
            public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet addNewSingleParameterSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet)get_store().add_element_user(SINGLEPARAMETERSET$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "SingleParameterSet" element
             */
            public void unsetSingleParameterSet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SINGLEPARAMETERSET$0, 0);
                }
            }
            
            /**
             * Gets the "MultipleParameterSets" element
             */
            public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets getMultipleParameterSets()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets)get_store().find_element_user(MULTIPLEPARAMETERSETS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "MultipleParameterSets" element
             */
            public boolean isSetMultipleParameterSets()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MULTIPLEPARAMETERSETS$2) != 0;
                }
            }
            
            /**
             * Sets the "MultipleParameterSets" element
             */
            public void setMultipleParameterSets(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets multipleParameterSets)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets)get_store().find_element_user(MULTIPLEPARAMETERSETS$2, 0);
                    if (target == null)
                    {
                      target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets)get_store().add_element_user(MULTIPLEPARAMETERSETS$2);
                    }
                    target.set(multipleParameterSets);
                }
            }
            
            /**
             * Appends and returns a new empty "MultipleParameterSets" element
             */
            public org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets addNewMultipleParameterSets()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets target = null;
                    target = (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets)get_store().add_element_user(MULTIPLEPARAMETERSETS$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "MultipleParameterSets" element
             */
            public void unsetMultipleParameterSets()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MULTIPLEPARAMETERSETS$2, 0);
                }
            }
            /**
             * An XML SingleParameterSet(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public static class SingleParameterSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet
            {
                private static final long serialVersionUID = 1L;
                
                public SingleParameterSetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ABSTRACTDATACOMPONENT$0 = 
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "AbstractDataComponent");
                private static final org.apache.xmlbeans.QNameSet ABSTRACTDATACOMPONENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Vector"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "DataChoice"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Boolean"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "AbstractSimpleComponent"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "DataRecord"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "AbstractDataComponent"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "TimeRange"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "CountRange"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Matrix"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "CategoryRange"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "DataArray"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Quantity"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Count"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "QuantityRange"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Text"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Time"),
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "Category"),
                });
                
                
                /**
                 * Gets the "AbstractDataComponent" element
                 */
                public net.opengis.swe.x20.AbstractDataComponentType getAbstractDataComponent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.AbstractDataComponentType target = null;
                      target = (net.opengis.swe.x20.AbstractDataComponentType)get_store().find_element_user(ABSTRACTDATACOMPONENT$1, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "AbstractDataComponent" element
                 */
                public void setAbstractDataComponent(net.opengis.swe.x20.AbstractDataComponentType abstractDataComponent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.AbstractDataComponentType target = null;
                      target = (net.opengis.swe.x20.AbstractDataComponentType)get_store().find_element_user(ABSTRACTDATACOMPONENT$1, 0);
                      if (target == null)
                      {
                        target = (net.opengis.swe.x20.AbstractDataComponentType)get_store().add_element_user(ABSTRACTDATACOMPONENT$0);
                      }
                      target.set(abstractDataComponent);
                    }
                }
                
                /**
                 * Appends and returns a new empty "AbstractDataComponent" element
                 */
                public net.opengis.swe.x20.AbstractDataComponentType addNewAbstractDataComponent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.AbstractDataComponentType target = null;
                      target = (net.opengis.swe.x20.AbstractDataComponentType)get_store().add_element_user(ABSTRACTDATACOMPONENT$0);
                      return target;
                    }
                }
            }
            /**
             * An XML MultipleParameterSets(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public static class MultipleParameterSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets
            {
                private static final long serialVersionUID = 1L;
                
                public MultipleParameterSetsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATACHOICE$0 = 
                    new javax.xml.namespace.QName("http://www.opengis.net/swe/2.0", "DataChoice");
                
                
                /**
                 * Gets the "DataChoice" element
                 */
                public net.opengis.swe.x20.DataChoiceType getDataChoice()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.DataChoiceType target = null;
                      target = (net.opengis.swe.x20.DataChoiceType)get_store().find_element_user(DATACHOICE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "DataChoice" element
                 */
                public void setDataChoice(net.opengis.swe.x20.DataChoiceType dataChoice)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.DataChoiceType target = null;
                      target = (net.opengis.swe.x20.DataChoiceType)get_store().find_element_user(DATACHOICE$0, 0);
                      if (target == null)
                      {
                        target = (net.opengis.swe.x20.DataChoiceType)get_store().add_element_user(DATACHOICE$0);
                      }
                      target.set(dataChoice);
                    }
                }
                
                /**
                 * Appends and returns a new empty "DataChoice" element
                 */
                public net.opengis.swe.x20.DataChoiceType addNewDataChoice()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.swe.x20.DataChoiceType target = null;
                      target = (net.opengis.swe.x20.DataChoiceType)get_store().add_element_user(DATACHOICE$0);
                      return target;
                    }
                }
            }
        }
    }
}
