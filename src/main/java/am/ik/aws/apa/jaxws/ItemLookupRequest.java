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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ItemLookupRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ItemLookupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Condition" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}DeliveryMethod" minOccurs="0"/>
 *         &lt;element name="FutureLaunchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ASIN"/>
 *               &lt;enumeration value="UPC"/>
 *               &lt;enumeration value="SKU"/>
 *               &lt;enumeration value="EAN"/>
 *               &lt;enumeration value="ISBN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ISPUPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReviewPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ReviewSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchInsideKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TagPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TagsPerPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TagSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationPage" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}positiveIntegerOrAll" minOccurs="0"/>
 *         &lt;element name="RelatedItemPage" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}positiveIntegerOrAll" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludeReviewsSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TruncateReviewsAt" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemLookupRequest", propOrder = { "condition",
        "deliveryMethod", "futureLaunchDate", "idType", "ispuPostalCode",
        "merchantId", "offerPage", "itemId", "responseGroup", "reviewPage",
        "reviewSort", "searchIndex", "searchInsideKeywords", "tagPage",
        "tagsPerPage", "tagSort", "variationPage", "relatedItemPage",
        "relationshipType", "includeReviewsSummary", "truncateReviewsAt" })
public class ItemLookupRequest {

    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "FutureLaunchDate")
    protected String futureLaunchDate;
    @XmlElement(name = "IdType")
    protected String idType;
    @XmlElement(name = "ISPUPostalCode")
    protected String ispuPostalCode;
    @XmlElement(name = "MerchantId")
    protected String merchantId;
    @XmlElement(name = "OfferPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger offerPage;
    @XmlElement(name = "ItemId")
    protected List<String> itemId;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;
    @XmlElement(name = "ReviewPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger reviewPage;
    @XmlElement(name = "ReviewSort")
    protected String reviewSort;
    @XmlElement(name = "SearchIndex")
    protected String searchIndex;
    @XmlElement(name = "SearchInsideKeywords")
    protected String searchInsideKeywords;
    @XmlElement(name = "TagPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tagPage;
    @XmlElement(name = "TagsPerPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tagsPerPage;
    @XmlElement(name = "TagSort")
    protected String tagSort;
    @XmlElement(name = "VariationPage")
    protected String variationPage;
    @XmlElement(name = "RelatedItemPage")
    protected String relatedItemPage;
    @XmlElement(name = "RelationshipType")
    protected List<String> relationshipType;
    @XmlElement(name = "IncludeReviewsSummary")
    protected String includeReviewsSummary;
    @XmlElement(name = "TruncateReviewsAt")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger truncateReviewsAt;

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
     * Gets the value of the deliveryMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the futureLaunchDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFutureLaunchDate() {
        return futureLaunchDate;
    }

    /**
     * Sets the value of the futureLaunchDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFutureLaunchDate(String value) {
        this.futureLaunchDate = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the ispuPostalCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getISPUPostalCode() {
        return ispuPostalCode;
    }

    /**
     * Sets the value of the ispuPostalCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setISPUPostalCode(String value) {
        this.ispuPostalCode = value;
    }

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
     * Gets the value of the offerPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getOfferPage() {
        return offerPage;
    }

    /**
     * Sets the value of the offerPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setOfferPage(BigInteger value) {
        this.offerPage = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the itemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getItemId() {
        if (itemId == null) {
            itemId = new ArrayList<String>();
        }
        return this.itemId;
    }

    /**
     * Gets the value of the responseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the responseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResponseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getResponseGroup() {
        if (responseGroup == null) {
            responseGroup = new ArrayList<String>();
        }
        return this.responseGroup;
    }

    /**
     * Gets the value of the reviewPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getReviewPage() {
        return reviewPage;
    }

    /**
     * Sets the value of the reviewPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setReviewPage(BigInteger value) {
        this.reviewPage = value;
    }

    /**
     * Gets the value of the reviewSort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReviewSort() {
        return reviewSort;
    }

    /**
     * Sets the value of the reviewSort property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReviewSort(String value) {
        this.reviewSort = value;
    }

    /**
     * Gets the value of the searchIndex property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSearchIndex() {
        return searchIndex;
    }

    /**
     * Sets the value of the searchIndex property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSearchIndex(String value) {
        this.searchIndex = value;
    }

    /**
     * Gets the value of the searchInsideKeywords property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSearchInsideKeywords() {
        return searchInsideKeywords;
    }

    /**
     * Sets the value of the searchInsideKeywords property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSearchInsideKeywords(String value) {
        this.searchInsideKeywords = value;
    }

    /**
     * Gets the value of the tagPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTagPage() {
        return tagPage;
    }

    /**
     * Sets the value of the tagPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTagPage(BigInteger value) {
        this.tagPage = value;
    }

    /**
     * Gets the value of the tagsPerPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTagsPerPage() {
        return tagsPerPage;
    }

    /**
     * Sets the value of the tagsPerPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTagsPerPage(BigInteger value) {
        this.tagsPerPage = value;
    }

    /**
     * Gets the value of the tagSort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTagSort() {
        return tagSort;
    }

    /**
     * Sets the value of the tagSort property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTagSort(String value) {
        this.tagSort = value;
    }

    /**
     * Gets the value of the variationPage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVariationPage() {
        return variationPage;
    }

    /**
     * Sets the value of the variationPage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setVariationPage(String value) {
        this.variationPage = value;
    }

    /**
     * Gets the value of the relatedItemPage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRelatedItemPage() {
        return relatedItemPage;
    }

    /**
     * Sets the value of the relatedItemPage property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRelatedItemPage(String value) {
        this.relatedItemPage = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the relationshipType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRelationshipType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getRelationshipType() {
        if (relationshipType == null) {
            relationshipType = new ArrayList<String>();
        }
        return this.relationshipType;
    }

    /**
     * Gets the value of the includeReviewsSummary property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIncludeReviewsSummary() {
        return includeReviewsSummary;
    }

    /**
     * Sets the value of the includeReviewsSummary property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIncludeReviewsSummary(String value) {
        this.includeReviewsSummary = value;
    }

    /**
     * Gets the value of the truncateReviewsAt property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTruncateReviewsAt() {
        return truncateReviewsAt;
    }

    /**
     * Sets the value of the truncateReviewsAt property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTruncateReviewsAt(BigInteger value) {
        this.truncateReviewsAt = value;
    }

}
