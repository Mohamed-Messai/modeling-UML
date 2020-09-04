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
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tParticipant">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;sequence>
 * &lt;element name="interfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="endPointRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantMultiplicity" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="processRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("95435447-ce8d-443d-82a6-167d7aefe204")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tParticipant", propOrder = {
    "interfaceRef",
    "endPointRef",
    "participantMultiplicity"
})
public class TParticipant extends TBaseElement {
    @objid ("e68d99a6-a7ce-4031-aecc-c290b26c1079")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("f02e0cbe-335f-4411-bba6-b410f07be72f")
    protected List<QName> interfaceRef;

    @objid ("a45c0e63-47b9-49e7-8258-51cb35ddf593")
    protected List<QName> endPointRef;

    @objid ("15577039-5a64-498c-aebd-cf290aa32c63")
    protected TParticipantMultiplicity participantMultiplicity;

    @objid ("661b0b22-0a31-4f03-85d3-23f5ba972e37")
    @XmlAttribute(name = "processRef")
    protected QName processRef;

    /**
     * Gets the value of the interfaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getInterfaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("aade86ec-93cd-44e4-a301-506af6638689")
    public List<QName> getInterfaceRef() {
        if (this.interfaceRef == null) {
            this.interfaceRef = new ArrayList<>();
        }
        return this.interfaceRef;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getEndPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     */
    @objid ("bfcbbcc1-336e-4f55-905e-d6c84911827f")
    public List<QName> getEndPointRef() {
        if (this.endPointRef == null) {
            this.endPointRef = new ArrayList<>();
        }
        return this.endPointRef;
    }

    /**
     * Gets the value of the participantMultiplicity property.
     * @return
     * possible object is
     * {@link TParticipantMultiplicity }
     */
    @objid ("fab0d445-71c4-4f50-8411-d0d4ab2c8019")
    public TParticipantMultiplicity getParticipantMultiplicity() {
        return this.participantMultiplicity;
    }

    /**
     * Sets the value of the participantMultiplicity property.
     * 
     * @param value allowed object is
     * {@link TParticipantMultiplicity }
     */
    @objid ("0470e22e-9c0d-4fe2-a0e5-5704e9084bfb")
    public void setParticipantMultiplicity(TParticipantMultiplicity value) {
        this.participantMultiplicity = value;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("d666b076-90cf-45e4-90ab-452ae4566d4e")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("86af7dc6-bbf0-4b45-8aba-7df39a6f8847")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the processRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("306745b5-41ae-4d74-a7d2-3b9fa42acc54")
    public QName getProcessRef() {
        return this.processRef;
    }

    /**
     * Sets the value of the processRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("0cfa0697-96d6-41b7-a35a-12f9b57d3835")
    public void setProcessRef(QName value) {
        this.processRef = value;
    }

}
