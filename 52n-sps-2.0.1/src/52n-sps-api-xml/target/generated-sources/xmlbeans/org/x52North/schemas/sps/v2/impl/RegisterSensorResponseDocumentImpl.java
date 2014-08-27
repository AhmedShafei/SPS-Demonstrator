/*
 * An XML document type.
 * Localname: RegisterSensorResponse
 * Namespace: http://www.52north.org/schemas/sps/v2
 * Java type: org.x52North.schemas.sps.v2.RegisterSensorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.x52North.schemas.sps.v2.impl;
/**
 * A document containing one RegisterSensorResponse(@http://www.52north.org/schemas/sps/v2) element.
 *
 * This is a complex type.
 */
public class RegisterSensorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.RegisterSensorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterSensorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERSENSORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "RegisterSensorResponse");
    
    
    /**
     * Gets the "RegisterSensorResponse" element
     */
    public org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse getRegisterSensorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse target = null;
            target = (org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse)get_store().find_element_user(REGISTERSENSORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterSensorResponse" element
     */
    public void setRegisterSensorResponse(org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse registerSensorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse target = null;
            target = (org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse)get_store().find_element_user(REGISTERSENSORRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse)get_store().add_element_user(REGISTERSENSORRESPONSE$0);
            }
            target.set(registerSensorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterSensorResponse" element
     */
    public org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse addNewRegisterSensorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse target = null;
            target = (org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse)get_store().add_element_user(REGISTERSENSORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RegisterSensorResponse(@http://www.52north.org/schemas/sps/v2).
     *
     * This is a complex type.
     */
    public static class RegisterSensorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.x52North.schemas.sps.v2.RegisterSensorResponseDocument.RegisterSensorResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RegisterSensorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "identifier");
        private static final javax.xml.namespace.QName STATUS$2 = 
            new javax.xml.namespace.QName("http://www.52north.org/schemas/sps/v2", "status");
        
        
        /**
         * Gets the "identifier" element
         */
        public org.apache.xmlbeans.XmlObject getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(org.apache.xmlbeans.XmlObject identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Appends and returns a new empty "identifier" element
         */
        public org.apache.xmlbeans.XmlObject addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Gets the "status" element
         */
        public org.apache.xmlbeans.XmlObject getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(org.apache.xmlbeans.XmlObject status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(STATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(STATUS$2);
                }
                target.set(status);
            }
        }
        
        /**
         * Appends and returns a new empty "status" element
         */
        public org.apache.xmlbeans.XmlObject addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(STATUS$2);
                return target;
            }
        }
    }
}
