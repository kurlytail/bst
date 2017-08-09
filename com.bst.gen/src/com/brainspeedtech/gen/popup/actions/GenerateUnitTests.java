/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.popup.actions;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.brainspeedtech.gen.Activator;
import com.brainspeedtech.gen.UnitTestGenerator;

public class GenerateUnitTests implements IObjectActionDelegate {
	private Shell shell;
	private List<?> resources;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateUnitTests() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (resources != null) {
			try {
			for(Object o: resources) {
				if (o instanceof IContainer) {
					UnitTestGenerator.generate((IContainer)o);
				} else if (o instanceof IFile) {
					UnitTestGenerator.generate((IFile)o);
				}
			}
			} catch (Exception e) {
				  IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, 1, "Exception found.", e.getCause());
				  ErrorDialog.openError(shell,"Unit Test generator error", e.getMessage(),status);	

			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection s = (IStructuredSelection)selection;
			resources = s.toList();
		} else {
			resources = null;
		}
	}

}
