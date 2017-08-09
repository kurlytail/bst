package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.util.*;
import org.eclipse.emf.ecore.*;;

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
  protected final String TEXT_1 = "  \t";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_5 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_6 = "_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_7 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_8 = ".h\"" + NL + "" + NL + "" + NL + "#endif";
  protected final String TEXT_9 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CellInstance instance = (CellInstance) argument;
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
    stringBuffer.append(((Instance)instance.eContainer()).getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
