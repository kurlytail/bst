/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.ConstraintBase;

public abstract class AbstractConstraintValidator extends AbstractModelConstraint {
	
	public IStatus validate(IValidationContext ctx) {

		EObject eObj = ctx.getTarget();
		if(eObj instanceof ConstraintBase) {
			ConstraintBase constraint = (ConstraintBase) eObj;
			if(constraint.isDisabled()) return ctx.createSuccessStatus();
		}

		IStatus status = validateObject(ctx);
		
		if(!status.isOK()) {
			System.out.println(status.getMessage());
		}
		return status;
	}

	protected abstract IStatus validateObject(IValidationContext ctx);
}
