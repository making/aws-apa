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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TotalFitments" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="FitmentAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Fitment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "totalFitments", "totalPages",
        "fitmentAttributes", "fitment" })
@XmlRootElement(name = "Fitments")
public class Fitments {

    @XmlElement(name = "TotalFitments", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFitments;
    @XmlElement(name = "TotalPages", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalPages;
    @XmlElement(name = "FitmentAttributes")
    protected String fitmentAttributes;
    @XmlElement(name = "Fitment")
    protected List<Fitment> fitment;

    /**
     * Gets the value of the totalFitments property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalFitments() {
        return totalFitments;
    }

    /**
     * Sets the value of the totalFitments property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalFitments(BigInteger value) {
        this.totalFitments = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalPages(BigInteger value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the fitmentAttributes property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFitmentAttributes() {
        return fitmentAttributes;
    }

    /**
     * Sets the value of the fitmentAttributes property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFitmentAttributes(String value) {
        this.fitmentAttributes = value;
    }

    /**
     * Gets the value of the fitment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the fitment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFitment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Fitment }
     * 
     * 
     */
    public List<Fitment> getFitment() {
        if (fitment == null) {
            fitment = new ArrayList<Fitment>();
        }
        return this.fitment;
    }

}
