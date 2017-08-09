package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.constraint.software.posix.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;;

public class FlowsHeaderFile
{
  protected static String nl;
  public static synchronized FlowsHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    FlowsHeaderFile result = new FlowsHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#ifndef __";
  protected final String TEXT_5 = "_FLOWS_H__" + NL + "#define __";
  protected final String TEXT_6 = "_FLOWS_H__" + NL + "" + NL + "typedef enum _ENUM_";
  protected final String TEXT_7 = "_FLOWS {" + NL + "\tENUM_";
  protected final String TEXT_8 = "_NULL_FLOW = 0,";
  protected final String TEXT_9 = NL + "\tENUM_";
  protected final String TEXT_10 = "_FLOW = ";
  protected final String TEXT_11 = ",";
  protected final String TEXT_12 = " " + NL + "\tENUM_";
  protected final String TEXT_13 = "_MAX_FLOWS" + NL + "} ENUM_";
  protected final String TEXT_14 = "_FLOWS;" + NL + "" + NL + "" + NL + "#endif";
  protected final String TEXT_15 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_1);
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    
	int flow_num = 1;
	String lastFlowName = "";
	for(Flow flow: MasterUtil.getDesignFlows(instance)) {
		if(!lastFlowName.equals(flow.getName())) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(flow_num);
    stringBuffer.append(TEXT_11);
     lastFlowName = flow.getName(); } ++flow_num; }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
