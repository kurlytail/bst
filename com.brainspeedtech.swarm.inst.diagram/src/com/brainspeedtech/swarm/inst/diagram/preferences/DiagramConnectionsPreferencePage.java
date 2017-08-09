/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.inst.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

import com.brainspeedtech.swarm.inst.diagram.part.InstDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(InstDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	public static void initDefaults(IPreferenceStore preferenceStore) {
		ConnectionsPreferencePage.initDefaults(preferenceStore);
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
				Routing.RECTILINEAR);
	}
}
