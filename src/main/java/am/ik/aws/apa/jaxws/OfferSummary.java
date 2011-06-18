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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowestNewPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestUsedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestCollectiblePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestRefurbishedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="TotalNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCollectible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRefurbished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "lowestNewPrice", "lowestUsedPrice",
        "lowestCollectiblePrice", "lowestRefurbishedPrice", "totalNew",
        "totalUsed", "totalCollectible", "totalRefurbished" })
@XmlRootElement(name = "OfferSummary")
public class OfferSummary {

    @XmlElement(name = "LowestNewPrice")
    protected Price lowestNewPrice;
    @XmlElement(name = "LowestUsedPrice")
    protected Price lowestUsedPrice;
    @XmlElement(name = "LowestCollectiblePrice")
    protected Price lowestCollectiblePrice;
    @XmlElement(name = "LowestRefurbishedPrice")
    protected Price lowestRefurbishedPrice;
    @XmlElement(name = "TotalNew")
    protected String totalNew;
    @XmlElement(name = "TotalUsed")
    protected String totalUsed;
    @XmlElement(name = "TotalCollectible")
    protected String totalCollectible;
    @XmlElement(name = "TotalRefurbished")
    protected String totalRefurbished;

    /**
     * Gets the value of the lowestNewPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestNewPrice() {
        return lowestNewPrice;
    }

    /**
     * Sets the value of the lowestNewPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestNewPrice(Price value) {
        this.lowestNewPrice = value;
    }

    /**
     * Gets the value of the lowestUsedPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestUsedPrice() {
        return lowestUsedPrice;
    }

    /**
     * Sets the value of the lowestUsedPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestUsedPrice(Price value) {
        this.lowestUsedPrice = value;
    }

    /**
     * Gets the value of the lowestCollectiblePrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestCollectiblePrice() {
        return lowestCollectiblePrice;
    }

    /**
     * Sets the value of the lowestCollectiblePrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestCollectiblePrice(Price value) {
        this.lowestCollectiblePrice = value;
    }

    /**
     * Gets the value of the lowestRefurbishedPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestRefurbishedPrice() {
        return lowestRefurbishedPrice;
    }

    /**
     * Sets the value of the lowestRefurbishedPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestRefurbishedPrice(Price value) {
        this.lowestRefurbishedPrice = value;
    }

    /**
     * Gets the value of the totalNew property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalNew() {
        return totalNew;
    }

    /**
     * Sets the value of the totalNew property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalNew(String value) {
        this.totalNew = value;
    }

    /**
     * Gets the value of the totalUsed property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalUsed() {
        return totalUsed;
    }

    /**
     * Sets the value of the totalUsed property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalUsed(String value) {
        this.totalUsed = value;
    }

    /**
     * Gets the value of the totalCollectible property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalCollectible() {
        return totalCollectible;
    }

    /**
     * Sets the value of the totalCollectible property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalCollectible(String value) {
        this.totalCollectible = value;
    }

    /**
     * Gets the value of the totalRefurbished property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalRefurbished() {
        return totalRefurbished;
    }

    /**
     * Sets the value of the totalRefurbished property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalRefurbished(String value) {
        this.totalRefurbished = value;
    }

}
