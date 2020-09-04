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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tDataObjectReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDataObjectReference">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowElement">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataState" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="itemSubjectRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="dataObjectRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("a382163f-01d9-47ae-aefa-2a87c2a8d7b4")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDataObjectReference", propOrder = {
    "dataState"
})
public class TDataObjectReference extends TFlowElement {
    @objid ("69f04f18-a7c2-4ed6-a545-a4623c0777c1")
    protected TDataState dataState;

    @objid ("9e3a6fef-559c-46d0-9fdd-26a343230ab1")
    @XmlAttribute(name = "itemSubjectRef")
    protected QName itemSubjectRef;

    @objid ("5faf88c5-232e-463c-8252-4c817259c8f7")
    @XmlAttribute(name = "dataObjectRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object dataObjectRef;

    /**
     * Gets the value of the dataState property.
     * @return
     * possible object is
     * {@link TDataState }
     */
    @objid ("5e163330-e02d-4bb1-afaa-347a9342bf6a")
    public TDataState getDataState() {
        return this.dataState;
    }

    /**
     * Sets the value of the dataState property.
     * 
     * @param value allowed object is
     * {@link TDataState }
     */
    @objid ("80a58a70-81fd-4fef-a080-8534f0f57d8d")
    public void setDataState(TDataState value) {
        this.dataState = value;
    }

    /**
     * Gets the value of the itemSubjectRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("a6542a22-43f9-480f-9213-be5a7f62193f")
    public QName getItemSubjectRef() {
        return this.itemSubjectRef;
    }

    /**
     * Sets the value of the itemSubjectRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("0409e135-c342-42dd-852f-e15f4431ec28")
    public void setItemSubjectRef(QName value) {
        this.itemSubjectRef = value;
    }

    /**
     * Gets the value of the dataObjectRef property.
     * @return
     * possible object is
     * {@link Object }
     */
    @objid ("020ea4f4-5480-4d21-89d9-3c0f9d12763e")
    public Object getDataObjectRef() {
        return this.dataObjectRef;
    }

    /**
     * Sets the value of the dataObjectRef property.
     * 
     * @param value allowed object is
     * {@link Object }
     */
    @objid ("e229ab51-c7a4-4a9b-b3d9-13767faac8d4")
    public void setDataObjectRef(Object value) {
        this.dataObjectRef = value;
    }

}
