/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.master.diagram.edit.policies.MasterBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MasterTubeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public MasterTubeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MasterTube) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MasterCell && newEnd instanceof MasterCell)) {
			return false;
		}
		MasterCell target = getLink().getTo();
		if (!(getLink().eContainer() instanceof MasterDesign)) {
			return false;
		}
		MasterDesign container = (MasterDesign) getLink().eContainer();
		return MasterBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMasterTube_4002(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MasterCell && newEnd instanceof MasterCell)) {
			return false;
		}
		MasterCell source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof MasterDesign)) {
			return false;
		}
		MasterDesign container = (MasterDesign) getLink().eContainer();
		return MasterBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMasterTube_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected MasterTube getLink() {
		return (MasterTube) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MasterCell getOldSource() {
		return (MasterCell) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MasterCell getNewSource() {
		return (MasterCell) newEnd;
	}

	/**
	 * @generated
	 */
	protected MasterCell getOldTarget() {
		return (MasterCell) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MasterCell getNewTarget() {
		return (MasterCell) newEnd;
	}
}
