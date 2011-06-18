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
 * Java class for ListLookupRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ListLookupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Condition" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}DeliveryMethod" minOccurs="0"/>
 *         &lt;element name="ISPUPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="WishList"/>
 *               &lt;enumeration value="Listmania"/>
 *               &lt;enumeration value="WeddingRegistry"/>
 *               &lt;enumeration value="BabyRegistry"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReviewSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOmitPurchasedItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsIncludeUniversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListLookupRequest", propOrder = { "condition",
        "deliveryMethod", "ispuPostalCode", "listId", "listType", "merchantId",
        "productGroup", "productPage", "responseGroup", "reviewSort", "sort",
        "isOmitPurchasedItems", "isIncludeUniversal" })
public class ListLookupRequest {

    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "ISPUPostalCode")
    protected String ispuPostalCode;
    @XmlElement(name = "ListId")
    protected String listId;
    @XmlElement(name = "ListType")
    protected String listType;
    @XmlElement(name = "MerchantId")
    protected String merchantId;
    @XmlElement(name = "ProductGroup")
    protected String productGroup;
    @XmlElement(name = "ProductPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger productPage;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;
    @XmlElement(name = "ReviewSort")
    protected String reviewSort;
    @XmlElement(name = "Sort")
    protected String sort;
    @XmlElement(name = "IsOmitPurchasedItems")
    protected Boolean isOmitPurchasedItems;
    @XmlElement(name = "IsIncludeUniversal")
    protected Boolean isIncludeUniversal;

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
     * Gets the value of the listId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setListId(String value) {
        this.listId = value;
    }

    /**
     * Gets the value of the listType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getListType() {
        return listType;
    }

    /**
     * Sets the value of the listType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setListType(String value) {
        this.listType = value;
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
     * Gets the value of the productGroup property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProductGroup() {
        return productGroup;
    }

    /**
     * Sets the value of the productGroup property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setProductGroup(String value) {
        this.productGroup = value;
    }

    /**
     * Gets the value of the productPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getProductPage() {
        return productPage;
    }

    /**
     * Sets the value of the productPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setProductPage(BigInteger value) {
        this.productPage = value;
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
     * Gets the value of the sort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSort(String value) {
        this.sort = value;
    }

    /**
     * Gets the value of the isOmitPurchasedItems property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsOmitPurchasedItems() {
        return isOmitPurchasedItems;
    }

    /**
     * Sets the value of the isOmitPurchasedItems property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsOmitPurchasedItems(Boolean value) {
        this.isOmitPurchasedItems = value;
    }

    /**
     * Gets the value of the isIncludeUniversal property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsIncludeUniversal() {
        return isIncludeUniversal;
    }

    /**
     * Sets the value of the isIncludeUniversal property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsIncludeUniversal(Boolean value) {
        this.isIncludeUniversal = value;
    }

}
