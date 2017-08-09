/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.jface.preference.IPreferenceStore;

import com.brainspeedtech.swarm.flow.diagram.part.FlowDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(FlowDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	public static void initDefaults(IPreferenceStore preferenceStore) {
		ConnectionsPreferencePage.initDefaults(preferenceStore);
		preferenceStore.setDefault(IPreferenceConstants.PREF_LINE_STYLE,
				Routing.RECTILINEAR);
	}
}
