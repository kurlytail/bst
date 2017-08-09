/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.gef.dnd.SimpleObjectTransfer;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;

public class PasteCommand extends AbstractCommand {

	Collection<?> objects;
	
	public PasteCommand(Collection<?> selection) {
		objects = selection;
	}

	@Override
	public void execute() {
		Clipboard clipboard = new Clipboard(Display.getCurrent());
		Transfer transfer = new SimpleObjectTransfer() {
			@Override
			protected String[] getTypeNames() {
				return new String[] {objects.getClass().toString()};
			}
			
			@Override
			protected int[] getTypeIds() {
				return new int[] {objects.getClass().hashCode()};
			}
		};
		Object clipboardContents = clipboard.getContents(transfer, DND.CLIPBOARD);
		if (clipboardContents instanceof Collection<?>) {
			Collection<?> toPaste = (Collection<?>)(clipboardContents);
			for(Object object: toPaste) {
				
			}
		}
		clipboard.dispose();
	}

	@Override
	public void redo() {
		
	}

	@Override
	protected boolean prepare() {
		return true;
	}
	
	

}
