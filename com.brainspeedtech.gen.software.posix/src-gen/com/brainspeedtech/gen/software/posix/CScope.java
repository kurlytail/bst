package com.brainspeedtech.gen.software.posix;

import org.eclipse.core.resources.*;
import java.io.File;
import java.util.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;;

public class CScope
{
  protected static String nl;
  public static synchronized CScope create(String lineSeparator)
  {
    nl = lineSeparator;
    CScope result = new CScope();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL;
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Collection<File> files = (Collection<File>) argument;
    stringBuffer.append(TEXT_1);
    for(File file: files) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(file.getName());
    }
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
