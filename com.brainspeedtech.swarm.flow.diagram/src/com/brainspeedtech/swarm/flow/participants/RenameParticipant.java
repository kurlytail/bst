/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.participants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.RefactoringStatusEntry;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameArguments;
import org.eclipse.ltk.core.refactoring.resource.RenameResourceChange;

import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class RenameParticipant extends
		org.eclipse.ltk.core.refactoring.participants.RenameParticipant {
	
	Flow flow;
	IFile iFile;

	public RenameParticipant() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean initialize(Object element) {
		if (!(element instanceof IFile)) return false;
		
		iFile = (IFile)element;
		TransactionalEditingDomain domain = SwarmEditingDomainFactory.INSTANCE.createEditingDomain();
		Resource resource = domain.getResourceSet().getResource(URI.createPlatformResourceURI(iFile.getFullPath().toString(), true), true);
		if (resource == null) return false;
		
		Object object = EcoreUtil.getObjectByType(resource.getContents(), FlowPackage.eINSTANCE.getFlow());
		if (object == null) return false;
		
		flow = (Flow)object;
		return true;
	}

	@Override
	public String getName() {
		if (iFile != null) {
			return "Rename " + iFile.getName();
		}
		return null;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws OperationCanceledException {
		RefactoringStatus status = new RefactoringStatus();
		return status;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {
		RenameArguments arguments = getArguments();
		Change change = new RenameResourceChange(iFile.getLocation(), arguments.getNewName());
		return change;
	}

}
