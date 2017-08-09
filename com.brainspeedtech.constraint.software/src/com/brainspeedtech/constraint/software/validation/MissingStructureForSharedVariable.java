/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.constraint.software.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.constraint.software.SharedVariable;
import com.brainspeedtech.swarm.layer.validation.AbstractConstraintValidator;

public class MissingStructureForSharedVariable extends AbstractConstraintValidator{

	@Override
	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		
		if(eObj instanceof SharedVariable) {
			SharedVariable sVar = (SharedVariable)eObj;
			if (sVar.getStruct() == null) {
				return ctx.createFailureStatus(new Object[] { eObj });
			}
		}
		return ctx.createSuccessStatus();	
	}

}
