/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.validation;

import org.eclipse.emf.validation.model.IClientSelector;

public class ValidationDelegateClientSelector implements IClientSelector {
	public static boolean running = false;
	
	@Override
	public boolean selects(Object object) {
		return running;
	}
}
