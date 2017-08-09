package com.brainspeedtech.gen.software.posix;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;;

public class CCopyRight
{
  protected static String nl;
  public static synchronized CCopyRight create(String lineSeparator)
  {
    nl = lineSeparator;
    CCopyRight result = new CCopyRight();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
