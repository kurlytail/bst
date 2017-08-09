/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;
import org.eclipse.ui.IEditorPart;

public class SwarmPaletteProvider extends AbstractProvider implements
		IPaletteProvider {

	@Override
	public boolean provides(IOperation operation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void contributeToPalette(IEditorPart editor, Object content,
			PaletteRoot root, Map predefinedEntries) {
//		PaletteEntry entry = new SwarmPaletteDrawer();
//		root.add(entry);
	}

	@Override
	public void setContributions(IConfigurationElement configElement) {
		// TODO Auto-generated method stub
		
	}

}
