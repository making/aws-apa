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
 *         &lt;element name="SteeringName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SteeringId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "steeringName", "steeringId" })
@XmlRootElement(name = "VehicleSteering")
public class VehicleSteering {

    @XmlElement(name = "SteeringName")
    protected String steeringName;
    @XmlElement(name = "SteeringId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger steeringId;

    /**
     * Gets the value of the steeringName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSteeringName() {
        return steeringName;
    }

    /**
     * Sets the value of the steeringName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSteeringName(String value) {
        this.steeringName = value;
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

}
