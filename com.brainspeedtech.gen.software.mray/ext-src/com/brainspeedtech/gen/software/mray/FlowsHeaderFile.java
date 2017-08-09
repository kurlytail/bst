package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.layer.*;;

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
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_FLOWS_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_FLOWS_H__" + NL + "" + NL + "typedef enum _ENUM_";
  protected final String TEXT_4 = "_FLOWS {" + NL + "\tENUM_";
  protected final String TEXT_5 = "_NULL_FLOW = 0,";
  protected final String TEXT_6 = NL + "\tENUM_";
  protected final String TEXT_7 = "_FLOW = ";
  protected final String TEXT_8 = ",";
  protected final String TEXT_9 = " " + NL + "\tENUM_";
  protected final String TEXT_10 = "_MAX_FLOWS" + NL + "} ENUM_";
  protected final String TEXT_11 = "_FLOWS;" + NL + "" + NL + "#endif";
  protected final String TEXT_12 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    
	int flow_num = 1;
	for(Flow flow: MasterUtil.getDesignFlows(instance)) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(flow_num);
    stringBuffer.append(TEXT_8);
     ++flow_num; }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
