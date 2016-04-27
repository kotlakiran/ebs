
package com.app;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ClassNotFoundException", targetNamespace = "http://app.com/")
public class ClassNotFoundException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ClassNotFoundException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ClassNotFoundException_Exception(String message, ClassNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ClassNotFoundException_Exception(String message, ClassNotFoundException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.app.ClassNotFoundException
     */
    public ClassNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
