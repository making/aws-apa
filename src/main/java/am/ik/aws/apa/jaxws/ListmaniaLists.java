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
 *         &lt;element name="ListmaniaList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ListId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "listmaniaList" })
@XmlRootElement(name = "ListmaniaLists")
public class ListmaniaLists {

    @XmlElement(name = "ListmaniaList", required = true)
    protected List<ListmaniaLists.ListmaniaList> listmaniaList;

    /**
     * Gets the value of the listmaniaList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listmaniaList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getListmaniaList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListmaniaLists.ListmaniaList }
     * 
     * 
     */
    public List<ListmaniaLists.ListmaniaList> getListmaniaList() {
        if (listmaniaList == null) {
            listmaniaList = new ArrayList<ListmaniaLists.ListmaniaList>();
        }
        return this.listmaniaList;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ListId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "listId", "listName" })
    public static class ListmaniaList {

        @XmlElement(name = "ListId", required = true)
        protected String listId;
        @XmlElement(name = "ListName")
        protected String listName;

        /**
         * Gets the value of the listId property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getListId() {
            return listId;
        }

        /**
         * Sets the value of the listId property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setListId(String value) {
            this.listId = value;
        }

        /**
         * Gets the value of the listName property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getListName() {
            return listName;
        }

        /**
         * Sets the value of the listName property.
         * 
         * @param value
         *            allowed object is {@link String }
         * 
         */
        public void setListName(String value) {
            this.listName = value;
        }

    }

}
