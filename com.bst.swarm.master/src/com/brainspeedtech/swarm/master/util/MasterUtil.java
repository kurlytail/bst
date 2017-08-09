/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.util.TransactionUtil;

import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;
import com.brainspeedtech.swarm.master.MasterTube;

public class MasterUtil {
	public static Set<Flow> getFlows(MasterTube mTube) {
		Set<Flow> flows = new HashSet<Flow>();
		for (Tube tube : mTube.getDesignTubes()) {
			Flow flow = (Flow) tube.eContainer();
			if (flow != null) flows.add(flow);
		}
		return flows;
	}

	public static Set<Struct> getDescriptors(MasterTube mTube) {
		Set<Struct> descriptors = new HashSet<Struct>();
		for (Tube tube : mTube.getDesignTubes()) {
			descriptors.addAll(tube.getDescriptor());
		}
		return descriptors;
	}

	public static Collection<Flow> getDesignFlows(EObject object) {
		Set<Flow> allFlows = new HashSet<Flow>();
		for (Resource res : TransactionUtil.getEditingDomain(object)
				.getResourceSet().getResources()) {
			Collection<Flow> flows = EcoreUtil.getObjectsByType(
					res.getContents(), FlowPackage.eINSTANCE.getFlow());
			allFlows.addAll(flows);
		}
		List<Flow> flowList = new LinkedList<Flow>(allFlows);
		
		Collections.sort(flowList, new Comparator<Flow>() {

			@Override
			public int compare(Flow o1, Flow o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return flowList;
	}

}
