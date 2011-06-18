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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}OperationRequest" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}HelpResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SimilarityLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartGetResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartAddResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartCreateResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartModifyResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartClearResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TransactionLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TagLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}BrowseNodeLookupResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartSearchResponse" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartLookupResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "operationRequest", "helpResponse",
        "itemSearchResponse", "itemLookupResponse", "listSearchResponse",
        "listLookupResponse", "customerContentSearchResponse",
        "customerContentLookupResponse", "similarityLookupResponse",
        "sellerLookupResponse", "cartGetResponse", "cartAddResponse",
        "cartCreateResponse", "cartModifyResponse", "cartClearResponse",
        "transactionLookupResponse", "sellerListingSearchResponse",
        "sellerListingLookupResponse", "tagLookupResponse",
        "browseNodeLookupResponse", "vehicleSearchResponse",
        "vehiclePartSearchResponse", "vehiclePartLookupResponse" })
@XmlRootElement(name = "MultiOperationResponse")
public class MultiOperationResponse {

    @XmlElement(name = "OperationRequest")
    protected OperationRequest operationRequest;
    @XmlElement(name = "HelpResponse")
    protected HelpResponse helpResponse;
    @XmlElement(name = "ItemSearchResponse")
    protected ItemSearchResponse itemSearchResponse;
    @XmlElement(name = "ItemLookupResponse")
    protected ItemLookupResponse itemLookupResponse;
    @XmlElement(name = "ListSearchResponse")
    protected ListSearchResponse listSearchResponse;
    @XmlElement(name = "ListLookupResponse")
    protected ListLookupResponse listLookupResponse;
    @XmlElement(name = "CustomerContentSearchResponse")
    protected CustomerContentSearchResponse customerContentSearchResponse;
    @XmlElement(name = "CustomerContentLookupResponse")
    protected CustomerContentLookupResponse customerContentLookupResponse;
    @XmlElement(name = "SimilarityLookupResponse")
    protected SimilarityLookupResponse similarityLookupResponse;
    @XmlElement(name = "SellerLookupResponse")
    protected SellerLookupResponse sellerLookupResponse;
    @XmlElement(name = "CartGetResponse")
    protected CartGetResponse cartGetResponse;
    @XmlElement(name = "CartAddResponse")
    protected CartAddResponse cartAddResponse;
    @XmlElement(name = "CartCreateResponse")
    protected CartCreateResponse cartCreateResponse;
    @XmlElement(name = "CartModifyResponse")
    protected CartModifyResponse cartModifyResponse;
    @XmlElement(name = "CartClearResponse")
    protected CartClearResponse cartClearResponse;
    @XmlElement(name = "TransactionLookupResponse")
    protected TransactionLookupResponse transactionLookupResponse;
    @XmlElement(name = "SellerListingSearchResponse")
    protected SellerListingSearchResponse sellerListingSearchResponse;
    @XmlElement(name = "SellerListingLookupResponse")
    protected SellerListingLookupResponse sellerListingLookupResponse;
    @XmlElement(name = "TagLookupResponse")
    protected TagLookupResponse tagLookupResponse;
    @XmlElement(name = "BrowseNodeLookupResponse")
    protected BrowseNodeLookupResponse browseNodeLookupResponse;
    @XmlElement(name = "VehicleSearchResponse")
    protected VehicleSearchResponse vehicleSearchResponse;
    @XmlElement(name = "VehiclePartSearchResponse")
    protected VehiclePartSearchResponse vehiclePartSearchResponse;
    @XmlElement(name = "VehiclePartLookupResponse")
    protected VehiclePartLookupResponse vehiclePartLookupResponse;

    /**
     * Gets the value of the operationRequest property.
     * 
     * @return possible object is {@link OperationRequest }
     * 
     */
    public OperationRequest getOperationRequest() {
        return operationRequest;
    }

    /**
     * Sets the value of the operationRequest property.
     * 
     * @param value
     *            allowed object is {@link OperationRequest }
     * 
     */
    public void setOperationRequest(OperationRequest value) {
        this.operationRequest = value;
    }

    /**
     * Gets the value of the helpResponse property.
     * 
     * @return possible object is {@link HelpResponse }
     * 
     */
    public HelpResponse getHelpResponse() {
        return helpResponse;
    }

    /**
     * Sets the value of the helpResponse property.
     * 
     * @param value
     *            allowed object is {@link HelpResponse }
     * 
     */
    public void setHelpResponse(HelpResponse value) {
        this.helpResponse = value;
    }

    /**
     * Gets the value of the itemSearchResponse property.
     * 
     * @return possible object is {@link ItemSearchResponse }
     * 
     */
    public ItemSearchResponse getItemSearchResponse() {
        return itemSearchResponse;
    }

    /**
     * Sets the value of the itemSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link ItemSearchResponse }
     * 
     */
    public void setItemSearchResponse(ItemSearchResponse value) {
        this.itemSearchResponse = value;
    }

    /**
     * Gets the value of the itemLookupResponse property.
     * 
     * @return possible object is {@link ItemLookupResponse }
     * 
     */
    public ItemLookupResponse getItemLookupResponse() {
        return itemLookupResponse;
    }

    /**
     * Sets the value of the itemLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link ItemLookupResponse }
     * 
     */
    public void setItemLookupResponse(ItemLookupResponse value) {
        this.itemLookupResponse = value;
    }

    /**
     * Gets the value of the listSearchResponse property.
     * 
     * @return possible object is {@link ListSearchResponse }
     * 
     */
    public ListSearchResponse getListSearchResponse() {
        return listSearchResponse;
    }

    /**
     * Sets the value of the listSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link ListSearchResponse }
     * 
     */
    public void setListSearchResponse(ListSearchResponse value) {
        this.listSearchResponse = value;
    }

    /**
     * Gets the value of the listLookupResponse property.
     * 
     * @return possible object is {@link ListLookupResponse }
     * 
     */
    public ListLookupResponse getListLookupResponse() {
        return listLookupResponse;
    }

    /**
     * Sets the value of the listLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link ListLookupResponse }
     * 
     */
    public void setListLookupResponse(ListLookupResponse value) {
        this.listLookupResponse = value;
    }

    /**
     * Gets the value of the customerContentSearchResponse property.
     * 
     * @return possible object is {@link CustomerContentSearchResponse }
     * 
     */
    public CustomerContentSearchResponse getCustomerContentSearchResponse() {
        return customerContentSearchResponse;
    }

    /**
     * Sets the value of the customerContentSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentSearchResponse }
     * 
     */
    public void setCustomerContentSearchResponse(
            CustomerContentSearchResponse value) {
        this.customerContentSearchResponse = value;
    }

    /**
     * Gets the value of the customerContentLookupResponse property.
     * 
     * @return possible object is {@link CustomerContentLookupResponse }
     * 
     */
    public CustomerContentLookupResponse getCustomerContentLookupResponse() {
        return customerContentLookupResponse;
    }

    /**
     * Sets the value of the customerContentLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentLookupResponse }
     * 
     */
    public void setCustomerContentLookupResponse(
            CustomerContentLookupResponse value) {
        this.customerContentLookupResponse = value;
    }

    /**
     * Gets the value of the similarityLookupResponse property.
     * 
     * @return possible object is {@link SimilarityLookupResponse }
     * 
     */
    public SimilarityLookupResponse getSimilarityLookupResponse() {
        return similarityLookupResponse;
    }

    /**
     * Sets the value of the similarityLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link SimilarityLookupResponse }
     * 
     */
    public void setSimilarityLookupResponse(SimilarityLookupResponse value) {
        this.similarityLookupResponse = value;
    }

    /**
     * Gets the value of the sellerLookupResponse property.
     * 
     * @return possible object is {@link SellerLookupResponse }
     * 
     */
    public SellerLookupResponse getSellerLookupResponse() {
        return sellerLookupResponse;
    }

    /**
     * Sets the value of the sellerLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link SellerLookupResponse }
     * 
     */
    public void setSellerLookupResponse(SellerLookupResponse value) {
        this.sellerLookupResponse = value;
    }

    /**
     * Gets the value of the cartGetResponse property.
     * 
     * @return possible object is {@link CartGetResponse }
     * 
     */
    public CartGetResponse getCartGetResponse() {
        return cartGetResponse;
    }

    /**
     * Sets the value of the cartGetResponse property.
     * 
     * @param value
     *            allowed object is {@link CartGetResponse }
     * 
     */
    public void setCartGetResponse(CartGetResponse value) {
        this.cartGetResponse = value;
    }

    /**
     * Gets the value of the cartAddResponse property.
     * 
     * @return possible object is {@link CartAddResponse }
     * 
     */
    public CartAddResponse getCartAddResponse() {
        return cartAddResponse;
    }

    /**
     * Sets the value of the cartAddResponse property.
     * 
     * @param value
     *            allowed object is {@link CartAddResponse }
     * 
     */
    public void setCartAddResponse(CartAddResponse value) {
        this.cartAddResponse = value;
    }

    /**
     * Gets the value of the cartCreateResponse property.
     * 
     * @return possible object is {@link CartCreateResponse }
     * 
     */
    public CartCreateResponse getCartCreateResponse() {
        return cartCreateResponse;
    }

    /**
     * Sets the value of the cartCreateResponse property.
     * 
     * @param value
     *            allowed object is {@link CartCreateResponse }
     * 
     */
    public void setCartCreateResponse(CartCreateResponse value) {
        this.cartCreateResponse = value;
    }

    /**
     * Gets the value of the cartModifyResponse property.
     * 
     * @return possible object is {@link CartModifyResponse }
     * 
     */
    public CartModifyResponse getCartModifyResponse() {
        return cartModifyResponse;
    }

    /**
     * Sets the value of the cartModifyResponse property.
     * 
     * @param value
     *            allowed object is {@link CartModifyResponse }
     * 
     */
    public void setCartModifyResponse(CartModifyResponse value) {
        this.cartModifyResponse = value;
    }

    /**
     * Gets the value of the cartClearResponse property.
     * 
     * @return possible object is {@link CartClearResponse }
     * 
     */
    public CartClearResponse getCartClearResponse() {
        return cartClearResponse;
    }

    /**
     * Sets the value of the cartClearResponse property.
     * 
     * @param value
     *            allowed object is {@link CartClearResponse }
     * 
     */
    public void setCartClearResponse(CartClearResponse value) {
        this.cartClearResponse = value;
    }

    /**
     * Gets the value of the transactionLookupResponse property.
     * 
     * @return possible object is {@link TransactionLookupResponse }
     * 
     */
    public TransactionLookupResponse getTransactionLookupResponse() {
        return transactionLookupResponse;
    }

    /**
     * Sets the value of the transactionLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link TransactionLookupResponse }
     * 
     */
    public void setTransactionLookupResponse(TransactionLookupResponse value) {
        this.transactionLookupResponse = value;
    }

    /**
     * Gets the value of the sellerListingSearchResponse property.
     * 
     * @return possible object is {@link SellerListingSearchResponse }
     * 
     */
    public SellerListingSearchResponse getSellerListingSearchResponse() {
        return sellerListingSearchResponse;
    }

    /**
     * Sets the value of the sellerListingSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link SellerListingSearchResponse }
     * 
     */
    public void setSellerListingSearchResponse(SellerListingSearchResponse value) {
        this.sellerListingSearchResponse = value;
    }

    /**
     * Gets the value of the sellerListingLookupResponse property.
     * 
     * @return possible object is {@link SellerListingLookupResponse }
     * 
     */
    public SellerListingLookupResponse getSellerListingLookupResponse() {
        return sellerListingLookupResponse;
    }

    /**
     * Sets the value of the sellerListingLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link SellerListingLookupResponse }
     * 
     */
    public void setSellerListingLookupResponse(SellerListingLookupResponse value) {
        this.sellerListingLookupResponse = value;
    }

    /**
     * Gets the value of the tagLookupResponse property.
     * 
     * @return possible object is {@link TagLookupResponse }
     * 
     */
    public TagLookupResponse getTagLookupResponse() {
        return tagLookupResponse;
    }

    /**
     * Sets the value of the tagLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link TagLookupResponse }
     * 
     */
    public void setTagLookupResponse(TagLookupResponse value) {
        this.tagLookupResponse = value;
    }

    /**
     * Gets the value of the browseNodeLookupResponse property.
     * 
     * @return possible object is {@link BrowseNodeLookupResponse }
     * 
     */
    public BrowseNodeLookupResponse getBrowseNodeLookupResponse() {
        return browseNodeLookupResponse;
    }

    /**
     * Sets the value of the browseNodeLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link BrowseNodeLookupResponse }
     * 
     */
    public void setBrowseNodeLookupResponse(BrowseNodeLookupResponse value) {
        this.browseNodeLookupResponse = value;
    }

    /**
     * Gets the value of the vehicleSearchResponse property.
     * 
     * @return possible object is {@link VehicleSearchResponse }
     * 
     */
    public VehicleSearchResponse getVehicleSearchResponse() {
        return vehicleSearchResponse;
    }

    /**
     * Sets the value of the vehicleSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link VehicleSearchResponse }
     * 
     */
    public void setVehicleSearchResponse(VehicleSearchResponse value) {
        this.vehicleSearchResponse = value;
    }

    /**
     * Gets the value of the vehiclePartSearchResponse property.
     * 
     * @return possible object is {@link VehiclePartSearchResponse }
     * 
     */
    public VehiclePartSearchResponse getVehiclePartSearchResponse() {
        return vehiclePartSearchResponse;
    }

    /**
     * Sets the value of the vehiclePartSearchResponse property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartSearchResponse }
     * 
     */
    public void setVehiclePartSearchResponse(VehiclePartSearchResponse value) {
        this.vehiclePartSearchResponse = value;
    }

    /**
     * Gets the value of the vehiclePartLookupResponse property.
     * 
     * @return possible object is {@link VehiclePartLookupResponse }
     * 
     */
    public VehiclePartLookupResponse getVehiclePartLookupResponse() {
        return vehiclePartLookupResponse;
    }

    /**
     * Sets the value of the vehiclePartLookupResponse property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartLookupResponse }
     * 
     */
    public void setVehiclePartLookupResponse(VehiclePartLookupResponse value) {
        this.vehiclePartLookupResponse = value;
    }

}
