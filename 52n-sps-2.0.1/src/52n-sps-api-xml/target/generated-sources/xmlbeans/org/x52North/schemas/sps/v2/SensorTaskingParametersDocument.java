/*
 * An XML document type.
 * Localname: SensorTaskingParameters
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorTaskingParametersDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2;


/**
 * A document containing one SensorTaskingParameters(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public interface SensorTaskingParametersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorTaskingParametersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensortaskingparametersfba0doctype");
    
    /**
     * Gets the "SensorTaskingParameters" element
     */
    org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters getSensorTaskingParameters();
    
    /**
     * Sets the "SensorTaskingParameters" element
     */
    void setSensorTaskingParameters(org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters sensorTaskingParameters);
    
    /**
     * Appends and returns a new empty "SensorTaskingParameters" element
     */
    org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters addNewSensorTaskingParameters();
    
    /**
     * An XML SensorTaskingParameters(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public interface SensorTaskingParameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorTaskingParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensortaskingparametersdd59elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters newInstance() {
              return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument.SensorTaskingParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument newInstance() {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorTaskingParametersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorTaskingParametersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
