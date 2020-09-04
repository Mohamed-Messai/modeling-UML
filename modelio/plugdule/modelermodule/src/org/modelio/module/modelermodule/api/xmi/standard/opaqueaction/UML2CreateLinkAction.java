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
package org.modelio.module.modelermodule.api.xmi.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << UML2CreateLinkAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("33dada2d-31ec-4a9d-9046-df7e11c23765")
public class UML2CreateLinkAction {
    @objid ("f3a7f593-885a-4bed-b7f9-b495eed00a5b")
    public static final String STEREOTYPE_NAME = "UML2CreateLinkAction";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("38dc005b-4051-40bd-ae4f-f51eb8599050")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link UML2CreateLinkAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << UML2CreateLinkAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4282863f-f262-4beb-acec-7b0034935514")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, UML2CreateLinkAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << UML2CreateLinkAction >> then instantiate a {@link UML2CreateLinkAction} proxy.
     * 
     * @return a {@link UML2CreateLinkAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("f68f95d9-a5d6-4573-be03-fcd1a94e7f08")
    public static UML2CreateLinkAction create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("OpaqueAction");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, UML2CreateLinkAction.STEREOTYPE_NAME);
        return UML2CreateLinkAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link UML2CreateLinkAction} proxy from a {@link OpaqueAction} stereotyped << UML2CreateLinkAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link UML2CreateLinkAction} proxy or <i>null</i>.
     */
    @objid ("99e4ebc2-5f61-408e-9d15-3fcf2857e579")
    public static UML2CreateLinkAction instantiate(OpaqueAction obj) {
        return UML2CreateLinkAction.canInstantiate(obj) ? new UML2CreateLinkAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UML2CreateLinkAction} proxy from a {@link OpaqueAction} stereotyped << UML2CreateLinkAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link UML2CreateLinkAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("539d4fcd-0732-43a3-8228-29f4efb42c65")
    public static UML2CreateLinkAction safeInstantiate(OpaqueAction obj) throws IllegalArgumentException {
        if (UML2CreateLinkAction.canInstantiate(obj))
        	return new UML2CreateLinkAction(obj);
        else
        	throw new IllegalArgumentException("UML2CreateLinkAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a030c368-827f-4096-99b8-5ca6531329fc")
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
        UML2CreateLinkAction other = (UML2CreateLinkAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("4e77443b-52d4-40ec-b9b4-8ac60eb31c1b")
    public OpaqueAction getElement() {
        return this.elt;
    }

    @objid ("9817438a-d92e-4179-848d-e1247910eb98")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("79cdcb6f-190e-4923-9c9c-230c9815087f")
    protected UML2CreateLinkAction(OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("ff41ce0e-1a7a-41e4-b25f-3b3c0f13b830")
    public static final class MdaTypes {
        @objid ("1d3e6200-6816-484f-970d-261ecfb33b6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("484cbd56-1a01-4f4d-bd6f-21e15203c691")
        private static Stereotype MDAASSOCDEP;

        @objid ("8109c5e1-ce4a-451d-9c07-88d21e69edfd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("251cc131-4ed4-44da-8c3f-ff18f3992858")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "67694a37-c2f9-11de-8ac8-001302895b2b");
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
