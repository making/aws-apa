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
 * Java class for SellerListingSearchRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SellerListingSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="OfferStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Open"/>
 *               &lt;enumeration value="Closed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SellerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerListingSearchRequest", propOrder = { "keywords",
        "listingPage", "offerStatus", "responseGroup", "sellerId", "sort",
        "title" })
public class SellerListingSearchRequest {

    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "ListingPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger listingPage;
    @XmlElement(name = "OfferStatus")
    protected String offerStatus;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;
    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name = "Sort")
    protected String sort;
    @XmlElement(name = "Title")
    protected String title;

    /**
     * Gets the value of the keywords property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the listingPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getListingPage() {
        return listingPage;
    }

    /**
     * Sets the value of the listingPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setListingPage(BigInteger value) {
        this.listingPage = value;
    }

    /**
     * Gets the value of the offerStatus property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOfferStatus() {
        return offerStatus;
    }

    /**
     * Sets the value of the offerStatus property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setOfferStatus(String value) {
        this.offerStatus = value;
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

}
