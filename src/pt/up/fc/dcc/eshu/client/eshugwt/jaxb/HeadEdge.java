//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.19 at 11:31:31 AM WEST 
//


package pt.up.fc.dcc.eshu.client.eshugwt.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Head_Edge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Head_Edge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fill" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dash" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Head_Edge")
public class HeadEdge {

    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "fill", required = true)
    protected String fill;
    @XmlAttribute(name = "dash", required = true)
    protected String dash;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the dash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDash() {
        return dash;
    }

    /**
     * Sets the value of the dash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDash(String value) {
        this.dash = value;
    }
    
    
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{\"type\" :" + "\""+ type + "\""+ ", \"fill\" :" + "\"" +fill +"\"" + ", \"dash\" :" + "\"" +dash + "\"" + "}";
	}

}
