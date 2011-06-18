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
 *         &lt;element name="AverageRating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalReviews" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TotalReviewPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Review" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IFrameURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "averageRating", "totalReviews",
        "totalReviewPages", "review", "iFrameURL", "hasReviews" })
@XmlRootElement(name = "CustomerReviews")
public class CustomerReviews {

    @XmlElement(name = "AverageRating")
    protected BigDecimal averageRating;
    @XmlElement(name = "TotalReviews")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalReviews;
    @XmlElement(name = "TotalReviewPages")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalReviewPages;
    @XmlElement(name = "Review")
    protected List<Review> review;
    @XmlElement(name = "IFrameURL")
    protected String iFrameURL;
    @XmlElement(name = "HasReviews")
    protected Boolean hasReviews;

    /**
     * Gets the value of the averageRating property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getAverageRating() {
        return averageRating;
    }

    /**
     * Sets the value of the averageRating property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setAverageRating(BigDecimal value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the totalReviews property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalReviews() {
        return totalReviews;
    }

    /**
     * Sets the value of the totalReviews property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalReviews(BigInteger value) {
        this.totalReviews = value;
    }

    /**
     * Gets the value of the totalReviewPages property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalReviewPages() {
        return totalReviewPages;
    }

    /**
     * Sets the value of the totalReviewPages property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalReviewPages(BigInteger value) {
        this.totalReviewPages = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the review property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Review }
     * 
     * 
     */
    public List<Review> getReview() {
        if (review == null) {
            review = new ArrayList<Review>();
        }
        return this.review;
    }

    /**
     * Gets the value of the iFrameURL property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIFrameURL() {
        return iFrameURL;
    }

    /**
     * Sets the value of the iFrameURL property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIFrameURL(String value) {
        this.iFrameURL = value;
    }

    /**
     * Gets the value of the hasReviews property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isHasReviews() {
        return hasReviews;
    }

    /**
     * Sets the value of the hasReviews property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setHasReviews(Boolean value) {
        this.hasReviews = value;
    }

}
