/*
 * Copyright (C) 2011 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package am.ik.aws.apa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Image complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = { "url", "height", "width", "isVerified" })
public class Image {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Height", required = true)
    protected DecimalWithUnits height;
    @XmlElement(name = "Width", required = true)
    protected DecimalWithUnits width;
    @XmlElement(name = "IsVerified")
    protected String isVerified;

    /**
     * Gets the value of the url property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return possible object is {@link DecimalWithUnits }
     * 
     */
    public DecimalWithUnits getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *            allowed object is {@link DecimalWithUnits }
     * 
     */
    public void setHeight(DecimalWithUnits value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return possible object is {@link DecimalWithUnits }
     * 
     */
    public DecimalWithUnits getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *            allowed object is {@link DecimalWithUnits }
     * 
     */
    public void setWidth(DecimalWithUnits value) {
        this.width = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIsVerified(String value) {
        this.isVerified = value;
    }

}
