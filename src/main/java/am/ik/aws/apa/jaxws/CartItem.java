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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for CartItem complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CartItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CartItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetaData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KeyValuePair" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="ItemTotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartItem", propOrder = { "cartItemId", "asin", "exchangeId",
        "merchantId", "sellerId", "sellerNickname", "quantity", "title",
        "productGroup", "listOwner", "listType", "metaData", "price",
        "itemTotal" })
public class CartItem {

    @XmlElement(name = "CartItemId", required = true)
    protected String cartItemId;
    @XmlElement(name = "ASIN")
    protected String asin;
    @XmlElement(name = "ExchangeId")
    protected String exchangeId;
    @XmlElement(name = "MerchantId")
    protected String merchantId;
    @XmlElement(name = "SellerId")
    protected String sellerId;
    @XmlElement(name = "SellerNickname")
    protected String sellerNickname;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ProductGroup")
    protected String productGroup;
    @XmlElement(name = "ListOwner")
    protected String listOwner;
    @XmlElement(name = "ListType")
    protected String listType;
    @XmlElement(name = "MetaData")
    protected CartItem.MetaData metaData;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "ItemTotal")
    protected Price itemTotal;

    /**
     * Gets the value of the cartItemId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCartItemId() {
        return cartItemId;
    }

    /**
     * Sets the value of the cartItemId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCartItemId(String value) {
        this.cartItemId = value;
    }

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
     * Gets the value of the exchangeId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setExchangeId(String value) {
        this.exchangeId = value;
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
     * Gets the value of the sellerNickname property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerNickname() {
        return sellerNickname;
    }

    /**
     * Sets the value of the sellerNickname property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSellerNickname(String value) {
        this.sellerNickname = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the listOwner property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getListOwner() {
        return listOwner;
    }

    /**
     * Sets the value of the listOwner property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setListOwner(String value) {
        this.listOwner = value;
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
     * Gets the value of the metaData property.
     * 
     * @return possible object is {@link CartItem.MetaData }
     * 
     */
    public CartItem.MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *            allowed object is {@link CartItem.MetaData }
     * 
     */
    public void setMetaData(CartItem.MetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the itemTotal property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getItemTotal() {
        return itemTotal;
    }

    /**
     * Sets the value of the itemTotal property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setItemTotal(Price value) {
        this.itemTotal = value;
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
     *         &lt;element name="KeyValuePair" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = { "keyValuePair" })
    public static class MetaData {

        @XmlElement(name = "KeyValuePair")
        protected List<CartItem.MetaData.KeyValuePair> keyValuePair;

        /**
         * Gets the value of the keyValuePair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the keyValuePair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getKeyValuePair().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CartItem.MetaData.KeyValuePair }
         * 
         * 
         */
        public List<CartItem.MetaData.KeyValuePair> getKeyValuePair() {
            if (keyValuePair == null) {
                keyValuePair = new ArrayList<CartItem.MetaData.KeyValuePair>();
            }
            return this.keyValuePair;
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
         *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "key", "value" })
        public static class KeyValuePair {

            @XmlElement(name = "Key", required = true)
            protected String key;
            @XmlElement(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *            allowed object is {@link String }
             * 
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
