/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

public class SwarmDiagramClipboardSupportGlobalActionHandler extends
		DiagramGlobalActionHandler {

	public ICommand getCommand(IGlobalActionContext cntxt) {
		IWorkbenchPart part = cntxt.getActivePart();
		if (!(part instanceof IDiagramWorkbenchPart)) {
			return null;
		}
		IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) part;
		org.eclipse.gmf.runtime.common.core.command.ICommand command = null;
		String actionId = cntxt.getActionId();
		if (actionId.equals(GlobalActionId.DELETE)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.COPY)) {
			command = getCopyCommand(cntxt, diagramPart, false);
		} else if (actionId.equals(GlobalActionId.CUT)) {
			command = getCutCommand(cntxt, diagramPart);
		} else if (actionId.equals(GlobalActionId.OPEN)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PASTE)) {
			command = getPasteCommand(cntxt, diagramPart);
		} else if (actionId.equals(GlobalActionId.SAVE)) {
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PROPERTIES)) {
			super.getCommand(cntxt);
		}
		return command;
	}

	protected ICommand getCopyCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart, final boolean isUndoable) {
		List<EObject> toCopyElements = this.getSelectedElements(cntxt.getSelection());
		List<EditPart> toCopyEditParts = this.getSelectedEditParts(cntxt.getSelection());
		SwarmEditorCopyCommand copyCmd = new SwarmEditorCopyCommand("Copy",
				toCopyElements, toCopyEditParts);
		return copyCmd;
	}

	private ICommand getPasteCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart) {
		return new SwarmEditorPasteCommand("Paste",
				(IGraphicalEditPart) ((StructuredSelection) cntxt
						.getSelection()).getFirstElement());
	}

	// These are 2 utilitary methods:
	protected List<EObject> getSelectedElements(ISelection selection) {
		List<EObject> results = new LinkedList<EObject>();
		if (selection == null || selection.isEmpty())
			return results;
		Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
		while (iterator.hasNext()) {
			Object selectedElement = iterator.next();
			EObject element = (EObject) ((EditPart) selectedElement)
					.getAdapter(EObject.class);
			results.add(element);
		}
		return results;
	}

	private List<EditPart> getSelectedEditParts(ISelection selection)

	{
		List<EditPart> results = new LinkedList<EditPart>();
		Iterator<?> iterator = ((IStructuredSelection) selection).iterator();
		while (iterator.hasNext()) {
			Object selectedElement = iterator.next();
			results.add((EditPart) selectedElement);
		}
		return results;
	}

	@Override
	protected boolean canCopy(IGlobalActionContext cntxt) {
		return !getSelectedEditParts(cntxt.getSelection()).isEmpty();
	}

	@Override
	protected boolean canCut(IGlobalActionContext cntxt) {
		return !getSelectedEditParts(cntxt.getSelection()).isEmpty();
	}

	@Override
	protected boolean canPaste(IGlobalActionContext cntxt) {
		if(SwarmEditorCopyCommand.copiedElements == null ||
				SwarmEditorCopyCommand.copiedElements.isEmpty())
			return false;
		return true;
	}
}
