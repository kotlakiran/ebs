
package com.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for availableSeats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availableSeats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableSeats", propOrder = {
    "flightID"
})
public class AvailableSeats {

    @XmlElement(name = "FlightID")
    protected int flightID;

    /**
     * Gets the value of the flightID property.
     * 
     */
    public int getFlightID() {
        return flightID;
    }

    /**
     * Sets the value of the flightID property.
     * 
     */
    public void setFlightID(int value) {
        this.flightID = value;
    }

}
