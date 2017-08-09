package com.brainspeedtech.gen.verilog;

import java.util.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.*;;

public class DesignTopFile
{
  protected static String nl;
  public static synchronized DesignTopFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DesignTopFile result = new DesignTopFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "`timescale 1ns/100ps";
  protected final String TEXT_2 = "\t" + NL + "" + NL + "" + NL + "`include \"gen_";
  protected final String TEXT_3 = "_design.vh\"" + NL + "" + NL + "module ";
  protected final String TEXT_4 = "_top(/*AUTOARG*/);" + NL + "\t/*AUTOWIRE*/" + NL + "\t/*AUTOOUTPUT*/" + NL + "\t/*AUTOINPUT*/" + NL;
  protected final String TEXT_5 = NL + "\tgen_";
  protected final String TEXT_6 = "_wrapper ";
  protected final String TEXT_7 = "(/*AUTOINST*/);" + NL;
  protected final String TEXT_8 = NL + NL + "endmodule" + NL + "" + NL + "" + NL + "// Local Variables:" + NL + "// verilog-library-directories:(\".\")" + NL + "// verilog-library-files:()" + NL + "// verilog-library-extensions:(\".v\" \".vh\")" + NL + "// eval:(verilog-read-includes)" + NL + "// eval:(setq verilog-auto-output-ignore-regexp \"^w_.*\")" + NL + "// eval:(setq verilog-auto-input-ignore-regexp \"^w_.*\")" + NL + "// End:" + NL;
  protected final String TEXT_9 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_4);
    for(CellInstance ci: instance.getCell()) { if (ci.getCell().isExternal()) continue; 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
