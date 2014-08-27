/*
 * An XML document type.
 * Localname: SensorOfferingData
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorOfferingDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2.impl;
/**
 * A document containing one SensorOfferingData(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public class SensorOfferingDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorOfferingDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSOROFFERINGDATA$0 = 
        new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "SensorOfferingData");
    
    
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
     * An XML SensorOfferingData(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public static class SensorOfferingDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData
    {
        private static final long serialVersionUID = 1L;
        
        public SensorOfferingDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OFFERINGIDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "OfferingIdentifier");
        private static final javax.xml.namespace.QName OFFERINGDESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "OfferingDescription");
        private static final javax.xml.namespace.QName OFFERINGNAME$4 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "OfferingName");
        private static final javax.xml.namespace.QName OBSERVABLEPROPERTY$6 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "ObservableProperty");
        private static final javax.xml.namespace.QName RELATEDFEATURE$8 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "RelatedFeature");
        private static final javax.xml.namespace.QName OBSERVABLEAREA$10 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "ObservableArea");
        
        
        /**
         * Gets the "OfferingIdentifier" element
         */
        public java.lang.String getOfferingIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINGIDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OfferingIdentifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetOfferingIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OFFERINGIDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OfferingIdentifier" element
         */
        public void setOfferingIdentifier(java.lang.String offeringIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINGIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERINGIDENTIFIER$0);
                }
                target.setStringValue(offeringIdentifier);
            }
        }
        
        /**
         * Sets (as xml) the "OfferingIdentifier" element
         */
        public void xsetOfferingIdentifier(org.apache.xmlbeans.XmlAnyURI offeringIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OFFERINGIDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(OFFERINGIDENTIFIER$0);
                }
                target.set(offeringIdentifier);
            }
        }
        
        /**
         * Gets the "OfferingDescription" element
         */
        public java.lang.String getOfferingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINGDESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OfferingDescription" element
         */
        public org.apache.xmlbeans.XmlString xgetOfferingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINGDESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "OfferingDescription" element
         */
        public boolean isSetOfferingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERINGDESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "OfferingDescription" element
         */
        public void setOfferingDescription(java.lang.String offeringDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OFFERINGDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OFFERINGDESCRIPTION$2);
                }
                target.setStringValue(offeringDescription);
            }
        }
        
        /**
         * Sets (as xml) the "OfferingDescription" element
         */
        public void xsetOfferingDescription(org.apache.xmlbeans.XmlString offeringDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OFFERINGDESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OFFERINGDESCRIPTION$2);
                }
                target.set(offeringDescription);
            }
        }
        
        /**
         * Unsets the "OfferingDescription" element
         */
        public void unsetOfferingDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERINGDESCRIPTION$2, 0);
            }
        }
        
        /**
         * Gets array of all "OfferingName" elements
         */
        public net.opengis.gml.x32.CodeType[] getOfferingNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OFFERINGNAME$4, targetList);
                net.opengis.gml.x32.CodeType[] result = new net.opengis.gml.x32.CodeType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "OfferingName" element
         */
        public net.opengis.gml.x32.CodeType getOfferingNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.CodeType target = null;
                target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(OFFERINGNAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "OfferingName" element
         */
        public int sizeOfOfferingNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OFFERINGNAME$4);
            }
        }
        
        /**
         * Sets array of all "OfferingName" element
         */
        public void setOfferingNameArray(net.opengis.gml.x32.CodeType[] offeringNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(offeringNameArray, OFFERINGNAME$4);
            }
        }
        
        /**
         * Sets ith "OfferingName" element
         */
        public void setOfferingNameArray(int i, net.opengis.gml.x32.CodeType offeringName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.CodeType target = null;
                target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(OFFERINGNAME$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(offeringName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OfferingName" element
         */
        public net.opengis.gml.x32.CodeType insertNewOfferingName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.CodeType target = null;
                target = (net.opengis.gml.x32.CodeType)get_store().insert_element_user(OFFERINGNAME$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OfferingName" element
         */
        public net.opengis.gml.x32.CodeType addNewOfferingName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.CodeType target = null;
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(OFFERINGNAME$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "OfferingName" element
         */
        public void removeOfferingName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OFFERINGNAME$4, i);
            }
        }
        
        /**
         * Gets array of all "ObservableProperty" elements
         */
        public java.lang.String[] getObservablePropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBSERVABLEPROPERTY$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "ObservableProperty" element
         */
        public java.lang.String getObservablePropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVABLEPROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "ObservableProperty" elements
         */
        public org.apache.xmlbeans.XmlAnyURI[] xgetObservablePropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBSERVABLEPROPERTY$6, targetList);
                org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "ObservableProperty" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetObservablePropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBSERVABLEPROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlAnyURI)target;
            }
        }
        
        /**
         * Returns number of "ObservableProperty" element
         */
        public int sizeOfObservablePropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBSERVABLEPROPERTY$6);
            }
        }
        
        /**
         * Sets array of all "ObservableProperty" element
         */
        public void setObservablePropertyArray(java.lang.String[] observablePropertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(observablePropertyArray, OBSERVABLEPROPERTY$6);
            }
        }
        
        /**
         * Sets ith "ObservableProperty" element
         */
        public void setObservablePropertyArray(int i, java.lang.String observableProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVABLEPROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(observableProperty);
            }
        }
        
        /**
         * Sets (as xml) array of all "ObservableProperty" element
         */
        public void xsetObservablePropertyArray(org.apache.xmlbeans.XmlAnyURI[]observablePropertyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(observablePropertyArray, OBSERVABLEPROPERTY$6);
            }
        }
        
        /**
         * Sets (as xml) ith "ObservableProperty" element
         */
        public void xsetObservablePropertyArray(int i, org.apache.xmlbeans.XmlAnyURI observableProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBSERVABLEPROPERTY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(observableProperty);
            }
        }
        
        /**
         * Inserts the value as the ith "ObservableProperty" element
         */
        public void insertObservableProperty(int i, java.lang.String observableProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OBSERVABLEPROPERTY$6, i);
                target.setStringValue(observableProperty);
            }
        }
        
        /**
         * Appends the value as the last "ObservableProperty" element
         */
        public void addObservableProperty(java.lang.String observableProperty)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBSERVABLEPROPERTY$6);
                target.setStringValue(observableProperty);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObservableProperty" element
         */
        public org.apache.xmlbeans.XmlAnyURI insertNewObservableProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(OBSERVABLEPROPERTY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObservableProperty" element
         */
        public org.apache.xmlbeans.XmlAnyURI addNewObservableProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(OBSERVABLEPROPERTY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "ObservableProperty" element
         */
        public void removeObservableProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBSERVABLEPROPERTY$6, i);
            }
        }
        
        /**
         * Gets array of all "RelatedFeature" elements
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[] getRelatedFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RELATEDFEATURE$8, targetList);
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[] result = new org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "RelatedFeature" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature getRelatedFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature)get_store().find_element_user(RELATEDFEATURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "RelatedFeature" element
         */
        public int sizeOfRelatedFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDFEATURE$8);
            }
        }
        
        /**
         * Sets array of all "RelatedFeature" element
         */
        public void setRelatedFeatureArray(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[] relatedFeatureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(relatedFeatureArray, RELATEDFEATURE$8);
            }
        }
        
        /**
         * Sets ith "RelatedFeature" element
         */
        public void setRelatedFeatureArray(int i, org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature relatedFeature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature)get_store().find_element_user(RELATEDFEATURE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(relatedFeature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RelatedFeature" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature insertNewRelatedFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature)get_store().insert_element_user(RELATEDFEATURE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RelatedFeature" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature addNewRelatedFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature)get_store().add_element_user(RELATEDFEATURE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "RelatedFeature" element
         */
        public void removeRelatedFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDFEATURE$8, i);
            }
        }
        
        /**
         * Gets the "ObservableArea" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea getObservableArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea)get_store().find_element_user(OBSERVABLEAREA$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ObservableArea" element
         */
        public void setObservableArea(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea observableArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea)get_store().find_element_user(OBSERVABLEAREA$10, 0);
                if (target == null)
                {
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea)get_store().add_element_user(OBSERVABLEAREA$10);
                }
                target.set(observableArea);
            }
        }
        
        /**
         * Appends and returns a new empty "ObservableArea" element
         */
        public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea addNewObservableArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea target = null;
                target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea)get_store().add_element_user(OBSERVABLEAREA$10);
                return target;
            }
        }
        /**
         * An XML RelatedFeature(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public static class RelatedFeatureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature
        {
            private static final long serialVersionUID = 1L;
            
            public RelatedFeatureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName FEATURERELATIONSHIP$0 = 
                new javax.xml.namespace.QName("http://www.opengis.net/swes/2.0", "FeatureRelationship");
            
            
            /**
             * Gets the "FeatureRelationship" element
             */
            public net.opengis.swes.x20.FeatureRelationshipType getFeatureRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.swes.x20.FeatureRelationshipType target = null;
                    target = (net.opengis.swes.x20.FeatureRelationshipType)get_store().find_element_user(FEATURERELATIONSHIP$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "FeatureRelationship" element
             */
            public void setFeatureRelationship(net.opengis.swes.x20.FeatureRelationshipType featureRelationship)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.swes.x20.FeatureRelationshipType target = null;
                    target = (net.opengis.swes.x20.FeatureRelationshipType)get_store().find_element_user(FEATURERELATIONSHIP$0, 0);
                    if (target == null)
                    {
                      target = (net.opengis.swes.x20.FeatureRelationshipType)get_store().add_element_user(FEATURERELATIONSHIP$0);
                    }
                    target.set(featureRelationship);
                }
            }
            
            /**
             * Appends and returns a new empty "FeatureRelationship" element
             */
            public net.opengis.swes.x20.FeatureRelationshipType addNewFeatureRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    net.opengis.swes.x20.FeatureRelationshipType target = null;
                    target = (net.opengis.swes.x20.FeatureRelationshipType)get_store().add_element_user(FEATURERELATIONSHIP$0);
                    return target;
                }
            }
        }
        /**
         * An XML ObservableArea(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public static class ObservableAreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea
        {
            private static final long serialVersionUID = 1L;
            
            public ObservableAreaImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BYPOINT$0 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "byPoint");
            private static final javax.xml.namespace.QName BYPOLYGON$2 = 
                new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "byPolygon");
            
            
            /**
             * Gets the "byPoint" element
             */
            public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint getByPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint)get_store().find_element_user(BYPOINT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "byPoint" element
             */
            public boolean isSetByPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BYPOINT$0) != 0;
                }
            }
            
            /**
             * Sets the "byPoint" element
             */
            public void setByPoint(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint byPoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint)get_store().find_element_user(BYPOINT$0, 0);
                    if (target == null)
                    {
                      target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint)get_store().add_element_user(BYPOINT$0);
                    }
                    target.set(byPoint);
                }
            }
            
            /**
             * Appends and returns a new empty "byPoint" element
             */
            public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint addNewByPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint)get_store().add_element_user(BYPOINT$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "byPoint" element
             */
            public void unsetByPoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BYPOINT$0, 0);
                }
            }
            
            /**
             * Gets the "byPolygon" element
             */
            public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon getByPolygon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon)get_store().find_element_user(BYPOLYGON$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "byPolygon" element
             */
            public boolean isSetByPolygon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(BYPOLYGON$2) != 0;
                }
            }
            
            /**
             * Sets the "byPolygon" element
             */
            public void setByPolygon(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon byPolygon)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon)get_store().find_element_user(BYPOLYGON$2, 0);
                    if (target == null)
                    {
                      target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon)get_store().add_element_user(BYPOLYGON$2);
                    }
                    target.set(byPolygon);
                }
            }
            
            /**
             * Appends and returns a new empty "byPolygon" element
             */
            public org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon addNewByPolygon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon target = null;
                    target = (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon)get_store().add_element_user(BYPOLYGON$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "byPolygon" element
             */
            public void unsetByPolygon()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(BYPOLYGON$2, 0);
                }
            }
            /**
             * An XML byPoint(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public static class ByPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint
            {
                private static final long serialVersionUID = 1L;
                
                public ByPointImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName POINT$0 = 
                    new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point");
                
                
                /**
                 * Gets the "Point" element
                 */
                public net.opengis.gml.x32.PointType getPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PointType target = null;
                      target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Point" element
                 */
                public void setPoint(net.opengis.gml.x32.PointType point)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PointType target = null;
                      target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$0, 0);
                      if (target == null)
                      {
                        target = (net.opengis.gml.x32.PointType)get_store().add_element_user(POINT$0);
                      }
                      target.set(point);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Point" element
                 */
                public net.opengis.gml.x32.PointType addNewPoint()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PointType target = null;
                      target = (net.opengis.gml.x32.PointType)get_store().add_element_user(POINT$0);
                      return target;
                    }
                }
            }
            /**
             * An XML byPolygon(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public static class ByPolygonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon
            {
                private static final long serialVersionUID = 1L;
                
                public ByPolygonImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName POLYGON$0 = 
                    new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon");
                
                
                /**
                 * Gets the "Polygon" element
                 */
                public net.opengis.gml.x32.PolygonType getPolygon()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PolygonType target = null;
                      target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Polygon" element
                 */
                public void setPolygon(net.opengis.gml.x32.PolygonType polygon)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PolygonType target = null;
                      target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, 0);
                      if (target == null)
                      {
                        target = (net.opengis.gml.x32.PolygonType)get_store().add_element_user(POLYGON$0);
                      }
                      target.set(polygon);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Polygon" element
                 */
                public net.opengis.gml.x32.PolygonType addNewPolygon()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      net.opengis.gml.x32.PolygonType target = null;
                      target = (net.opengis.gml.x32.PolygonType)get_store().add_element_user(POLYGON$0);
                      return target;
                    }
                }
            }
        }
    }
}
