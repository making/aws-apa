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

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlancePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AverageFeedbackRating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFeedback" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalFeedbackPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "merchantId", "name", "glancePage",
        "location", "averageFeedbackRating", "totalFeedback",
        "totalFeedbackPages" })
@XmlRootElement(name = "Merchant")
public class Merchant {

    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "GlancePage")
    protected String glancePage;
    @XmlElement(name = "Location")
    protected Merchant.Location location;
    @XmlElement(name = "AverageFeedbackRating")
    protected BigDecimal averageFeedbackRating;
    @XmlElement(name = "TotalFeedback")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFeedback;
    @XmlElement(name = "TotalFeedbackPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFeedbackPages;

    /**
     * Gets the value of the merchantId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the glancePage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGlancePage() {
        return glancePage;
    }

    /**
     * Sets the value of the glancePage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setGlancePage(String value) {
        this.glancePage = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link Merchant.Location }
     * 
     */
    public Merchant.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *            allowed object is {@link Merchant.Location }
     * 
     */
    public void setLocation(Merchant.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the averageFeedbackRating property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getAverageFeedbackRating() {
        return averageFeedbackRating;
    }

    /**
     * Sets the value of the averageFeedbackRating property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setAverageFeedbackRating(BigDecimal value) {
        this.averageFeedbackRating = value;
    }

    /**
     * Gets the value of the totalFeedback property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalFeedback() {
        return totalFeedback;
    }

    /**
     * Sets the value of the totalFeedback property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalFeedback(BigInteger value) {
        this.totalFeedback = value;
    }

    /**
     * Gets the value of the totalFeedbackPages property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalFeedbackPages() {
        return totalFeedbackPages;
    }

    /**
     * Sets the value of the totalFeedbackPages property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalFeedbackPages(BigInteger value) {
        this.totalFeedbackPages = value;
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
     *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "countryCode", "stateCode" })
    public static class Location {

        @XmlElement(name = "CountryCode")
        protected String countryCode;
        @XmlElement(name = "StateCode")
        protected String stateCode;

        /**
         * Gets the value of the countryCode property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the stateCode property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getStateCode() {
            return stateCode;
        }

        /**
         * Sets the value of the stateCode property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setStateCode(String value) {
            this.stateCode = value;
        }

    }

}
