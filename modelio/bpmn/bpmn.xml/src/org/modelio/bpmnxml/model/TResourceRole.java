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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tResourceRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tResourceRole">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;choice>
 * &lt;sequence>
 * &lt;element name="resourceRef" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceParameterBinding" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceAssignmentExpression" minOccurs="0"/>
 * &lt;/choice>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("ec694b88-7ae9-4935-8e7c-a37c3102d433")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tResourceRole", propOrder = {
    "resourceRef",
    "resourceParameterBinding",
    "resourceAssignmentExpression"
})
@XmlSeeAlso({
    TPerformer.class
})
public class TResourceRole extends TBaseElement {
    @objid ("9ee32945-4802-44bf-9db3-2f6363fbca97")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("09bae9eb-ed69-49a4-9684-b001087b5ce6")
    protected QName resourceRef;

    @objid ("d52ffebd-d0e8-42b0-beea-0d33a7daf4e8")
    protected List<TResourceParameterBinding> resourceParameterBinding;

    @objid ("68d934d7-5e23-468e-b138-cce9c7877e00")
    protected TResourceAssignmentExpression resourceAssignmentExpression;

    /**
     * Gets the value of the resourceRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("ab3aa43d-2707-400e-9ff1-7ec6012ee87e")
    public QName getResourceRef() {
        return this.resourceRef;
    }

    /**
     * Sets the value of the resourceRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("1d909879-4cf3-4af3-9d3b-0e13124dc8ba")
    public void setResourceRef(QName value) {
        this.resourceRef = value;
    }

    /**
     * Gets the value of the resourceParameterBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParameterBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getResourceParameterBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TResourceParameterBinding }
     */
    @objid ("ffc4917f-f01a-467a-9cae-734cfb996096")
    public List<TResourceParameterBinding> getResourceParameterBinding() {
        if (this.resourceParameterBinding == null) {
            this.resourceParameterBinding = new ArrayList<>();
        }
        return this.resourceParameterBinding;
    }

    /**
     * Gets the value of the resourceAssignmentExpression property.
     * @return
     * possible object is
     * {@link TResourceAssignmentExpression }
     */
    @objid ("81871531-e283-49e5-9792-b7a562f24dcd")
    public TResourceAssignmentExpression getResourceAssignmentExpression() {
        return this.resourceAssignmentExpression;
    }

    /**
     * Sets the value of the resourceAssignmentExpression property.
     * 
     * @param value allowed object is
     * {@link TResourceAssignmentExpression }
     */
    @objid ("397c9326-b7d9-459d-99ed-37acf8a9fe77")
    public void setResourceAssignmentExpression(TResourceAssignmentExpression value) {
        this.resourceAssignmentExpression = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("1bd2cd6d-2934-43ee-9884-bac4b8220cbb")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("18dad5f0-14ce-4eff-9a9e-7591a7518adb")
    public void setName(String value) {
        this.name = value;
    }

}
