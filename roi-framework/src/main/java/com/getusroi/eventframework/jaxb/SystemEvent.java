//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 02:27:20 PM IST 
//


package com.getusroi.eventframework.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CamelSystemEventBuilder">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="fqcn" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="beanRefid" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://getusroi.com/internalevents/Dispatcher}EventDispatchers"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="description" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="isEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "camelSystemEventBuilder",
    "eventDispatchers"
})
public class SystemEvent
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CamelSystemEventBuilder", required = true)
    protected CamelSystemEventBuilder camelSystemEventBuilder;
    @XmlElement(name = "EventDispatchers", namespace = "http://getusroi.com/internalevents/Dispatcher", required = true)
    protected EventDispatchers eventDispatchers;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "isEnabled", required = true)
    protected boolean isEnabled;

    /**
     * Gets the value of the camelSystemEventBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link CamelSystemEventBuilder }
     *     
     */
    public CamelSystemEventBuilder getCamelSystemEventBuilder() {
        return camelSystemEventBuilder;
    }

    /**
     * Sets the value of the camelSystemEventBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CamelSystemEventBuilder }
     *     
     */
    public void setCamelSystemEventBuilder(CamelSystemEventBuilder value) {
        this.camelSystemEventBuilder = value;
    }

    /**
     * Gets the value of the eventDispatchers property.
     * 
     * @return
     *     possible object is
     *     {@link EventDispatchers }
     *     
     */
    public EventDispatchers getEventDispatchers() {
        return eventDispatchers;
    }

    /**
     * Sets the value of the eventDispatchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDispatchers }
     *     
     */
    public void setEventDispatchers(EventDispatchers value) {
        this.eventDispatchers = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     */
    public void setIsEnabled(boolean value) {
        this.isEnabled = value;
    }

}