package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.constraint.software.*;
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
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_5 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_6 = "_H__" + NL + "" + NL + "#include <stdint.h>" + NL + "" + NL + "#define GEN_DESIGN_";
  protected final String TEXT_7 = NL + "#define GEN_PLATFORM_POSIX" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_8 = "_parameters.h\"" + NL + "#include \"gen_";
  protected final String TEXT_9 = "_flows.h\"" + NL + "#include \"gen_";
  protected final String TEXT_10 = "_swarm_lib.h\"";
  protected final String TEXT_11 = NL + "#include \"gen_";
  protected final String TEXT_12 = "\"";
  protected final String TEXT_13 = NL + NL + NL + "static const char* gen_";
  protected final String TEXT_14 = "_flow_string(int flow)" + NL + "{" + NL + "\tswitch(flow) {";
  protected final String TEXT_15 = NL + "\tcase ENUM_";
  protected final String TEXT_16 = "_FLOW:" + NL + "\t\treturn \"";
  protected final String TEXT_17 = "\";";
  protected final String TEXT_18 = " \t" + NL + "\tdefault:" + NL + "\t\treturn \"Unrecognized flow\";" + NL + "\t}" + NL + "}" + NL;
  protected final String TEXT_19 = NL + "typedef union _";
  protected final String TEXT_20 = " {" + NL + "\tuint8_t uint8;";
  protected final String TEXT_21 = NL + "\t";
  protected final String TEXT_22 = "_t ";
  protected final String TEXT_23 = ";";
  protected final String TEXT_24 = NL + "} __attribute__((aligned(1), packed)) ";
  protected final String TEXT_25 = "_t;" + NL;
  protected final String TEXT_26 = NL + NL + "#define SWARM_MEMORY_FENCE \tasm volatile(\"mfence\" ::: \"memory\")" + NL + "" + NL + "extern int work_dir_fd;" + NL + "" + NL + "#endif";
  protected final String TEXT_27 = NL;

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
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_10);
    
		Set<String> includeFiles = new HashSet<String>();

		for (Resource includeResource : instance.eResource().getResourceSet()
				.getResources()) {
			if (includeResource instanceof StructResourceImpl) {
				includeFiles.add(includeResource.getURI().lastSegment()
						.replaceAll("\\.struct$", ".h"));
			}
		}

		for (String f : includeFiles) {

    stringBuffer.append(TEXT_11);
    stringBuffer.append(f);
    stringBuffer.append(TEXT_12);
    		}

    stringBuffer.append(TEXT_13);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_14);
    
	String lastString = "";
for(Flow flow: MasterUtil.getDesignFlows(instance)) {
	if (!lastString.equals(flow.getName())) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_17);
    } lastString = flow.getName(); }
    stringBuffer.append(TEXT_18);
    
if (!instance.getTube().isEmpty()) {
	MasterDesign mDesign = (MasterDesign)instance.getTube().iterator().next().getTube().eContainer();
	for(MasterTube ti : mDesign.getTube()) {

    stringBuffer.append(TEXT_19);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_20);
    Collection<Struct> structList = MasterUtil.getDescriptors(ti);
	for (Struct struct: structList) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_25);
    	}
}

    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    return stringBuffer.toString();
  }
}
