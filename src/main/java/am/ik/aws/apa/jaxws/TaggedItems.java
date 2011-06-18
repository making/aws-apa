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
 *         &lt;element name="DistinctUsers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUsages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstTagging" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Tagging" minOccurs="0"/>
 *         &lt;element name="LastTagging" type="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Tagging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "item", "distinctUsers", "totalUsages",
        "firstTagging", "lastTagging" })
@XmlRootElement(name = "TaggedItems")
public class TaggedItems {

    @XmlElement(name = "Item")
    protected Item item;
    @XmlElement(name = "DistinctUsers")
    protected String distinctUsers;
    @XmlElement(name = "TotalUsages")
    protected String totalUsages;
    @XmlElement(name = "FirstTagging")
    protected Tagging firstTagging;
    @XmlElement(name = "LastTagging")
    protected Tagging lastTagging;

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
     * Gets the value of the distinctUsers property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDistinctUsers() {
        return distinctUsers;
    }

    /**
     * Sets the value of the distinctUsers property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDistinctUsers(String value) {
        this.distinctUsers = value;
    }

    /**
     * Gets the value of the totalUsages property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalUsages() {
        return totalUsages;
    }

    /**
     * Sets the value of the totalUsages property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalUsages(String value) {
        this.totalUsages = value;
    }

    /**
     * Gets the value of the firstTagging property.
     * 
     * @return possible object is {@link Tagging }
     * 
     */
    public Tagging getFirstTagging() {
        return firstTagging;
    }

    /**
     * Sets the value of the firstTagging property.
     * 
     * @param value
     *            allowed object is {@link Tagging }
     * 
     */
    public void setFirstTagging(Tagging value) {
        this.firstTagging = value;
    }

    /**
     * Gets the value of the lastTagging property.
     * 
     * @return possible object is {@link Tagging }
     * 
     */
    public Tagging getLastTagging() {
        return lastTagging;
    }

    /**
     * Sets the value of the lastTagging property.
     * 
     * @param value
     *            allowed object is {@link Tagging }
     * 
     */
    public void setLastTagging(Tagging value) {
        this.lastTagging = value;
    }

}
