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
 *         &lt;element name="ListItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAdded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityDesired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}Item" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-04-01}UniversalListItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "listItemId", "dateAdded", "comment",
        "quantityDesired", "quantityReceived", "priority", "item",
        "universalListItem" })
@XmlRootElement(name = "ListItem")
public class ListItem {

    @XmlElement(name = "ListItemId")
    protected String listItemId;
    @XmlElement(name = "DateAdded")
    protected String dateAdded;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "QuantityDesired")
    protected String quantityDesired;
    @XmlElement(name = "QuantityReceived")
    protected String quantityReceived;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Item")
    protected Item item;
    @XmlElement(name = "UniversalListItem")
    protected UniversalListItem universalListItem;

    /**
     * Gets the value of the listItemId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getListItemId() {
        return listItemId;
    }

    /**
     * Sets the value of the listItemId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setListItemId(String value) {
        this.listItemId = value;
    }

    /**
     * Gets the value of the dateAdded property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * Sets the value of the dateAdded property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDateAdded(String value) {
        this.dateAdded = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the quantityDesired property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getQuantityDesired() {
        return quantityDesired;
    }

    /**
     * Sets the value of the quantityDesired property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setQuantityDesired(String value) {
        this.quantityDesired = value;
    }

    /**
     * Gets the value of the quantityReceived property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Sets the value of the quantityReceived property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setQuantityReceived(String value) {
        this.quantityReceived = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPriority(String value) {
        this.priority = value;
    }

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
     * Gets the value of the universalListItem property.
     * 
     * @return possible object is {@link UniversalListItem }
     * 
     */
    public UniversalListItem getUniversalListItem() {
        return universalListItem;
    }

    /**
     * Sets the value of the universalListItem property.
     * 
     * @param value
     *            allowed object is {@link UniversalListItem }
     * 
     */
    public void setUniversalListItem(UniversalListItem value) {
        this.universalListItem = value;
    }

}
