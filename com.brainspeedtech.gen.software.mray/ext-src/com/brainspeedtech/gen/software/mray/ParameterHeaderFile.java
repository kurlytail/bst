package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.layer.*;
import org.eclipse.emf.ecore.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.gen.software.util.*;
import org.eclipse.emf.transaction.util.*;;

public class ParameterHeaderFile
{
  protected static String nl;
  public static synchronized ParameterHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    ParameterHeaderFile result = new ParameterHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_PARAMETERS_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_PARAMETERS_H__" + NL;
  protected final String TEXT_4 = NL + "//  ";
  protected final String TEXT_5 = " = ";
  protected final String TEXT_6 = NL + "//  ";
  protected final String TEXT_7 = NL + "#define ";
  protected final String TEXT_8 = "  ";
  protected final String TEXT_9 = NL + NL + "#endif";
  protected final String TEXT_10 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    
Collection<Parameter> parameters = new LinkedList<Parameter>();
for(Resource resource: TransactionUtil.getEditingDomain(instance).getResourceSet().getResources()) {
	Layer layer = (Layer)EcoreUtil.getObjectByType(resource.getContents(), LayerPackage.eINSTANCE.getLayer());
	if (layer == null) continue;
	parameters.addAll((Collection<? extends Parameter>)EcoreUtil.getObjectsByType(layer.eContents(), LayerPackage.eINSTANCE.getParameter()));
}

    for(Parameter parameter: parameters) {
	if(parameter.isDisabled()) continue;
	
    stringBuffer.append(TEXT_4);
    stringBuffer.append(parameter.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(parameter.getValue());
    	if(parameter.getBlurb() != null) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(parameter.getBlurb());
     	} 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(parameter.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(SoftwareUtil.computeParameter(parameter));
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
