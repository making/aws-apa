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
 * Java class for CustomerContentLookupRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerContentLookupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReviewPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TagPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TagsPerPage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TagSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContentLookupRequest", propOrder = { "customerId",
        "responseGroup", "reviewPage", "tagPage", "tagsPerPage", "tagSort" })
public class CustomerContentLookupRequest {

    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;
    @XmlElement(name = "ReviewPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger reviewPage;
    @XmlElement(name = "TagPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tagPage;
    @XmlElement(name = "TagsPerPage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tagsPerPage;
    @XmlElement(name = "TagSort")
    protected String tagSort;

    /**
     * Gets the value of the customerId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setCustomerId(String value) {
        this.customerId = value;
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
     * Gets the value of the reviewPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getReviewPage() {
        return reviewPage;
    }

    /**
     * Sets the value of the reviewPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setReviewPage(BigInteger value) {
        this.reviewPage = value;
    }

    /**
     * Gets the value of the tagPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTagPage() {
        return tagPage;
    }

    /**
     * Sets the value of the tagPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTagPage(BigInteger value) {
        this.tagPage = value;
    }

    /**
     * Gets the value of the tagsPerPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTagsPerPage() {
        return tagsPerPage;
    }

    /**
     * Sets the value of the tagsPerPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTagsPerPage(BigInteger value) {
        this.tagsPerPage = value;
    }

    /**
     * Gets the value of the tagSort property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTagSort() {
        return tagSort;
    }

    /**
     * Sets the value of the tagSort property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTagSort(String value) {
        this.tagSort = value;
    }

}
