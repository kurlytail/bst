/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.views.LayerDialog;

public class OpenDiagramEditPolicy extends OpenEditPolicy {

	protected Command getOpenCommand(Request request) {
		EditPart targetEditPart = getTargetEditPart(request);

	    if (targetEditPart instanceof IGraphicalEditPart) {
	        IGraphicalEditPart editPart = (IGraphicalEditPart) targetEditPart;
	        View view = editPart.getNotationView();
	        if (view != null) {
	            EObject element = ViewUtil.resolveSemanticElement(view);
	    		IFile file = WorkspaceSynchronizer.getFile(element.eResource());
	    		TransactionalEditingDomain domain = SwarmEditingDomainFactory
	    				.getEditingDomain(file);
	    		Resource resource = domain.getResourceSet().getResource(
	    				element.eResource().getURI(), true);
	    		element = resource.getEObject(element.eResource().getURIFragment(element));

                Shell shell = new Shell(SWT.DIALOG_TRIM | 
                        SWT.APPLICATION_MODAL);
                new LayerDialog(shell, element).open();
	        }
	    }
	    return null;
	}
}
