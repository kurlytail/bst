/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.validation;

import javax.script.ScriptException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.Parameter;
import com.brainspeedtech.swarm.layer.util.ParameterUtil;

public class ParameterValueConstraint extends AbstractConstraintValidator {

	@Override
	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		
		if(eObj instanceof Parameter) {
			try {
				ParameterUtil.compute((Parameter)eObj);
			} catch (ScriptException e) {
				return ctx.createFailureStatus(new Object[] { eObj }, e.getMessage());
			}
			
		}
		return ctx.createSuccessStatus();
	}
}
