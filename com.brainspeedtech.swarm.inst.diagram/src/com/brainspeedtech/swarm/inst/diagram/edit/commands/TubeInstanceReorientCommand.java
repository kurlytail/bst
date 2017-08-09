/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.inst.diagram.edit.policies.InstBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TubeInstanceReorientCommand extends EditElementCommand {

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
	public TubeInstanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TubeInstance) {
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
		if (!(oldEnd instanceof CellInstance && newEnd instanceof CellInstance)) {
			return false;
		}
		CellInstance target = getLink().getTo();
		if (!(getLink().eContainer() instanceof Instance)) {
			return false;
		}
		Instance container = (Instance) getLink().eContainer();
		return InstBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTubeInstance_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CellInstance && newEnd instanceof CellInstance)) {
			return false;
		}
		CellInstance source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof Instance)) {
			return false;
		}
		Instance container = (Instance) getLink().eContainer();
		return InstBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTubeInstance_4001(container, getLink(), source,
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
	protected TubeInstance getLink() {
		return (TubeInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected CellInstance getOldSource() {
		return (CellInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CellInstance getNewSource() {
		return (CellInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected CellInstance getOldTarget() {
		return (CellInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected CellInstance getNewTarget() {
		return (CellInstance) newEnd;
	}
}
