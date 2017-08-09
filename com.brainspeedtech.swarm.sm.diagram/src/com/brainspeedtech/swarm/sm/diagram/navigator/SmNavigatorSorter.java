/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.sm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.brainspeedtech.swarm.sm.diagram.part.SmVisualIDRegistry;

/**
 * @generated
 */
public class SmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SmNavigatorItem) {
			SmNavigatorItem item = (SmNavigatorItem) element;
			return SmVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
