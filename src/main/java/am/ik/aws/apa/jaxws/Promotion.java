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
 *         &lt;element name="Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OwningMerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PromotionCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MerchantPromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GroupClaimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CouponCombinationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EligibilityRequirements" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionEligibilityRequirements" minOccurs="0"/>
 *                   &lt;element name="Benefits" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionBenefits" minOccurs="0"/>
 *                   &lt;element name="ItemApplicability" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionItemApplicability" minOccurs="0"/>
 *                   &lt;element name="MerchandisingMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IconMediaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsIconMediaIdCustom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "summary", "details" })
@XmlRootElement(name = "Promotion")
public class Promotion {

    @XmlElement(name = "Summary")
    protected Promotion.Summary summary;
    @XmlElement(name = "Details")
    protected Promotion.Details details;

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
     * Gets the value of the details property.
     * 
     * @return possible object is {@link Promotion.Details }
     * 
     */
    public Promotion.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *            allowed object is {@link Promotion.Details }
     * 
     */
    public void setDetails(Promotion.Details value) {
        this.details = value;
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
     *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OwningMerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PromotionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PromotionCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MerchantPromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GroupClaimCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CouponCombinationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EligibilityRequirements" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionEligibilityRequirements" minOccurs="0"/>
     *         &lt;element name="Benefits" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionBenefits" minOccurs="0"/>
     *         &lt;element name="ItemApplicability" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PromotionItemApplicability" minOccurs="0"/>
     *         &lt;element name="MerchandisingMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IconMediaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsIconMediaIdCustom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "merchantId", "owningMerchantId",
            "promotionId", "promotionCategory", "merchantPromotionId",
            "groupClaimCode", "couponCombinationType", "startDate", "endDate",
            "termsAndConditions", "eligibilityRequirements", "benefits",
            "itemApplicability", "merchandisingMessage", "iconMediaId",
            "isIconMediaIdCustom" })
    public static class Details {

        @XmlElement(name = "MerchantId", required = true)
        protected String merchantId;
        @XmlElement(name = "OwningMerchantId", required = true)
        protected String owningMerchantId;
        @XmlElement(name = "PromotionId", required = true)
        protected String promotionId;
        @XmlElement(name = "PromotionCategory", required = true)
        protected String promotionCategory;
        @XmlElement(name = "MerchantPromotionId")
        protected String merchantPromotionId;
        @XmlElement(name = "GroupClaimCode")
        protected String groupClaimCode;
        @XmlElement(name = "CouponCombinationType")
        protected String couponCombinationType;
        @XmlElement(name = "StartDate")
        protected String startDate;
        @XmlElement(name = "EndDate")
        protected String endDate;
        @XmlElement(name = "TermsAndConditions")
        protected String termsAndConditions;
        @XmlElement(name = "EligibilityRequirements")
        protected PromotionEligibilityRequirements eligibilityRequirements;
        @XmlElement(name = "Benefits")
        protected PromotionBenefits benefits;
        @XmlElement(name = "ItemApplicability")
        protected PromotionItemApplicability itemApplicability;
        @XmlElement(name = "MerchandisingMessage")
        protected String merchandisingMessage;
        @XmlElement(name = "IconMediaId")
        protected String iconMediaId;
        @XmlElement(name = "IsIconMediaIdCustom")
        protected Boolean isIconMediaIdCustom;

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
         * Gets the value of the owningMerchantId property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getOwningMerchantId() {
            return owningMerchantId;
        }

        /**
         * Sets the value of the owningMerchantId property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setOwningMerchantId(String value) {
            this.owningMerchantId = value;
        }

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
         * Gets the value of the promotionCategory property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPromotionCategory() {
            return promotionCategory;
        }

        /**
         * Sets the value of the promotionCategory property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPromotionCategory(String value) {
            this.promotionCategory = value;
        }

        /**
         * Gets the value of the merchantPromotionId property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getMerchantPromotionId() {
            return merchantPromotionId;
        }

        /**
         * Sets the value of the merchantPromotionId property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setMerchantPromotionId(String value) {
            this.merchantPromotionId = value;
        }

        /**
         * Gets the value of the groupClaimCode property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getGroupClaimCode() {
            return groupClaimCode;
        }

        /**
         * Sets the value of the groupClaimCode property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setGroupClaimCode(String value) {
            this.groupClaimCode = value;
        }

        /**
         * Gets the value of the couponCombinationType property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getCouponCombinationType() {
            return couponCombinationType;
        }

        /**
         * Sets the value of the couponCombinationType property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setCouponCombinationType(String value) {
            this.couponCombinationType = value;
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

        /**
         * Gets the value of the eligibilityRequirements property.
         * 
         * @return possible object is {@link PromotionEligibilityRequirements }
         * 
         */
        public PromotionEligibilityRequirements getEligibilityRequirements() {
            return eligibilityRequirements;
        }

        /**
         * Sets the value of the eligibilityRequirements property.
         * 
         * @param value
         *            allowed object is {@link PromotionEligibilityRequirements }
         * 
         */
        public void setEligibilityRequirements(
                PromotionEligibilityRequirements value) {
            this.eligibilityRequirements = value;
        }

        /**
         * Gets the value of the benefits property.
         * 
         * @return possible object is {@link PromotionBenefits }
         * 
         */
        public PromotionBenefits getBenefits() {
            return benefits;
        }

        /**
         * Sets the value of the benefits property.
         * 
         * @param value
         *            allowed object is {@link PromotionBenefits }
         * 
         */
        public void setBenefits(PromotionBenefits value) {
            this.benefits = value;
        }

        /**
         * Gets the value of the itemApplicability property.
         * 
         * @return possible object is {@link PromotionItemApplicability }
         * 
         */
        public PromotionItemApplicability getItemApplicability() {
            return itemApplicability;
        }

        /**
         * Sets the value of the itemApplicability property.
         * 
         * @param value
         *            allowed object is {@link PromotionItemApplicability }
         * 
         */
        public void setItemApplicability(PromotionItemApplicability value) {
            this.itemApplicability = value;
        }

        /**
         * Gets the value of the merchandisingMessage property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getMerchandisingMessage() {
            return merchandisingMessage;
        }

        /**
         * Sets the value of the merchandisingMessage property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setMerchandisingMessage(String value) {
            this.merchandisingMessage = value;
        }

        /**
         * Gets the value of the iconMediaId property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getIconMediaId() {
            return iconMediaId;
        }

        /**
         * Sets the value of the iconMediaId property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setIconMediaId(String value) {
            this.iconMediaId = value;
        }

        /**
         * Gets the value of the isIconMediaIdCustom property.
         * 
         * @return possible object is {@link Boolean }
         * 
         */
        public Boolean isIsIconMediaIdCustom() {
            return isIconMediaIdCustom;
        }

        /**
         * Sets the value of the isIconMediaIdCustom property.
         * 
         * @param value
         *            allowed object is {@link Boolean }
         * 
         */
        public void setIsIconMediaIdCustom(Boolean value) {
            this.isIconMediaIdCustom = value;
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
