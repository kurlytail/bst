/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.listeners;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;

public class SwarmStandardKeyListener implements KeyListener {
	
	private Resource resource;
	private Viewer selectionProvider;
	private EditingDomain domain;

	public SwarmStandardKeyListener(
			EditingDomain domain,
			Viewer selectionProvider,
			Resource resource) {
		this.resource = resource;
		this.selectionProvider = selectionProvider;
		this.domain = domain;
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (!(selectionProvider.getSelection() instanceof IStructuredSelection)) return;
		IStructuredSelection sel = (IStructuredSelection) selectionProvider.getSelection();
		if (sel.getFirstElement() == null || !(sel.getFirstElement() instanceof EObject)) return;
		EObject object = (EObject)sel.getFirstElement();
		if (EcoreUtil.getRootContainer(object) == object) return;
		
 		if(e.keyCode == SWT.CR && ((e.stateMask & SWT.CTRL) != 0)) {
 			if(!object.eContainingFeature().isMany()) return;
 			EObject copy = object.eClass().getEPackage().getEFactoryInstance().create(object.eClass());
 			domain.getCommandStack().execute(new AddCommand(domain,
 					(EList<?>)object.eContainer().eGet(object.eContainingFeature()),
 					copy));
 			selectionProvider.setSelection(new StructuredSelection(copy), true);
 			return;
		}

	}

}
