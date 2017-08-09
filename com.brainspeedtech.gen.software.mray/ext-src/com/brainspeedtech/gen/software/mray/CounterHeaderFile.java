package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.constraint.software.hx.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.flow.*;;

public class CounterHeaderFile
{
  protected static String nl;
  public static synchronized CounterHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    CounterHeaderFile result = new CounterHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_COUNTER_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_COUNTER_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"" + NL;
  protected final String TEXT_5 = NL + "typedef struct _";
  protected final String TEXT_6 = "_counters {";
  protected final String TEXT_7 = NL + "    ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL + "} ";
  protected final String TEXT_11 = "_counters_t;" + NL;
  protected final String TEXT_12 = NL + NL + "#endif";
  protected final String TEXT_13 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    MasterDesign design = (MasterDesign) argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(design.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(design.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(design.getName());
    stringBuffer.append(TEXT_4);
    for(MasterCell cell: design.getCell()) {
    Collection<Counter> counters = ProjectUtil.getReferringInstances(cell, Counter.class);
    counters.addAll(ProjectUtil.getReferringInstances(cell.getInput(), TubeReceiveCounter.class));
    counters.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_6);
    for(Counter counter: counters) {
            String type = "";
            switch(counter.getWidth()) {
            case _16BIT: type = "uint16_t"; break;
            case _32BIT: type = "uint32_t"; break;
            case _64BIT: type = "uint64_t"; break;
            }
        
    stringBuffer.append(TEXT_7);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_11);
      }
}
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
