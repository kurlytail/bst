package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.flow.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.layer.util.*;;

public class FifoTube
{
  protected static String nl;
  public static synchronized FifoTube create(String lineSeparator)
  {
    nl = lineSeparator;
    FifoTube result = new FifoTube();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
