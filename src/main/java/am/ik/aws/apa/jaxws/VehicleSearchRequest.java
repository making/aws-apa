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
 * Java class for VehicleSearchRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MakeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ModelId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TrimId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ResponseGroup" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSearchRequest", propOrder = { "year", "makeId",
        "modelId", "trimId", "responseGroup" })
public class VehicleSearchRequest {

    @XmlElement(name = "Year")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger year;
    @XmlElement(name = "MakeId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger makeId;
    @XmlElement(name = "ModelId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger modelId;
    @XmlElement(name = "TrimId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger trimId;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;

    /**
     * Gets the value of the year property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the makeId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMakeId() {
        return makeId;
    }

    /**
     * Sets the value of the makeId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMakeId(BigInteger value) {
        this.makeId = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setModelId(BigInteger value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the trimId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTrimId() {
        return trimId;
    }

    /**
     * Sets the value of the trimId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTrimId(BigInteger value) {
        this.trimId = value;
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

}
