/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;

public class SwarmEditorCopyCommand extends AbstractCommand {

	public static Collection<EObject> copiedElements = null;
	public static Collection<EditPart> copiedEditParts = null;
	
	private Collection<EObject> toCopyElements = null;
	private Collection<EditPart> toCopyEditParts = null;
	private Collection<EObject> oldToCopyElements = null;
	private Collection<EditPart> oldToCopyEditParts = null; 

	
	public SwarmEditorCopyCommand(String string, List<EObject> toCopyElements,
			List<EditPart> toCopyEditParts) {
		super(string);
		this.toCopyElements = toCopyElements;
		this.toCopyEditParts = toCopyEditParts;
	}

	@Override
	protected CommandResult doExecuteWithResult(
			IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		oldToCopyElements = copiedElements;
		oldToCopyEditParts = copiedEditParts;
		
		return doRedoWithResult(progressMonitor, info);
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {
		Copier copier = new Copier(true, true);

		copiedElements = new ArrayList<EObject>();
		
		for(EObject obj: toCopyElements) {
			EObject objCopy = copier.copy(obj);
			copiedElements.add(objCopy);
		}
		copier.copyReferences();
		
		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {
		copiedElements = oldToCopyElements;
		copiedEditParts = oldToCopyEditParts;
		return CommandResult.newOKCommandResult();
	}

	@Override
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return super.canExecute();
	}

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return super.canRedo();
	}

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return super.canUndo();
	}

}
