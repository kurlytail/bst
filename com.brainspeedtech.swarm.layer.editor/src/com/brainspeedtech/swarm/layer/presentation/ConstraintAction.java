/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.presentation;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.views.LayerDialog;

public class ConstraintAction implements IObjectActionDelegate{

	private LayerDialog dialog;
	private IWorkbenchPart part;
	private EObject eobj;
	
	@Override
	public void run(IAction action) {
		if (dialog != null) dialog.open();
	} 

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		eobj = null;
		setupDialog();
		
		if (!(selection instanceof StructuredSelection))
			return;

		StructuredSelection sel = (StructuredSelection) selection;
		Object obj = (Object) sel.getFirstElement();

		if (obj instanceof EditPart) {
			EditPart editPart = (EditPart) obj;
			obj = editPart.getModel();
		}

		if (obj instanceof View) {
			View view = (View) obj;
			obj = view.getElement();
		}

		if (!(obj instanceof EObject))
			return;

		eobj = (EObject) obj;
		IFile file = WorkspaceSynchronizer.getFile(eobj.eResource());
		TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(file);
		Resource resource = domain.getResourceSet().getResource(
				eobj.eResource().getURI(), true);
		eobj = resource.getEObject(eobj.eResource().getURIFragment(eobj));
		
		setupDialog();
	}
	
	private void setupDialog() {
		if (part != null && eobj != null)
			dialog = new LayerDialog(part.getSite().getShell(), eobj);
		else
			dialog = null;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		part = targetPart;
		eobj = null;
		setupDialog();
	}


}
