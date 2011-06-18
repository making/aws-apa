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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PromotionBenefit complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionBenefit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BenefitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ComponentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PercentOff" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="FixedAmount" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *         &lt;element name="Ceiling" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Price" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionBenefit", propOrder = { "benefitType",
        "componentType", "quantity", "percentOff", "fixedAmount", "ceiling" })
public class PromotionBenefit {

    @XmlElement(name = "BenefitType", required = true)
    protected String benefitType;
    @XmlElement(name = "ComponentType", required = true)
    protected String componentType;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "PercentOff")
    protected Double percentOff;
    @XmlElement(name = "FixedAmount")
    protected Price fixedAmount;
    @XmlElement(name = "Ceiling")
    protected Price ceiling;

    /**
     * Gets the value of the benefitType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBenefitType() {
        return benefitType;
    }

    /**
     * Sets the value of the benefitType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBenefitType(String value) {
        this.benefitType = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the percentOff property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getPercentOff() {
        return percentOff;
    }

    /**
     * Sets the value of the percentOff property.
     * 
     * @param value
     *            allowed object is {@link Double }
     * 
     */
    public void setPercentOff(Double value) {
        this.percentOff = value;
    }

    /**
     * Gets the value of the fixedAmount property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setFixedAmount(Price value) {
        this.fixedAmount = value;
    }

    /**
     * Gets the value of the ceiling property.
     * 
     * @return possible object is {@link Price }
     * 
     */
    public Price getCeiling() {
        return ceiling;
    }

    /**
     * Sets the value of the ceiling property.
     * 
     * @param value
     *            allowed object is {@link Price }
     * 
     */
    public void setCeiling(Price value) {
        this.ceiling = value;
    }

}
