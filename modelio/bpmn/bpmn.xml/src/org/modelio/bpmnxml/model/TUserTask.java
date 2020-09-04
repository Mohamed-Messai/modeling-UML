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
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tUserTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tUserTask">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}rendering" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="implementation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplementation" default="##unspecified" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("c7bf5bef-40f1-432d-8853-b667db3c142c")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUserTask", propOrder = {
    "rendering"
})
public class TUserTask extends TTask {
    @objid ("3449e280-fc49-43b5-b8eb-ff477de5731c")
    @XmlAttribute(name = "implementation")
    protected String implementation;

    @objid ("207ddd7a-9755-4644-b204-fa0ffbbdde8b")
    protected List<TRendering> rendering;

    /**
     * Gets the value of the rendering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rendering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getRendering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRendering }
     */
    @objid ("ec829be4-ae00-4502-89bd-ef592a8fd8bd")
    public List<TRendering> getRendering() {
        if (this.rendering == null) {
            this.rendering = new ArrayList<>();
        }
        return this.rendering;
    }

    /**
     * Gets the value of the implementation property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("9fa7e9bd-9985-45de-9b47-da65d11ff709")
    public String getImplementation() {
        if (this.implementation == null) {
            return "##unspecified";
        } else {
            return this.implementation;
        }
    }

    /**
     * Sets the value of the implementation property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("88d7560a-2575-4fb2-8665-e823e2236de7")
    public void setImplementation(String value) {
        this.implementation = value;
    }

}
