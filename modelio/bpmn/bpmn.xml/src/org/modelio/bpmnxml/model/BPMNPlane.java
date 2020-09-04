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
 * <p>Java class for BPMNPlane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BPMNPlane">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Plane">
 * &lt;attribute name="bpmnElement" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("0b134b18-8c7d-4dde-aced-df5e1f14bcb9")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNPlane", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BPMNPlane extends Plane {
    @objid ("d1a1d246-7722-42a3-ae42-c34ec6974364")
    @XmlAttribute(name = "bpmnElement")
    protected QName bpmnElement;

    /**
     * Gets the value of the bpmnElement property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("b9fe4ee4-8595-4681-8786-75d679bd5df7")
    public QName getBpmnElement() {
        return this.bpmnElement;
    }

    /**
     * Sets the value of the bpmnElement property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("f5770fd9-3a14-4727-94d5-b0a4caede2a1")
    public void setBpmnElement(QName value) {
        this.bpmnElement = value;
    }

}