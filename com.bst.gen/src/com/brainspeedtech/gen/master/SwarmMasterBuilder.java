/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.master;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.ui.WorkbenchException;

import com.brainspeedtech.swarm.layer.ConvertMasterToSM;
import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;
import com.brainspeedtech.swarm.project.builder.SwarmProjectBuilder;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.util.ProjectUtil;
import com.brainspeedtech.swarm.sm.SmFactory;
import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;
import com.brainspeedtech.swarm.sm.Transition;

public class SwarmMasterBuilder extends SwarmProjectBuilder {

	public static final String BUILDER_ID = "com.bst.gen.swarmMasterBuilder";

	public SwarmMasterBuilder() {
		super(LayerFactory.eINSTANCE.createFlowAnalysisAndMerge());
		observeAddExtension("flow");
		observeAddExtension("struct");
		observeAddExtension("layer");
		observeAddExtension("sm");

		observeChangeExtension("flow");
		observeChangeExtension("struct");
		observeChangeExtension("layer");
		observeChangeExtension("sm");

		observeDeleteExtension("master");
		observeDeleteExtension("flow");
		observeDeleteExtension("struct");
		observeDeleteExtension("layer");
		observeDeleteExtension("sm");

		generatedFileExtension("master");
		setSitePath("master");
		setGeneratorClass(MasterGenerator.class);
	}

	@Override
	protected void fullBuild(IProgressMonitor monitor, PrintStream log) throws CoreException {

		final TransactionalEditingDomain domain = SwarmEditingDomainFactory
				.getEditingDomain(getProject());
		try {
			MasterGenerator.generate((SwarmCachingEditingDomain) domain, 
					ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toString() + "/" + getProject().getName(),
					getProject().getName(), log);
		} catch (IOException e) {
			e.printStackTrace(log);
			throw new WorkbenchException("IO error", e);
		}
		importStateMachines(domain);
	}

	private void importStateMachines(TransactionalEditingDomain domain)
			throws WorkbenchException {
		List<StateMachine> stateMachines = new LinkedList<StateMachine>();

		synchronized (domain) {

			for (Resource resource : domain.getResourceSet().getResources()) {
				StateMachine stateMachine = (StateMachine) EcoreUtil
						.getObjectByType(resource.getContents(),
								SmPackage.eINSTANCE.getStateMachine());
				if (stateMachine != null) {
					stateMachines.add(stateMachine);
				}
			}

		}

		for (StateMachine stateMachine : stateMachines) {
			ConvertMasterToSM convert = ProjectUtil.getReferringInstance(
					stateMachine, ConvertMasterToSM.class);
			if (convert != null) {
				importStateMachine(domain, stateMachine, convert);
			}
		}
	}

	private void importStateMachine(TransactionalEditingDomain domain,
			final StateMachine stateMachine, ConvertMasterToSM convert)
			throws WorkbenchException {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(convert.getProject());
		TransactionalEditingDomain sourceDomain = SwarmEditingDomainFactory
				.getEditingDomain(project);

		MasterDesign sourceMaster = null;

		synchronized (sourceDomain) {
			for (Resource resource : sourceDomain.getResourceSet()
					.getResources()) {
				sourceMaster = (MasterDesign) EcoreUtil.getObjectByType(
						resource.getContents(),
						MasterPackage.eINSTANCE.getMasterDesign());
				if (sourceMaster != null) {
					break;
				}
			}
		}

		/* Save all older objects */
		final Map<String, State> oldStateMap = new HashMap<String, State>();
		final Map<String, Transition> oldTransitionMap = new HashMap<String, Transition>();

		final MasterDesign finalMasterDesign = sourceMaster;
		final Resource finalResource = stateMachine.eResource();

		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override
			protected void doExecute() {

				for (State mState : stateMachine.getState()) {
					oldStateMap.put(mState.getName(), mState);
				}
				stateMachine.getState().clear();

				for (Transition mTube : stateMachine.getTransition()) {
					oldTransitionMap.put(mTube.getName(), mTube);
				}
				stateMachine.getTransition().clear();
				/* Clear all contents, this saves the object ids */

				Map<String, State> stateMap = new HashMap<String, State>();
				Map<String, Transition> transitionMap = new HashMap<String, Transition>();

				for (MasterCell cell : finalMasterDesign.getCell()) {
					State state = oldStateMap.get(cell.getName());
					if (state == null)
						state = SmFactory.eINSTANCE.createState();
					state.getDest().clear();
					state.getSource().clear();

					state.setName(cell.getName());
					stateMap.put(cell.getName(), state);

					stateMachine.getState().add(state);
				}

				for (MasterTube tube : finalMasterDesign.getTube()) {
					Transition transition = oldTransitionMap.get(tube.getName());
					if (transition == null)
						transition = SmFactory.eINSTANCE.createTransition();

					transition.setName(tube.getName());
					transitionMap.put(tube.getName(), transition);

					State sourceState = stateMap.get(tube.getFrom().getName());
					State destinState = stateMap.get(tube.getTo().getName());

					transition.setFrom(sourceState);
					transition.setTo(destinState);
					stateMachine.getTransition().add(transition);

				}

				// Remove all unresolved diagram elements
				while (ProjectUtil.removeUnresolvedContainers((EObject) EcoreUtil
						.getObjectByType(
								finalResource.getContents(),
								NotationPackage.eINSTANCE.getDiagram())))
					;
			}
		});

		Resource smResource = stateMachine.eResource();
		try {
			smResource.save(null);
		} catch (IOException e) {
			throw (new WorkbenchException(e.getMessage()));
		}

	}
}
