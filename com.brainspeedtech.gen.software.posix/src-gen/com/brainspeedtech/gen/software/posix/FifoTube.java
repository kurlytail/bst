/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.posix;

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
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    return stringBuffer.toString();
  }
}
