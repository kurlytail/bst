/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.brainspeedtech.swarm.flow.diagram.part.FlowVisualIDRegistry;

/**
 * @generated
 */
public class FlowNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FlowNavigatorItem) {
			FlowNavigatorItem item = (FlowNavigatorItem) element;
			return FlowVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
