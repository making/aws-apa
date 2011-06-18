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
 * Java class for PromotionItemApplicability complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionItemApplicability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsInBenefitSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInEligibilityRequirementSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionItemApplicability", propOrder = { "asin",
        "isInBenefitSet", "isInEligibilityRequirementSet" })
public class PromotionItemApplicability {

    @XmlElement(name = "ASIN", required = true)
    protected String asin;
    @XmlElement(name = "IsInBenefitSet")
    protected boolean isInBenefitSet;
    @XmlElement(name = "IsInEligibilityRequirementSet")
    protected boolean isInEligibilityRequirementSet;

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
     * Gets the value of the isInBenefitSet property.
     * 
     */
    public boolean isIsInBenefitSet() {
        return isInBenefitSet;
    }

    /**
     * Sets the value of the isInBenefitSet property.
     * 
     */
    public void setIsInBenefitSet(boolean value) {
        this.isInBenefitSet = value;
    }

    /**
     * Gets the value of the isInEligibilityRequirementSet property.
     * 
     */
    public boolean isIsInEligibilityRequirementSet() {
        return isInEligibilityRequirementSet;
    }

    /**
     * Sets the value of the isInEligibilityRequirementSet property.
     * 
     */
    public void setIsInEligibilityRequirementSet(boolean value) {
        this.isInEligibilityRequirementSet = value;
    }

}
