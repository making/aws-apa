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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Merchant" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Seller" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}OfferAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}OfferListing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}LoyaltyPoints" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Promotions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "merchant", "seller", "offerAttributes",
        "offerListing", "loyaltyPoints", "promotions" })
@XmlRootElement(name = "Offer")
public class Offer {

    @XmlElement(name = "Merchant")
    protected Merchant merchant;
    @XmlElement(name = "Seller")
    protected Seller seller;
    @XmlElement(name = "OfferAttributes")
    protected OfferAttributes offerAttributes;
    @XmlElement(name = "OfferListing")
    protected List<OfferListing> offerListing;
    @XmlElement(name = "LoyaltyPoints")
    protected LoyaltyPoints loyaltyPoints;
    @XmlElement(name = "Promotions")
    protected Promotions promotions;

    /**
     * Gets the value of the merchant property.
     * 
     * @return possible object is {@link Merchant }
     * 
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *            allowed object is {@link Merchant }
     * 
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return possible object is {@link Seller }
     * 
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *            allowed object is {@link Seller }
     * 
     */
    public void setSeller(Seller value) {
        this.seller = value;
    }

    /**
     * Gets the value of the offerAttributes property.
     * 
     * @return possible object is {@link OfferAttributes }
     * 
     */
    public OfferAttributes getOfferAttributes() {
        return offerAttributes;
    }

    /**
     * Sets the value of the offerAttributes property.
     * 
     * @param value
     *            allowed object is {@link OfferAttributes }
     * 
     */
    public void setOfferAttributes(OfferAttributes value) {
        this.offerAttributes = value;
    }

    /**
     * Gets the value of the offerListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the offerListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOfferListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferListing }
     * 
     * 
     */
    public List<OfferListing> getOfferListing() {
        if (offerListing == null) {
            offerListing = new ArrayList<OfferListing>();
        }
        return this.offerListing;
    }

    /**
     * Gets the value of the loyaltyPoints property.
     * 
     * @return possible object is {@link LoyaltyPoints }
     * 
     */
    public LoyaltyPoints getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * Sets the value of the loyaltyPoints property.
     * 
     * @param value
     *            allowed object is {@link LoyaltyPoints }
     * 
     */
    public void setLoyaltyPoints(LoyaltyPoints value) {
        this.loyaltyPoints = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return possible object is {@link Promotions }
     * 
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *            allowed object is {@link Promotions }
     * 
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

}
