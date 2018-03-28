//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.28 at 12:43:02 PM IST 
//


package com.attunedlabs.datacontext.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="RefDataContext" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="dbBeanRefName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbHost" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbSchema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="dbPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="featureGroup" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="featureName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refDataContext"
})
public class RefDataContexts
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RefDataContext", namespace = "", required = true)
    protected List<RefDataContext> refDataContext;
    @XmlAttribute(name = "featureGroup", required = true)
    protected String featureGroup;
    @XmlAttribute(name = "featureName", required = true)
    protected String featureName;

    /**
     * Gets the value of the refDataContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refDataContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefDataContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefDataContext }
     * 
     * 
     */
    public List<RefDataContext> getRefDataContext() {
        if (refDataContext == null) {
            refDataContext = new ArrayList<RefDataContext>();
        }
        return this.refDataContext;
    }

    /**
     * Gets the value of the featureGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureGroup() {
        return featureGroup;
    }

    /**
     * Sets the value of the featureGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureGroup(String value) {
        this.featureGroup = value;
    }

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

}
