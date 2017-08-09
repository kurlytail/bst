package com.brainspeedtech.gen.software.posix.vpi;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.layer.*;
import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.project.util.*;;

public class ModulePlanFile
{
  protected static String nl;
  public static synchronized ModulePlanFile create(String lineSeparator)
  {
    nl = lineSeparator;
    ModulePlanFile result = new ModulePlanFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "module ";
  protected final String TEXT_3 = "();" + NL + "" + NL + "// Put this into the appropriate always block with the correct clocks and other port instantiations" + NL + "\tinitial" + NL + "\t\tbegin" + NL + "\t\t\t$";
  protected final String TEXT_4 = "_vpi(\"logs\");" + NL + "\t\tend" + NL + "endmodule // ";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    CellInstance instance = (CellInstance) argument;
  Instance designInstance = (Instance)instance.eContainer();
  

    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
