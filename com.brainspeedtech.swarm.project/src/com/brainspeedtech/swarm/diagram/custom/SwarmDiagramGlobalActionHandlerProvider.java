/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.Hashtable;

import org.eclipse.gmf.runtime.common.ui.services.action.global.AbstractGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

public class SwarmDiagramGlobalActionHandlerProvider extends
		AbstractGlobalActionHandlerProvider {
	/**
	 * List for handlers.
	 */
	private Hashtable handlerList = new Hashtable();

	/**
	 * Creates a new instance.
	 */
	public SwarmDiagramGlobalActionHandlerProvider() {
		super();
	}

	/**
	 * Returns a global action handler that supports global image operations
	 * (cut, copy, and paste).
	 */
	public IGlobalActionHandler getGlobalActionHandler(
			final IGlobalActionHandlerContext context) {
		/* Create the handler */
		if (!getHandlerList().containsKey(context.getActivePart())) {
			getHandlerList().put(context.getActivePart(),
					new SwarmDiagramClipboardSupportGlobalActionHandler());

			/*
			 * Register as a part listener so that the cache can be cleared when
			 * the part is disposed
			 */
			context.getActivePart().getSite().getPage()
					.addPartListener(new IPartListener() {

						private IWorkbenchPart localPart = context
								.getActivePart();

						/**
						 * @see org.eclipse.ui.IPartListener#partActivated(IWorkbenchPart)
						 */
						public void partActivated(IWorkbenchPart part) {
							// Do nothing
						}

						/**
						 * @see org.eclipse.ui.IPartListener#partBroughtToTop(IWorkbenchPart)
						 */
						public void partBroughtToTop(IWorkbenchPart part) {
							// Do nothing
						}

						/**
						 * @see org.eclipse.ui.IPartListener#partClosed(IWorkbenchPart)
						 */
						public void partClosed(IWorkbenchPart part) {
							/* Remove the cache associated with the part */
							if (part != null && part == localPart
									&& getHandlerList().containsKey(part)) {
								getHandlerList().remove(part);
								localPart.getSite().getPage()
										.removePartListener(this);
								localPart = null;
							}
						}

						/**
						 * @see org.eclipse.ui.IPartListener#partDeactivated(IWorkbenchPart)
						 */
						public void partDeactivated(IWorkbenchPart part) {
							// Do nothing
						}

						/**
						 * @see org.eclipse.ui.IPartListener#partOpened(IWorkbenchPart)
						 */
						public void partOpened(IWorkbenchPart part) {
							// Do nothing
						}
					});
		}

		return (SwarmDiagramClipboardSupportGlobalActionHandler)getHandlerList().get(context.getActivePart());
	}

	/**
	 * Returns the handlerList.
	 * 
	 * @return Hashtable
	 */
	private Hashtable getHandlerList() {
		return handlerList;
	}
}
