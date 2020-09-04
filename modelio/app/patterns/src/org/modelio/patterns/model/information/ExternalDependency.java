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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.07.19 at 01:40:57 PM CEST
//
package org.modelio.patterns.model.information;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>
 * Java class for ExternalDependency complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalDependency">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("09bcd8a3-cd99-4dff-9900-3b3a27ed99b1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDependency")
@XmlSeeAlso({ ModuleDependency.class, RAMCDependency.class, PatternDependency.class })
public class ExternalDependency {
    @objid ("104c944e-dade-4106-b0ff-948bf6da435c")
    @XmlAttribute
    protected String name;

    @objid ("3660fc53-2464-44bf-a56b-2c8970b1ced4")
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    @objid ("5288c643-b840-4908-a242-2c13adec4d3f")
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    @objid ("aa61b59d-7590-4370-bddc-cbf5ae5f625d")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    @objid ("c73ed5b7-ada3-48e0-9b4f-022ed1d69c00")
    public String getVersion() {
        return this.version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    @objid ("a1fe7a67-171a-4eb8-824e-965d406a26d2")
    public void setVersion(String value) {
        this.version = value;
    }

}
