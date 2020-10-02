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

package org.modelio.propertyview.vtabfolder;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.internal.SWTEventListener;

/**
 * Classes which implement this interface provide methods
 * that deal with the events that are generated by the CTabFolder
 * control.
 * <p>
 * After creating an instance of a class that implements
 * this interface it can be added to a CTabFolder using the
 * <code>addCTabFolder2Listener</code> method and removed using
 * the <code>removeCTabFolder2Listener</code> method. When
 * events occurs in a CTabFolder the appropriate method
 * will be invoked.
 * </p>
 * 
 * @see CTabFolder2Adapter
 * @see VTabFolderEvent
 * 
 * @since 3.0
 */
@objid ("a7a0e343-a16f-45e8-b318-64e89fc39040")
public interface VTabFolder2Listener extends SWTEventListener {
    /**
     * Sent when the user clicks on the close button of an item in the CTabFolder.
     * The item being closed is specified in the event.item field.
     * Setting the event.doit field to false will stop the CTabItem from closing.
     * When the CTabItem is closed, it is disposed.  The contents of the
     * CTabItem (see CTabItem.setControl) will be made not visible when
     * the CTabItem is closed.
     * 
     * @param event an event indicating the item being closed
     */
    @objid ("61dec5ea-4753-4bb9-a8c1-87416412af94")
    void close(VTabFolderEvent event);

    /**
     * Sent when the user clicks on the minimize button of a CTabFolder.
     * The state of the CTabFolder does not change automatically - it
     * is up to the application to change the state of the CTabFolder
     * in response to this event using CTabFolder.setMinimized(true).
     * @see CTabFolder#getMinimized()
     * @see CTabFolder#setMinimized(boolean)
     * @see CTabFolder#setMinimizeVisible(boolean)
     * 
     * @param event an event containing information about the minimize
     */
    @objid ("741f11db-eb34-4758-b017-6573742c68df")
    void minimize(VTabFolderEvent event);

    /**
     * Sent when the user clicks on the maximize button of a CTabFolder.
     * The state of the CTabFolder does not change automatically - it
     * is up to the application to change the state of the CTabFolder
     * in response to this event using CTabFolder.setMaximized(true).
     * @see CTabFolder#getMaximized()
     * @see CTabFolder#setMaximized(boolean)
     * @see CTabFolder#setMaximizeVisible(boolean)
     * 
     * @param event an event containing information about the maximize
     */
    @objid ("50cb4d17-5495-444e-871b-eb5cacd9dc4f")
    void maximize(VTabFolderEvent event);

    /**
     * Sent when the user clicks on the restore button of a CTabFolder.
     * This event is sent either to restore the CTabFolder from the
     * minimized state or from the maximized state.  To determine
     * which restore is requested, use CTabFolder.getMinimized() or
     * CTabFolder.getMaximized() to determine the current state.
     * The state of the CTabFolder does not change automatically - it
     * is up to the application to change the state of the CTabFolder
     * in response to this event using CTabFolder.setMaximized(false)
     * or CTabFolder.setMinimized(false).
     * @see CTabFolder#getMinimized()
     * @see CTabFolder#getMaximized()
     * @see CTabFolder#setMinimized(boolean)
     * @see CTabFolder#setMinimizeVisible(boolean)
     * @see CTabFolder#setMaximized(boolean)
     * @see CTabFolder#setMaximizeVisible(boolean)
     * 
     * @param event an event containing information about the restore
     */
    @objid ("63a7efb8-912a-4406-9d29-54438d0009ee")
    void restore(VTabFolderEvent event);

    /**
     * Sent when the user clicks on the chevron button of the CTabFolder.
     * A chevron appears in the CTabFolder when there are more tabs
     * than can be displayed at the current widget size.  To select a
     * tab that is not currently visible, the user clicks on the
     * chevron and selects a tab item from a list.  By default, the
     * CTabFolder provides a list of all the items that are not currently
     * visible, however, the application can provide its own list by setting
     * the event.doit field to <code>false</code> and displaying a selection list.
     * @see CTabFolder#setSelection(CTabItem)
     * 
     * @param event an event containing information about the show list
     */
    @objid ("ca58b2d5-67c7-4444-a7e1-bcbbfeff9cc8")
    void showList(VTabFolderEvent event);

}