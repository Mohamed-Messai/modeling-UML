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
package org.modelio.module.modelermodule.api.methodology.infrastructure.methodologicallink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.MethodologicalLink;
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
 * Proxy class to handle a {@link MethodologicalLink} with << State >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("94ea7c34-4b73-4981-b50a-54bf698ba624")
public class State {
    @objid ("222814cf-b874-4bda-a002-4e5ecabe8371")
    public static final String STEREOTYPE_NAME = "State";

    /**
     * The underlying {@link MethodologicalLink} represented by this proxy, never null.
     */
    @objid ("79b345e8-0ec9-4487-9f1a-9bdf55cdc8e9")
    protected final MethodologicalLink elt;

    /**
     * Tells whether a {@link State proxy} can be instantiated from a {@link MObject} checking it is a {@link MethodologicalLink} stereotyped << State >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("57759b46-e761-4f42-8852-c0826a5d90f6")
    public static boolean canInstantiate(MObject elt) {
        return ((elt instanceof MethodologicalLink) && ((MethodologicalLink) elt).isStereotyped(IModelerModulePeerModule.MODULE_NAME, State.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link MethodologicalLink} stereotyped << State >> then instantiate a {@link State} proxy.
     * 
     * @return a {@link State} proxy on the created {@link MethodologicalLink}.
     */
    @objid ("09543d53-cfd0-4fb9-b73a-931693d9c79c")
    public static State create() {
        ModelElement e = (ModelElement)ModelerModuleModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("MethodologicalLink");
        e.addStereotype(IModelerModulePeerModule.MODULE_NAME, State.STEREOTYPE_NAME);
        return State.instantiate((MethodologicalLink)e);
    }

    /**
     * Tries to instantiate a {@link State} proxy from a {@link MethodologicalLink} stereotyped << State >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a MethodologicalLink
     * @return a {@link State} proxy or <i>null</i>.
     */
    @objid ("0b59065d-449f-46a5-8f9f-0ea2aec70c59")
    public static State instantiate(MethodologicalLink obj) {
        return State.canInstantiate(obj) ? new State(obj) : null;
    }

    /**
     * Tries to instantiate a {@link State} proxy from a {@link MethodologicalLink} stereotyped << State >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link MethodologicalLink}
     * @return a {@link State} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8b4be395-aaa9-4fc2-ba48-9e2b8f5fc36d")
    public static State safeInstantiate(MethodologicalLink obj) throws IllegalArgumentException {
        if (State.canInstantiate(obj))
        	return new State(obj);
        else
        	throw new IllegalArgumentException("State: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7207f726-3712-4dda-b4f6-7c3b2a15ecab")
    public static ModelElement getTarget(ModelElement source) {
        return AbstractMethodologicalLink.getTarget(source, MdaTypes.STEREOTYPE_ELT);
    }

    @objid ("a4f6612b-2466-4a91-bf27-450b83b67491")
    public static void setTarget(ModelElement source, ModelElement target) {
        AbstractMethodologicalLink.setTarget(source, MdaTypes.STEREOTYPE_ELT, target);
    }

    @objid ("ee996e85-1f96-4935-b936-a507226f7d0b")
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
        State other = (State) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link MethodologicalLink}. 
     * @return the MethodologicalLink represented by this proxy, never null.
     */
    @objid ("617a244a-450d-4a46-a94b-d0f27fe39bf1")
    public MethodologicalLink getElement() {
        return this.elt;
    }

    @objid ("f249bbe0-6508-4d9a-afb3-2da17ba6f289")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("74001543-90b1-4dd2-abc3-4a78d498488e")
    protected State(MethodologicalLink elt) {
        this.elt = elt;
    }

    @objid ("21c2a2ed-24af-4840-be82-7c2e0a995f1c")
    public static final class MdaTypes {
        @objid ("970950eb-e9c7-4378-9751-91c5d90f6c85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b51e59a-884d-4ef9-9cc3-2dd282a5165f")
        private static Stereotype MDAASSOCDEP;

        @objid ("3a18f30f-38f0-4b5f-9c9c-3832349ece9e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("551b6844-605b-469b-9f4f-36ec3dafe222")
        public static void init(IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c2d2a1ec-2c29-453c-a79c-19e4f2d27f13");
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
