/*
 * An XML document type.
 * Localname: SensorOfferingData
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.SensorOfferingDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2;


/**
 * A document containing one SensorOfferingData(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public interface SensorOfferingDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorOfferingDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensorofferingdata85afdoctype");
    
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
     * An XML SensorOfferingData(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public interface SensorOfferingData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorOfferingData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("sensorofferingdatadd89elemtype");
        
        /**
         * Gets the "OfferingIdentifier" element
         */
        java.lang.String getOfferingIdentifier();
        
        /**
         * Gets (as xml) the "OfferingIdentifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetOfferingIdentifier();
        
        /**
         * Sets the "OfferingIdentifier" element
         */
        void setOfferingIdentifier(java.lang.String offeringIdentifier);
        
        /**
         * Sets (as xml) the "OfferingIdentifier" element
         */
        void xsetOfferingIdentifier(org.apache.xmlbeans.XmlAnyURI offeringIdentifier);
        
        /**
         * Gets the "OfferingDescription" element
         */
        java.lang.String getOfferingDescription();
        
        /**
         * Gets (as xml) the "OfferingDescription" element
         */
        org.apache.xmlbeans.XmlString xgetOfferingDescription();
        
        /**
         * True if has "OfferingDescription" element
         */
        boolean isSetOfferingDescription();
        
        /**
         * Sets the "OfferingDescription" element
         */
        void setOfferingDescription(java.lang.String offeringDescription);
        
        /**
         * Sets (as xml) the "OfferingDescription" element
         */
        void xsetOfferingDescription(org.apache.xmlbeans.XmlString offeringDescription);
        
        /**
         * Unsets the "OfferingDescription" element
         */
        void unsetOfferingDescription();
        
        /**
         * Gets array of all "OfferingName" elements
         */
        net.opengis.gml.x32.CodeType[] getOfferingNameArray();
        
        /**
         * Gets ith "OfferingName" element
         */
        net.opengis.gml.x32.CodeType getOfferingNameArray(int i);
        
        /**
         * Returns number of "OfferingName" element
         */
        int sizeOfOfferingNameArray();
        
        /**
         * Sets array of all "OfferingName" element
         */
        void setOfferingNameArray(net.opengis.gml.x32.CodeType[] offeringNameArray);
        
        /**
         * Sets ith "OfferingName" element
         */
        void setOfferingNameArray(int i, net.opengis.gml.x32.CodeType offeringName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OfferingName" element
         */
        net.opengis.gml.x32.CodeType insertNewOfferingName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OfferingName" element
         */
        net.opengis.gml.x32.CodeType addNewOfferingName();
        
        /**
         * Removes the ith "OfferingName" element
         */
        void removeOfferingName(int i);
        
        /**
         * Gets array of all "ObservableProperty" elements
         */
        java.lang.String[] getObservablePropertyArray();
        
        /**
         * Gets ith "ObservableProperty" element
         */
        java.lang.String getObservablePropertyArray(int i);
        
        /**
         * Gets (as xml) array of all "ObservableProperty" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetObservablePropertyArray();
        
        /**
         * Gets (as xml) ith "ObservableProperty" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetObservablePropertyArray(int i);
        
        /**
         * Returns number of "ObservableProperty" element
         */
        int sizeOfObservablePropertyArray();
        
        /**
         * Sets array of all "ObservableProperty" element
         */
        void setObservablePropertyArray(java.lang.String[] observablePropertyArray);
        
        /**
         * Sets ith "ObservableProperty" element
         */
        void setObservablePropertyArray(int i, java.lang.String observableProperty);
        
        /**
         * Sets (as xml) array of all "ObservableProperty" element
         */
        void xsetObservablePropertyArray(org.apache.xmlbeans.XmlAnyURI[] observablePropertyArray);
        
        /**
         * Sets (as xml) ith "ObservableProperty" element
         */
        void xsetObservablePropertyArray(int i, org.apache.xmlbeans.XmlAnyURI observableProperty);
        
        /**
         * Inserts the value as the ith "ObservableProperty" element
         */
        void insertObservableProperty(int i, java.lang.String observableProperty);
        
        /**
         * Appends the value as the last "ObservableProperty" element
         */
        void addObservableProperty(java.lang.String observableProperty);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ObservableProperty" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewObservableProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ObservableProperty" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewObservableProperty();
        
        /**
         * Removes the ith "ObservableProperty" element
         */
        void removeObservableProperty(int i);
        
        /**
         * Gets array of all "RelatedFeature" elements
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[] getRelatedFeatureArray();
        
        /**
         * Gets ith "RelatedFeature" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature getRelatedFeatureArray(int i);
        
        /**
         * Returns number of "RelatedFeature" element
         */
        int sizeOfRelatedFeatureArray();
        
        /**
         * Sets array of all "RelatedFeature" element
         */
        void setRelatedFeatureArray(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature[] relatedFeatureArray);
        
        /**
         * Sets ith "RelatedFeature" element
         */
        void setRelatedFeatureArray(int i, org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature relatedFeature);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "RelatedFeature" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature insertNewRelatedFeature(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "RelatedFeature" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature addNewRelatedFeature();
        
        /**
         * Removes the ith "RelatedFeature" element
         */
        void removeRelatedFeature(int i);
        
        /**
         * Gets the "ObservableArea" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea getObservableArea();
        
        /**
         * Sets the "ObservableArea" element
         */
        void setObservableArea(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea observableArea);
        
        /**
         * Appends and returns a new empty "ObservableArea" element
         */
        org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea addNewObservableArea();
        
        /**
         * An XML RelatedFeature(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public interface RelatedFeature extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedFeature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("relatedfeaturea290elemtype");
            
            /**
             * Gets the "FeatureRelationship" element
             */
            net.opengis.swes.x20.FeatureRelationshipType getFeatureRelationship();
            
            /**
             * Sets the "FeatureRelationship" element
             */
            void setFeatureRelationship(net.opengis.swes.x20.FeatureRelationshipType featureRelationship);
            
            /**
             * Appends and returns a new empty "FeatureRelationship" element
             */
            net.opengis.swes.x20.FeatureRelationshipType addNewFeatureRelationship();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature newInstance() {
                  return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.RelatedFeature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ObservableArea(@http://www.52north.org/schemas/sps/v2).
         *
         * This is a complex type.
         */
        public interface ObservableArea extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservableArea.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("observablearea70b5elemtype");
            
            /**
             * Gets the "byPoint" element
             */
            org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint getByPoint();
            
            /**
             * True if has "byPoint" element
             */
            boolean isSetByPoint();
            
            /**
             * Sets the "byPoint" element
             */
            void setByPoint(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint byPoint);
            
            /**
             * Appends and returns a new empty "byPoint" element
             */
            org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint addNewByPoint();
            
            /**
             * Unsets the "byPoint" element
             */
            void unsetByPoint();
            
            /**
             * Gets the "byPolygon" element
             */
            org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon getByPolygon();
            
            /**
             * True if has "byPolygon" element
             */
            boolean isSetByPolygon();
            
            /**
             * Sets the "byPolygon" element
             */
            void setByPolygon(org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon byPolygon);
            
            /**
             * Appends and returns a new empty "byPolygon" element
             */
            org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon addNewByPolygon();
            
            /**
             * Unsets the "byPolygon" element
             */
            void unsetByPolygon();
            
            /**
             * An XML byPoint(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public interface ByPoint extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ByPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("bypointd570elemtype");
                
                /**
                 * Gets the "Point" element
                 */
                net.opengis.gml.x32.PointType getPoint();
                
                /**
                 * Sets the "Point" element
                 */
                void setPoint(net.opengis.gml.x32.PointType point);
                
                /**
                 * Appends and returns a new empty "Point" element
                 */
                net.opengis.gml.x32.PointType addNewPoint();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint newInstance() {
                      return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML byPolygon(@http://www.52north.org/schemas/sps/v2).
             *
             * This is a complex type.
             */
            public interface ByPolygon extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ByPolygon.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCA840F2C01EF5927BF5882D4BA0FB2B0").resolveHandle("bypolygon8b46elemtype");
                
                /**
                 * Gets the "Polygon" element
                 */
                net.opengis.gml.x32.PolygonType getPolygon();
                
                /**
                 * Sets the "Polygon" element
                 */
                void setPolygon(net.opengis.gml.x32.PolygonType polygon);
                
                /**
                 * Appends and returns a new empty "Polygon" element
                 */
                net.opengis.gml.x32.PolygonType addNewPolygon();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon newInstance() {
                      return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea.ByPolygon) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea newInstance() {
                  return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData.ObservableArea) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData newInstance() {
              return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument.SensorOfferingData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument newInstance() {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.x52North.schemas.sps.v2.SensorOfferingDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.x52North.schemas.sps.v2.SensorOfferingDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
