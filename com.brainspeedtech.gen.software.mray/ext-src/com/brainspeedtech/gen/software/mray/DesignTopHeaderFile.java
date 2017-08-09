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
import com.brainspeedtech.swarm.layer.*;;

public class DesignTopHeaderFile
{
  protected static String nl;
  public static synchronized DesignTopHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DesignTopHeaderFile result = new DesignTopHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "#ifndef __DESIGN_TOP_H__" + NL + "#define __DESIGN_TOP_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_2 = ".h\"" + NL + "#endif";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
