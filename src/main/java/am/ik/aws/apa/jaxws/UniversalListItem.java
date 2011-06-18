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
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoldBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SavedPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "title", "productUrl", "imageUrl", "soldBy",
        "savedPrice" })
@XmlRootElement(name = "UniversalListItem")
public class UniversalListItem {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ProductUrl")
    protected String productUrl;
    @XmlElement(name = "ImageUrl")
    protected String imageUrl;
    @XmlElement(name = "SoldBy")
    protected String soldBy;
    @XmlElement(name = "SavedPrice")
    protected Price savedPrice;

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the productUrl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * Sets the value of the productUrl property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setProductUrl(String value) {
        this.productUrl = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the soldBy property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSoldBy(String value) {
        this.soldBy = value;
    }

    /**
     * Gets the value of the savedPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getSavedPrice() {
        return savedPrice;
    }

    /**
     * Sets the value of the savedPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setSavedPrice(Price value) {
        this.savedPrice = value;
    }

}
