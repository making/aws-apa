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
 *         &lt;element name="MakeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MakeId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleModels" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "makeName", "makeId", "isValid",
        "vehicleModels" })
@XmlRootElement(name = "VehicleMake")
public class VehicleMake {

    @XmlElement(name = "MakeName")
    protected String makeName;
    @XmlElement(name = "MakeId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger makeId;
    @XmlElement(name = "IsValid")
    protected String isValid;
    @XmlElement(name = "VehicleModels")
    protected VehicleModels vehicleModels;

    /**
     * Gets the value of the makeName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMakeName() {
        return makeName;
    }

    /**
     * Sets the value of the makeName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMakeName(String value) {
        this.makeName = value;
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
     * Gets the value of the isValid property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIsValid(String value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the vehicleModels property.
     * 
     * @return possible object is {@link VehicleModels }
     * 
     */
    public VehicleModels getVehicleModels() {
        return vehicleModels;
    }

    /**
     * Sets the value of the vehicleModels property.
     * 
     * @param value
     *            allowed object is {@link VehicleModels }
     * 
     */
    public void setVehicleModels(VehicleModels value) {
        this.vehicleModels = value;
    }

}
