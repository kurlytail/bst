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

public class MonitorFile
{
  protected static String nl;
  public static synchronized MonitorFile create(String lineSeparator)
  {
    nl = lineSeparator;
    MonitorFile result = new MonitorFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "#!/bin/bash" + NL + "" + NL + "if [ -a logrotate.conf ]" + NL + "then" + NL + "    CURDIR=`pwd | sed -e 's/[]\\\\/()$*.^|[]/\\\\\\\\&/g'`" + NL + "    sed -e\"s/CURDIR/$CURDIR/\" logrotate.conf > logrotate.final.conf" + NL + "    logrotate -s logrotate logrotate.final.conf" + NL + "fi";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
