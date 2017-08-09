/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.layer.validation.AbstractConstraintValidator;

public class SingleIOConstraint extends AbstractConstraintValidator {

	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		if (eObj instanceof Cell) {
			Cell cell = (Cell)eObj;
			if (cell.getOutput().size() > 1 || cell.getInput().size() > 1) {
				return ctx.createFailureStatus(new Object[] { eObj });
			}
		}

		return ctx.createSuccessStatus();
	}

}
