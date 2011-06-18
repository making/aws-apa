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
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BodyStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brakes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Engine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MfrBodyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpringTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Steering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wheelbase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "year", "make", "model", "trim", "bed",
        "bodyStyle", "brakes", "driveType", "engine", "mfrBodyCode",
        "springTypes", "steering", "transmission", "wheelbase", "position",
        "notes" })
@XmlRootElement(name = "Fitment")
public class Fitment {

    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Trim")
    protected String trim;
    @XmlElement(name = "Bed")
    protected String bed;
    @XmlElement(name = "BodyStyle")
    protected String bodyStyle;
    @XmlElement(name = "Brakes")
    protected String brakes;
    @XmlElement(name = "DriveType")
    protected String driveType;
    @XmlElement(name = "Engine")
    protected String engine;
    @XmlElement(name = "MfrBodyCode")
    protected String mfrBodyCode;
    @XmlElement(name = "SpringTypes")
    protected String springTypes;
    @XmlElement(name = "Steering")
    protected String steering;
    @XmlElement(name = "Transmission")
    protected String transmission;
    @XmlElement(name = "Wheelbase")
    protected String wheelbase;
    @XmlElement(name = "Position")
    protected String position;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the year property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the trim property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTrim() {
        return trim;
    }

    /**
     * Sets the value of the trim property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTrim(String value) {
        this.trim = value;
    }

    /**
     * Gets the value of the bed property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBed() {
        return bed;
    }

    /**
     * Sets the value of the bed property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBed(String value) {
        this.bed = value;
    }

    /**
     * Gets the value of the bodyStyle property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    /**
     * Sets the value of the bodyStyle property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBodyStyle(String value) {
        this.bodyStyle = value;
    }

    /**
     * Gets the value of the brakes property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBrakes() {
        return brakes;
    }

    /**
     * Sets the value of the brakes property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBrakes(String value) {
        this.brakes = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEngine(String value) {
        this.engine = value;
    }

    /**
     * Gets the value of the mfrBodyCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMfrBodyCode() {
        return mfrBodyCode;
    }

    /**
     * Sets the value of the mfrBodyCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMfrBodyCode(String value) {
        this.mfrBodyCode = value;
    }

    /**
     * Gets the value of the springTypes property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSpringTypes() {
        return springTypes;
    }

    /**
     * Sets the value of the springTypes property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSpringTypes(String value) {
        this.springTypes = value;
    }

    /**
     * Gets the value of the steering property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSteering() {
        return steering;
    }

    /**
     * Sets the value of the steering property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSteering(String value) {
        this.steering = value;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTransmission(String value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the wheelbase property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getWheelbase() {
        return wheelbase;
    }

    /**
     * Sets the value of the wheelbase property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setWheelbase(String value) {
        this.wheelbase = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
