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

package org.modelio.diagram.editor.activity.elements.initial;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.diagram.editor.activity.style.ActivityAbstractStyleKeyProvider;
import org.modelio.diagram.styles.core.MetaKey;
import org.modelio.diagram.styles.core.StyleKey;

/**
 * This class provides the StyleKey constants for a GmInitial when its representation mode is RepresentationMode.SIMPLE
 */
@objid ("2a9ffb10-55b6-11e2-877f-002564c97630")
public class GmInitialSimpleStyleKeys extends ActivityAbstractStyleKeyProvider {
    @objid ("d21f92e9-55c0-11e2-9337-002564c97630")
     static final StyleKey REPMODE = GmInitialStructuredStyleKeys.REPMODE;

    @objid ("d21f92eb-55c0-11e2-9337-002564c97630")
     static final StyleKey FILLCOLOR = GmInitialStructuredStyleKeys.FILLCOLOR;

    @objid ("d21f92ed-55c0-11e2-9337-002564c97630")
     static final StyleKey FILLMODE = GmInitialStructuredStyleKeys.FILLMODE;

    @objid ("d21f92ef-55c0-11e2-9337-002564c97630")
     static final StyleKey LINECOLOR = createStyleKey("INITIAL_LINECOLOR", MetaKey.LINECOLOR);

    @objid ("d21f92f1-55c0-11e2-9337-002564c97630")
     static final StyleKey LINEWIDTH = GmInitialStructuredStyleKeys.LINEWIDTH;

    @objid ("d21f92f3-55c0-11e2-9337-002564c97630")
     static final StyleKey FONT = GmInitialStructuredStyleKeys.FONT;

    @objid ("d21f92f5-55c0-11e2-9337-002564c97630")
     static final StyleKey TEXTCOLOR = GmInitialStructuredStyleKeys.TEXTCOLOR;

    @objid ("d21f92f7-55c0-11e2-9337-002564c97630")
     static final StyleKey SHOWSTEREOTYPES = GmInitialStructuredStyleKeys.SHOWSTEREOTYPES;

    @objid ("d21f92f9-55c0-11e2-9337-002564c97630")
     static final StyleKey SHOWTAGS = createStyleKey("INITIAL_SHOWTAGS", MetaKey.SHOWTAGS);

    /**
     * Show the label.
     */
    @objid ("d21f92fb-55c0-11e2-9337-002564c97630")
     static final StyleKey SHOWLABEL = GmInitialStructuredStyleKeys.SHOWLABEL;

}
