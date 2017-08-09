package com.brainspeedtech.gen.software.python;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.python.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;;

public class SwarmStructBaseFile
{
  protected static String nl;
  public static synchronized SwarmStructBaseFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SwarmStructBaseFile result = new SwarmStructBaseFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "class swarm_struct_base:" + NL + "    def encode_binary(self):" + NL + "        return self.unpack()" + NL + "" + NL + "    def decode_binary(self):" + NL + "        return self.pack()";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
