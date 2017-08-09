package com.brainspeedtech.swarm.project.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class EclipseProjectUtil {
	public static EObject getSwarmObject(EObject obj) {
		// Get Project from object.
		IFile file = WorkspaceSynchronizer.getFile(obj.eResource());
		TransactionalEditingDomain domain = SwarmEditingDomainFactory.getEditingDomain(file);
		if(domain == null) return null;
		
		TransactionalEditingDomain sourceDomain = TransactionUtil.getEditingDomain(obj);
		if (sourceDomain == null) return null;
		
		
		Resource resource = domain.getResourceSet().getResource(obj.eResource().getURI(), false);
		if (resource == null) return null;
		
		EObject newobj = resource.getEObject(obj.eResource().getURIFragment(obj));
		
		return newobj;
	}
}
