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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleBedOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleBodyStyleOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleBrakesOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleDriveTypeOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleEngineOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleMfrBodyCodeOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleSpringTypesOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleSteeringOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleTransmissionOptions" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}VehicleWheelbaseOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "vehicleBedOptions",
        "vehicleBodyStyleOptions", "vehicleBrakesOptions",
        "vehicleDriveTypeOptions", "vehicleEngineOptions",
        "vehicleMfrBodyCodeOptions", "vehicleSpringTypesOptions",
        "vehicleSteeringOptions", "vehicleTransmissionOptions",
        "vehicleWheelbaseOptions" })
@XmlRootElement(name = "VehicleOptions")
public class VehicleOptions {

    @XmlElement(name = "VehicleBedOptions")
    protected VehicleBedOptions vehicleBedOptions;
    @XmlElement(name = "VehicleBodyStyleOptions")
    protected VehicleBodyStyleOptions vehicleBodyStyleOptions;
    @XmlElement(name = "VehicleBrakesOptions")
    protected VehicleBrakesOptions vehicleBrakesOptions;
    @XmlElement(name = "VehicleDriveTypeOptions")
    protected VehicleDriveTypeOptions vehicleDriveTypeOptions;
    @XmlElement(name = "VehicleEngineOptions")
    protected VehicleEngineOptions vehicleEngineOptions;
    @XmlElement(name = "VehicleMfrBodyCodeOptions")
    protected VehicleMfrBodyCodeOptions vehicleMfrBodyCodeOptions;
    @XmlElement(name = "VehicleSpringTypesOptions")
    protected VehicleSpringTypesOptions vehicleSpringTypesOptions;
    @XmlElement(name = "VehicleSteeringOptions")
    protected VehicleSteeringOptions vehicleSteeringOptions;
    @XmlElement(name = "VehicleTransmissionOptions")
    protected VehicleTransmissionOptions vehicleTransmissionOptions;
    @XmlElement(name = "VehicleWheelbaseOptions")
    protected VehicleWheelbaseOptions vehicleWheelbaseOptions;

    /**
     * Gets the value of the vehicleBedOptions property.
     * 
     * @return possible object is {@link VehicleBedOptions }
     * 
     */
    public VehicleBedOptions getVehicleBedOptions() {
        return vehicleBedOptions;
    }

    /**
     * Sets the value of the vehicleBedOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleBedOptions }
     * 
     */
    public void setVehicleBedOptions(VehicleBedOptions value) {
        this.vehicleBedOptions = value;
    }

    /**
     * Gets the value of the vehicleBodyStyleOptions property.
     * 
     * @return possible object is {@link VehicleBodyStyleOptions }
     * 
     */
    public VehicleBodyStyleOptions getVehicleBodyStyleOptions() {
        return vehicleBodyStyleOptions;
    }

    /**
     * Sets the value of the vehicleBodyStyleOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleBodyStyleOptions }
     * 
     */
    public void setVehicleBodyStyleOptions(VehicleBodyStyleOptions value) {
        this.vehicleBodyStyleOptions = value;
    }

    /**
     * Gets the value of the vehicleBrakesOptions property.
     * 
     * @return possible object is {@link VehicleBrakesOptions }
     * 
     */
    public VehicleBrakesOptions getVehicleBrakesOptions() {
        return vehicleBrakesOptions;
    }

    /**
     * Sets the value of the vehicleBrakesOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleBrakesOptions }
     * 
     */
    public void setVehicleBrakesOptions(VehicleBrakesOptions value) {
        this.vehicleBrakesOptions = value;
    }

    /**
     * Gets the value of the vehicleDriveTypeOptions property.
     * 
     * @return possible object is {@link VehicleDriveTypeOptions }
     * 
     */
    public VehicleDriveTypeOptions getVehicleDriveTypeOptions() {
        return vehicleDriveTypeOptions;
    }

    /**
     * Sets the value of the vehicleDriveTypeOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleDriveTypeOptions }
     * 
     */
    public void setVehicleDriveTypeOptions(VehicleDriveTypeOptions value) {
        this.vehicleDriveTypeOptions = value;
    }

    /**
     * Gets the value of the vehicleEngineOptions property.
     * 
     * @return possible object is {@link VehicleEngineOptions }
     * 
     */
    public VehicleEngineOptions getVehicleEngineOptions() {
        return vehicleEngineOptions;
    }

    /**
     * Sets the value of the vehicleEngineOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleEngineOptions }
     * 
     */
    public void setVehicleEngineOptions(VehicleEngineOptions value) {
        this.vehicleEngineOptions = value;
    }

    /**
     * Gets the value of the vehicleMfrBodyCodeOptions property.
     * 
     * @return possible object is {@link VehicleMfrBodyCodeOptions }
     * 
     */
    public VehicleMfrBodyCodeOptions getVehicleMfrBodyCodeOptions() {
        return vehicleMfrBodyCodeOptions;
    }

    /**
     * Sets the value of the vehicleMfrBodyCodeOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleMfrBodyCodeOptions }
     * 
     */
    public void setVehicleMfrBodyCodeOptions(VehicleMfrBodyCodeOptions value) {
        this.vehicleMfrBodyCodeOptions = value;
    }

    /**
     * Gets the value of the vehicleSpringTypesOptions property.
     * 
     * @return possible object is {@link VehicleSpringTypesOptions }
     * 
     */
    public VehicleSpringTypesOptions getVehicleSpringTypesOptions() {
        return vehicleSpringTypesOptions;
    }

    /**
     * Sets the value of the vehicleSpringTypesOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleSpringTypesOptions }
     * 
     */
    public void setVehicleSpringTypesOptions(VehicleSpringTypesOptions value) {
        this.vehicleSpringTypesOptions = value;
    }

    /**
     * Gets the value of the vehicleSteeringOptions property.
     * 
     * @return possible object is {@link VehicleSteeringOptions }
     * 
     */
    public VehicleSteeringOptions getVehicleSteeringOptions() {
        return vehicleSteeringOptions;
    }

    /**
     * Sets the value of the vehicleSteeringOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleSteeringOptions }
     * 
     */
    public void setVehicleSteeringOptions(VehicleSteeringOptions value) {
        this.vehicleSteeringOptions = value;
    }

    /**
     * Gets the value of the vehicleTransmissionOptions property.
     * 
     * @return possible object is {@link VehicleTransmissionOptions }
     * 
     */
    public VehicleTransmissionOptions getVehicleTransmissionOptions() {
        return vehicleTransmissionOptions;
    }

    /**
     * Sets the value of the vehicleTransmissionOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleTransmissionOptions }
     * 
     */
    public void setVehicleTransmissionOptions(VehicleTransmissionOptions value) {
        this.vehicleTransmissionOptions = value;
    }

    /**
     * Gets the value of the vehicleWheelbaseOptions property.
     * 
     * @return possible object is {@link VehicleWheelbaseOptions }
     * 
     */
    public VehicleWheelbaseOptions getVehicleWheelbaseOptions() {
        return vehicleWheelbaseOptions;
    }

    /**
     * Sets the value of the vehicleWheelbaseOptions property.
     * 
     * @param value
     *            allowed object is {@link VehicleWheelbaseOptions }
     * 
     */
    public void setVehicleWheelbaseOptions(VehicleWheelbaseOptions value) {
        this.vehicleWheelbaseOptions = value;
    }

}
