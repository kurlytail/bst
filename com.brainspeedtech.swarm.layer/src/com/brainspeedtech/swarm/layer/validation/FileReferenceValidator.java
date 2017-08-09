/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.validation;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.FileReference;

public class FileReferenceValidator extends AbstractConstraintValidator {

	@Override
	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();

		if (eObj instanceof FileReference) {
			for (String fileRef : ((FileReference) eObj).getFiles()) {
				File file = new File(fileRef);
				if (!file.exists()) {
					return ctx.createFailureStatus(new Object[] { eObj },
							"File " + fileRef + " not found");
				}
			}
		}
		return ctx.createSuccessStatus();
	}
}
