
package com.app;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Test", targetNamespace = "http://app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Test {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findFlights", targetNamespace = "http://app.com/", className = "com.app.FindFlights")
    @ResponseWrapper(localName = "findFlightsResponse", targetNamespace = "http://app.com/", className = "com.app.FindFlightsResponse")
    @Action(input = "http://app.com/Test/findFlightsRequest", output = "http://app.com/Test/findFlightsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://app.com/Test/findFlights/Fault/Exception")
    })
    public List<Object> findFlights(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @param flightID
     * @return
     *     returns int
     * @throws ClassNotFoundException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(name = "availableSeats", targetNamespace = "")
    @RequestWrapper(localName = "availableSeats", targetNamespace = "http://app.com/", className = "com.app.AvailableSeats")
    @ResponseWrapper(localName = "availableSeatsResponse", targetNamespace = "http://app.com/", className = "com.app.AvailableSeatsResponse")
    @Action(input = "http://app.com/Test/availableSeatsRequest", output = "http://app.com/Test/availableSeatsResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://app.com/Test/availableSeats/Fault/IOException"),
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://app.com/Test/availableSeats/Fault/ClassNotFoundException")
    })
    public int availableSeats(
        @WebParam(name = "FlightID", targetNamespace = "")
        int flightID)
        throws ClassNotFoundException_Exception, IOException_Exception
    ;

}
