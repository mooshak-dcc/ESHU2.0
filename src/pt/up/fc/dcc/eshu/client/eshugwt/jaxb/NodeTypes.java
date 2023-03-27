//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.19 at 11:31:31 AM WEST 
//


package pt.up.fc.dcc.eshu.client.eshugwt.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="label" type="{http://www.example.org/EshuConfig}Label"/>
 *         &lt;element name="containers" type="{http://www.example.org/EshuConfig}Containers" minOccurs="0"/>
 *         &lt;element name="isConfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeElement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rotation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="infoUrlNode" type="{http://www.example.org/EshuConfig}InfoUrl"/>
 *         &lt;element name="handlers" type="{http://www.example.org/EshuConfig}Handlers"/>
 *         &lt;element name="anchors" type="{http://www.example.org/EshuConfig}Anchors"/>
 *         &lt;element name="propertiesNode" type="{http://www.example.org/EshuConfig}Properties"/>
 *         &lt;element name="featuresNode" type="{http://www.example.org/EshuConfig}Features"/>
 *         &lt;element name="nodeStyle" type="{http://www.example.org/EshuConfig}NodeStyle"/>
 *         &lt;element name="stereotype" type="{http://www.example.org/EshuConfig}Stereotype" minOccurs="0"/>
 *         &lt;element name="nodeValidation" type="{http://www.example.org/EshuConfig}NodeValidation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeTypes", propOrder = {
    "type",
    "variant",
    "label",
    "containers",
    "isConfigurable",
    "includeElement",
    "rotation",
    "infoUrlNode",
    "handlers",
    "anchors",
    "propertiesNode",
    "featuresNode",
    "nodeStyle",
    "stereotype",
    "nodeValidation"
})
public class NodeTypes {

    @XmlElement(required = true, defaultValue = "class")
    protected String type;
    @XmlElement(required = true, defaultValue = "class")
    protected String variant;
    @XmlElement(required = true)
    protected Label label;
    protected Containers containers;
    @XmlElement(defaultValue = "true")
    protected boolean isConfigurable;
    @XmlElement(defaultValue = "false")
    protected boolean includeElement;
    @XmlElement(defaultValue = "false")
    protected boolean rotation;
    @XmlElement(required = true)
    protected InfoUrl infoUrlNode;
    @XmlElement(required = true)
    protected Handlers handlers;
    @XmlElement(required = true)
    protected Anchors anchors;
    @XmlElement(required = true)
    protected Properties propertiesNode;
    @XmlElement(required = true)
    protected Features featuresNode;
    @XmlElement(required = true)
    protected NodeStyle nodeStyle;
    protected Stereotype stereotype;
    @XmlElement(required = true)
    protected NodeValidation nodeValidation;

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
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the containers property.
     * 
     * @return
     *     possible object is
     *     {@link Containers }
     *     
     */
    public Containers getContainers() {
        return containers;
    }

    /**
     * Sets the value of the containers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Containers }
     *     
     */
    public void setContainers(Containers value) {
        this.containers = value;
    }

    /**
     * Gets the value of the isConfigurable property.
     * 
     */
    public boolean isIsConfigurable() {
        return isConfigurable;
    }

    /**
     * Sets the value of the isConfigurable property.
     * 
     */
    public void setIsConfigurable(boolean value) {
        this.isConfigurable = value;
    }

    /**
     * Gets the value of the includeElement property.
     * 
     */
    public boolean isIncludeElement() {
        return includeElement;
    }

    /**
     * Sets the value of the includeElement property.
     * 
     */
    public void setIncludeElement(boolean value) {
        this.includeElement = value;
    }

    /**
     * Gets the value of the rotation property.
     * 
     */
    public boolean isRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     */
    public void setRotation(boolean value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the infoUrlNode property.
     * 
     * @return
     *     possible object is
     *     {@link InfoUrl }
     *     
     */
    public InfoUrl getInfoUrlNode() {
        return infoUrlNode;
    }

    /**
     * Sets the value of the infoUrlNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoUrl }
     *     
     */
    public void setInfoUrlNode(InfoUrl value) {
        this.infoUrlNode = value;
    }

    /**
     * Gets the value of the handlers property.
     * 
     * @return
     *     possible object is
     *     {@link Handlers }
     *     
     */
    public Handlers getHandlers() {
        return handlers;
    }

    /**
     * Sets the value of the handlers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Handlers }
     *     
     */
    public void setHandlers(Handlers value) {
        this.handlers = value;
    }

    /**
     * Gets the value of the anchors property.
     * 
     * @return
     *     possible object is
     *     {@link Anchors }
     *     
     */
    public Anchors getAnchors() {
        return anchors;
    }

    /**
     * Sets the value of the anchors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anchors }
     *     
     */
    public void setAnchors(Anchors value) {
        this.anchors = value;
    }

    /**
     * Gets the value of the propertiesNode property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getPropertiesNode() {
        return propertiesNode;
    }

    /**
     * Sets the value of the propertiesNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setPropertiesNode(Properties value) {
        this.propertiesNode = value;
    }

    /**
     * Gets the value of the featuresNode property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeaturesNode() {
        return featuresNode;
    }

    /**
     * Sets the value of the featuresNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeaturesNode(Features value) {
        this.featuresNode = value;
    }

    /**
     * Gets the value of the nodeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link NodeStyle }
     *     
     */
    public NodeStyle getNodeStyle() {
        return nodeStyle;
    }

    /**
     * Sets the value of the nodeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeStyle }
     *     
     */
    public void setNodeStyle(NodeStyle value) {
        this.nodeStyle = value;
    }

    /**
     * Gets the value of the stereotype property.
     * 
     * @return
     *     possible object is
     *     {@link Stereotype }
     *     
     */
    public Stereotype getStereotype() {
        return stereotype;
    }

    /**
     * Sets the value of the stereotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stereotype }
     *     
     */
    public void setStereotype(Stereotype value) {
        this.stereotype = value;
    }

    /**
     * Gets the value of the nodeValidation property.
     * 
     * @return
     *     possible object is
     *     {@link NodeValidation }
     *     
     */
    public NodeValidation getNodeValidation() {
        return nodeValidation;
    }

    /**
     * Sets the value of the nodeValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeValidation }
     *     
     */
    public void setNodeValidation(NodeValidation value) {
        this.nodeValidation = value;
    }
    
    
    @Override
   	public String toString() {
       	
   		return "{\"type\":" + "\"" +type + "\"" +  "\"" + ", \"labelConf\":" + label +", \"containers\" : " 
   				+ containers  + ", \"rotation\":" + "\"" + rotation + "\"" +", \"variant\":" + "\"" + variant + "\""+ ", \"isConfigurable\":" 
   				+  "\"" + isConfigurable + "\"" + ", \"infoUrlNode\":" + infoUrlNode  + ", \"listHandlers\":" + handlers + ", \"listAnchors\":" + anchors + ", \"includeElement\":" 
   				+  "\"" + includeElement +  "\"" + ", \"propertiesView\":" + propertiesNode + ", \"features\":"
   				+ featuresNode  +", \"style\" : "+ nodeValidation  +", \"nodeValidation\" : "+ nodeValidation + "}";
   	}
   	
    
    public String getInfoUrlNodeText() {
		String url="";
		List<String> infoUrlNode = this.getInfoUrlNode().getUrl();
		
		for(String entry: infoUrlNode){
			url = url + entry +"\n";
		}
	
        return url;
    }

}