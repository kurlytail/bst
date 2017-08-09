/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.master.MasterCell;

public class InstanceUtil {
	public static Collection<TubeInstance> getAllTubeInstances(EObject object) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(object);
		Collection<Setting> referencingObjects = UsageCrossReferencer.find(
				object, domain.getResourceSet());
		Collection<TubeInstance> hashSet = new HashSet<TubeInstance>();
		
		for (Setting setting : referencingObjects) {
			if (setting.getEObject() instanceof TubeInstance) {
				hashSet.add((TubeInstance)setting.getEObject());
			}
		}

		return hashSet;
	}
	
}
