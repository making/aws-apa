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
 *         &lt;element name="TotalExcerpts" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Excerpt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "totalExcerpts", "excerpt" })
@XmlRootElement(name = "SearchInside")
public class SearchInside {

    @XmlElement(name = "TotalExcerpts")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalExcerpts;
    @XmlElement(name = "Excerpt")
    protected SearchInside.Excerpt excerpt;

    /**
     * Gets the value of the totalExcerpts property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTotalExcerpts() {
        return totalExcerpts;
    }

    /**
     * Sets the value of the totalExcerpts property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTotalExcerpts(BigInteger value) {
        this.totalExcerpts = value;
    }

    /**
     * Gets the value of the excerpt property.
     * 
     * @return possible object is {@link SearchInside.Excerpt }
     * 
     */
    public SearchInside.Excerpt getExcerpt() {
        return excerpt;
    }

    /**
     * Sets the value of the excerpt property.
     * 
     * @param value
     *            allowed object is {@link SearchInside.Excerpt }
     * 
     */
    public void setExcerpt(SearchInside.Excerpt value) {
        this.excerpt = value;
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
     *         &lt;element name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "checksum", "pageType", "pageNumber",
            "sequenceNumber", "text" })
    public static class Excerpt {

        @XmlElement(name = "Checksum")
        protected String checksum;
        @XmlElement(name = "PageType")
        protected String pageType;
        @XmlElement(name = "PageNumber")
        protected String pageNumber;
        @XmlElement(name = "SequenceNumber")
        protected String sequenceNumber;
        @XmlElement(name = "Text")
        protected String text;

        /**
         * Gets the value of the checksum property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getChecksum() {
            return checksum;
        }

        /**
         * Sets the value of the checksum property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setChecksum(String value) {
            this.checksum = value;
        }

        /**
         * Gets the value of the pageType property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPageType() {
            return pageType;
        }

        /**
         * Sets the value of the pageType property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPageType(String value) {
            this.pageType = value;
        }

        /**
         * Gets the value of the pageNumber property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPageNumber() {
            return pageNumber;
        }

        /**
         * Sets the value of the pageNumber property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setPageNumber(String value) {
            this.pageNumber = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setSequenceNumber(String value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
