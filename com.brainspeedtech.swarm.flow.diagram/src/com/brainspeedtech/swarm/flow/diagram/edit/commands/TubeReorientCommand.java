/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.flow.diagram.edit.policies.FlowBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TubeReorientCommand extends EditElementCommand {

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
	public TubeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Tube) {
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
		if (!(oldEnd instanceof Cell && newEnd instanceof Cell)) {
			return false;
		}
		Cell target = getLink().getTo();
		if (!(getLink().eContainer() instanceof Flow)) {
			return false;
		}
		Flow container = (Flow) getLink().eContainer();
		return FlowBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTube_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Cell && newEnd instanceof Cell)) {
			return false;
		}
		Cell source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof Flow)) {
			return false;
		}
		Flow container = (Flow) getLink().eContainer();
		return FlowBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTube_4001(container, getLink(), source, getNewTarget());
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
	protected Tube getLink() {
		return (Tube) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Cell getOldSource() {
		return (Cell) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Cell getNewSource() {
		return (Cell) newEnd;
	}

	/**
	 * @generated
	 */
	protected Cell getOldTarget() {
		return (Cell) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Cell getNewTarget() {
		return (Cell) newEnd;
	}
}
