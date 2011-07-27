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
 *         &lt;element name="Summary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "summary" })
@XmlRootElement(name = "Promotion")
public class Promotion {

    @XmlElement(name = "Summary")
    protected Promotion.Summary summary;

    /**
     * Gets the value of the summary property.
     * 
     * @return possible object is {@link Promotion.Summary }
     * 
     */
    public Promotion.Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *            allowed object is {@link Promotion.Summary }
     * 
     */
    public void setSummary(Promotion.Summary value) {
        this.summary = value;
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
     *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EligibilityRequirementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BenefitDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "promotionId", "category", "startDate",
            "endDate", "eligibilityRequirementDescription",
            "benefitDescription", "termsAndConditions" })
    public static class Summary {

        @XmlElement(name = "PromotionId", required = true)
        protected String promotionId;
        @XmlElement(name = "Category")
        protected String category;
        @XmlElement(name = "StartDate")
        protected String startDate;
        @XmlElement(name = "EndDate")
        protected String endDate;
        @XmlElement(name = "EligibilityRequirementDescription")
        protected String eligibilityRequirementDescription;
        @XmlElement(name = "BenefitDescription")
        protected String benefitDescription;
        @XmlElement(name = "TermsAndConditions")
        protected String termsAndConditions;

        /**
         * Gets the value of the promotionId property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPromotionId() {
            return promotionId;
        }

        /**
         * Sets the value of the promotionId property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPromotionId(String value) {
            this.promotionId = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the eligibilityRequirementDescription property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getEligibilityRequirementDescription() {
            return eligibilityRequirementDescription;
        }

        /**
         * Sets the value of the eligibilityRequirementDescription property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setEligibilityRequirementDescription(String value) {
            this.eligibilityRequirementDescription = value;
        }

        /**
         * Gets the value of the benefitDescription property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getBenefitDescription() {
            return benefitDescription;
        }

        /**
         * Sets the value of the benefitDescription property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setBenefitDescription(String value) {
            this.benefitDescription = value;
        }

        /**
         * Gets the value of the termsAndConditions property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getTermsAndConditions() {
            return termsAndConditions;
        }

        /**
         * Sets the value of the termsAndConditions property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setTermsAndConditions(String value) {
            this.termsAndConditions = value;
        }

    }

}
