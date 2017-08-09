package com.brainspeedtech.gen.software.posix;

import java.util.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.layer.*;
import org.eclipse.emf.ecore.*;;

public class LogrotateConfigFile
{
  protected static String nl;
  public static synchronized LogrotateConfigFile create(String lineSeparator)
  {
    nl = lineSeparator;
    LogrotateConfigFile result = new LogrotateConfigFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "# Copy this file into logrotate.conf to use log rotation" + NL + "# Try \"man logrotate\" for more info on the config file" + NL + "" + NL + "size 100k" + NL + "rotate 1" + NL + "missingok" + NL + "copytruncate" + NL;
  protected final String TEXT_2 = NL + "CURDIR/";
  protected final String TEXT_3 = "_logs/";
  protected final String TEXT_4 = "_err.log {" + NL + "}";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_1);
    for(CellInstance ci: instance.getCell()) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
