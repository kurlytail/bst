/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.util;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.brainspeedtech.swarm.layer.CopyrightMessage;

public class LayerUtil {

	public static String[] getCopyrightMessage(EObject object) {
		CopyrightMessage copyright = ProjectUtil.getReferringInstance(object, CopyrightMessage.class);
		String copyrightMessage = "Copyright of Mangstor LLC, All rights reserved";
		if (copyright != null) {
			if (copyright.getMessage() != null)
				copyrightMessage = copyright.getMessage();
		}
		
		copyrightMessage = copyrightMessage.replaceAll("\\r", " ");
		copyrightMessage = copyrightMessage.replaceAll("\\n", " ");

		BreakIterator iterator = BreakIterator.getWordInstance();
		iterator.setText(copyrightMessage);
		
		String[] messageArray = new String[] { };
		int start = iterator.first();
		List<String> lineList = new ArrayList<String>();
		String currentString = "";
		while(true) {
			int end = iterator.next();
			if (end == BreakIterator.DONE) {
				if (currentString.length() != 0) {
					lineList.add(currentString);
				}
				break;
			}
			String nextWord = copyrightMessage.substring(start, end);
			if (currentString.length() + nextWord.length() > 80) {
				lineList.add(currentString);
				currentString = nextWord;
			} else {
				currentString = currentString + nextWord;
			}
			start = end;
		}
		
		return lineList.toArray(messageArray);
	}


}
