/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tProperty">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataState" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="itemSubjectRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("a440a122-98d5-49e9-a4df-0ed3bc900c3e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProperty", propOrder = {
    "dataState"
})
public class TProperty extends TBaseElement {
    @objid ("3fa3d472-5537-4b86-9aa3-4bab9504e4eb")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("fbfa3936-065c-4514-86b3-91b4b9a22524")
    protected TDataState dataState;

    @objid ("9d53b32b-c952-4574-b94a-4371a01343b4")
    @XmlAttribute(name = "itemSubjectRef")
    protected QName itemSubjectRef;

    /**
     * Gets the value of the dataState property.
     * @return
     * possible object is
     * {@link TDataState }
     */
    @objid ("9124af66-23a8-4b5d-8a41-b75e537f7f96")
    public TDataState getDataState() {
        return this.dataState;
    }

    /**
     * Sets the value of the dataState property.
     * 
     * @param value allowed object is
     * {@link TDataState }
     */
    @objid ("9a7c0e22-a092-4423-a716-590ddd511d7f")
    public void setDataState(TDataState value) {
        this.dataState = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("73c3697b-e661-4c7b-b33e-61771748cd8c")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("9b5cea30-c395-499b-8239-fba0e7acb2b9")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemSubjectRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("02d208ad-46db-4712-924f-689a06096ab0")
    public QName getItemSubjectRef() {
        return this.itemSubjectRef;
    }

    /**
     * Sets the value of the itemSubjectRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("d896b485-cf76-45aa-801d-1a494a808891")
    public void setItemSubjectRef(QName value) {
        this.itemSubjectRef = value;
    }

}
