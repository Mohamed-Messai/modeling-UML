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

package org.modelio.app.project.core.services;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystemException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.IProgressMonitor;
import org.modelio.app.core.project.ICurrentProjectService;
import org.modelio.app.preferences.IGProjectPreferenceStore;
import org.modelio.app.project.core.services.closeproject.IProjectCloser;
import org.modelio.app.project.core.services.createproject.IProjectCreator2;
import org.modelio.app.project.core.services.openproject.IProjectOpener;
import org.modelio.app.project.core.services.workspace.IWorkspaceService;
import org.modelio.gproject.data.project.FragmentDescriptor;
import org.modelio.gproject.data.project.ProjectDescriptor;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.FragmentConflictException;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.GProjectAuthenticationException;
import org.modelio.vbasic.auth.IAuthData;

/**
 * IProjectService: modelio application scoped services dealing with
 * <ul>
 * <li>workspace management</li>
 * <li>project management</li>
 * 
 * IProjectService has a singleton instance available for injection.
 */
@objid ("0056d718-9dc5-103b-a520-001ec947cd2a")
public interface IProjectService extends ICurrentProjectService, IWorkspaceService, IProjectOpener, IProjectCreator2, IProjectCloser, IFragmentMigratorFactory {
    /**
     * Adds a model fragment to the currently opened project.
     * 
     * @param project the project to modify
     * @param fragmentDescriptor the descriptor of the fragment to add.
     * @param monitor a progress monitor.
     * @throws org.modelio.gproject.gproject.FragmentConflictException if a fragment with same name or URI is already deployed.
     */
    @objid ("00545222-bb2f-103c-a520-001ec947cd2a")
    void addFragment(GProject project, FragmentDescriptor fragmentDescriptor, IProgressMonitor monitor) throws FragmentConflictException;

    /**
     * @param nodeId a preference node identifier.
     * @return the project preference store for the node.
     */
    @objid ("afae4f86-0efd-4d61-b575-75ec081826ae")
    @Override
    IGProjectPreferenceStore getProjectPreferences(String nodeId);

    /**
     * Opens a project in the application.
     * <p>
     * On successful return the given project receives an active CoreSession instance.
     * 
     * @param project The project to open. The project must not be already opened.
     * @param authData project authentication data.
     * @param monitor a progress monitor.
     * @throws java.io.IOException If the project opening failed at the IO level.
     * @throws java.lang.IllegalArgumentException If <code>project</code> is null.
     * @throws java.lang.IllegalStateException If a project is currently opened.
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException if the authentication fails
     * @throws java.lang.InterruptedException on user cancel
     */
    @objid ("0082f550-acc2-103b-a520-001ec947cd2a")
    void openProject(final ProjectDescriptor project, IAuthData authData, IProgressMonitor monitor) throws GProjectAuthenticationException, IOException, IllegalArgumentException, IllegalStateException, InterruptedException;

    /**
     * Opens the project designated by 'projectURI' in the current workspace.
     * 
     * @param projectURI the project URI. eg for a local project: <i>file://myworkspace/myprojectspace/project.conf</i>
     * @param authData authentication data, may be <code>null</code> if not needed.
     * @param monitor a progress monitor.
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException in case of authentication failure
     * @throws java.io.IOException If the project opening failed at the IO level.
     * @throws java.lang.InterruptedException on user cancel
     */
    @objid ("004e41e8-8d1e-10b4-9941-001ec947cd2a")
    void openProject(URI projectURI, IAuthData authData, IProgressMonitor monitor) throws GProjectAuthenticationException, IOException, InterruptedException;

    /**
     * Opens the project designated by 'projectName' in the current workspace. This is a convenience method that build a "file://workspace/projectName/project.conf" URI to open the project.
     * 
     * @param projectName the project name of the project to open.
     * @param authData authentication data, may be <code>null</code> if not needed.
     * @param monitor a progress monitor.
     * @throws org.modelio.gproject.gproject.GProjectAuthenticationException in case of authentication failure
     * @throws java.io.IOException If the project opening failed at the IO level.
     * @throws java.lang.InterruptedException on user cancel
     */
    @objid ("8c36a49b-e1ab-4fba-9ecd-8229ed5655cc")
    void openProject(String projectName, IAuthData authData, IProgressMonitor monitor) throws GProjectAuthenticationException, IOException, InterruptedException;

    /**
     * Remove a model fragment from the currently opened project.
     * <p>
     * All fragment datas will be deleted from disk.
     * 
     * @param project the project to modify
     * @param fragment the fragment to remove
     */
    @objid ("002f56d4-a4c3-1044-a30e-001ec947cd2a")
    void removeFragment(GProject project, IProjectFragment fragment);

    /**
     * Rename a fragment and adapt its directory to match the new name.
     * 
     * @param project the project that owns the fragment
     * @param fragment the fragment to edit.
     * @param name the new name.
     * @throws java.nio.file.FileSystemException in case of file system error.
     * @throws java.io.IOException in case of I/O failure.
     * @throws org.modelio.gproject.gproject.FragmentConflictException if a fragment with same name or URI is already deployed.
     */
    @objid ("616c200b-ef1a-44b2-9bbb-a43efbd8f4cc")
    void renameFragment(GProject project, IProjectFragment fragment, String name) throws FileSystemException, FragmentConflictException, IOException;

    /**
     * Saves the contents of the project currently opened in the application.
     * 
     * @param monitor a progress monitor. If <code>null</code>, no progress will be reported.
     * @throws java.io.IOException If the project saving failed at the IO level.
     * @throws java.lang.IllegalStateException If no project is currently opened.
     */
    @objid ("00831bd4-acc2-103b-a520-001ec947cd2a")
    void saveProject(IProgressMonitor monitor) throws IOException, IllegalStateException;

}
