package com.brainspeedtech.gen.software.web.gwt;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.sm.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.software.*;
import org.eclipse.emf.ecore.util.*;
import com.brainspeedtech.constraint.web.gwt.*;
import org.eclipse.emf.ecore.*;;

public class PlaceFile
{
  protected static String nl;
  public static synchronized PlaceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    PlaceFile result = new PlaceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package com.brainspeedtech.swarm.designer.client;" + NL + "" + NL + "import com.google.gwt.place.shared.Place;" + NL + "" + NL + "public class MyPlace extends Place {" + NL + "" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
