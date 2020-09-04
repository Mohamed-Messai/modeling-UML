/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ModelerModule v9.0.07

 * This file was generated on 2/6/19 2:07 PM by Modelio Studio.
 */
package org.modelio.module.modelermodule.api.analyst.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.modelermodule.api.IModelerModulePeerModule;
import org.modelio.module.modelermodule.api.ModelerModuleProxyFactory;
import org.modelio.module.modelermodule.impl.ModelerModuleModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << antonym >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3e8030d-e474-473c-b754-e7e5465e68e7")
public class Antonym {
    @objid ("07e3ab33-0436-459c-ab7e-217f5bb03605")
    public static final String STEREOTYPE_NAME = "antonym";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3d064b57-e789-4798-aace-062124ada2b1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link Antonym proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << antonym >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("37f09a3d-acd5-4b69-bbb7-5a3e1d594907")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, Antonym.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << antonym >> then instantiate a {@link Antonym} proxy.
     * 
     * @return a {@link Antonym} proxy on the created {@link Dependency}.
     */
    @objid ("6c3ce38f-02ed-45a2-a4af-27a0cfab72e8")
    public static Antonym create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, Antonym.STEREOTYPE_NAME);
        return Antonym.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link Antonym} proxy from a {@link Dependency} stereotyped << antonym >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link Antonym} proxy or <i>null</i>.
     */
    @objid ("96da693e-33e5-46b3-b999-642914673091")
    public static Antonym instantiate(Dependency obj) {
        return Antonym.canInstantiate(obj) ? new Antonym(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Antonym} proxy from a {@link Dependency} stereotyped << antonym >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link Antonym} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f80bb32f-2600-410d-948a-a6749129fc61")
    public static Antonym safeInstantiate(Dependency obj) throws IllegalArgumentException {
        if (Antonym.canInstantiate(obj))
        	return new Antonym(obj);
        else
        	throw new IllegalArgumentException("Antonym: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0f660d7-8b6f-4113-8c87-1239f41c4059")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Antonym other = (Antonym) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("1d3908f7-a7c6-49a0-9a37-0ea507e8f520")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6e9ddfbe-5c4b-4f20-99d1-3410639d3546")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("84bbabc7-f1b7-45e1-afbb-dfcb9da50713")
    protected Antonym(Dependency elt) {
        this.elt = elt;
    }

    @objid ("e8185a79-1f85-46e2-9ae1-2d7bcf9b15b1")
    public static final class MdaTypes {
        @objid ("9d9f4592-ad55-4aa8-899d-79e8523d3b7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f4236181-e749-465f-8060-a3b107fe9dec")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1829bb3-f7f9-493c-b12a-54ee1f3ee27a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55243f37-d75f-4024-962d-f731ce167100")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01ec12fc-0000-0233-0000-000000000000");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(ModelerModuleModule.getInstance() != null) {
			init(ModelerModuleModule.getInstance().getModuleContext());
		}
	}
    }

}
