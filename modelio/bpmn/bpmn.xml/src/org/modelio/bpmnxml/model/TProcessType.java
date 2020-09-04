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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tProcessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tProcessType">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="None"/>
 * &lt;enumeration value="Public"/>
 * &lt;enumeration value="Private"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@objid ("0a2f8265-bc58-4e1b-bdb4-1d4300999bbd")
@XmlType(name = "tProcessType")
@XmlEnum
public enum TProcessType {
    @XmlEnumValue("None")
    NONE ("None"),
    @XmlEnumValue("Public")
    PUBLIC ("Public"),
    @XmlEnumValue("Private")
    PRIVATE ("Private");

    @objid ("fb373acb-37cf-47a3-b9db-379cafe8b915")
    private final String value;

    @objid ("04a99019-576a-4e9d-81e2-a22f1ed4fdd9")
    TProcessType(String v) {
        this.value = v;
    }

    @objid ("b5942035-6c03-4b08-bf58-88dbfba1d4e2")
    public String value() {
        return this.value;
    }

    @objid ("4deb5628-6a12-4455-887d-64d3b45d781c")
    public static TProcessType fromValue(String v) {
        for (TProcessType c: TProcessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
