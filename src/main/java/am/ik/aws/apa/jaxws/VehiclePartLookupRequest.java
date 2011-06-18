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
 * Java class for VehiclePartLookupRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="VehiclePartLookupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MakeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ModelId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TrimId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="BedId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="BodyStyleId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="BrakesId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DriveTypeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="EngineId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MfrBodyCodeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="SpringTypesId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="SteeringId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TransmissionId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="WheelbaseId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="BrowseNodeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FitmentPage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FitmentCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
@XmlType(name = "VehiclePartLookupRequest", propOrder = { "itemId", "idType",
        "year", "makeId", "modelId", "trimId", "bedId", "bodyStyleId",
        "brakesId", "driveTypeId", "engineId", "mfrBodyCodeId",
        "springTypesId", "steeringId", "transmissionId", "wheelbaseId",
        "browseNodeId", "fitmentPage", "fitmentCount", "responseGroup" })
public class VehiclePartLookupRequest {

    @XmlElement(name = "ItemId")
    protected String itemId;
    @XmlElement(name = "IdType")
    protected String idType;
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
    @XmlElement(name = "BedId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bedId;
    @XmlElement(name = "BodyStyleId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bodyStyleId;
    @XmlElement(name = "BrakesId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger brakesId;
    @XmlElement(name = "DriveTypeId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger driveTypeId;
    @XmlElement(name = "EngineId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger engineId;
    @XmlElement(name = "MfrBodyCodeId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger mfrBodyCodeId;
    @XmlElement(name = "SpringTypesId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger springTypesId;
    @XmlElement(name = "SteeringId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger steeringId;
    @XmlElement(name = "TransmissionId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transmissionId;
    @XmlElement(name = "WheelbaseId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelbaseId;
    @XmlElement(name = "BrowseNodeId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger browseNodeId;
    @XmlElement(name = "FitmentPage")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fitmentPage;
    @XmlElement(name = "FitmentCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fitmentCount;
    @XmlElement(name = "ResponseGroup")
    protected List<String> responseGroup;

    /**
     * Gets the value of the itemId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIdType(String value) {
        this.idType = value;
    }

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
     * Gets the value of the bedId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getBedId() {
        return bedId;
    }

    /**
     * Sets the value of the bedId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setBedId(BigInteger value) {
        this.bedId = value;
    }

    /**
     * Gets the value of the bodyStyleId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getBodyStyleId() {
        return bodyStyleId;
    }

    /**
     * Sets the value of the bodyStyleId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setBodyStyleId(BigInteger value) {
        this.bodyStyleId = value;
    }

    /**
     * Gets the value of the brakesId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getBrakesId() {
        return brakesId;
    }

    /**
     * Sets the value of the brakesId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setBrakesId(BigInteger value) {
        this.brakesId = value;
    }

    /**
     * Gets the value of the driveTypeId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getDriveTypeId() {
        return driveTypeId;
    }

    /**
     * Sets the value of the driveTypeId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setDriveTypeId(BigInteger value) {
        this.driveTypeId = value;
    }

    /**
     * Gets the value of the engineId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getEngineId() {
        return engineId;
    }

    /**
     * Sets the value of the engineId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setEngineId(BigInteger value) {
        this.engineId = value;
    }

    /**
     * Gets the value of the mfrBodyCodeId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMfrBodyCodeId() {
        return mfrBodyCodeId;
    }

    /**
     * Sets the value of the mfrBodyCodeId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMfrBodyCodeId(BigInteger value) {
        this.mfrBodyCodeId = value;
    }

    /**
     * Gets the value of the springTypesId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getSpringTypesId() {
        return springTypesId;
    }

    /**
     * Sets the value of the springTypesId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setSpringTypesId(BigInteger value) {
        this.springTypesId = value;
    }

    /**
     * Gets the value of the steeringId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getSteeringId() {
        return steeringId;
    }

    /**
     * Sets the value of the steeringId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setSteeringId(BigInteger value) {
        this.steeringId = value;
    }

    /**
     * Gets the value of the transmissionId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getTransmissionId() {
        return transmissionId;
    }

    /**
     * Sets the value of the transmissionId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setTransmissionId(BigInteger value) {
        this.transmissionId = value;
    }

    /**
     * Gets the value of the wheelbaseId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getWheelbaseId() {
        return wheelbaseId;
    }

    /**
     * Sets the value of the wheelbaseId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setWheelbaseId(BigInteger value) {
        this.wheelbaseId = value;
    }

    /**
     * Gets the value of the browseNodeId property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getBrowseNodeId() {
        return browseNodeId;
    }

    /**
     * Sets the value of the browseNodeId property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setBrowseNodeId(BigInteger value) {
        this.browseNodeId = value;
    }

    /**
     * Gets the value of the fitmentPage property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getFitmentPage() {
        return fitmentPage;
    }

    /**
     * Sets the value of the fitmentPage property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setFitmentPage(BigInteger value) {
        this.fitmentPage = value;
    }

    /**
     * Gets the value of the fitmentCount property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getFitmentCount() {
        return fitmentCount;
    }

    /**
     * Sets the value of the fitmentCount property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setFitmentCount(BigInteger value) {
        this.fitmentCount = value;
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
