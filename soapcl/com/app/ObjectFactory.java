
package com.app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.app package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://app.com/", "Exception");
    private final static QName _AvailableSeatsResponse_QNAME = new QName("http://app.com/", "availableSeatsResponse");
    private final static QName _FindFlightsResponse_QNAME = new QName("http://app.com/", "findFlightsResponse");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://app.com/", "ClassNotFoundException");
    private final static QName _IOException_QNAME = new QName("http://app.com/", "IOException");
    private final static QName _AvailableSeats_QNAME = new QName("http://app.com/", "availableSeats");
    private final static QName _FindFlights_QNAME = new QName("http://app.com/", "findFlights");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FindFlightsResponse }
     * 
     */
    public FindFlightsResponse createFindFlightsResponse() {
        return new FindFlightsResponse();
    }

    /**
     * Create an instance of {@link AvailableSeatsResponse }
     * 
     */
    public AvailableSeatsResponse createAvailableSeatsResponse() {
        return new AvailableSeatsResponse();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link AvailableSeats }
     * 
     */
    public AvailableSeats createAvailableSeats() {
        return new AvailableSeats();
    }

    /**
     * Create an instance of {@link FindFlights }
     * 
     */
    public FindFlights createFindFlights() {
        return new FindFlights();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "availableSeatsResponse")
    public JAXBElement<AvailableSeatsResponse> createAvailableSeatsResponse(AvailableSeatsResponse value) {
        return new JAXBElement<AvailableSeatsResponse>(_AvailableSeatsResponse_QNAME, AvailableSeatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "findFlightsResponse")
    public JAXBElement<FindFlightsResponse> createFindFlightsResponse(FindFlightsResponse value) {
        return new JAXBElement<FindFlightsResponse>(_FindFlightsResponse_QNAME, FindFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "availableSeats")
    public JAXBElement<AvailableSeats> createAvailableSeats(AvailableSeats value) {
        return new JAXBElement<AvailableSeats>(_AvailableSeats_QNAME, AvailableSeats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app.com/", name = "findFlights")
    public JAXBElement<FindFlights> createFindFlights(FindFlights value) {
        return new JAXBElement<FindFlights>(_FindFlights_QNAME, FindFlights.class, null, value);
    }

}
