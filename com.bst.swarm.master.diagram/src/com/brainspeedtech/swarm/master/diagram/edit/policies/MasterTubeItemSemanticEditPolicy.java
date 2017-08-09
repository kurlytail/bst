/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import com.brainspeedtech.swarm.master.diagram.providers.MasterElementTypes;

/**
 * @generated
 */
public class MasterTubeItemSemanticEditPolicy extends
		MasterBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MasterTubeItemSemanticEditPolicy() {
		super(MasterElementTypes.MasterTube_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
