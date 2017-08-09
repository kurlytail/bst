package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.util.*;;

public class InstanceHeaderFile
{
  protected static String nl;
  public static synchronized InstanceHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    InstanceHeaderFile result = new InstanceHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_H__";
  protected final String TEXT_4 = NL + NL + "#include \"gen_";
  protected final String TEXT_5 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_6 = ".h\"" + NL + "" + NL + "" + NL + "#endif";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
CellInstance instance = (CellInstance) argument;  	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
     Instance designInstance = (Instance)instance.eContainer(); 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(designInstance.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
