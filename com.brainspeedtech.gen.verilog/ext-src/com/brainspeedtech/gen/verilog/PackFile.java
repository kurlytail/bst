package com.brainspeedtech.gen.verilog;

import java.util.*;
import java.util.Map.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.hardware.verilog.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.struct.*;
import org.eclipse.emf.ecore.*;;

public class PackFile
{
  protected static String nl;
  public static synchronized PackFile create(String lineSeparator)
  {
    nl = lineSeparator;
    PackFile result = new PackFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "`timescale 1ns/100ps";
  protected final String TEXT_2 = "\t" + NL + "" + NL + "module gen_";
  protected final String TEXT_3 = "_pack(/*AUTOARG*/);" + NL + "endmodule" + NL + "" + NL + "// Local Variables:" + NL + "// verilog-library-directories:(\".\")" + NL + "// verilog-library-files:()" + NL + "// verilog-library-extensions:(\".v\" \".vh\")" + NL + "// eval:(verilog-read-includes)" + NL + "// eval:(setq verilog-auto-output-ignore-regexp \"^w_.*\")" + NL + "// eval:(setq verilog-auto-input-ignore-regexp \"^w_.*\")" + NL + "// End:" + NL;
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entry<String, Struct> entry = (Entry<String, Struct>) argument;
    stringBuffer.append(TEXT_2);
    stringBuffer.append(entry.getKey());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
