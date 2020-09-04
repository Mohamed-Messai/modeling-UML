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

package org.modelio.diagram.editor.statik.elements.bpmnprocess;

import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.graphics.Image;
import org.modelio.core.ui.swt.images.ElementImageService;
import org.modelio.diagram.elements.common.header.GmDefaultModelElementHeader;
import org.modelio.diagram.elements.core.model.GmAbstractObject;
import org.modelio.diagram.elements.core.model.IGmDiagram;
import org.modelio.diagram.elements.core.model.IGmObject;
import org.modelio.diagram.elements.core.node.GmCompositeNode;
import org.modelio.diagram.elements.core.node.GmNoStyleCompositeNode;
import org.modelio.diagram.elements.core.node.GmNodeModel;
import org.modelio.diagram.elements.core.node.IImageableNode;
import org.modelio.diagram.persistence.IDiagramReader;
import org.modelio.diagram.persistence.IDiagramWriter;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey.RepresentationMode;
import org.modelio.diagram.styles.core.StyleKey;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * This class represents the Gm of a BpmnProcess.
 */
@objid ("342a7f11-55b7-11e2-877f-002564c97630")
public class GmBpmnProcessPrimaryNode extends GmNoStyleCompositeNode implements IImageableNode {
    /**
     * Current version of this Gm.
     */
    @objid ("342a7f1b-55b7-11e2-877f-002564c97630")
    private static final int MINOR_VERSION = 1;

    @objid ("342a7f1e-55b7-11e2-877f-002564c97630")
    private static final int MAJOR_VERSION = 0;

    /**
     * Header
     */
    @objid ("a6002f69-55c2-11e2-9337-002564c97630")
    private GmDefaultModelElementHeader header;

    /**
     * Default constructor.
     * 
     * @param diagram the diagram in which this gm is unmasked.
     * @param relatedRef a reference to the represented CallBehaviorAction
     */
    @objid ("342a7f20-55b7-11e2-877f-002564c97630")
    public GmBpmnProcessPrimaryNode(final IGmDiagram diagram, final MRef relatedRef) {
        super(diagram, relatedRef);
        this.header = new GmDefaultModelElementHeader(diagram, relatedRef);
        this.header.setShowMetaclassIcon(true);
        addChild(this.header);
    }

    /**
     * Empty constructor needed for the serialization.
     */
    @objid ("342a7f2b-55b7-11e2-877f-002564c97630")
    public GmBpmnProcessPrimaryNode() {
        // empty constructor for the serialization
    }

    @objid ("342a7f2e-55b7-11e2-877f-002564c97630")
    @Override
    public boolean canCreate(final Class<? extends MObject> type) {
        return false;
    }

    @objid ("342c059d-55b7-11e2-877f-002564c97630")
    @Override
    public boolean canUnmask(final MObject el) {
        return false;
    }

    @objid ("342c05a6-55b7-11e2-877f-002564c97630")
    @Override
    public GmCompositeNode getCompositeFor(final Class<? extends MObject> metaclass) {
        return this;
    }

    @objid ("342c05b1-55b7-11e2-877f-002564c97630")
    @Override
    public Image getImage() {
        return ElementImageService.getImage(getRelatedElement());
    }

    @objid ("342c05b6-55b7-11e2-877f-002564c97630")
    @Override
    public RepresentationMode getRepresentationMode() {
        final StyleKey repModeKey = GmBpmnProcess.STRUCTURED_KEYS.getStyleKey(MetaKey.REPMODE);
        return getDisplayedStyle().getProperty(repModeKey);
    }

    @objid ("342c05bd-55b7-11e2-877f-002564c97630")
    @Override
    public List<GmNodeModel> getVisibleChildren() {
        // Returned result depends on current representation mode:
        List<GmNodeModel> ret;
        switch (getRepresentationMode()) {
        case IMAGE: {
            ret = Collections.emptyList();
            break;
        }
        default: {
            ret = super.getVisibleChildren();
            break;
        }
        }
        return ret;
    }

    @objid ("342c05c6-55b7-11e2-877f-002564c97630")
    @Override
    public void read(final IDiagramReader in) {
        // Read version, defaults to 0 if not found
        int readVersion = GmAbstractObject.readMinorVersion(in, "GmBpmnProcessPrimaryNode.");
        switch (readVersion) {
        case 0: {
            read_0(in);
            break;
        }
        case 1: {
            read_1(in);
            break;
        }
        default: {
            assert (false) : "version number not covered!";
            // reading as last handled version: 1
            read_1(in);
            break;
        }
        }
    }

    @objid ("342c05cd-55b7-11e2-877f-002564c97630")
    @Override
    public void refreshFromObModel() {
        super.refreshFromObModel(); // forcing visual refresh in case Image changed
        firePropertyChange(IGmObject.PROPERTY_LAYOUTDATA, null, getLayoutData());
    }

    @objid ("342c05d0-55b7-11e2-877f-002564c97630")
    @Override
    public void write(IDiagramWriter out) {
        super.write(out);
        
        // Write version of this Gm if different of 0
        GmAbstractObject.writeMinorVersion(out, "GmBpmnProcessPrimaryNode.", GmBpmnProcessPrimaryNode.MINOR_VERSION);
    }

    @objid ("342c05d6-55b7-11e2-877f-002564c97630")
    private void read_0(final IDiagramReader in) {
        super.read(in);
        
        int i = 0;
        
        this.header = (GmDefaultModelElementHeader) this.getChildren().get(i++);
        GmNodeModel imageModeHeader = this.getChildren().get(i++);
        imageModeHeader.delete();
    }

    @objid ("342c05dc-55b7-11e2-877f-002564c97630")
    @Override
    public int getMajorVersion() {
        return GmBpmnProcessPrimaryNode.MAJOR_VERSION;
    }

    @objid ("342d8c3c-55b7-11e2-877f-002564c97630")
    private void read_1(final IDiagramReader in) {
        super.read(in);
        
        this.header = (GmDefaultModelElementHeader) this.getChildren().get(0);
    }

}
