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

import com.brainspeedtech.struct.Field;

public class NonZeroMemberCountConstraint extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		if(eObj instanceof Field) {
			Field field = (Field)eObj;
			if(field.getCount() == 0) {
				return ctx.createFailureStatus(new Object[] { eObj } );
			}
		}
		return ctx.createSuccessStatus();
	}

}
