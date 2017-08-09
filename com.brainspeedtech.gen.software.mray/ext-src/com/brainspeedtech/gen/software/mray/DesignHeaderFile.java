package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.project.domain.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;
import org.eclipse.emf.transaction.util.*;
import com.brainspeedtech.swarm.layer.*;;

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
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_H__" + NL + "#include <stdint.h>" + NL + "#include <string.h>" + NL + "#include <xtensa/tie/xt_booleans.h>" + NL + "" + NL + "" + NL + "#define GEN_DESIGN_";
  protected final String TEXT_4 = NL + "#define GEN_PLATFORM_MRAY" + NL + "#define MRAY_SHARED" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_5 = "_parameters.h\"" + NL + "#include \"gen_";
  protected final String TEXT_6 = "_flows.h\"";
  protected final String TEXT_7 = NL + "#include \"gen_";
  protected final String TEXT_8 = "\"";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL + "typedef union _";
  protected final String TEXT_11 = " {" + NL + "\tuint32_t uint32;";
  protected final String TEXT_12 = NL + "\t";
  protected final String TEXT_13 = "_t ";
  protected final String TEXT_14 = ";";
  protected final String TEXT_15 = NL + "} ";
  protected final String TEXT_16 = "_t;" + NL;
  protected final String TEXT_17 = NL + NL + "#define SWARM_RECV(__queue__, __ptr__, __size__) SWARM_RECV_ ## __queue__((__ptr__), (__size__))" + NL + "#define SWARM_SEND(__queue__, __ptr__, __size__) SWARM_SEND_ ## __queue__((__ptr__), (__size__))" + NL + "#define SWARM_RECV_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_RECV_RELATIVE_ ## __queue__((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_SEND_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_SEND_RELATIVE_ ## __queue__((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_RECV_NONBLOCKING(__queue__, __ptr__, __size__) SWARM_RECV_NONBLOCKING_ ## __queue__((__ptr__), (__size__))" + NL + "#define SWARM_SEND_NONBLOCKING(__queue__, __ptr__, __size__) SWARM_SEND_NONBLOCKING_ ## __queue__((__ptr__), (__size__))" + NL + "#define SWARM_RECV_NONBLOCKING_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_RECV_NONBLOCKING_RELATIVE_ ## __queue__((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_SEND_NONBLOCKING_RELATIVE_ ## __queue__((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_RECV_BUSY(__queue__) SWARM_RECV_BUSY_ ## __queue__" + NL + "#define SWARM_SEND_BUSY(__queue__) SWARM_SEND_BUSY_ ## __queue__" + NL + "#define SWARM_RECV_BUSY_RELATIVE(__queue__, __instance__) SWARM_RECV_BUSY_RELATIVE_ ## __queue__((__instance__))" + NL + "#define SWARM_SEND_BUSY_RELATIVE(__queue__, __instance__) SWARM_SEND_BUSY_RELATIVE_ ## __queue__((__instance__))" + NL + "" + NL + "#define SWARM_RECV_LOGGED SWARM_RECV" + NL + "#define SWARM_SEND_LOGGED SWARM_SEND" + NL + "#define SWARM_RECV_RELATIVE_LOGGED SWARM_RECV_RELATIVE" + NL + "#define SWARM_SEND_RELATIVE_LOGGED SWARM_SEND_RELATIVE" + NL + "#define SWARM_RECV_NONBLOCKING_LOGGED SWARM_RECV_NONBLOCKING" + NL + "#define SWARM_SEND_NONBLOCKING_LOGGED SWARM_SEND_NONBLOCKING" + NL + "#define SWARM_RECV_NONBLOCKING_RELATIVE_LOGGED SWARM_RECV_NONBLOCKING_RELATIVE" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE_LOGGED SWARM_SEND_NONBLOCKING_RELATIVE" + NL + "" + NL + "#define SWARM_SHARED(__type__, __varname__) __type__ __varname__" + NL + "#define SWARM_PRINT0(__format__) SWARM_PRINT(__format__, 0, 0, 0, 0)" + NL + "#define SWARM_PRINT1(__format__, __arg0__) SWARM_PRINT(__format__, __arg0__, 0, 0, 0)" + NL + "#define SWARM_PRINT2(__format__, __arg0__, __arg1__) SWARM_PRINT(__format__, __arg0__, __arg1__, 0, 0)" + NL + "#define SWARM_PRINT3(__format__, __arg0__, __arg1__, __arg2__) SWARM_PRINT(__format__, __arg0__, __arg1__, __arg2__, 0)" + NL + "#define SWARM_PRINT4(__format__, __arg0__, __arg1__, __arg2__, __arg3__) SWARM_PRINT(__format__, __arg0__, __arg1__, __arg2__, __arg3__)" + NL + "#define SWARM_PRINT(__format__, __arg0__, __arg1__, __arg2__, __arg3__)" + NL + "#define SWARM_FATAL_ERROR while(1);" + NL + "" + NL + "#ifndef SWARM_SIZEOF" + NL + "#define SWARM_SIZEOF(__arg__) (sizeof(__arg__))" + NL + "#endif" + NL + "#define SWARM_MEMORY_FENCE while(0);" + NL + "#endif";
  protected final String TEXT_18 = NL;

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
    
MasterDesign mDesign = (MasterDesign)((SwarmCachingEditingDomain)(TransactionUtil.getEditingDomain(instance))).
    getObjectByType(MasterPackage.eINSTANCE.getMasterDesign());
if (!instance.getTube().isEmpty()) {
	for(MasterTube ti : mDesign.getTube()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_11);
    Collection<Struct> structList = MasterUtil.getDescriptors(ti);
	for (Struct struct: structList) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_16);
    	}
}

    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
