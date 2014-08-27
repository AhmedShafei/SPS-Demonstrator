/*
 * An XML document type.
 * Localname: SensorInstanceData
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorInstanceDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2;


/**
 * A document containing one SensorInstanceData(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public interface SensorInstanceDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorInstanceDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensorinstancedatae77edoctype");
    
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
     * An XML SensorInstanceData(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public interface SensorInstanceData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorInstanceData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensorinstancedata64e9elemtype");
        
        /**
         * Gets the "Procedure" element
         */
        org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure getProcedure();
        
        /**
         * Sets the "Procedure" element
         */
        void setProcedure(org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure procedure);
        
        /**
         * Appends and returns a new empty "Procedure" element
         */
        org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure addNewProcedure();
        
        /**
         * Gets the "SensorPluginType" element
         */
        java.lang.String getSensorPluginType();
        
        /**
         * Gets (as xml) the "SensorPluginType" element
         */
        org.apache.xmlbeans.XmlString xgetSensorPluginType();
        
        /**
         * True if has "SensorPluginType" element
         */
        boolean isSetSensorPluginType();
        
        /**
         * Sets the "SensorPluginType" element
         */
        void setSensorPluginType(java.lang.String sensorPluginType);
        
        /**
         * Sets (as xml) the "SensorPluginType" element
         */
        void xsetSensorPluginType(org.apache.xmlbeans.XmlString sensorPluginType);
        
        /**
         * Unsets the "SensorPluginType" element
         */
        void unsetSensorPluginType();
        
        /**
         * Gets the "Reference" element
         */
        net.opengis.ows.x11.ReferenceType getReference();
        
        /**
         * Sets the "Reference" element
         */
        void setReference(net.opengis.ows.x11.ReferenceType reference);
        
        /**
         * Appends and returns a new empty "Reference" element
         */
        net.opengis.ows.x11.ReferenceType addNewReference();
        
        /**
         * An XML Procedure(@http://www.52north.org/schemas/sps/v2).
         *
         * This is an atomic type that is a restriction of org.x52North.schemas.sps.v2.SensorInstanceDataDocument$SensorInstanceData$Procedure.
         */
        public interface Procedure extends org.apache.xmlbeans.XmlAnyURI
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Procedure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("procedure9408elemtype");
            
            /**
             * Gets the "separator" attribute
             */
            java.lang.String getSeparator();
            
            /**
             * Gets (as xml) the "separator" attribute
             */
            org.apache.xmlbeans.XmlString xgetSeparator();
            
            /**
             * True if has "separator" attribute
             */
            boolean isSetSeparator();
            
            /**
             * Sets the "separator" attribute
             */
            void setSeparator(java.lang.String separator);
            
            /**
             * Sets (as xml) the "separator" attribute
             */
            void xsetSeparator(org.apache.xmlbeans.XmlString separator);
            
            /**
             * Unsets the "separator" attribute
             */
            void unsetSeparator();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure newInstance() {
                  return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData.Procedure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData newInstance() {
              return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument.SensorInstanceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument newInstance() {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorInstanceDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorInstanceDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
