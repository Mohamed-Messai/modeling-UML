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

package org.modelio.diagram.diagramauto.diagram.creator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.standard.factory.IStandardModelFactory;
import org.modelio.metamodel.mmextensions.standard.services.IMModelServices;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Package;

@objid ("27b26f94-4c5c-46e5-a220-21c62258f5ce")
public class UseCaseFocusCreator extends AbstractDiagramCreator {
    @objid ("56f60fa8-127e-41e4-8c54-2e288b3700e3")
    private IDiagramNode _ucDG;

    /**
     * The DGs representing the actors associated with the focused UseCase
     */
    @objid ("2d9a6d80-a83c-497d-894a-8a3cf0a8411d")
    public List<IDiagramNode> _actorsDgs;

    /**
     * The Dgs representing the Actor-UseCase associations
     */
    @objid ("9615fa9e-9f9a-495e-94f6-db02d427d92f")
    public List<IDiagramLink> _linksDgs;

    /**
     * The DGs of the bounds use case, ie : extended, and includes use cases. The focused UseCase itself is NOT in this this list.
     */
    @objid ("09091676-0898-4c3a-9b50-79c47009b69f")
    public List<IDiagramNode> _linkedUseCaseDgs;

    /**
     * The DGs of the parent use case
     */
    @objid ("51eb0003-e616-4ad0-8c9f-a26d1f321c55")
    public List<IDiagramNode> _parentUseCaseDgs;

    @objid ("6e4174f9-90bb-47d6-b944-e7e60dc502cf")
    public UseCaseFocusCreator(IMModelServices modelServices) {
        super(modelServices);
        
        this._actorsDgs = new ArrayList<>();
        this._linksDgs = new ArrayList<>();
        this._parentUseCaseDgs = new ArrayList<>();
        this._linkedUseCaseDgs = new ArrayList<>();
    }

    @objid ("9f7e7dc8-a3c9-42bd-a042-026136719b2c")
    @Override
    public String getAutoDiagramName() {
        return "use-case-focus";
    }

    @objid ("4eef8076-4fbb-4307-a75a-8d5799ca545e")
    @Override
    public String getAutoDiagramGroup() {
        return "Use Case";
    }

    @objid ("33578f7d-05c5-4825-8b24-5cabbd4a43a7")
    @Override
    public ModelElement getAutoDiagramContext(final ModelElement main) {
        return main;
    }

    @objid ("fc50fd84-771c-4ed4-97a2-56c1f9c77e6d")
    @Override
    protected void initialUnmasking(final IDiagramHandle dh, final ModelElement main) {
        if (main instanceof UseCase) {
            initialUnmasking(dh, (UseCase) main);
        }
    }

    @objid ("b53e3108-66c2-45a9-bc15-43d5f6e7eb2c")
    protected void initialUnmasking(final IDiagramHandle dh, final UseCase uc) {
        // Mask old content
        for (IDiagramNode node : dh.getDiagramNode().getNodes()) {
            node.mask();
        }
        
        // The focused UseCase
        this._ucDG = (IDiagramNode) dh.unmask(uc, 400, 400).get(0);
        this._ucDG.setSize(100, 100);
        
        // Unmask the "left" nodes : the actors associated to the use case
        // Need to explore both incoming and outgoing associations because orientation is completely ignored in use case diagrams
        // First, links from an Actor to the UseCase
        for (AssociationEnd a : uc.getTargetingEnd()) {
            Classifier e = a.getSource();
            if (e != null && e instanceof Actor) {
                // Unmask actor
                List<IDiagramGraphic> nodes = dh.unmask(e, 0, 0);
                if ((nodes != null) && (nodes.size() > 0)) {
                    IDiagramNode node = (IDiagramNode) nodes.get(0);
                    this._actorsDgs.add(node);
                }
        
                // Unmask the link
                List<IDiagramGraphic> linkDgs = dh.unmask(a.getAssociation(), 0, 0);
                if ((linkDgs != null) && (linkDgs.size() > 0)) {
                    IDiagramLink link = (IDiagramLink) linkDgs.get(0);
                    this._linksDgs.add(link);
                }
        
            }
        }
        
        // Then, links from the UseCase to an Actor
        for (AssociationEnd a : uc.getOwnedEnd()) {
            Classifier e = a.isNavigable() ? a.getTarget() : a.getOpposite().getSource();
            if (e != null && e instanceof Actor) {
                // Unmask actor
                List<IDiagramGraphic> nodes = dh.unmask(e, 0, 0);
                if ((nodes != null) && (nodes.size() > 0)) {
                    IDiagramNode node = (IDiagramNode) nodes.get(0);
                    this._actorsDgs.add(node);
                }
        
                // Unmask the link
                Association link = a.getAssociation();
                List<IDiagramGraphic> linkDgs = dh.unmask(link, 0, 0);
                if ((linkDgs != null) && (linkDgs.size() > 0)) {
                    IDiagramLink linkDg = (IDiagramLink) linkDgs.get(0);
                    this._linksDgs.add(linkDg);
                }
            }
        }
        
        // Unmask the 'top' nodes which are the inherited UseCases
        for (Generalization g : uc.getParent()) {
            // Unmask the node
            IDiagramNode dg = (IDiagramNode) dh.unmask(g.getSuperType(), 0, 0).get(0);
            this._parentUseCaseDgs.add(dg);
            // unmask the link
            List<IDiagramGraphic> links = dh.unmask(g, 0, 0);
            if ((links != null) && (links.size() > 0)) {
                IDiagramLink link = (IDiagramLink) links.get(0);
                this._linksDgs.add(link);
            }
        }
        
        // Unmask the 'left' nodes which are the included and extended UseCases
        for (UseCaseDependency d : uc.getUsed()) {
            // Unmask the node
            IDiagramNode dg = (IDiagramNode) dh.unmask(d.getTarget(), 0, 0).get(0);
            this._linkedUseCaseDgs.add(dg);
            // unmask the link
            List<IDiagramGraphic> links = dh.unmask(d, 0, 0);
            if ((links != null) && (links.size() > 0)) {
                IDiagramLink link = (IDiagramLink) links.get(0);
                this._linksDgs.add(link);
            }
        }
    }

    @objid ("116308bf-987f-4887-926a-b05cca2d2356")
    private boolean isInSamePackage(final ModelTree elt1, final ModelTree elt2) {
        ModelTree parent1 = getOwnerPackage(elt1);
        ModelTree parent2 = getOwnerPackage(elt2);
        return parent1 != null && parent2 != null && parent1.equals(parent2);
    }

    @objid ("64fde413-9ae4-4e9f-b0e9-bf8c34d70ced")
    private ModelTree getOwnerPackage(final ModelTree elt) {
        ModelTree parent = elt.getOwner();
        
        // Take parents for Inner elements
        while ((parent != null)) {
            if (parent instanceof Package) {
                return parent;
            } else {
                parent = parent.getOwner();
            }
        }
        return parent;
    }

    @objid ("beeb701c-0708-4ab2-84b0-8b5c13ffded5")
    @Override
    protected void layout(final IDiagramHandle dh) {
        if (this._ucDG != null) {
            UseCaseFocusLayout layout = new UseCaseFocusLayout();
            try {
                layout.layout(this._ucDG, this._actorsDgs, this._parentUseCaseDgs, this._linkedUseCaseDgs, this._linksDgs);
            } catch (Exception e) {
                // Should never happen
                e.printStackTrace();
            }
        }
    }

    @objid ("015232ce-21a9-4487-ac8b-ecbaf9264642")
    @Override
    public ModelElement getMainElement(AbstractDiagram autoDiagram) {
        return autoDiagram.getOrigin();
    }

// The UseCaseCloseUp auto diagram are usecase diagrams
    @objid ("415b2977-4e17-446d-a847-a9aa707ee3a1")
    @Override
    protected AbstractDiagram createDiagramElement(IStandardModelFactory standardFactory) {
        return standardFactory.createUseCaseDiagram();
    }

    @objid ("d37d0da0-c7c4-4bc6-ad5e-700fab4a7c82")
    private static class UseCaseFocusLayout {
        @objid ("8b225f2c-a817-4c68-860a-65e61d6af860")
        private static final int BLOCK_H_SPACING = 30;

        @objid ("d8f5e6eb-bc81-42ea-b3ac-6c2ad633e5c8")
        private static final int NODE_H_SPACING = 10;

        @objid ("64758412-d46d-47ed-a59b-2ae1175ce473")
        private static final int NODE_V_SPACING = 25;

        @objid ("a70a3a98-d06d-4d64-9c97-4543c76d81e0")
        public void layout(IDiagramNode ucDg, List<IDiagramNode> actorsDgs, List<IDiagramNode> parentUseCaseDgs, List<IDiagramNode> linkedUseCaseDgs, List<IDiagramLink> linksDgs) {
            DgNodeGroup leftGroup = new DgNodeGroup(actorsDgs);
            DgNodeGroup rightGroup = new DgNodeGroup(linkedUseCaseDgs);
            DgNodeGroup topGroup = new DgNodeGroup(parentUseCaseDgs);
            
            // Layout Actors : left DGs
            leftGroup.vLayout(0, 0, NODE_V_SPACING);
            
            // Layout linked UseCase: right DGs
            rightGroup.vLayout(0, 0, NODE_V_SPACING);
            
            // Layout parent UseCases : topDgs
            topGroup.hLayout(0, 0, NODE_H_SPACING);
            
            Rectangle leftBlock = leftGroup.getBounds();
            Rectangle rightBlock = rightGroup.getBounds();
            Rectangle topBLock = topGroup.getBounds();
            
            // Position the focused UseCase
            ucDg.fitToContent();
            double xUc = leftBlock.preciseWidth() + max(topBLock.preciseWidth(), ucDg.getBounds().preciseWidth()) / 2;
            double yUc = topBLock.preciseHeight() + max(leftBlock.preciseHeight(), ucDg.getBounds().preciseWidth(), rightBlock.preciseHeight()) / 2;
            ucDg.setLocation((int) xUc, (int) yUc);
            
            // Position the top block
            double xTop = ucDg.getBounds().preciseX() + ucDg.getBounds().preciseWidth() / 2 - topBLock.preciseWidth() / 2; // centered on focused UseCase
            double yTop = ucDg.getBounds().preciseY() - ucDg.getBounds().preciseHeight() / 2 -
                    max(leftBlock.preciseWidth(), ucDg.getBounds().preciseWidth(), rightBlock.preciseHeight()) / 2;
            topGroup.moveTo(xTop, yTop);
            
            // Position the left block
            double xLeft = ucDg.getBounds().preciseX() + ucDg.getBounds().preciseWidth() / 2 -
                    max(ucDg.getBounds().preciseWidth(), topBLock.preciseWidth()) / 2 -
                    leftBlock.preciseWidth() - BLOCK_H_SPACING;
            double yLeft = ucDg.getBounds().preciseY() + ucDg.getBounds().preciseHeight() / 2 - leftBlock.preciseHeight() / 2;
            leftGroup.moveTo(xLeft, yLeft);
            
            // Position the right block
            double xRight = ucDg.getBounds().preciseX() + ucDg.getBounds().preciseWidth() / 2 +
                    max(ucDg.getBounds().preciseWidth() / 2 + BLOCK_H_SPACING + BLOCK_H_SPACING, topBLock.preciseWidth() / 2 + BLOCK_H_SPACING);
            double yRight = ucDg.getBounds().preciseY() + ucDg.getBounds().preciseHeight() / 2 - rightBlock.preciseHeight() / 2;
            rightGroup.moveTo(xRight, yRight);
            
            // Route links
            for (IDiagramLink linkDg : linksDgs) {
                linkDg.setRouterKind(LinkRouterKind.DIRECT);
                IDiagramNode from = (IDiagramNode) linkDg.getFrom();
                IDiagramNode to = (IDiagramNode) linkDg.getTo();
                List<Point> points = Arrays.asList(new Point(from.getBounds().getCenter()), new Point(to.getBounds().getCenter()));
                linkDg.setPath(points);
            }
        }

        @objid ("e16c2008-ea7b-45f2-9adf-fbd4a5148b29")
        private double max(double a, double b, double c) {
            return Math.max(Math.max(a, b), c);
        }

        @objid ("7f79719b-2c99-4613-b3ba-4f6269314d60")
        private double max(double a, double b) {
            return Math.max(a, b);
        }

    }

    @objid ("5e384f6e-c383-416f-a188-8dd4269f6dec")
    private static class DgNodeGroup {
        @objid ("1bd96b7e-b1ff-4678-bcf3-a635ad782783")
        private Collection<IDiagramNode> dgs;

        @objid ("25065737-becf-4e9f-936d-1aefb2bccf47")
        public DgNodeGroup(Collection<IDiagramNode> dgs) {
            this.dgs = dgs;
        }

        @objid ("d27daf87-55ff-437e-b3b0-24ca370b4605")
        public Rectangle moveTo(double x, double y) {
            Rectangle currentBounds = getBounds();
            
            double dx = x - currentBounds.preciseX();
            double dy = y - currentBounds.preciseY();
            
            for (IDiagramNode dg : this.dgs) {
                dg.setBounds(dg.getBounds().translate(dx, dy));
            }
            return getBounds();
        }

        @objid ("cd63c9c1-a03c-4bf5-b37f-8a2ddbde63f4")
        public Rectangle getBounds() {
            Rectangle bounds = new Rectangle();
            for (IDiagramNode dg : this.dgs) {
                bounds.union(dg.getBounds());
            }
            return bounds;
        }

        @objid ("7c0dbaf1-41ab-45ab-aee9-d8cfd04a12b9")
        public void vLayout(int x, int y, int spacing) {
            int curX = 0;
            int curY = 0;
            for (IDiagramNode dg : this.dgs) {
                dg.setLocation(curX, curY);
                curY += dg.getBounds().height + spacing;
            }
        }

        @objid ("90191e2f-53b6-4260-86e6-2aae16501271")
        public void hLayout(int x, int y, int spacing) {
            int curX = 0;
            int curY = 0;
            for (IDiagramNode dg : this.dgs) {
                dg.setLocation(curX, curY);
                curX += dg.getBounds().width + spacing;
            }
        }

    }

}
