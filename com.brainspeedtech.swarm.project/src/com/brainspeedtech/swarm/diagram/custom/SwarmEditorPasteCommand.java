/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.AbstractCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

public class SwarmEditorPasteCommand extends AbstractCommand {

	private IGraphicalEditPart graphicalEditPart = null;
	private EObject targetElement;
	private ArrayList<EObject> copiedElements;

	public SwarmEditorPasteCommand(String string,
			IGraphicalEditPart iGraphicalEditPart) {
		super(string);
		this.graphicalEditPart = iGraphicalEditPart;
		this.targetElement = iGraphicalEditPart.resolveSemanticElement();
	}

	@Override
	protected CommandResult doExecuteWithResult(
			IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		Copier copier = new Copier(true, true);

		copiedElements = new ArrayList<EObject>();

		for (EObject obj : SwarmEditorCopyCommand.copiedElements) {
			EObject objCopy = copier.copy(obj);
			copiedElements.add(objCopy);
		}
		copier.copyReferences();

		return doRedoWithResult(progressMonitor, info);
	}

	@Override
	protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {

		TransactionalEditingDomain domain = TransactionUtil
				.getEditingDomain(targetElement);
		for (final EStructuralFeature feature : targetElement.eClass()
				.getEStructuralFeatures()) {
			final Collection<Object> objectsForFeature = EcoreUtil
					.getObjectsByType(copiedElements, feature.getEType());
			if (objectsForFeature.isEmpty())
				continue;

			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Object object = targetElement.eGet(feature);
					if (object instanceof EList<?>) {
						@SuppressWarnings("unchecked")
						EList<Object> objectList = (EList<Object>) object;
						objectList.addAll(objectsForFeature);
					}
				}
			});
		}

		EditPart mainEditPart = (EditPart) (graphicalEditPart.getRoot()
				.getChildren().get(0));
		CanonicalEditPolicy cep = (CanonicalEditPolicy) mainEditPart
				.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		if (cep != null)
			cep.refresh();

		return CommandResult.newOKCommandResult();
	}

	@Override
	protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor,
			IAdaptable info) throws ExecutionException {

		TransactionalEditingDomain domain = TransactionUtil
				.getEditingDomain(targetElement);
		for (final EStructuralFeature feature : targetElement.eClass()
				.getEStructuralFeatures()) {
			final Collection<Object> objectsForFeature = EcoreUtil
					.getObjectsByType(copiedElements, feature.getEType());
			if (objectsForFeature.isEmpty())
				continue;

			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Object object = targetElement.eGet(feature);
					if (object instanceof EList<?>) {
						@SuppressWarnings("unchecked")
						EList<Object> objectList = (EList<Object>) object;
						objectList.removeAll(objectsForFeature);
					}
				}
			});
		}
		EditPart mainEditPart = (EditPart) (graphicalEditPart.getRoot()
				.getChildren().get(0));
		CanonicalEditPolicy cep = (CanonicalEditPolicy) mainEditPart
				.getEditPolicy(EditPolicyRoles.CANONICAL_ROLE);
		if (cep != null)
			cep.refresh();
		
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
