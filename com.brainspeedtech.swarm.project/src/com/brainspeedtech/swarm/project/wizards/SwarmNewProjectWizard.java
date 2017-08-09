/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import com.brainspeedtech.swarm.project.builder.SwarmNature;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

/**
 * This example shows how to implement an own project wizard that uses the
 * JavaCapabilityConfigurationPage to allow the user to configure the Java build
 * path.
 */
public class SwarmNewProjectWizard extends Wizard implements
		IExecutableExtension, INewWizard {

	private WizardNewProjectCreationPage fMainPage;

	private IConfigurationElement fConfigElement;

	private IWorkbench fWorkbench;

	public SwarmNewProjectWizard() {
		setWindowTitle("New Swarm Project");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org
	 * .eclipse.core.runtime.IConfigurationElement, java.lang.String,
	 * java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement cfig,
			String propertyName, Object data) {
		// The config element will be used in <code>finishPage to set the result
		// perspective.
		fConfigElement = cfig;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		fWorkbench = workbench;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#addPages
	 */
	public void addPages() {
		super.addPages();
		fMainPage = new WizardNewProjectCreationPage("NewProjectCreationWizard");
		fMainPage.setTitle("New");
		fMainPage.setDescription("Create a new Swarm project.");

		// the main page
		addPage(fMainPage);

		// TODO: add your pages here
	}

	private void finishPage(IProgressMonitor monitor)
			throws InterruptedException, CoreException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		try {
			monitor.beginTask("Creating Swarm project...", 3); // 3 steps

			IProject project = fMainPage.getProjectHandle();
			IPath locationPath = fMainPage.getLocationPath();

			// create the project
			IProjectDescription desc = project.getWorkspace()
					.newProjectDescription(project.getName());
			if (!fMainPage.useDefaults()) {
				desc.setLocation(locationPath);
			}
			project.create(desc, new SubProgressMonitor(monitor, 1));
			project.open(new SubProgressMonitor(monitor, 1));

			SwarmEditingDomainFactory.addNatures(project, new String[] {
					SwarmNature.NATURE_ID, "com.bst.gen.swarmMasterNature" });

			// change to the perspective specified in the plugin.xml
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);

			BasicNewResourceWizard.selectAndReveal(project,
					fWorkbench.getActiveWorkbenchWindow());

		} finally {
			monitor.done();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Wizard#performFinish
	 */
	public boolean performFinish() {
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				finishPage(monitor);
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InvocationTargetException e) {
			MessageDialog.openError(getShell(), "Error creating project", 
					e.getMessage());
			return false;
		} catch (InterruptedException e) {
			return false; // canceled
		}
		return true;
	}

}
