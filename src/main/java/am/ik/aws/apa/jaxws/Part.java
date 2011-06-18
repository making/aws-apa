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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Item" minOccurs="0"/>
 *         &lt;element name="HasPartCompatibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehiclePartFit" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Fitments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "item", "hasPartCompatibility",
        "vehiclePartFit", "fitments" })
@XmlRootElement(name = "Part")
public class Part {

    @XmlElement(name = "Item")
    protected Item item;
    @XmlElement(name = "HasPartCompatibility")
    protected Boolean hasPartCompatibility;
    @XmlElement(name = "VehiclePartFit")
    protected VehiclePartFit vehiclePartFit;
    @XmlElement(name = "Fitments")
    protected Fitments fitments;

    /**
     * Gets the value of the item property.
     * 
     * @return possible object is {@link Item }
     * 
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *            allowed object is {@link Item }
     * 
     */
    public void setItem(Item value) {
        this.item = value;
    }

    /**
     * Gets the value of the hasPartCompatibility property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isHasPartCompatibility() {
        return hasPartCompatibility;
    }

    /**
     * Sets the value of the hasPartCompatibility property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setHasPartCompatibility(Boolean value) {
        this.hasPartCompatibility = value;
    }

    /**
     * Gets the value of the vehiclePartFit property.
     * 
     * @return possible object is {@link VehiclePartFit }
     * 
     */
    public VehiclePartFit getVehiclePartFit() {
        return vehiclePartFit;
    }

    /**
     * Sets the value of the vehiclePartFit property.
     * 
     * @param value
     *            allowed object is {@link VehiclePartFit }
     * 
     */
    public void setVehiclePartFit(VehiclePartFit value) {
        this.vehiclePartFit = value;
    }

    /**
     * Gets the value of the fitments property.
     * 
     * @return possible object is {@link Fitments }
     * 
     */
    public Fitments getFitments() {
        return fitments;
    }

    /**
     * Sets the value of the fitments property.
     * 
     * @param value
     *            allowed object is {@link Fitments }
     * 
     */
    public void setFitments(Fitments value) {
        this.fitments = value;
    }

}
