/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.validation;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.validation.AbstractConstraintValidator;

public class BrokenReferencesConstraint extends AbstractConstraintValidator {
	

	public IStatus validateObject(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		if (eObj.eIsProxy()) {
			try {
				EcoreUtil.resolveAll(eObj);
			} catch (Exception ex) {
				// Do nothing
			}
		}
		if (eObj.eIsProxy()) {
			return ctx.createFailureStatus(new Object[] { eObj });
		}
		
		List<EObject> errorObjects = new LinkedList<EObject>();
		for (EContentsEList.FeatureIterator<?> featureIterator = (EContentsEList.FeatureIterator<?>) eObj
				.eCrossReferences().iterator(); featureIterator.hasNext();) {
			EObject eObject = (EObject) featureIterator.next();
			if (eObject.eIsProxy()) {
				try {
					EcoreUtil.resolveAll(eObject);
				} catch (Exception ex) {
					// Do nothing
				}
			}
			if (eObject.eIsProxy()) {
				errorObjects.add(eObject);
			}

		}

		if (!errorObjects.isEmpty()) {
			return ctx.createFailureStatus(new Object[] { eObj });
		}

		return ctx.createSuccessStatus();
	}
}
