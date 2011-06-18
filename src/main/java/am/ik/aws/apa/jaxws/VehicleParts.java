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

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Request" minOccurs="0"/>
 *         &lt;element name="IsNext" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IsPrevious" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Part" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}MissingVehicleAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PartBrowseNodeBins" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}PartBrandBins" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "request", "isNext", "isPrevious", "part",
        "missingVehicleAttributes", "partBrowseNodeBins", "partBrandBins" })
@XmlRootElement(name = "VehicleParts")
public class VehicleParts {

    @XmlElement(name = "Request")
    protected Request request;
    @XmlElement(name = "IsNext", type = Boolean.class)
    protected List<Boolean> isNext;
    @XmlElement(name = "IsPrevious", type = Boolean.class)
    protected List<Boolean> isPrevious;
    @XmlElement(name = "Part")
    protected List<Part> part;
    @XmlElement(name = "MissingVehicleAttributes")
    protected MissingVehicleAttributes missingVehicleAttributes;
    @XmlElement(name = "PartBrowseNodeBins")
    protected PartBrowseNodeBins partBrowseNodeBins;
    @XmlElement(name = "PartBrandBins")
    protected PartBrandBins partBrandBins;

    /**
     * Gets the value of the request property.
     * 
     * @return possible object is {@link Request }
     * 
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *            allowed object is {@link Request }
     * 
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the isNext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the isNext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIsNext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getIsNext() {
        if (isNext == null) {
            isNext = new ArrayList<Boolean>();
        }
        return this.isNext;
    }

    /**
     * Gets the value of the isPrevious property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the isPrevious property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIsPrevious().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getIsPrevious() {
        if (isPrevious == null) {
            isPrevious = new ArrayList<Boolean>();
        }
        return this.isPrevious;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the missingVehicleAttributes property.
     * 
     * @return possible object is {@link MissingVehicleAttributes }
     * 
     */
    public MissingVehicleAttributes getMissingVehicleAttributes() {
        return missingVehicleAttributes;
    }

    /**
     * Sets the value of the missingVehicleAttributes property.
     * 
     * @param value
     *            allowed object is {@link MissingVehicleAttributes }
     * 
     */
    public void setMissingVehicleAttributes(MissingVehicleAttributes value) {
        this.missingVehicleAttributes = value;
    }

    /**
     * Gets the value of the partBrowseNodeBins property.
     * 
     * @return possible object is {@link PartBrowseNodeBins }
     * 
     */
    public PartBrowseNodeBins getPartBrowseNodeBins() {
        return partBrowseNodeBins;
    }

    /**
     * Sets the value of the partBrowseNodeBins property.
     * 
     * @param value
     *            allowed object is {@link PartBrowseNodeBins }
     * 
     */
    public void setPartBrowseNodeBins(PartBrowseNodeBins value) {
        this.partBrowseNodeBins = value;
    }

    /**
     * Gets the value of the partBrandBins property.
     * 
     * @return possible object is {@link PartBrandBins }
     * 
     */
    public PartBrandBins getPartBrandBins() {
        return partBrandBins;
    }

    /**
     * Sets the value of the partBrandBins property.
     * 
     * @param value
     *            allowed object is {@link PartBrandBins }
     * 
     */
    public void setPartBrandBins(PartBrandBins value) {
        this.partBrandBins = value;
    }

}
