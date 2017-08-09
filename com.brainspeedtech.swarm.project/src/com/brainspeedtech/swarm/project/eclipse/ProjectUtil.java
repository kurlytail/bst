/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.eclipse;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class ProjectUtil {
	public static class MyContainer {
		private IContainer container;

		public MyContainer(IContainer container) {
			this.container = container;
		}

		public IFile getFile(String name) {
			if (container instanceof IFolder) {
				return ((IFolder) container).getFile(name);
			}
			if (container instanceof IProject) {
				return ((IProject) container).getFile(name);
			}
			return null;
		}
	}
	
	public static String[] getNatures(Resource eResource) {
		return getNatures(WorkspaceSynchronizer.getFile(eResource));
	}

	private static String[] getNatures(IFile file) {
		try {
			return SwarmEditingDomainFactory.getNatures(file.getProject());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String[0];
	}

	
	
	public static String[] getNatures(EObject object) {
		return getNatures(object.eResource());
	}



}
