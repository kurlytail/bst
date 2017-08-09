/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.inst.TubeInstance;

public class OrphanedTubeInstanceConstraint extends AbstractModelConstraint {
	public IStatus validate(IValidationContext ctx) {

		EObject eObj = ctx.getTarget();
		if (eObj.eIsProxy()) {
			return ctx.createSuccessStatus();
		}
		
		if (eObj instanceof TubeInstance) {
			if (((TubeInstance)eObj).getTube() == null) {
				return ctx.createFailureStatus(new Object[] { eObj });
			}
		}

		return ctx.createSuccessStatus();
	}
}
