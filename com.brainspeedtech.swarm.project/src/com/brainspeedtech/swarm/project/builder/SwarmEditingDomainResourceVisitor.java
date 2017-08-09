/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class SwarmEditingDomainResourceVisitor implements IResourceVisitor {

	@Override
	public boolean visit(IResource resource) throws CoreException {
		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(resource);
		
		if (resource instanceof IFile) {
			if (resource.getFileExtension() != null && 
					resource.getFileExtension().equals("html")) return false;
			
			if(resource.isLinked()) {
				// point to the original source file
				IPath location = resource.getLocation();
				if(location == null) return false;
				resource = ResourcesPlugin.getWorkspace().getRoot().getFile(location);
			}
			final URI targetURI = URI.createPlatformResourceURI(resource
					.getFullPath().toString(), true);
			try {
				Resource res = domain.getResourceSet()
						.getResource(targetURI, true);
				if(res.getContents().size() == 0) {
					res.unload();
					domain.getResourceSet().getResources().remove(res);
				}
			} catch (Exception e) {

				Resource res = domain.getResourceSet().getResource(
						targetURI, false);
				if (res != null) {
					res.unload();
					domain.getResourceSet().getResources().remove(res);
				}
			}
		}
		return true;
	}

}
