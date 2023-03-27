//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.19 at 11:31:31 AM WEST 
//


package pt.up.fc.dcc.eshu.client.eshugwt.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="field" type="{http://www.example.org/EshuConfig}Field"/>
 *       &lt;/all>
 *       &lt;attribute name="defaultValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position" use="required" type="{http://www.example.org/EshuConfig}Position" />
 *       &lt;attribute name="letterCase" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstLetterCase" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disabled" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="alignment" type="{http://www.example.org/EshuConfig}Alignment" />
 *       &lt;attribute name="underlined" type="{http://www.example.org/EshuConfig}UnderlinedValue" />
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="textColor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="textFont" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marginWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="marginHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder = {

})
public class Label {

    @XmlElement(required = true)
    protected Field field;
    @XmlAttribute(name = "defaultValue", required = true)
    protected String defaultValue;
    @XmlAttribute(name = "position", required = true)
    protected Position position;
    @XmlAttribute(name = "letterCase", required = true)
    protected String letterCase;
    @XmlAttribute(name = "firstLetterCase", required = true)
    protected String firstLetterCase;
    @XmlAttribute(name = "disabled", required = true)
    protected boolean disabled;
    @XmlAttribute(name = "alignment")
    protected Alignment alignment;
    @XmlAttribute(name = "underlined")
    protected Integer underlined;
    @XmlAttribute(name = "pattern")
    protected String pattern;
    @XmlAttribute(name = "textColor", required = true)
    protected String textColor;
    @XmlAttribute(name = "textFont", required = true)
    protected String textFont;
    @XmlAttribute(name = "marginWidth", required = true)
    protected BigInteger marginWidth;
    @XmlAttribute(name = "marginHeight", required = true)
    protected BigInteger marginHeight;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setField(Field value) {
        this.field = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the letterCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterCase() {
        return letterCase;
    }

    /**
     * Sets the value of the letterCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterCase(String value) {
        this.letterCase = value;
    }

    /**
     * Gets the value of the firstLetterCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLetterCase() {
        return firstLetterCase;
    }

    /**
     * Sets the value of the firstLetterCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLetterCase(String value) {
        this.firstLetterCase = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link Alignment }
     *     
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alignment }
     *     
     */
    public void setAlignment(Alignment value) {
        this.alignment = value;
    }

    /**
     * Gets the value of the underlined property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderlined() {
        return underlined;
    }

    /**
     * Sets the value of the underlined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderlined(Integer value) {
        this.underlined = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the textFont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextFont() {
        return textFont;
    }

    /**
     * Sets the value of the textFont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextFont(String value) {
        this.textFont = value;
    }

    /**
     * Gets the value of the marginWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginWidth() {
        return marginWidth;
    }

    /**
     * Sets the value of the marginWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginWidth(BigInteger value) {
        this.marginWidth = value;
    }

    /**
     * Gets the value of the marginHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarginHeight() {
        return marginHeight;
    }

    /**
     * Sets the value of the marginHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarginHeight(BigInteger value) {
        this.marginHeight = value;
    }

    @Override
	public String toString() {
		return " {\"underlined\" :" +underlined + ", \"defaultValue\" :" + "\""+defaultValue +"\"" + ", \"position\":" + "\""+position+"\""
				+ ", \"letterCase\" :" + "\""+letterCase + "\""+ ", \"firstLetterCase\" :" + "\""+ firstLetterCase + "\""+ ", \"disabled\" :" + "\""+disabled +"\""
				+ ", \"alignment\":" + "\""+alignment+"\"" + ", \"underlined\":" + "\""+underlined+"\""+ ", \"pattern\":" + "\""+pattern+"\"" 
				+ ", \"textColor\":" + "\""+textColor+"\""+ ", \"textFont\":" + "\""+textFont+"\""+  ", \"marginWidth\":" + "\""+marginWidth+"\""+ 
				 ", \"marginHeight\":" + "\""+marginHeight+"\""+"}";
	}
    
}
