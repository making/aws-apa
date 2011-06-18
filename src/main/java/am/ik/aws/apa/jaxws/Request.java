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
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HelpRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}HelpRequest" minOccurs="0"/>
 *         &lt;element name="BrowseNodeLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}BrowseNodeLookupRequest" minOccurs="0"/>
 *         &lt;element name="ItemSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemSearchRequest" minOccurs="0"/>
 *         &lt;element name="ItemLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemLookupRequest" minOccurs="0"/>
 *         &lt;element name="ListSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListSearchRequest" minOccurs="0"/>
 *         &lt;element name="ListLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListLookupRequest" minOccurs="0"/>
 *         &lt;element name="CustomerContentSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentSearchRequest" minOccurs="0"/>
 *         &lt;element name="CustomerContentLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentLookupRequest" minOccurs="0"/>
 *         &lt;element name="SimilarityLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SimilarityLookupRequest" minOccurs="0"/>
 *         &lt;element name="CartGetRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartGetRequest" minOccurs="0"/>
 *         &lt;element name="CartAddRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartAddRequest" minOccurs="0"/>
 *         &lt;element name="CartCreateRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartCreateRequest" minOccurs="0"/>
 *         &lt;element name="CartModifyRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartModifyRequest" minOccurs="0"/>
 *         &lt;element name="CartClearRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartClearRequest" minOccurs="0"/>
 *         &lt;element name="TransactionLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TransactionLookupRequest" minOccurs="0"/>
 *         &lt;element name="SellerListingSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingSearchRequest" minOccurs="0"/>
 *         &lt;element name="SellerListingLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingLookupRequest" minOccurs="0"/>
 *         &lt;element name="SellerLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerLookupRequest" minOccurs="0"/>
 *         &lt;element name="TagLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TagLookupRequest" minOccurs="0"/>
 *         &lt;element name="VehicleSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleSearchRequest" minOccurs="0"/>
 *         &lt;element name="VehiclePartSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartSearchRequest" minOccurs="0"/>
 *         &lt;element name="VehiclePartLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartLookupRequest" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "isValid", "helpRequest",
        "browseNodeLookupRequest", "itemSearchRequest", "itemLookupRequest",
        "listSearchRequest", "listLookupRequest",
        "customerContentSearchRequest", "customerContentLookupRequest",
        "similarityLookupRequest", "cartGetRequest", "cartAddRequest",
        "cartCreateRequest", "cartModifyRequest", "cartClearRequest",
        "transactionLookupRequest", "sellerListingSearchRequest",
        "sellerListingLookupRequest", "sellerLookupRequest",
        "tagLookupRequest", "vehicleSearchRequest", "vehiclePartSearchRequest",
        "vehiclePartLookupRequest", "errors" })
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "IsValid")
    protected String isValid;
    @XmlElement(name = "HelpRequest")
    protected HelpRequest helpRequest;
    @XmlElement(name = "BrowseNodeLookupRequest")
    protected BrowseNodeLookupRequest browseNodeLookupRequest;
    @XmlElement(name = "ItemSearchRequest")
    protected ItemSearchRequest itemSearchRequest;
    @XmlElement(name = "ItemLookupRequest")
    protected ItemLookupRequest itemLookupRequest;
    @XmlElement(name = "ListSearchRequest")
    protected ListSearchRequest listSearchRequest;
    @XmlElement(name = "ListLookupRequest")
    protected ListLookupRequest listLookupRequest;
    @XmlElement(name = "CustomerContentSearchRequest")
    protected CustomerContentSearchRequest customerContentSearchRequest;
    @XmlElement(name = "CustomerContentLookupRequest")
    protected CustomerContentLookupRequest customerContentLookupRequest;
    @XmlElement(name = "SimilarityLookupRequest")
    protected SimilarityLookupRequest similarityLookupRequest;
    @XmlElement(name = "CartGetRequest")
    protected CartGetRequest cartGetRequest;
    @XmlElement(name = "CartAddRequest")
    protected CartAddRequest cartAddRequest;
    @XmlElement(name = "CartCreateRequest")
    protected CartCreateRequest cartCreateRequest;
    @XmlElement(name = "CartModifyRequest")
    protected CartModifyRequest cartModifyRequest;
    @XmlElement(name = "CartClearRequest")
    protected CartClearRequest cartClearRequest;
    @XmlElement(name = "TransactionLookupRequest")
    protected TransactionLookupRequest transactionLookupRequest;
    @XmlElement(name = "SellerListingSearchRequest")
    protected SellerListingSearchRequest sellerListingSearchRequest;
    @XmlElement(name = "SellerListingLookupRequest")
    protected SellerListingLookupRequest sellerListingLookupRequest;
    @XmlElement(name = "SellerLookupRequest")
    protected SellerLookupRequest sellerLookupRequest;
    @XmlElement(name = "TagLookupRequest")
    protected TagLookupRequest tagLookupRequest;
    @XmlElement(name = "VehicleSearchRequest")
    protected VehicleSearchRequest vehicleSearchRequest;
    @XmlElement(name = "VehiclePartSearchRequest")
    protected VehiclePartSearchRequest vehiclePartSearchRequest;
    @XmlElement(name = "VehiclePartLookupRequest")
    protected VehiclePartLookupRequest vehiclePartLookupRequest;
    @XmlElement(name = "Errors")
    protected Errors errors;

    /**
     * Gets the value of the isValid property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIsValid(String value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the helpRequest property.
     * 
     * @return possible object is {@link HelpRequest }
     * 
     */
    public HelpRequest getHelpRequest() {
        return helpRequest;
    }

    /**
     * Sets the value of the helpRequest property.
     * 
     * @param value
     *            allowed object is {@link HelpRequest }
     * 
     */
    public void setHelpRequest(HelpRequest value) {
        this.helpRequest = value;
    }

    /**
     * Gets the value of the browseNodeLookupRequest property.
     * 
     * @return possible object is {@link BrowseNodeLookupRequest }
     * 
     */
    public BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return browseNodeLookupRequest;
    }

    /**
     * Sets the value of the browseNodeLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link BrowseNodeLookupRequest }
     * 
     */
    public void setBrowseNodeLookupRequest(BrowseNodeLookupRequest value) {
        this.browseNodeLookupRequest = value;
    }

    /**
     * Gets the value of the itemSearchRequest property.
     * 
     * @return possible object is {@link ItemSearchRequest }
     * 
     */
    public ItemSearchRequest getItemSearchRequest() {
        return itemSearchRequest;
    }

    /**
     * Sets the value of the itemSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link ItemSearchRequest }
     * 
     */
    public void setItemSearchRequest(ItemSearchRequest value) {
        this.itemSearchRequest = value;
    }

    /**
     * Gets the value of the itemLookupRequest property.
     * 
     * @return possible object is {@link ItemLookupRequest }
     * 
     */
    public ItemLookupRequest getItemLookupRequest() {
        return itemLookupRequest;
    }

    /**
     * Sets the value of the itemLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link ItemLookupRequest }
     * 
     */
    public void setItemLookupRequest(ItemLookupRequest value) {
        this.itemLookupRequest = value;
    }

    /**
     * Gets the value of the listSearchRequest property.
     * 
     * @return possible object is {@link ListSearchRequest }
     * 
     */
    public ListSearchRequest getListSearchRequest() {
        return listSearchRequest;
    }

    /**
     * Sets the value of the listSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link ListSearchRequest }
     * 
     */
    public void setListSearchRequest(ListSearchRequest value) {
        this.listSearchRequest = value;
    }

    /**
     * Gets the value of the listLookupRequest property.
     * 
     * @return possible object is {@link ListLookupRequest }
     * 
     */
    public ListLookupRequest getListLookupRequest() {
        return listLookupRequest;
    }

    /**
     * Sets the value of the listLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link ListLookupRequest }
     * 
     */
    public void setListLookupRequest(ListLookupRequest value) {
        this.listLookupRequest = value;
    }

    /**
     * Gets the value of the customerContentSearchRequest property.
     * 
     * @return possible object is {@link CustomerContentSearchRequest }
     * 
     */
    public CustomerContentSearchRequest getCustomerContentSearchRequest() {
        return customerContentSearchRequest;
    }

    /**
     * Sets the value of the customerContentSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentSearchRequest }
     * 
     */
    public void setCustomerContentSearchRequest(
            CustomerContentSearchRequest value) {
        this.customerContentSearchRequest = value;
    }

    /**
     * Gets the value of the customerContentLookupRequest property.
     * 
     * @return possible object is {@link CustomerContentLookupRequest }
     * 
     */
    public CustomerContentLookupRequest getCustomerContentLookupRequest() {
        return customerContentLookupRequest;
    }

    /**
     * Sets the value of the customerContentLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentLookupRequest }
     * 
     */
    public void setCustomerContentLookupRequest(
            CustomerContentLookupRequest value) {
        this.customerContentLookupRequest = value;
    }

    /**
     * Gets the value of the similarityLookupRequest property.
     * 
     * @return possible object is {@link SimilarityLookupRequest }
     * 
     */
    public SimilarityLookupRequest getSimilarityLookupRequest() {
        return similarityLookupRequest;
    }

    /**
     * Sets the value of the similarityLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link SimilarityLookupRequest }
     * 
     */
    public void setSimilarityLookupRequest(SimilarityLookupRequest value) {
        this.similarityLookupRequest = value;
    }

    /**
     * Gets the value of the cartGetRequest property.
     * 
     * @return possible object is {@link CartGetRequest }
     * 
     */
    public CartGetRequest getCartGetRequest() {
        return cartGetRequest;
    }

    /**
     * Sets the value of the cartGetRequest property.
     * 
     * @param value
     *            allowed object is {@link CartGetRequest }
     * 
     */
    public void setCartGetRequest(CartGetRequest value) {
        this.cartGetRequest = value;
    }

    /**
     * Gets the value of the cartAddRequest property.
     * 
     * @return possible object is {@link CartAddRequest }
     * 
     */
    public CartAddRequest getCartAddRequest() {
        return cartAddRequest;
    }

    /**
     * Sets the value of the cartAddRequest property.
     * 
     * @param value
     *            allowed object is {@link CartAddRequest }
     * 
     */
    public void setCartAddRequest(CartAddRequest value) {
        this.cartAddRequest = value;
    }

    /**
     * Gets the value of the cartCreateRequest property.
     * 
     * @return possible object is {@link CartCreateRequest }
     * 
     */
    public CartCreateRequest getCartCreateRequest() {
        return cartCreateRequest;
    }

    /**
     * Sets the value of the cartCreateRequest property.
     * 
     * @param value
     *            allowed object is {@link CartCreateRequest }
     * 
     */
    public void setCartCreateRequest(CartCreateRequest value) {
        this.cartCreateRequest = value;
    }

    /**
     * Gets the value of the cartModifyRequest property.
     * 
     * @return possible object is {@link CartModifyRequest }
     * 
     */
    public CartModifyRequest getCartModifyRequest() {
        return cartModifyRequest;
    }

    /**
     * Sets the value of the cartModifyRequest property.
     * 
     * @param value
     *            allowed object is {@link CartModifyRequest }
     * 
     */
    public void setCartModifyRequest(CartModifyRequest value) {
        this.cartModifyRequest = value;
    }

    /**
     * Gets the value of the cartClearRequest property.
     * 
     * @return possible object is {@link CartClearRequest }
     * 
     */
    public CartClearRequest getCartClearRequest() {
        return cartClearRequest;
    }

    /**
     * Sets the value of the cartClearRequest property.
     * 
     * @param value
     *            allowed object is {@link CartClearRequest }
     * 
     */
    public void setCartClearRequest(CartClearRequest value) {
        this.cartClearRequest = value;
    }

    /**
     * Gets the value of the transactionLookupRequest property.
     * 
     * @return possible object is {@link TransactionLookupRequest }
     * 
     */
    public TransactionLookupRequest getTransactionLookupRequest() {
        return transactionLookupRequest;
    }

    /**
     * Sets the value of the transactionLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link TransactionLookupRequest }
     * 
     */
    public void setTransactionLookupRequest(TransactionLookupRequest value) {
        this.transactionLookupRequest = value;
    }

    /**
     * Gets the value of the sellerListingSearchRequest property.
     * 
     * @return possible object is {@link SellerListingSearchRequest }
     * 
     */
    public SellerListingSearchRequest getSellerListingSearchRequest() {
        return sellerListingSearchRequest;
    }

    /**
     * Sets the value of the sellerListingSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link SellerListingSearchRequest }
     * 
     */
    public void setSellerListingSearchRequest(SellerListingSearchRequest value) {
        this.sellerListingSearchRequest = value;
    }

    /**
     * Gets the value of the sellerListingLookupRequest property.
     * 
     * @return possible object is {@link SellerListingLookupRequest }
     * 
     */
    public SellerListingLookupRequest getSellerListingLookupRequest() {
        return sellerListingLookupRequest;
    }

    /**
     * Sets the value of the sellerListingLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link SellerListingLookupRequest }
     * 
     */
    public void setSellerListingLookupRequest(SellerListingLookupRequest value) {
        this.sellerListingLookupRequest = value;
    }

    /**
     * Gets the value of the sellerLookupRequest property.
     * 
     * @return possible object is {@link SellerLookupRequest }
     * 
     */
    public SellerLookupRequest getSellerLookupRequest() {
        return sellerLookupRequest;
    }

    /**
     * Sets the value of the sellerLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link SellerLookupRequest }
     * 
     */
    public void setSellerLookupRequest(SellerLookupRequest value) {
        this.sellerLookupRequest = value;
    }

    /**
     * Gets the value of the tagLookupRequest property.
     * 
     * @return possible object is {@link TagLookupRequest }
     * 
     */
    public TagLookupRequest getTagLookupRequest() {
        return tagLookupRequest;
    }

    /**
     * Sets the value of the tagLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link TagLookupRequest }
     * 
     */
    public void setTagLookupRequest(TagLookupRequest value) {
        this.tagLookupRequest = value;
    }

    /**
     * Gets the value of the vehicleSearchRequest property.
     * 
     * @return possible object is {@link VehicleSearchRequest }
     * 
     */
    public VehicleSearchRequest getVehicleSearchRequest() {
        return vehicleSearchRequest;
    }

    /**
     * Sets the value of the vehicleSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link VehicleSearchRequest }
     * 
     */
    public void setVehicleSearchRequest(VehicleSearchRequest value) {
        this.vehicleSearchRequest = value;
    }

    /**
     * Gets the value of the vehiclePartSearchRequest property.
     * 
     * @return possible object is {@link VehiclePartSearchRequest }
     * 
     */
    public VehiclePartSearchRequest getVehiclePartSearchRequest() {
        return vehiclePartSearchRequest;
    }

    /**
     * Sets the value of the vehiclePartSearchRequest property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartSearchRequest }
     * 
     */
    public void setVehiclePartSearchRequest(VehiclePartSearchRequest value) {
        this.vehiclePartSearchRequest = value;
    }

    /**
     * Gets the value of the vehiclePartLookupRequest property.
     * 
     * @return possible object is {@link VehiclePartLookupRequest }
     * 
     */
    public VehiclePartLookupRequest getVehiclePartLookupRequest() {
        return vehiclePartLookupRequest;
    }

    /**
     * Sets the value of the vehiclePartLookupRequest property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartLookupRequest }
     * 
     */
    public void setVehiclePartLookupRequest(VehiclePartLookupRequest value) {
        this.vehiclePartLookupRequest = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return possible object is {@link Errors }
     * 
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *            allowed object is {@link Errors }
     * 
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
