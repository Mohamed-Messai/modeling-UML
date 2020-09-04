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
 * <p>Java class for tMessageEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMessageEventDefinition">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition">
 * &lt;sequence>
 * &lt;element name="operationRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="messageRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("9f81d35f-6cd9-4777-894c-cf33cd1f14c8")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMessageEventDefinition", propOrder = {
    "operationRef"
})
public class TMessageEventDefinition extends TEventDefinition {
    @objid ("9482a510-2aee-499d-b8f7-1aa75fe0907f")
    protected QName operationRef;

    @objid ("a1f6136c-b4f1-41ae-8f44-a9467ebabb39")
    @XmlAttribute(name = "messageRef")
    protected QName messageRef;

    /**
     * Gets the value of the operationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("81484491-fc53-48d8-af04-c284ac6e3c37")
    public QName getOperationRef() {
        return this.operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("ae0476d5-c2e9-4fcb-8c6d-a71b7207efa4")
    public void setOperationRef(QName value) {
        this.operationRef = value;
    }

    /**
     * Gets the value of the messageRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("6cc5ff79-d662-433f-b3fb-db112bd3ac33")
    public QName getMessageRef() {
        return this.messageRef;
    }

    /**
     * Sets the value of the messageRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("aa2e9ed7-f512-4c3c-b990-8cb7b73bdb81")
    public void setMessageRef(QName value) {
        this.messageRef = value;
    }

}
