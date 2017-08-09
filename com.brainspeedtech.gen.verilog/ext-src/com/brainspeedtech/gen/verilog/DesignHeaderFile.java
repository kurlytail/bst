package com.brainspeedtech.gen.verilog;

import java.util.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;;

public class DesignHeaderFile
{
  protected static String nl;
  public static synchronized DesignHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DesignHeaderFile result = new DesignHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "" + NL + "`ifndef __";
  protected final String TEXT_2 = "_VH__" + NL + "`define __";
  protected final String TEXT_3 = "_VH__" + NL + "" + NL + "`define GEN_DESIGN_";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "`include \"gen_";
  protected final String TEXT_6 = "\"";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "`define ENUM_";
  protected final String TEXT_9 = "_FLOW ";
  protected final String TEXT_10 = NL + "`define ENUM_MAX_FLOWS ";
  protected final String TEXT_11 = NL + NL + "`endif";
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
    
		Set<String> includeFiles = new HashSet<String>();

		for (Resource includeResource : instance.eResource().getResourceSet()
				.getResources()) {
			if (includeResource instanceof StructResourceImpl) {
				includeFiles.add(includeResource.getURI().lastSegment()
						.replaceAll("\\.struct$", ".vh"));
			}
		}

		for (String f : includeFiles) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append(f);
    stringBuffer.append(TEXT_6);
    		}

    stringBuffer.append(TEXT_7);
    int flowId = 0;
    for(Flow flow: MasterUtil.getDesignFlows(instance)) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(flowId);
    ++flowId;
}
    stringBuffer.append(TEXT_10);
    stringBuffer.append(flowId);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
