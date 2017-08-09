/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.util;

import javax.script.ScriptException;

import com.brainspeedtech.swarm.layer.Parameter;
import com.brainspeedtech.swarm.layer.util.ParameterUtil;

public class SoftwareUtil {
	public static String computeParameter(Parameter parameter) {
		String objectValue = "Invalid Object";
		try {
			Object object = ParameterUtil.compute(parameter);
			if(object instanceof Double) {
				Double doubleValue = (Double)object;
				long longValue = doubleValue.longValue();
				if(longValue >= 0x10000) {
					objectValue = Long.toString(longValue) + "UL";
				} else {
					objectValue = Long.toString(longValue);
				}
			}
		} catch (ScriptException e) {
		}

		return objectValue;
	}
}
