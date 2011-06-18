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
 *         &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnitPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *         &lt;element name="TotalPrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildTransactionItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TransactionItem" maxOccurs="unbounded"/>
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
@XmlType(name = "", propOrder = { "transactionItemId", "quantity", "unitPrice",
        "totalPrice", "asin", "sku", "title", "childTransactionItems" })
@XmlRootElement(name = "TransactionItem")
public class TransactionItem {

    @XmlElement(name = "TransactionItemId", required = true)
    protected String transactionItemId;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected Price unitPrice;
    @XmlElement(name = "TotalPrice", required = true)
    protected Price totalPrice;
    @XmlElement(name = "ASIN")
    protected String asin;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ChildTransactionItems")
    protected TransactionItem.ChildTransactionItems childTransactionItems;

    /**
     * Gets the value of the transactionItemId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransactionItemId() {
        return transactionItemId;
    }

    /**
     * Sets the value of the transactionItemId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransactionItemId(String value) {
        this.transactionItemId = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setUnitPrice(Price value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setTotalPrice(Price value) {
        this.totalPrice = value;
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
     * Gets the value of the sku property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSKU(String value) {
        this.sku = value;
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
     * Gets the value of the childTransactionItems property.
     * 
     * @return possible object is {@link TransactionItem.ChildTransactionItems }
     * 
     */
    public TransactionItem.ChildTransactionItems getChildTransactionItems() {
        return childTransactionItems;
    }

    /**
     * Sets the value of the childTransactionItems property.
     * 
     * @param value
     *            allowed object is
     *            {@link TransactionItem.ChildTransactionItems }
     * 
     */
    public void setChildTransactionItems(
            TransactionItem.ChildTransactionItems value) {
        this.childTransactionItems = value;
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
     *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}TransactionItem" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "transactionItem" })
    public static class ChildTransactionItems {

        @XmlElement(name = "TransactionItem", required = true)
        protected List<TransactionItem> transactionItem;

        /**
         * Gets the value of the transactionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the transactionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getTransactionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransactionItem }
         * 
         * 
         */
        public List<TransactionItem> getTransactionItem() {
            if (transactionItem == null) {
                transactionItem = new ArrayList<TransactionItem>();
            }
            return this.transactionItem;
        }

    }

}
