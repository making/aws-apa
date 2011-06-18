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
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HelpfulVotes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Reviewer" minOccurs="0"/>
 *         &lt;element name="TotalVotes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "asin", "rating", "helpfulVotes",
        "customerId", "reviewer", "totalVotes", "date", "summary", "content" })
@XmlRootElement(name = "Review")
public class Review {

    @XmlElement(name = "ASIN")
    protected String asin;
    @XmlElement(name = "Rating")
    protected BigDecimal rating;
    @XmlElement(name = "HelpfulVotes")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger helpfulVotes;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "Reviewer")
    protected Reviewer reviewer;
    @XmlElement(name = "TotalVotes")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalVotes;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Summary")
    protected String summary;
    @XmlElement(name = "Content")
    protected String content;

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
     * Gets the value of the rating property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setRating(BigDecimal value) {
        this.rating = value;
    }

    /**
     * Gets the value of the helpfulVotes property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getHelpfulVotes() {
        return helpfulVotes;
    }

    /**
     * Sets the value of the helpfulVotes property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setHelpfulVotes(BigInteger value) {
        this.helpfulVotes = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the reviewer property.
     * 
     * @return possible object is {@link Reviewer }
     * 
     */
    public Reviewer getReviewer() {
        return reviewer;
    }

    /**
     * Sets the value of the reviewer property.
     * 
     * @param value
     *            allowed object is {@link Reviewer }
     * 
     */
    public void setReviewer(Reviewer value) {
        this.reviewer = value;
    }

    /**
     * Gets the value of the totalVotes property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalVotes() {
        return totalVotes;
    }

    /**
     * Sets the value of the totalVotes property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalVotes(BigInteger value) {
        this.totalVotes = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setContent(String value) {
        this.content = value;
    }

}
