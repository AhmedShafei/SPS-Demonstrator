/*
 * An XML document type.
 * Localname: InsertSensorOffering
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.InsertSensorOfferingDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2;


/**
 * A document containing one InsertSensorOffering(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public interface InsertSensorOfferingDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InsertSensorOfferingDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("insertsensorofferingf37edoctype");
    
    /**
     * Gets the "InsertSensorOffering" element
     */
    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering getInsertSensorOffering();
    
    /**
     * Sets the "InsertSensorOffering" element
     */
    void setInsertSensorOffering(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering insertSensorOffering);
    
    /**
     * Appends and returns a new empty "InsertSensorOffering" element
     */
    org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering addNewInsertSensorOffering();
    
    /**
     * An XML InsertSensorOffering(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public interface InsertSensorOffering extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InsertSensorOffering.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("insertsensorofferingb9e9elemtype");
        
        /**
         * Gets the "SensorOfferingData" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData getSensorOfferingData();
        
        /**
         * Sets the "SensorOfferingData" element
         */
        void setSensorOfferingData(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData sensorOfferingData);
        
        /**
         * Appends and returns a new empty "SensorOfferingData" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData addNewSensorOfferingData();
        
        /**
         * Gets the "SensorInstanceData" element
         */
        org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData getSensorInstanceData();
        
        /**
         * Sets the "SensorInstanceData" element
         */
        void setSensorInstanceData(org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData sensorInstanceData);
        
        /**
         * Appends and returns a new empty "SensorInstanceData" element
         */
        org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData addNewSensorInstanceData();
        
        /**
         * Gets array of all "SensorDescriptionData" elements
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[] getSensorDescriptionDataArray();
        
        /**
         * Gets ith "SensorDescriptionData" element
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData getSensorDescriptionDataArray(int i);
        
        /**
         * Returns number of "SensorDescriptionData" element
         */
        int sizeOfSensorDescriptionDataArray();
        
        /**
         * Sets array of all "SensorDescriptionData" element
         */
        void setSensorDescriptionDataArray(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData[] sensorDescriptionDataArray);
        
        /**
         * Sets ith "SensorDescriptionData" element
         */
        void setSensorDescriptionDataArray(int i, org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData sensorDescriptionData);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SensorDescriptionData" element
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData insertNewSensorDescriptionData(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SensorDescriptionData" element
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData addNewSensorDescriptionData();
        
        /**
         * Removes the ith "SensorDescriptionData" element
         */
        void removeSensorDescriptionData(int i);
        
        /**
         * Gets the "SensorTaskingParametersSet" element
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet getSensorTaskingParametersSet();
        
        /**
         * Sets the "SensorTaskingParametersSet" element
         */
        void setSensorTaskingParametersSet(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet sensorTaskingParametersSet);
        
        /**
         * Appends and returns a new empty "SensorTaskingParametersSet" element
         */
        org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet addNewSensorTaskingParametersSet();
        
        /**
         * Gets the "SensorSetup" element
         */
        org.apache.xmlbeans.XmlObject getSensorSetup();
        
        /**
         * True if has "SensorSetup" element
         */
        boolean isSetSensorSetup();
        
        /**
         * Sets the "SensorSetup" element
         */
        void setSensorSetup(org.apache.xmlbeans.XmlObject sensorSetup);
        
        /**
         * Appends and returns a new empty "SensorSetup" element
         */
        org.apache.xmlbeans.XmlObject addNewSensorSetup();
        
        /**
         * Unsets the "SensorSetup" element
         */
        void unsetSensorSetup();
        
        /**
         * An XML SensorDescriptionData(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public interface SensorDescriptionData extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorDescriptionData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensordescriptiondataa6e1elemtype");
            
            /**
             * Gets the "ProcedureDescriptionFormat" element
             */
            java.lang.String getProcedureDescriptionFormat();
            
            /**
             * Gets (as xml) the "ProcedureDescriptionFormat" element
             */
            org.apache.xmlbeans.XmlAnyURI xgetProcedureDescriptionFormat();
            
            /**
             * Sets the "ProcedureDescriptionFormat" element
             */
            void setProcedureDescriptionFormat(java.lang.String procedureDescriptionFormat);
            
            /**
             * Sets (as xml) the "ProcedureDescriptionFormat" element
             */
            void xsetProcedureDescriptionFormat(org.apache.xmlbeans.XmlAnyURI procedureDescriptionFormat);
            
            /**
             * Gets the "DownloadLink" element
             */
            java.lang.String getDownloadLink();
            
            /**
             * Gets (as xml) the "DownloadLink" element
             */
            org.apache.xmlbeans.XmlAnyURI xgetDownloadLink();
            
            /**
             * Sets the "DownloadLink" element
             */
            void setDownloadLink(java.lang.String downloadLink);
            
            /**
             * Sets (as xml) the "DownloadLink" element
             */
            void xsetDownloadLink(org.apache.xmlbeans.XmlAnyURI downloadLink);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData newInstance() {
                  return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorDescriptionData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SensorTaskingParametersSet(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public interface SensorTaskingParametersSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorTaskingParametersSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensortaskingparameterssetd1daelemtype");
            
            /**
             * Gets the "SingleParameterSet" element
             */
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet getSingleParameterSet();
            
            /**
             * True if has "SingleParameterSet" element
             */
            boolean isSetSingleParameterSet();
            
            /**
             * Sets the "SingleParameterSet" element
             */
            void setSingleParameterSet(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet singleParameterSet);
            
            /**
             * Appends and returns a new empty "SingleParameterSet" element
             */
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet addNewSingleParameterSet();
            
            /**
             * Unsets the "SingleParameterSet" element
             */
            void unsetSingleParameterSet();
            
            /**
             * Gets the "MultipleParameterSets" element
             */
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets getMultipleParameterSets();
            
            /**
             * True if has "MultipleParameterSets" element
             */
            boolean isSetMultipleParameterSets();
            
            /**
             * Sets the "MultipleParameterSets" element
             */
            void setMultipleParameterSets(org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets multipleParameterSets);
            
            /**
             * Appends and returns a new empty "MultipleParameterSets" element
             */
            org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets addNewMultipleParameterSets();
            
            /**
             * Unsets the "MultipleParameterSets" element
             */
            void unsetMultipleParameterSets();
            
            /**
             * An XML SingleParameterSet(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public interface SingleParameterSet extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SingleParameterSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("singleparametersetec5delemtype");
                
                /**
                 * Gets the "AbstractDataComponent" element
                 */
                net.opengis.swe.x20.AbstractDataComponentType getAbstractDataComponent();
                
                /**
                 * Sets the "AbstractDataComponent" element
                 */
                void setAbstractDataComponent(net.opengis.swe.x20.AbstractDataComponentType abstractDataComponent);
                
                /**
                 * Appends and returns a new empty "AbstractDataComponent" element
                 */
                net.opengis.swe.x20.AbstractDataComponentType addNewAbstractDataComponent();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet newInstance() {
                      return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.SingleParameterSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML MultipleParameterSets(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public interface MultipleParameterSets extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MultipleParameterSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("multipleparametersets46e4elemtype");
                
                /**
                 * Gets the "DataChoice" element
                 */
                net.opengis.swe.x20.DataChoiceType getDataChoice();
                
                /**
                 * Sets the "DataChoice" element
                 */
                void setDataChoice(net.opengis.swe.x20.DataChoiceType dataChoice);
                
                /**
                 * Appends and returns a new empty "DataChoice" element
                 */
                net.opengis.swe.x20.DataChoiceType addNewDataChoice();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets newInstance() {
                      return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet.MultipleParameterSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet newInstance() {
                  return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering.SensorTaskingParametersSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering newInstance() {
              return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument.InsertSensorOffering) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument newInstance() {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.InsertSensorOfferingDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.InsertSensorOfferingDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
