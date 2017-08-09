/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;

import com.brainspeedtech.swarm.layer.Association;
import com.brainspeedtech.swarm.layer.AssociationType;
import com.brainspeedtech.swarm.layer.CellInstanceCount;
import com.brainspeedtech.swarm.layer.validation.AbstractConstraintValidator;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class BadTubeAssociation extends AbstractConstraintValidator {

	@Override
	public IStatus validateObject(IValidationContext ctx) {
		
		EObject eObj = ctx.getTarget();
		if (eObj instanceof MasterTube) {
			MasterTube tube = (MasterTube)eObj;
			int fromCount = 1;
			int toCount = 1;
			CellInstanceCount fCount = ProjectUtil.getReferringInstance(tube.getFrom(), CellInstanceCount.class);
			CellInstanceCount tCount = ProjectUtil.getReferringInstance(tube.getTo(), CellInstanceCount.class);
			Association assoc = ProjectUtil.getReferringInstance(tube, Association.class);
			
			if (fCount != null) fromCount = fCount.getCount();
			if (tCount != null) toCount = tCount.getCount();
			AssociationType assocType = AssociationType.MANY_TO_MANY;
			if (assoc != null) {
				assocType = assoc.getType();
			}
			
			if(assocType == AssociationType.ONE_TO_MANY &&
					toCount <= fromCount) {
				return ctx.createFailureStatus(new Object[] { tube });
			}

			if(assocType == AssociationType.MANY_TO_ONE &&
					fromCount <= toCount) {
				return ctx.createFailureStatus(new Object[] { tube });				
			}
			
			if(assocType == AssociationType.ONE_TO_ONE &&
					toCount != fromCount) {
				return ctx.createFailureStatus(new Object[] { tube });				
			}
		}
		return ctx.createSuccessStatus();

	}

}
