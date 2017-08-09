/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.validation.AbstractConstraintValidator;


public class NonEmptyNamesConstraint extends AbstractConstraintValidator {

	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		for (EStructuralFeature feature : eObj.eClass()
				.getEAllStructuralFeatures()) {
			if (feature.getName().equals("name")) {
				String name = (String) eObj.eGet(feature);
				if (name == null || ((String) name).length() == 0) {
					return ctx.createFailureStatus(new Object[] { eObj });
				}


				name = name.replace('.', '_');
				for (Byte c : ((String) name).getBytes()) {
					if (!Character.isJavaIdentifierPart(c)) {
						return ctx.createFailureStatus(new Object[] { eObj });
					}
				}

				return ctx.createSuccessStatus();
			}
		}
		return ctx.createSuccessStatus();
	}

}
