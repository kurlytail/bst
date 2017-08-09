/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import com.brainspeedtech.swarm.master.diagram.part.MasterVisualIDRegistry;

/**
 * @generated
 */
public class MasterNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof MasterNavigatorItem) {
			MasterNavigatorItem item = (MasterNavigatorItem) element;
			return MasterVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
