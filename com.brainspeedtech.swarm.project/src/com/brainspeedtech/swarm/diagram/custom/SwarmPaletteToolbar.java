/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.ToolEntry;

public class SwarmPaletteToolbar extends PaletteToolbar {
	public SwarmPaletteToolbar() {
		super("Swarm");

		add(new PaletteSeparator());
		add(new ToolEntry("Swarm", "", null, null) {
		});
	}
}
