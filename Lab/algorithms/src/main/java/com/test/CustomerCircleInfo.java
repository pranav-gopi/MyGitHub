//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.24 at 04:24:17 PM IST 
//


package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Circle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LRN" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "msisdn",
    "status",
    "customer",
    "circle",
    "lrn"
})
@XmlRootElement(name = "CustomerCircleInfo")
public class CustomerCircleInfo {

    @XmlElement(name = "MSISDN")
    protected long msisdn;
    @XmlElement(name = "Status")
    protected byte status;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "Circle", required = true)
    protected String circle;
    @XmlElement(name = "LRN")
    protected byte lrn;

    /**
     * Gets the value of the msisdn property.
     * 
     */
    public long getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     */
    public void setMSISDN(long value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the circle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircle(String value) {
        this.circle = value;
    }

    /**
     * Gets the value of the lrn property.
     * 
     */
    public byte getLRN() {
        return lrn;
    }

    /**
     * Sets the value of the lrn property.
     * 
     */
    public void setLRN(byte value) {
        this.lrn = value;
    }

}
