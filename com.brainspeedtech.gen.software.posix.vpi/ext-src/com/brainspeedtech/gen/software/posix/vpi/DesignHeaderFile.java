package com.brainspeedtech.gen.software.posix.vpi;

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
  protected final String TEXT_1 = "\t" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_H__" + NL + "" + NL + "#define GEN_DESIGN_";
  protected final String TEXT_4 = NL + NL + "#include <stdint.h>" + NL + "#include \"gen_";
  protected final String TEXT_5 = "_parameters.h\"" + NL + "#include \"gen_";
  protected final String TEXT_6 = "_swarm_lib.h\"" + NL;
  protected final String TEXT_7 = NL + "#include \"gen_";
  protected final String TEXT_8 = "\"";
  protected final String TEXT_9 = NL + NL + NL + "typedef enum _ENUM_";
  protected final String TEXT_10 = "_FLOWS {";
  protected final String TEXT_11 = NL + "\tENUM_";
  protected final String TEXT_12 = "_";
  protected final String TEXT_13 = "_FLOW,";
  protected final String TEXT_14 = " " + NL + "\tENUM_";
  protected final String TEXT_15 = "_MAX_FLOWS" + NL + "} ENUM_";
  protected final String TEXT_16 = "_FLOWS;" + NL;
  protected final String TEXT_17 = NL + "typedef union _";
  protected final String TEXT_18 = " {" + NL + "\tuint8_t uint8;";
  protected final String TEXT_19 = NL + "\t";
  protected final String TEXT_20 = "_t ";
  protected final String TEXT_21 = ";";
  protected final String TEXT_22 = NL + "} __attribute__((aligned(1), packed)) ";
  protected final String TEXT_23 = "_t;" + NL;
  protected final String TEXT_24 = NL + NL + "extern int work_dir_fd;" + NL + "extern void design_startup(char*);" + NL + ";" + NL + "" + NL + "#endif";
  protected final String TEXT_25 = NL;

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
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_6);
    
		Set<String> includeFiles = new HashSet<String>();

		for (Resource includeResource : instance.eResource().getResourceSet()
				.getResources()) {
			if (includeResource instanceof StructResourceImpl) {
				includeFiles.add(includeResource.getURI().lastSegment()
						.replaceAll("\\.struct$", ".h"));
			}
		}

		for (String f : includeFiles) {

    stringBuffer.append(TEXT_7);
    stringBuffer.append(f);
    stringBuffer.append(TEXT_8);
    		}

    stringBuffer.append(TEXT_9);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_10);
    for(Flow flow: MasterUtil.getDesignFlows(instance)) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    
if (!instance.getTube().isEmpty()) {
	MasterDesign mDesign = (MasterDesign)instance.getTube().iterator().next().getTube().eContainer();
	for(MasterTube ti : mDesign.getTube()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_18);
    Collection<Struct> structList = MasterUtil.getDescriptors(ti);
	for (Struct struct: structList) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    	}
}

    stringBuffer.append(TEXT_24);
    stringBuffer.append(TEXT_25);
    return stringBuffer.toString();
  }
}
