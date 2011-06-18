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
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDateEpoch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SellerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayingCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderingCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Totals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Total" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                   &lt;element name="Subtotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                   &lt;element name="Tax" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                   &lt;element name="ShippingCharge" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                   &lt;element name="Promotion" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionItems" minOccurs="0">
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
 *         &lt;element name="Shipments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Shipment" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ShipmentItems" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Packages" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Package" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transactionId", "sellerId", "condition",
        "transactionDate", "transactionDateEpoch", "sellerName",
        "payingCustomerId", "orderingCustomerId", "totals", "transactionItems",
        "shipments" })
@XmlRootElement(name = "Transaction")
public class Transaction {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name = "Condition", required = true)
    protected String condition;
    @XmlElement(name = "TransactionDate", required = true)
    protected String transactionDate;
    @XmlElement(name = "TransactionDateEpoch", required = true)
    protected String transactionDateEpoch;
    @XmlElement(name = "SellerName")
    protected String sellerName;
    @XmlElement(name = "PayingCustomerId")
    protected String payingCustomerId;
    @XmlElement(name = "OrderingCustomerId")
    protected String orderingCustomerId;
    @XmlElement(name = "Totals")
    protected Transaction.Totals totals;
    @XmlElement(name = "TransactionItems")
    protected Transaction.TransactionItems transactionItems;
    @XmlElement(name = "Shipments")
    protected Transaction.Shipments shipments;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
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
     * Gets the value of the transactionDate property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionDateEpoch property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransactionDateEpoch() {
        return transactionDateEpoch;
    }

    /**
     * Sets the value of the transactionDateEpoch property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransactionDateEpoch(String value) {
        this.transactionDateEpoch = value;
    }

    /**
     * Gets the value of the sellerName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets the value of the sellerName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSellerName(String value) {
        this.sellerName = value;
    }

    /**
     * Gets the value of the payingCustomerId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPayingCustomerId() {
        return payingCustomerId;
    }

    /**
     * Sets the value of the payingCustomerId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPayingCustomerId(String value) {
        this.payingCustomerId = value;
    }

    /**
     * Gets the value of the orderingCustomerId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOrderingCustomerId() {
        return orderingCustomerId;
    }

    /**
     * Sets the value of the orderingCustomerId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOrderingCustomerId(String value) {
        this.orderingCustomerId = value;
    }

    /**
     * Gets the value of the totals property.
     * 
     * @return possible object is {@link Transaction.Totals }
     * 
     */
    public Transaction.Totals getTotals() {
        return totals;
    }

    /**
     * Sets the value of the totals property.
     * 
     * @param value
     *            allowed object is {@link Transaction.Totals }
     * 
     */
    public void setTotals(Transaction.Totals value) {
        this.totals = value;
    }

    /**
     * Gets the value of the transactionItems property.
     * 
     * @return possible object is {@link Transaction.TransactionItems }
     * 
     */
    public Transaction.TransactionItems getTransactionItems() {
        return transactionItems;
    }

    /**
     * Sets the value of the transactionItems property.
     * 
     * @param value
     *            allowed object is {@link Transaction.TransactionItems }
     * 
     */
    public void setTransactionItems(Transaction.TransactionItems value) {
        this.transactionItems = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * @return possible object is {@link Transaction.Shipments }
     * 
     */
    public Transaction.Shipments getShipments() {
        return shipments;
    }

    /**
     * Sets the value of the shipments property.
     * 
     * @param value
     *            allowed object is {@link Transaction.Shipments }
     * 
     */
    public void setShipments(Transaction.Shipments value) {
        this.shipments = value;
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
     *         &lt;element name="Shipment" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ShipmentItems" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Packages" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Package" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "shipment" })
    public static class Shipments {

        @XmlElement(name = "Shipment", required = true)
        protected List<Transaction.Shipments.Shipment> shipment;

        /**
         * Gets the value of the shipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the shipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getShipment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Transaction.Shipments.Shipment }
         * 
         * 
         */
        public List<Transaction.Shipments.Shipment> getShipment() {
            if (shipment == null) {
                shipment = new ArrayList<Transaction.Shipments.Shipment>();
            }
            return this.shipment;
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
         *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ShipmentItems" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Packages" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Package" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "condition", "deliveryMethod",
                "shipmentItems", "packages" })
        public static class Shipment {

            @XmlElement(name = "Condition", required = true)
            protected String condition;
            @XmlElement(name = "DeliveryMethod", required = true)
            protected String deliveryMethod;
            @XmlElement(name = "ShipmentItems")
            protected Transaction.Shipments.Shipment.ShipmentItems shipmentItems;
            @XmlElement(name = "Packages")
            protected Transaction.Shipments.Shipment.Packages packages;

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
             * Gets the value of the shipmentItems property.
             * 
             * @return possible object is
             *         {@link Transaction.Shipments.Shipment.ShipmentItems }
             * 
             */
            public Transaction.Shipments.Shipment.ShipmentItems getShipmentItems() {
                return shipmentItems;
            }

            /**
             * Sets the value of the shipmentItems property.
             * 
             * @param value
             *            allowed object is
             *            {@link Transaction.Shipments.Shipment.ShipmentItems }
             * 
             */
            public void setShipmentItems(
                    Transaction.Shipments.Shipment.ShipmentItems value) {
                this.shipmentItems = value;
            }

            /**
             * Gets the value of the packages property.
             * 
             * @return possible object is
             *         {@link Transaction.Shipments.Shipment.Packages }
             * 
             */
            public Transaction.Shipments.Shipment.Packages getPackages() {
                return packages;
            }

            /**
             * Sets the value of the packages property.
             * 
             * @param value
             *            allowed object is
             *            {@link Transaction.Shipments.Shipment.Packages }
             * 
             */
            public void setPackages(
                    Transaction.Shipments.Shipment.Packages value) {
                this.packages = value;
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
             *         &lt;element name="Package" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            @XmlType(name = "", propOrder = { "_package" })
            public static class Packages {

                @XmlElement(name = "Package", required = true)
                protected List<Transaction.Shipments.Shipment.Packages.Package> _package;

                /**
                 * Gets the value of the package property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the package
                 * property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getPackage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Transaction.Shipments.Shipment.Packages.Package }
                 * 
                 * 
                 */
                public List<Transaction.Shipments.Shipment.Packages.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<Transaction.Shipments.Shipment.Packages.Package>();
                    }
                    return this._package;
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
                 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { "trackingNumber",
                        "carrierName" })
                public static class Package {

                    @XmlElement(name = "TrackingNumber", required = true)
                    protected String trackingNumber;
                    @XmlElement(name = "CarrierName", required = true)
                    protected String carrierName;

                    /**
                     * Gets the value of the trackingNumber property.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getTrackingNumber() {
                        return trackingNumber;
                    }

                    /**
                     * Sets the value of the trackingNumber property.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setTrackingNumber(String value) {
                        this.trackingNumber = value;
                    }

                    /**
                     * Gets the value of the carrierName property.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getCarrierName() {
                        return carrierName;
                    }

                    /**
                     * Sets the value of the carrierName property.
                     * 
                     * @param value
                     *            allowed object is {@link String }
                     * 
                     */
                    public void setCarrierName(String value) {
                        this.carrierName = value;
                    }

                }

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
             *         &lt;element name="TransactionItemId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "transactionItemId" })
            public static class ShipmentItems {

                @XmlElement(name = "TransactionItemId", required = true)
                protected List<String> transactionItemId;

                /**
                 * Gets the value of the transactionItemId property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object. This is
                 * why there is not a <CODE>set</CODE> method for the
                 * transactionItemId property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getTransactionItemId().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTransactionItemId() {
                    if (transactionItemId == null) {
                        transactionItemId = new ArrayList<String>();
                    }
                    return this.transactionItemId;
                }

            }

        }

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
     *         &lt;element name="Total" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *         &lt;element name="Subtotal" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *         &lt;element name="Tax" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *         &lt;element name="ShippingCharge" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *         &lt;element name="Promotion" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "total", "subtotal", "tax",
            "shippingCharge", "promotion" })
    public static class Totals {

        @XmlElement(name = "Total", required = true)
        protected Price total;
        @XmlElement(name = "Subtotal", required = true)
        protected Price subtotal;
        @XmlElement(name = "Tax", required = true)
        protected Price tax;
        @XmlElement(name = "ShippingCharge", required = true)
        protected Price shippingCharge;
        @XmlElement(name = "Promotion", required = true)
        protected Price promotion;

        /**
         * Gets the value of the total property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setTotal(Price value) {
            this.total = value;
        }

        /**
         * Gets the value of the subtotal property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getSubtotal() {
            return subtotal;
        }

        /**
         * Sets the value of the subtotal property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setSubtotal(Price value) {
            this.subtotal = value;
        }

        /**
         * Gets the value of the tax property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getTax() {
            return tax;
        }

        /**
         * Sets the value of the tax property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setTax(Price value) {
            this.tax = value;
        }

        /**
         * Gets the value of the shippingCharge property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getShippingCharge() {
            return shippingCharge;
        }

        /**
         * Sets the value of the shippingCharge property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setShippingCharge(Price value) {
            this.shippingCharge = value;
        }

        /**
         * Gets the value of the promotion property.
         * 
         * @return possible object is {@link Price }
         * 
         */
        public Price getPromotion() {
            return promotion;
        }

        /**
         * Sets the value of the promotion property.
         * 
         * @param value
         *            allowed object is {@link Price }
         * 
         */
        public void setPromotion(Price value) {
            this.promotion = value;
        }

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
    public static class TransactionItems {

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
