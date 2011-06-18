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
 *         &lt;element name="ExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WillShipExpedited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WillShipInternational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Seller" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "exchangeId", "listingId", "asin", "sku",
        "upc", "ean", "willShipExpedited", "willShipInternational", "title",
        "price", "startDate", "endDate", "status", "quantity", "condition",
        "subCondition", "seller" })
@XmlRootElement(name = "SellerListing")
public class SellerListing {

    @XmlElement(name = "ExchangeId")
    protected String exchangeId;
    @XmlElement(name = "ListingId")
    protected String listingId;
    @XmlElement(name = "ASIN")
    protected String asin;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "WillShipExpedited")
    protected Boolean willShipExpedited;
    @XmlElement(name = "WillShipInternational")
    protected Boolean willShipInternational;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "SubCondition")
    protected String subCondition;
    @XmlElement(name = "Seller")
    protected Seller seller;

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setExchangeId(String value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the listingId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getListingId() {
        return listingId;
    }

    /**
     * Sets the value of the listingId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setListingId(String value) {
        this.listingId = value;
    }

    /**
     * Gets the value of the asin property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getASIN() {
        return asin;
    }

    /**
     * Sets the value of the asin property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setASIN(String value) {
        this.asin = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the willShipExpedited property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isWillShipExpedited() {
        return willShipExpedited;
    }

    /**
     * Sets the value of the willShipExpedited property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setWillShipExpedited(Boolean value) {
        this.willShipExpedited = value;
    }

    /**
     * Gets the value of the willShipInternational property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isWillShipInternational() {
        return willShipInternational;
    }

    /**
     * Sets the value of the willShipInternational property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setWillShipInternational(Boolean value) {
        this.willShipInternational = value;
    }

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
     * Gets the value of the price property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the subCondition property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubCondition() {
        return subCondition;
    }

    /**
     * Sets the value of the subCondition property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSubCondition(String value) {
        this.subCondition = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return possible object is {@link Seller }
     * 
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *            allowed object is {@link Seller }
     * 
     */
    public void setSeller(Seller value) {
        this.seller = value;
    }

}
