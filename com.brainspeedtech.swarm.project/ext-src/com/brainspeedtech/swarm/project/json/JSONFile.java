package com.brainspeedtech.swarm.project.json;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.domain.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;;

public class JSONFile
{
  protected static String nl;
  public static synchronized JSONFile create(String lineSeparator)
  {
    nl = lineSeparator;
    JSONFile result = new JSONFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "var design = {" + NL + "\tname : \"";
  protected final String TEXT_3 = "\"," + NL + "\tmaster_cell : [";
  protected final String TEXT_4 = NL + "\t\t{ name : \"";
  protected final String TEXT_5 = "\" },";
  protected final String TEXT_6 = NL + "\t]" + NL + "};";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
SwarmCachingEditingDomain domain = (SwarmCachingEditingDomain)argument;
MasterDesign design = ProjectUtil.getMasterDesign(domain.getResourceSet().getResources().get(0));

    stringBuffer.append(TEXT_2);
    stringBuffer.append(domain.getID());
    stringBuffer.append(TEXT_3);
    for(MasterCell mCell: design.getCell()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(mCell.getName());
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
