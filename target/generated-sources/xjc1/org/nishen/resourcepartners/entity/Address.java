//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.27 at 11:50:46 AM AEST 
//


package org.nishen.resourcepartners.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A partner's specific address.
 * 
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="line4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="line5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="state_province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postal_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address_note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="address_types" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="address_type"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="order"/&gt;
 *                         &lt;enumeration value="claim"/&gt;
 *                         &lt;enumeration value="payment"/&gt;
 *                         &lt;enumeration value="returns"/&gt;
 *                         &lt;enumeration value="billing"/&gt;
 *                         &lt;enumeration value="shipping"/&gt;
 *                         &lt;enumeration value="ALL"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {

})
public class Address
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String line1;
    protected String line2;
    protected String line3;
    protected String line4;
    protected String line5;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "state_province")
    protected String stateProvince;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    protected Address.Country country;
    @XmlElement(name = "address_note")
    protected String addressNote;
    @XmlElement(name = "start_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "address_types")
    protected Address.AddressTypes addressTypes;
    @XmlAttribute(name = "preferred")
    protected Boolean preferred;

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the line5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the value of the line5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine5(String value) {
        this.line5 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvince(String value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Address.Country }
     *     
     */
    public Address.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address.Country }
     *     
     */
    public void setCountry(Address.Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the addressNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNote() {
        return addressNote;
    }

    /**
     * Sets the value of the addressNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNote(String value) {
        this.addressNote = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the addressTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Address.AddressTypes }
     *     
     */
    public Address.AddressTypes getAddressTypes() {
        return addressTypes;
    }

    /**
     * Sets the value of the addressTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address.AddressTypes }
     *     
     */
    public void setAddressTypes(Address.AddressTypes value) {
        this.addressTypes = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreferred() {
        if (preferred == null) {
            return false;
        } else {
            return preferred;
        }
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theLine1;
            theLine1 = this.getLine1();
            strategy.appendField(locator, this, "line1", buffer, theLine1);
        }
        {
            String theLine2;
            theLine2 = this.getLine2();
            strategy.appendField(locator, this, "line2", buffer, theLine2);
        }
        {
            String theLine3;
            theLine3 = this.getLine3();
            strategy.appendField(locator, this, "line3", buffer, theLine3);
        }
        {
            String theLine4;
            theLine4 = this.getLine4();
            strategy.appendField(locator, this, "line4", buffer, theLine4);
        }
        {
            String theLine5;
            theLine5 = this.getLine5();
            strategy.appendField(locator, this, "line5", buffer, theLine5);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            String theStateProvince;
            theStateProvince = this.getStateProvince();
            strategy.appendField(locator, this, "stateProvince", buffer, theStateProvince);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode);
        }
        {
            Address.Country theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        {
            String theAddressNote;
            theAddressNote = this.getAddressNote();
            strategy.appendField(locator, this, "addressNote", buffer, theAddressNote);
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            strategy.appendField(locator, this, "startDate", buffer, theStartDate);
        }
        {
            XMLGregorianCalendar theEndDate;
            theEndDate = this.getEndDate();
            strategy.appendField(locator, this, "endDate", buffer, theEndDate);
        }
        {
            Address.AddressTypes theAddressTypes;
            theAddressTypes = this.getAddressTypes();
            strategy.appendField(locator, this, "addressTypes", buffer, theAddressTypes);
        }
        {
            boolean thePreferred;
            thePreferred = ((this.preferred!= null)?this.isPreferred():false);
            strategy.appendField(locator, this, "preferred", buffer, thePreferred);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Address)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Address that = ((Address) object);
        {
            String lhsLine1;
            lhsLine1 = this.getLine1();
            String rhsLine1;
            rhsLine1 = that.getLine1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line1", lhsLine1), LocatorUtils.property(thatLocator, "line1", rhsLine1), lhsLine1, rhsLine1)) {
                return false;
            }
        }
        {
            String lhsLine2;
            lhsLine2 = this.getLine2();
            String rhsLine2;
            rhsLine2 = that.getLine2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line2", lhsLine2), LocatorUtils.property(thatLocator, "line2", rhsLine2), lhsLine2, rhsLine2)) {
                return false;
            }
        }
        {
            String lhsLine3;
            lhsLine3 = this.getLine3();
            String rhsLine3;
            rhsLine3 = that.getLine3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line3", lhsLine3), LocatorUtils.property(thatLocator, "line3", rhsLine3), lhsLine3, rhsLine3)) {
                return false;
            }
        }
        {
            String lhsLine4;
            lhsLine4 = this.getLine4();
            String rhsLine4;
            rhsLine4 = that.getLine4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line4", lhsLine4), LocatorUtils.property(thatLocator, "line4", rhsLine4), lhsLine4, rhsLine4)) {
                return false;
            }
        }
        {
            String lhsLine5;
            lhsLine5 = this.getLine5();
            String rhsLine5;
            rhsLine5 = that.getLine5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line5", lhsLine5), LocatorUtils.property(thatLocator, "line5", rhsLine5), lhsLine5, rhsLine5)) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
                return false;
            }
        }
        {
            String lhsStateProvince;
            lhsStateProvince = this.getStateProvince();
            String rhsStateProvince;
            rhsStateProvince = that.getStateProvince();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateProvince", lhsStateProvince), LocatorUtils.property(thatLocator, "stateProvince", rhsStateProvince), lhsStateProvince, rhsStateProvince)) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode)) {
                return false;
            }
        }
        {
            Address.Country lhsCountry;
            lhsCountry = this.getCountry();
            Address.Country rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry)) {
                return false;
            }
        }
        {
            String lhsAddressNote;
            lhsAddressNote = this.getAddressNote();
            String rhsAddressNote;
            rhsAddressNote = that.getAddressNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressNote", lhsAddressNote), LocatorUtils.property(thatLocator, "addressNote", rhsAddressNote), lhsAddressNote, rhsAddressNote)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsStartDate;
            lhsStartDate = this.getStartDate();
            XMLGregorianCalendar rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndDate;
            lhsEndDate = this.getEndDate();
            XMLGregorianCalendar rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate)) {
                return false;
            }
        }
        {
            Address.AddressTypes lhsAddressTypes;
            lhsAddressTypes = this.getAddressTypes();
            Address.AddressTypes rhsAddressTypes;
            rhsAddressTypes = that.getAddressTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressTypes", lhsAddressTypes), LocatorUtils.property(thatLocator, "addressTypes", rhsAddressTypes), lhsAddressTypes, rhsAddressTypes)) {
                return false;
            }
        }
        {
            boolean lhsPreferred;
            lhsPreferred = ((this.preferred!= null)?this.isPreferred():false);
            boolean rhsPreferred;
            rhsPreferred = ((that.preferred!= null)?that.isPreferred():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferred", lhsPreferred), LocatorUtils.property(thatLocator, "preferred", rhsPreferred), lhsPreferred, rhsPreferred)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theLine1;
            theLine1 = this.getLine1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line1", theLine1), currentHashCode, theLine1);
        }
        {
            String theLine2;
            theLine2 = this.getLine2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line2", theLine2), currentHashCode, theLine2);
        }
        {
            String theLine3;
            theLine3 = this.getLine3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line3", theLine3), currentHashCode, theLine3);
        }
        {
            String theLine4;
            theLine4 = this.getLine4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line4", theLine4), currentHashCode, theLine4);
        }
        {
            String theLine5;
            theLine5 = this.getLine5();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line5", theLine5), currentHashCode, theLine5);
        }
        {
            String theCity;
            theCity = this.getCity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode, theCity);
        }
        {
            String theStateProvince;
            theStateProvince = this.getStateProvince();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateProvince", theStateProvince), currentHashCode, theStateProvince);
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode);
        }
        {
            Address.Country theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry);
        }
        {
            String theAddressNote;
            theAddressNote = this.getAddressNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressNote", theAddressNote), currentHashCode, theAddressNote);
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate);
        }
        {
            XMLGregorianCalendar theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate);
        }
        {
            Address.AddressTypes theAddressTypes;
            theAddressTypes = this.getAddressTypes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressTypes", theAddressTypes), currentHashCode, theAddressTypes);
        }
        {
            boolean thePreferred;
            thePreferred = ((this.preferred!= null)?this.isPreferred():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferred", thePreferred), currentHashCode, thePreferred);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * Address types.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="address_type"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="order"/&gt;
     *               &lt;enumeration value="claim"/&gt;
     *               &lt;enumeration value="payment"/&gt;
     *               &lt;enumeration value="returns"/&gt;
     *               &lt;enumeration value="billing"/&gt;
     *               &lt;enumeration value="shipping"/&gt;
     *               &lt;enumeration value="ALL"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressType"
    })
    public static class AddressTypes
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "address_type")
        protected List<String> addressType;

        /**
         * Gets the value of the addressType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAddressType() {
            if (addressType == null) {
                addressType = new ArrayList<String>();
            }
            return this.addressType;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                List<String> theAddressType;
                theAddressType = (((this.addressType!= null)&&(!this.addressType.isEmpty()))?this.getAddressType():null);
                strategy.appendField(locator, this, "addressType", buffer, theAddressType);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Address.AddressTypes)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Address.AddressTypes that = ((Address.AddressTypes) object);
            {
                List<String> lhsAddressType;
                lhsAddressType = (((this.addressType!= null)&&(!this.addressType.isEmpty()))?this.getAddressType():null);
                List<String> rhsAddressType;
                rhsAddressType = (((that.addressType!= null)&&(!that.addressType.isEmpty()))?that.getAddressType():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "addressType", lhsAddressType), LocatorUtils.property(thatLocator, "addressType", rhsAddressType), lhsAddressType, rhsAddressType)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<String> theAddressType;
                theAddressType = (((this.addressType!= null)&&(!this.addressType.isEmpty()))?this.getAddressType():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressType", theAddressType), currentHashCode, theAddressType);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Country
        implements Equals, HashCode, ToString
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "desc")
        protected String desc;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesc(String value) {
            this.desc = value;
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
            }
            {
                String theDesc;
                theDesc = this.getDesc();
                strategy.appendField(locator, this, "desc", buffer, theDesc);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Address.Country)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Address.Country that = ((Address.Country) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                    return false;
                }
            }
            {
                String lhsDesc;
                lhsDesc = this.getDesc();
                String rhsDesc;
                rhsDesc = that.getDesc();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                String theValue;
                theValue = this.getValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
            }
            {
                String theDesc;
                theDesc = this.getDesc();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}