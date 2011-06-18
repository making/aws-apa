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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="PercentageSaved" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="QuantityRestriction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QuantityLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ISPUStoreAddress" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Address" minOccurs="0"/>
 *         &lt;element name="ISPUStoreHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEligibleForSuperSaverShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEligibleForPrime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFulfilledByAmazon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMapViolated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesRestriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCharge" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsRateTaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="ShippingPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "offerListingId", "exchangeId", "price",
        "salePrice", "amountSaved", "percentageSaved", "availability",
        "availabilityAttributes", "quantity", "quantityRestriction",
        "ispuStoreAddress", "ispuStoreHours",
        "isEligibleForSuperSaverShipping", "isEligibleForPrime",
        "isFulfilledByAmazon", "isMapViolated", "salesRestriction",
        "shippingCharge" })
@XmlRootElement(name = "OfferListing")
public class OfferListing {

    @XmlElement(name = "OfferListingId")
    protected String offerListingId;
    @XmlElement(name = "ExchangeId")
    protected String exchangeId;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "SalePrice")
    protected Price salePrice;
    @XmlElement(name = "AmountSaved")
    protected Price amountSaved;
    @XmlElement(name = "PercentageSaved")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger percentageSaved;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "AvailabilityAttributes")
    protected OfferListing.AvailabilityAttributes availabilityAttributes;
    @XmlElement(name = "Quantity")
    protected BigInteger quantity;
    @XmlElement(name = "QuantityRestriction")
    protected OfferListing.QuantityRestriction quantityRestriction;
    @XmlElement(name = "ISPUStoreAddress")
    protected Address ispuStoreAddress;
    @XmlElement(name = "ISPUStoreHours")
    protected String ispuStoreHours;
    @XmlElement(name = "IsEligibleForSuperSaverShipping")
    protected Boolean isEligibleForSuperSaverShipping;
    @XmlElement(name = "IsEligibleForPrime")
    protected Boolean isEligibleForPrime;
    @XmlElement(name = "IsFulfilledByAmazon")
    protected Boolean isFulfilledByAmazon;
    @XmlElement(name = "IsMapViolated")
    protected Boolean isMapViolated;
    @XmlElement(name = "SalesRestriction")
    protected String salesRestriction;
    @XmlElement(name = "ShippingCharge")
    protected List<OfferListing.ShippingCharge> shippingCharge;

    /**
     * Gets the value of the offerListingId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOfferListingId() {
        return offerListingId;
    }

    /**
     * Sets the value of the offerListingId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOfferListingId(String value) {
        this.offerListingId = value;
    }

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
     * Gets the value of the salePrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setSalePrice(Price value) {
        this.salePrice = value;
    }

    /**
     * Gets the value of the amountSaved property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getAmountSaved() {
        return amountSaved;
    }

    /**
     * Sets the value of the amountSaved property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setAmountSaved(Price value) {
        this.amountSaved = value;
    }

    /**
     * Gets the value of the percentageSaved property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getPercentageSaved() {
        return percentageSaved;
    }

    /**
     * Sets the value of the percentageSaved property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setPercentageSaved(BigInteger value) {
        this.percentageSaved = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the availabilityAttributes property.
     * 
     * @return possible object is {@link OfferListing.AvailabilityAttributes }
     * 
     */
    public OfferListing.AvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }

    /**
     * Sets the value of the availabilityAttributes property.
     * 
     * @param value
     *            allowed object is {@link OfferListing.AvailabilityAttributes }
     * 
     */
    public void setAvailabilityAttributes(
            OfferListing.AvailabilityAttributes value) {
        this.availabilityAttributes = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityRestriction property.
     * 
     * @return possible object is {@link OfferListing.QuantityRestriction }
     * 
     */
    public OfferListing.QuantityRestriction getQuantityRestriction() {
        return quantityRestriction;
    }

    /**
     * Sets the value of the quantityRestriction property.
     * 
     * @param value
     *            allowed object is {@link OfferListing.QuantityRestriction }
     * 
     */
    public void setQuantityRestriction(OfferListing.QuantityRestriction value) {
        this.quantityRestriction = value;
    }

    /**
     * Gets the value of the ispuStoreAddress property.
     * 
     * @return possible object is {@link Address }
     * 
     */
    public Address getISPUStoreAddress() {
        return ispuStoreAddress;
    }

    /**
     * Sets the value of the ispuStoreAddress property.
     * 
     * @param value
     *            allowed object is {@link Address }
     * 
     */
    public void setISPUStoreAddress(Address value) {
        this.ispuStoreAddress = value;
    }

    /**
     * Gets the value of the ispuStoreHours property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPUStoreHours() {
        return ispuStoreHours;
    }

    /**
     * Sets the value of the ispuStoreHours property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setISPUStoreHours(String value) {
        this.ispuStoreHours = value;
    }

    /**
     * Gets the value of the isEligibleForSuperSaverShipping property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }

    /**
     * Sets the value of the isEligibleForSuperSaverShipping property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsEligibleForSuperSaverShipping(Boolean value) {
        this.isEligibleForSuperSaverShipping = value;
    }

    /**
     * Gets the value of the isEligibleForPrime property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsEligibleForPrime() {
        return isEligibleForPrime;
    }

    /**
     * Sets the value of the isEligibleForPrime property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsEligibleForPrime(Boolean value) {
        this.isEligibleForPrime = value;
    }

    /**
     * Gets the value of the isFulfilledByAmazon property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsFulfilledByAmazon() {
        return isFulfilledByAmazon;
    }

    /**
     * Sets the value of the isFulfilledByAmazon property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsFulfilledByAmazon(Boolean value) {
        this.isFulfilledByAmazon = value;
    }

    /**
     * Gets the value of the isMapViolated property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsMapViolated() {
        return isMapViolated;
    }

    /**
     * Sets the value of the isMapViolated property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsMapViolated(Boolean value) {
        this.isMapViolated = value;
    }

    /**
     * Gets the value of the salesRestriction property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSalesRestriction() {
        return salesRestriction;
    }

    /**
     * Sets the value of the salesRestriction property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSalesRestriction(String value) {
        this.salesRestriction = value;
    }

    /**
     * Gets the value of the shippingCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the shippingCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getShippingCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferListing.ShippingCharge }
     * 
     * 
     */
    public List<OfferListing.ShippingCharge> getShippingCharge() {
        if (shippingCharge == null) {
            shippingCharge = new ArrayList<OfferListing.ShippingCharge>();
        }
        return this.shippingCharge;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "availabilityType", "isPreorder",
            "minimumHours", "maximumHours" })
    public static class AvailabilityAttributes {

        @XmlElement(name = "AvailabilityType")
        protected String availabilityType;
        @XmlElement(name = "IsPreorder")
        protected Boolean isPreorder;
        @XmlElement(name = "MinimumHours")
        protected BigInteger minimumHours;
        @XmlElement(name = "MaximumHours")
        protected BigInteger maximumHours;

        /**
         * Gets the value of the availabilityType property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getAvailabilityType() {
            return availabilityType;
        }

        /**
         * Sets the value of the availabilityType property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setAvailabilityType(String value) {
            this.availabilityType = value;
        }

        /**
         * Gets the value of the isPreorder property.
         * 
         * @return possible object is {@link Boolean }
         * 
         */
        public Boolean isIsPreorder() {
            return isPreorder;
        }

        /**
         * Sets the value of the isPreorder property.
         * 
         * @param value
         *            allowed object is {@link Boolean }
         * 
         */
        public void setIsPreorder(Boolean value) {
            this.isPreorder = value;
        }

        /**
         * Gets the value of the minimumHours property.
         * 
         * @return possible object is {@link BigInteger }
         * 
         */
        public BigInteger getMinimumHours() {
            return minimumHours;
        }

        /**
         * Sets the value of the minimumHours property.
         * 
         * @param value
         *            allowed object is {@link BigInteger }
         * 
         */
        public void setMinimumHours(BigInteger value) {
            this.minimumHours = value;
        }

        /**
         * Gets the value of the maximumHours property.
         * 
         * @return possible object is {@link BigInteger }
         * 
         */
        public BigInteger getMaximumHours() {
            return maximumHours;
        }

        /**
         * Sets the value of the maximumHours property.
         * 
         * @param value
         *            allowed object is {@link BigInteger }
         * 
         */
        public void setMaximumHours(BigInteger value) {
            this.maximumHours = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="QuantityLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "quantityLimit" })
    public static class QuantityRestriction {

        @XmlElement(name = "QuantityLimit")
        protected BigInteger quantityLimit;

        /**
         * Gets the value of the quantityLimit property.
         * 
         * @return possible object is {@link BigInteger }
         * 
         */
        public BigInteger getQuantityLimit() {
            return quantityLimit;
        }

        /**
         * Sets the value of the quantityLimit property.
         * 
         * @param value
         *            allowed object is {@link BigInteger }
         * 
         */
        public void setQuantityLimit(BigInteger value) {
            this.quantityLimit = value;
        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsRateTaxInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="ShippingPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "shippingType", "isRateTaxInclusive",
            "shippingPrice" })
    public static class ShippingCharge {

        @XmlElement(name = "ShippingType", required = true)
        protected String shippingType;
        @XmlElement(name = "IsRateTaxInclusive")
        protected boolean isRateTaxInclusive;
        @XmlElement(name = "ShippingPrice", required = true)
        protected Price shippingPrice;

        /**
         * Gets the value of the shippingType property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getShippingType() {
            return shippingType;
        }

        /**
         * Sets the value of the shippingType property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setShippingType(String value) {
            this.shippingType = value;
        }

        /**
         * Gets the value of the isRateTaxInclusive property.
         * 
         */
        public boolean isIsRateTaxInclusive() {
            return isRateTaxInclusive;
        }

        /**
         * Sets the value of the isRateTaxInclusive property.
         * 
         */
        public void setIsRateTaxInclusive(boolean value) {
            this.isRateTaxInclusive = value;
        }

        /**
         * Gets the value of the shippingPrice property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getShippingPrice() {
            return shippingPrice;
        }

        /**
         * Sets the value of the shippingPrice property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setShippingPrice(Price value) {
            this.shippingPrice = value;
        }

    }

}
