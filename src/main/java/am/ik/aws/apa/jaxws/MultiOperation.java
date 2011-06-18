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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Help" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ItemLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}ListLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CustomerContentLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SimilarityLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartGet" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartAdd" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartCreate" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartModify" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartClear" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TransactionLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SellerListingLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TagLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}BrowseNodeLookup" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartSearch" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartLookup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "help", "itemSearch", "itemLookup",
        "listSearch", "listLookup", "customerContentSearch",
        "customerContentLookup", "similarityLookup", "sellerLookup", "cartGet",
        "cartAdd", "cartCreate", "cartModify", "cartClear",
        "transactionLookup", "sellerListingSearch", "sellerListingLookup",
        "tagLookup", "browseNodeLookup", "vehicleSearch", "vehiclePartSearch",
        "vehiclePartLookup" })
@XmlRootElement(name = "MultiOperation")
public class MultiOperation {

    @XmlElement(name = "Help")
    protected Help help;
    @XmlElement(name = "ItemSearch")
    protected ItemSearch itemSearch;
    @XmlElement(name = "ItemLookup")
    protected ItemLookup itemLookup;
    @XmlElement(name = "ListSearch")
    protected ListSearch listSearch;
    @XmlElement(name = "ListLookup")
    protected ListLookup listLookup;
    @XmlElement(name = "CustomerContentSearch")
    protected CustomerContentSearch customerContentSearch;
    @XmlElement(name = "CustomerContentLookup")
    protected CustomerContentLookup customerContentLookup;
    @XmlElement(name = "SimilarityLookup")
    protected SimilarityLookup similarityLookup;
    @XmlElement(name = "SellerLookup")
    protected SellerLookup sellerLookup;
    @XmlElement(name = "CartGet")
    protected CartGet cartGet;
    @XmlElement(name = "CartAdd")
    protected CartAdd cartAdd;
    @XmlElement(name = "CartCreate")
    protected CartCreate cartCreate;
    @XmlElement(name = "CartModify")
    protected CartModify cartModify;
    @XmlElement(name = "CartClear")
    protected CartClear cartClear;
    @XmlElement(name = "TransactionLookup")
    protected TransactionLookup transactionLookup;
    @XmlElement(name = "SellerListingSearch")
    protected SellerListingSearch sellerListingSearch;
    @XmlElement(name = "SellerListingLookup")
    protected SellerListingLookup sellerListingLookup;
    @XmlElement(name = "TagLookup")
    protected TagLookup tagLookup;
    @XmlElement(name = "BrowseNodeLookup")
    protected BrowseNodeLookup browseNodeLookup;
    @XmlElement(name = "VehicleSearch")
    protected VehicleSearch vehicleSearch;
    @XmlElement(name = "VehiclePartSearch")
    protected VehiclePartSearch vehiclePartSearch;
    @XmlElement(name = "VehiclePartLookup")
    protected VehiclePartLookup vehiclePartLookup;

    /**
     * Gets the value of the help property.
     * 
     * @return possible object is {@link Help }
     * 
     */
    public Help getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *            allowed object is {@link Help }
     * 
     */
    public void setHelp(Help value) {
        this.help = value;
    }

    /**
     * Gets the value of the itemSearch property.
     * 
     * @return possible object is {@link ItemSearch }
     * 
     */
    public ItemSearch getItemSearch() {
        return itemSearch;
    }

    /**
     * Sets the value of the itemSearch property.
     * 
     * @param value
     *            allowed object is {@link ItemSearch }
     * 
     */
    public void setItemSearch(ItemSearch value) {
        this.itemSearch = value;
    }

    /**
     * Gets the value of the itemLookup property.
     * 
     * @return possible object is {@link ItemLookup }
     * 
     */
    public ItemLookup getItemLookup() {
        return itemLookup;
    }

    /**
     * Sets the value of the itemLookup property.
     * 
     * @param value
     *            allowed object is {@link ItemLookup }
     * 
     */
    public void setItemLookup(ItemLookup value) {
        this.itemLookup = value;
    }

    /**
     * Gets the value of the listSearch property.
     * 
     * @return possible object is {@link ListSearch }
     * 
     */
    public ListSearch getListSearch() {
        return listSearch;
    }

    /**
     * Sets the value of the listSearch property.
     * 
     * @param value
     *            allowed object is {@link ListSearch }
     * 
     */
    public void setListSearch(ListSearch value) {
        this.listSearch = value;
    }

    /**
     * Gets the value of the listLookup property.
     * 
     * @return possible object is {@link ListLookup }
     * 
     */
    public ListLookup getListLookup() {
        return listLookup;
    }

    /**
     * Sets the value of the listLookup property.
     * 
     * @param value
     *            allowed object is {@link ListLookup }
     * 
     */
    public void setListLookup(ListLookup value) {
        this.listLookup = value;
    }

    /**
     * Gets the value of the customerContentSearch property.
     * 
     * @return possible object is {@link CustomerContentSearch }
     * 
     */
    public CustomerContentSearch getCustomerContentSearch() {
        return customerContentSearch;
    }

    /**
     * Sets the value of the customerContentSearch property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentSearch }
     * 
     */
    public void setCustomerContentSearch(CustomerContentSearch value) {
        this.customerContentSearch = value;
    }

    /**
     * Gets the value of the customerContentLookup property.
     * 
     * @return possible object is {@link CustomerContentLookup }
     * 
     */
    public CustomerContentLookup getCustomerContentLookup() {
        return customerContentLookup;
    }

    /**
     * Sets the value of the customerContentLookup property.
     * 
     * @param value
     *            allowed object is {@link CustomerContentLookup }
     * 
     */
    public void setCustomerContentLookup(CustomerContentLookup value) {
        this.customerContentLookup = value;
    }

    /**
     * Gets the value of the similarityLookup property.
     * 
     * @return possible object is {@link SimilarityLookup }
     * 
     */
    public SimilarityLookup getSimilarityLookup() {
        return similarityLookup;
    }

    /**
     * Sets the value of the similarityLookup property.
     * 
     * @param value
     *            allowed object is {@link SimilarityLookup }
     * 
     */
    public void setSimilarityLookup(SimilarityLookup value) {
        this.similarityLookup = value;
    }

    /**
     * Gets the value of the sellerLookup property.
     * 
     * @return possible object is {@link SellerLookup }
     * 
     */
    public SellerLookup getSellerLookup() {
        return sellerLookup;
    }

    /**
     * Sets the value of the sellerLookup property.
     * 
     * @param value
     *            allowed object is {@link SellerLookup }
     * 
     */
    public void setSellerLookup(SellerLookup value) {
        this.sellerLookup = value;
    }

    /**
     * Gets the value of the cartGet property.
     * 
     * @return possible object is {@link CartGet }
     * 
     */
    public CartGet getCartGet() {
        return cartGet;
    }

    /**
     * Sets the value of the cartGet property.
     * 
     * @param value
     *            allowed object is {@link CartGet }
     * 
     */
    public void setCartGet(CartGet value) {
        this.cartGet = value;
    }

    /**
     * Gets the value of the cartAdd property.
     * 
     * @return possible object is {@link CartAdd }
     * 
     */
    public CartAdd getCartAdd() {
        return cartAdd;
    }

    /**
     * Sets the value of the cartAdd property.
     * 
     * @param value
     *            allowed object is {@link CartAdd }
     * 
     */
    public void setCartAdd(CartAdd value) {
        this.cartAdd = value;
    }

    /**
     * Gets the value of the cartCreate property.
     * 
     * @return possible object is {@link CartCreate }
     * 
     */
    public CartCreate getCartCreate() {
        return cartCreate;
    }

    /**
     * Sets the value of the cartCreate property.
     * 
     * @param value
     *            allowed object is {@link CartCreate }
     * 
     */
    public void setCartCreate(CartCreate value) {
        this.cartCreate = value;
    }

    /**
     * Gets the value of the cartModify property.
     * 
     * @return possible object is {@link CartModify }
     * 
     */
    public CartModify getCartModify() {
        return cartModify;
    }

    /**
     * Sets the value of the cartModify property.
     * 
     * @param value
     *            allowed object is {@link CartModify }
     * 
     */
    public void setCartModify(CartModify value) {
        this.cartModify = value;
    }

    /**
     * Gets the value of the cartClear property.
     * 
     * @return possible object is {@link CartClear }
     * 
     */
    public CartClear getCartClear() {
        return cartClear;
    }

    /**
     * Sets the value of the cartClear property.
     * 
     * @param value
     *            allowed object is {@link CartClear }
     * 
     */
    public void setCartClear(CartClear value) {
        this.cartClear = value;
    }

    /**
     * Gets the value of the transactionLookup property.
     * 
     * @return possible object is {@link TransactionLookup }
     * 
     */
    public TransactionLookup getTransactionLookup() {
        return transactionLookup;
    }

    /**
     * Sets the value of the transactionLookup property.
     * 
     * @param value
     *            allowed object is {@link TransactionLookup }
     * 
     */
    public void setTransactionLookup(TransactionLookup value) {
        this.transactionLookup = value;
    }

    /**
     * Gets the value of the sellerListingSearch property.
     * 
     * @return possible object is {@link SellerListingSearch }
     * 
     */
    public SellerListingSearch getSellerListingSearch() {
        return sellerListingSearch;
    }

    /**
     * Sets the value of the sellerListingSearch property.
     * 
     * @param value
     *            allowed object is {@link SellerListingSearch }
     * 
     */
    public void setSellerListingSearch(SellerListingSearch value) {
        this.sellerListingSearch = value;
    }

    /**
     * Gets the value of the sellerListingLookup property.
     * 
     * @return possible object is {@link SellerListingLookup }
     * 
     */
    public SellerListingLookup getSellerListingLookup() {
        return sellerListingLookup;
    }

    /**
     * Sets the value of the sellerListingLookup property.
     * 
     * @param value
     *            allowed object is {@link SellerListingLookup }
     * 
     */
    public void setSellerListingLookup(SellerListingLookup value) {
        this.sellerListingLookup = value;
    }

    /**
     * Gets the value of the tagLookup property.
     * 
     * @return possible object is {@link TagLookup }
     * 
     */
    public TagLookup getTagLookup() {
        return tagLookup;
    }

    /**
     * Sets the value of the tagLookup property.
     * 
     * @param value
     *            allowed object is {@link TagLookup }
     * 
     */
    public void setTagLookup(TagLookup value) {
        this.tagLookup = value;
    }

    /**
     * Gets the value of the browseNodeLookup property.
     * 
     * @return possible object is {@link BrowseNodeLookup }
     * 
     */
    public BrowseNodeLookup getBrowseNodeLookup() {
        return browseNodeLookup;
    }

    /**
     * Sets the value of the browseNodeLookup property.
     * 
     * @param value
     *            allowed object is {@link BrowseNodeLookup }
     * 
     */
    public void setBrowseNodeLookup(BrowseNodeLookup value) {
        this.browseNodeLookup = value;
    }

    /**
     * Gets the value of the vehicleSearch property.
     * 
     * @return possible object is {@link VehicleSearch }
     * 
     */
    public VehicleSearch getVehicleSearch() {
        return vehicleSearch;
    }

    /**
     * Sets the value of the vehicleSearch property.
     * 
     * @param value
     *            allowed object is {@link VehicleSearch }
     * 
     */
    public void setVehicleSearch(VehicleSearch value) {
        this.vehicleSearch = value;
    }

    /**
     * Gets the value of the vehiclePartSearch property.
     * 
     * @return possible object is {@link VehiclePartSearch }
     * 
     */
    public VehiclePartSearch getVehiclePartSearch() {
        return vehiclePartSearch;
    }

    /**
     * Sets the value of the vehiclePartSearch property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartSearch }
     * 
     */
    public void setVehiclePartSearch(VehiclePartSearch value) {
        this.vehiclePartSearch = value;
    }

    /**
     * Gets the value of the vehiclePartLookup property.
     * 
     * @return possible object is {@link VehiclePartLookup }
     * 
     */
    public VehiclePartLookup getVehiclePartLookup() {
        return vehiclePartLookup;
    }

    /**
     * Sets the value of the vehiclePartLookup property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartLookup }
     * 
     */
    public void setVehiclePartLookup(VehiclePartLookup value) {
        this.vehiclePartLookup = value;
    }

}
