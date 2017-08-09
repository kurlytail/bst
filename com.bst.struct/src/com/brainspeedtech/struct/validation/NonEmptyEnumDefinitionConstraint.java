/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.struct.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.struct.EnumTerm;

public class NonEmptyEnumDefinitionConstraint extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		if(eObj instanceof EnumTerm) {
			EnumTerm term = (EnumTerm)eObj;
			if(term.getValue() == null) {
				return ctx.createFailureStatus(new Object[] { eObj } );
			}
		}
		return ctx.createSuccessStatus();
	}

}
