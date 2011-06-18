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
 *         &lt;element name="LowestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="LowestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="HighestSalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="SingleMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "lowestPrice", "highestPrice",
        "lowestSalePrice", "highestSalePrice", "singleMerchantId" })
@XmlRootElement(name = "VariationSummary")
public class VariationSummary {

    @XmlElement(name = "LowestPrice")
    protected Price lowestPrice;
    @XmlElement(name = "HighestPrice")
    protected Price highestPrice;
    @XmlElement(name = "LowestSalePrice")
    protected Price lowestSalePrice;
    @XmlElement(name = "HighestSalePrice")
    protected Price highestSalePrice;
    @XmlElement(name = "SingleMerchantId")
    protected String singleMerchantId;

    /**
     * Gets the value of the lowestPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestPrice() {
        return lowestPrice;
    }

    /**
     * Sets the value of the lowestPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestPrice(Price value) {
        this.lowestPrice = value;
    }

    /**
     * Gets the value of the highestPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getHighestPrice() {
        return highestPrice;
    }

    /**
     * Sets the value of the highestPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setHighestPrice(Price value) {
        this.highestPrice = value;
    }

    /**
     * Gets the value of the lowestSalePrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getLowestSalePrice() {
        return lowestSalePrice;
    }

    /**
     * Sets the value of the lowestSalePrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setLowestSalePrice(Price value) {
        this.lowestSalePrice = value;
    }

    /**
     * Gets the value of the highestSalePrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getHighestSalePrice() {
        return highestSalePrice;
    }

    /**
     * Sets the value of the highestSalePrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setHighestSalePrice(Price value) {
        this.highestSalePrice = value;
    }

    /**
     * Gets the value of the singleMerchantId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSingleMerchantId() {
        return singleMerchantId;
    }

    /**
     * Sets the value of the singleMerchantId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSingleMerchantId(String value) {
        this.singleMerchantId = value;
    }

}
