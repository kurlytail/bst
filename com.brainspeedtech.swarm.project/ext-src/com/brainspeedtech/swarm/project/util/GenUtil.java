/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.util;

public class GenUtil {
	public static String sanitize(String str) {
		if (str == null) {
			str = "";
		}
		
		str = str.replaceAll("\\n", " ");
		
		return str; 
	}
}
