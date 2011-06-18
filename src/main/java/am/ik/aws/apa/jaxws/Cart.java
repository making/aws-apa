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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Request" minOccurs="0"/>
 *         &lt;element name="CartId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLEncodedHMAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PurchaseURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileCartURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}CartItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SavedForLaterItems" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SimilarProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TopSellers" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}NewReleases" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}SimilarViewedProducts" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}OtherCategoriesSimilarProducts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "request", "cartId", "hmac",
        "urlEncodedHMAC", "purchaseURL", "mobileCartURL", "subTotal",
        "cartItems", "savedForLaterItems", "similarProducts", "topSellers",
        "newReleases", "similarViewedProducts",
        "otherCategoriesSimilarProducts" })
@XmlRootElement(name = "Cart")
public class Cart {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "CartId", required = true)
    protected String cartId;
    @XmlElement(name = "HMAC", required = true)
    protected String hmac;
    @XmlElement(name = "URLEncodedHMAC", required = true)
    protected String urlEncodedHMAC;
    @XmlElement(name = "PurchaseURL")
    protected String purchaseURL;
    @XmlElement(name = "MobileCartURL")
    protected String mobileCartURL;
    @XmlElement(name = "SubTotal")
    protected Price subTotal;
    @XmlElement(name = "CartItems")
    protected CartItems cartItems;
    @XmlElement(name = "SavedForLaterItems")
    protected SavedForLaterItems savedForLaterItems;
    @XmlElement(name = "SimilarProducts")
    protected SimilarProducts similarProducts;
    @XmlElement(name = "TopSellers")
    protected TopSellers topSellers;
    @XmlElement(name = "NewReleases")
    protected NewReleases newReleases;
    @XmlElement(name = "SimilarViewedProducts")
    protected SimilarViewedProducts similarViewedProducts;
    @XmlElement(name = "OtherCategoriesSimilarProducts")
    protected OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;

    /**
     * Gets the value of the request property.
     * 
     * @return possible object is {@link Request }
     * 
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *            allowed object is {@link Request }
     * 
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the cartId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * Sets the value of the cartId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCartId(String value) {
        this.cartId = value;
    }

    /**
     * Gets the value of the hmac property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHMAC() {
        return hmac;
    }

    /**
     * Sets the value of the hmac property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setHMAC(String value) {
        this.hmac = value;
    }

    /**
     * Gets the value of the urlEncodedHMAC property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getURLEncodedHMAC() {
        return urlEncodedHMAC;
    }

    /**
     * Sets the value of the urlEncodedHMAC property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setURLEncodedHMAC(String value) {
        this.urlEncodedHMAC = value;
    }

    /**
     * Gets the value of the purchaseURL property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPurchaseURL() {
        return purchaseURL;
    }

    /**
     * Sets the value of the purchaseURL property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPurchaseURL(String value) {
        this.purchaseURL = value;
    }

    /**
     * Gets the value of the mobileCartURL property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMobileCartURL() {
        return mobileCartURL;
    }

    /**
     * Sets the value of the mobileCartURL property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMobileCartURL(String value) {
        this.mobileCartURL = value;
    }

    /**
     * Gets the value of the subTotal property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getSubTotal() {
        return subTotal;
    }

    /**
     * Sets the value of the subTotal property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setSubTotal(Price value) {
        this.subTotal = value;
    }

    /**
     * Gets the value of the cartItems property.
     * 
     * @return possible object is {@link CartItems }
     * 
     */
    public CartItems getCartItems() {
        return cartItems;
    }

    /**
     * Sets the value of the cartItems property.
     * 
     * @param value
     *            allowed object is {@link CartItems }
     * 
     */
    public void setCartItems(CartItems value) {
        this.cartItems = value;
    }

    /**
     * Gets the value of the savedForLaterItems property.
     * 
     * @return possible object is {@link SavedForLaterItems }
     * 
     */
    public SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }

    /**
     * Sets the value of the savedForLaterItems property.
     * 
     * @param value
     *            allowed object is {@link SavedForLaterItems }
     * 
     */
    public void setSavedForLaterItems(SavedForLaterItems value) {
        this.savedForLaterItems = value;
    }

    /**
     * Gets the value of the similarProducts property.
     * 
     * @return possible object is {@link SimilarProducts }
     * 
     */
    public SimilarProducts getSimilarProducts() {
        return similarProducts;
    }

    /**
     * Sets the value of the similarProducts property.
     * 
     * @param value
     *            allowed object is {@link SimilarProducts }
     * 
     */
    public void setSimilarProducts(SimilarProducts value) {
        this.similarProducts = value;
    }

    /**
     * Gets the value of the topSellers property.
     * 
     * @return possible object is {@link TopSellers }
     * 
     */
    public TopSellers getTopSellers() {
        return topSellers;
    }

    /**
     * Sets the value of the topSellers property.
     * 
     * @param value
     *            allowed object is {@link TopSellers }
     * 
     */
    public void setTopSellers(TopSellers value) {
        this.topSellers = value;
    }

    /**
     * Gets the value of the newReleases property.
     * 
     * @return possible object is {@link NewReleases }
     * 
     */
    public NewReleases getNewReleases() {
        return newReleases;
    }

    /**
     * Sets the value of the newReleases property.
     * 
     * @param value
     *            allowed object is {@link NewReleases }
     * 
     */
    public void setNewReleases(NewReleases value) {
        this.newReleases = value;
    }

    /**
     * Gets the value of the similarViewedProducts property.
     * 
     * @return possible object is {@link SimilarViewedProducts }
     * 
     */
    public SimilarViewedProducts getSimilarViewedProducts() {
        return similarViewedProducts;
    }

    /**
     * Sets the value of the similarViewedProducts property.
     * 
     * @param value
     *            allowed object is {@link SimilarViewedProducts }
     * 
     */
    public void setSimilarViewedProducts(SimilarViewedProducts value) {
        this.similarViewedProducts = value;
    }

    /**
     * Gets the value of the otherCategoriesSimilarProducts property.
     * 
     * @return possible object is {@link OtherCategoriesSimilarProducts }
     * 
     */
    public OtherCategoriesSimilarProducts getOtherCategoriesSimilarProducts() {
        return otherCategoriesSimilarProducts;
    }

    /**
     * Sets the value of the otherCategoriesSimilarProducts property.
     * 
     * @param value
     *            allowed object is {@link OtherCategoriesSimilarProducts }
     * 
     */
    public void setOtherCategoriesSimilarProducts(
            OtherCategoriesSimilarProducts value) {
        this.otherCategoriesSimilarProducts = value;
    }

}
