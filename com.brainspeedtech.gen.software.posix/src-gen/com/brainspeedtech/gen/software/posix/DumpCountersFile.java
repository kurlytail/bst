package com.brainspeedtech.gen.software.posix;

import java.util.*;
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

public class DumpCountersFile
{
  protected static String nl;
  public static synchronized DumpCountersFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DumpCountersFile result = new DumpCountersFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    ";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_5 = "_PRINT_COUNTER_H__" + NL + "#define __GEN__";
  protected final String TEXT_6 = "_PRINT_COUNTER_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_7 = ".h\"" + NL;
  protected final String TEXT_8 = NL + NL + "void print_";
  protected final String TEXT_9 = "_counters (const char* prefix, const void* data) " + NL + "{" + NL + "\t";
  protected final String TEXT_10 = "_counters_t *counters = (";
  protected final String TEXT_11 = "_counters_t*)data;\t";
  protected final String TEXT_12 = NL + "\tprintf(\"%s ";
  protected final String TEXT_13 = " = %d\\n\", prefix, counters->";
  protected final String TEXT_14 = ");";
  protected final String TEXT_15 = NL + "}" + NL;
  protected final String TEXT_16 = NL + NL + "#endif";
  protected final String TEXT_17 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    MasterDesign design = (MasterDesign) argument;
    stringBuffer.append(TEXT_1);
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(design.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(design.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(design.getName());
    stringBuffer.append(TEXT_7);
    for(MasterCell cell: design.getCell()) {
	List<Counter> counters = new LinkedList<Counter>();
    counters.addAll(ProjectUtil.getReferringInstances(cell, Counter.class));
    counters.addAll(ProjectUtil.getReferringInstances(cell.getInput(), TubeReceiveCounter.class));
    counters.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), TubeTransmitCounter.class));
    Comparator<? super Counter> comparator = new Comparator<Counter>() {
		@Override
		public int compare(Counter o1, Counter o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	Collections.sort(counters, comparator);
	if(counters.size() != 0) {

    stringBuffer.append(TEXT_8);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_11);
    for(Counter counter: counters) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
      }
}
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
