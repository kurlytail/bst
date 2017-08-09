package com.brainspeedtech.swarm.listeners;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new WorkspaceListener());

	}

}
