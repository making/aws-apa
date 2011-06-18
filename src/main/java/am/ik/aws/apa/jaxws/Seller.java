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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerLegalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlancePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="About" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoreAbout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserDefinedLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AverageFeedbackRating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFeedback" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalFeedbackPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="SellerFeedbackSummary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeedbackDateRange" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SellerFeedbackRating" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerFeedback" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sellerId", "sellerName", "sellerLegalName",
        "nickname", "glancePage", "about", "moreAbout", "location",
        "averageFeedbackRating", "totalFeedback", "totalFeedbackPages",
        "sellerFeedbackSummary", "sellerFeedback" })
@XmlRootElement(name = "Seller")
public class Seller {

    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name = "SellerName")
    protected String sellerName;
    @XmlElement(name = "SellerLegalName")
    protected String sellerLegalName;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "GlancePage")
    protected String glancePage;
    @XmlElement(name = "About")
    protected String about;
    @XmlElement(name = "MoreAbout")
    protected String moreAbout;
    @XmlElement(name = "Location")
    protected Seller.Location location;
    @XmlElement(name = "AverageFeedbackRating")
    protected BigDecimal averageFeedbackRating;
    @XmlElement(name = "TotalFeedback")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFeedback;
    @XmlElement(name = "TotalFeedbackPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFeedbackPages;
    @XmlElement(name = "SellerFeedbackSummary")
    protected Seller.SellerFeedbackSummary sellerFeedbackSummary;
    @XmlElement(name = "SellerFeedback")
    protected SellerFeedback sellerFeedback;

    /**
     * Gets the value of the sellerId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    /**
     * Gets the value of the sellerName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets the value of the sellerName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSellerName(String value) {
        this.sellerName = value;
    }

    /**
     * Gets the value of the sellerLegalName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerLegalName() {
        return sellerLegalName;
    }

    /**
     * Sets the value of the sellerLegalName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSellerLegalName(String value) {
        this.sellerLegalName = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNickname(String value) {
        this.nickname = value;
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
     * Gets the value of the about property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the moreAbout property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMoreAbout() {
        return moreAbout;
    }

    /**
     * Sets the value of the moreAbout property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMoreAbout(String value) {
        this.moreAbout = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link Seller.Location }
     * 
     */
    public Seller.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *            allowed object is {@link Seller.Location }
     * 
     */
    public void setLocation(Seller.Location value) {
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
     * Gets the value of the sellerFeedbackSummary property.
     * 
     * @return possible object is {@link Seller.SellerFeedbackSummary }
     * 
     */
    public Seller.SellerFeedbackSummary getSellerFeedbackSummary() {
        return sellerFeedbackSummary;
    }

    /**
     * Sets the value of the sellerFeedbackSummary property.
     * 
     * @param value
     *            allowed object is {@link Seller.SellerFeedbackSummary }
     * 
     */
    public void setSellerFeedbackSummary(Seller.SellerFeedbackSummary value) {
        this.sellerFeedbackSummary = value;
    }

    /**
     * Gets the value of the sellerFeedback property.
     * 
     * @return possible object is {@link SellerFeedback }
     * 
     */
    public SellerFeedback getSellerFeedback() {
        return sellerFeedback;
    }

    /**
     * Sets the value of the sellerFeedback property.
     * 
     * @param value
     *            allowed object is {@link SellerFeedback }
     * 
     */
    public void setSellerFeedback(SellerFeedback value) {
        this.sellerFeedback = value;
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
     *         &lt;element name="UserDefinedLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "userDefinedLocation", "city", "state",
            "country" })
    public static class Location {

        @XmlElement(name = "UserDefinedLocation")
        protected String userDefinedLocation;
        @XmlElement(name = "City")
        protected String city;
        @XmlElement(name = "State")
        protected String state;
        @XmlElement(name = "Country")
        protected String country;

        /**
         * Gets the value of the userDefinedLocation property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getUserDefinedLocation() {
            return userDefinedLocation;
        }

        /**
         * Sets the value of the userDefinedLocation property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setUserDefinedLocation(String value) {
            this.userDefinedLocation = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCountry(String value) {
            this.country = value;
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
     *         &lt;element name="FeedbackDateRange" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SellerFeedbackRating" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = { "feedbackDateRange" })
    public static class SellerFeedbackSummary {

        @XmlElement(name = "FeedbackDateRange")
        protected List<Seller.SellerFeedbackSummary.FeedbackDateRange> feedbackDateRange;

        /**
         * Gets the value of the feedbackDateRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the feedbackDateRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getFeedbackDateRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Seller.SellerFeedbackSummary.FeedbackDateRange }
         * 
         * 
         */
        public List<Seller.SellerFeedbackSummary.FeedbackDateRange> getFeedbackDateRange() {
            if (feedbackDateRange == null) {
                feedbackDateRange = new ArrayList<Seller.SellerFeedbackSummary.FeedbackDateRange>();
            }
            return this.feedbackDateRange;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SellerFeedbackRating" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "sellerFeedbackRating" })
        public static class FeedbackDateRange {

            @XmlElement(name = "SellerFeedbackRating")
            protected List<Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating> sellerFeedbackRating;
            @XmlAttribute(name = "Period")
            protected String period;

            /**
             * Gets the value of the sellerFeedbackRating property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the sellerFeedbackRating
             * property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getSellerFeedbackRating().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating }
             * 
             * 
             */
            public List<Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating> getSellerFeedbackRating() {
                if (sellerFeedbackRating == null) {
                    sellerFeedbackRating = new ArrayList<Seller.SellerFeedbackSummary.FeedbackDateRange.SellerFeedbackRating>();
                }
                return this.sellerFeedbackRating;
            }

            /**
             * Gets the value of the period property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getPeriod() {
                return period;
            }

            /**
             * Sets the value of the period property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setPeriod(String value) {
                this.period = value;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             * 
             * <p>
             * The following schema fragment specifies the expected content
             * contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "count", "percentage" })
            public static class SellerFeedbackRating {

                @XmlElement(name = "Count")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger count;
                @XmlElement(name = "Percentage")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger percentage;
                @XmlAttribute(name = "Type")
                protected String type;

                /**
                 * Gets the value of the count property.
                 * 
                 * @return possible object is {@link BigInteger }
                 * 
                 */
                public BigInteger getCount() {
                    return count;
                }

                /**
                 * Sets the value of the count property.
                 * 
                 * @param value
                 *            allowed object is {@link BigInteger }
                 * 
                 */
                public void setCount(BigInteger value) {
                    this.count = value;
                }

                /**
                 * Gets the value of the percentage property.
                 * 
                 * @return possible object is {@link BigInteger }
                 * 
                 */
                public BigInteger getPercentage() {
                    return percentage;
                }

                /**
                 * Sets the value of the percentage property.
                 * 
                 * @param value
                 *            allowed object is {@link BigInteger }
                 * 
                 */
                public void setPercentage(BigInteger value) {
                    this.percentage = value;
                }

                /**
                 * Gets the value of the type property.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *            allowed object is {@link String }
                 * 
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }

    }

}
