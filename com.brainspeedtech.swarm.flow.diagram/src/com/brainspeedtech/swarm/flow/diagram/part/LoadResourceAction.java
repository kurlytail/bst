/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.part;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * @generated
 */
public class LoadResourceAction extends AbstractHandler {
	/**
	 * @generated
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart diagramEditor = HandlerUtil.getActiveEditorChecked(event);
		Shell shell = diagramEditor.getEditorSite().getShell();
		assert diagramEditor instanceof DiagramEditor;
		TransactionalEditingDomain editingDomain = ((DiagramEditor) diagramEditor)
				.getEditingDomain();
		org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog loadResourceDialog = new org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog(
				shell, editingDomain);
		loadResourceDialog.open();
		return null;
	}

}
