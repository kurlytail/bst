/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.providers;

import com.brainspeedtech.swarm.master.diagram.part.MasterDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MasterDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			MasterDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
