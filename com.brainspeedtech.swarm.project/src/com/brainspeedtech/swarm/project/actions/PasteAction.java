/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import com.brainspeedtech.swarm.commands.CopyCommand;
import com.brainspeedtech.swarm.commands.PasteCommand;

public class PasteAction extends org.eclipse.emf.edit.ui.action.PasteAction {

	@Override
	public Command createCommand(Collection<?> selection) {
		return new PasteCommand(selection);
	}

}
