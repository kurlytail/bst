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

public class ActivityFile
{
  protected static String nl;
  public static synchronized ActivityFile create(String lineSeparator)
  {
    nl = lineSeparator;
    ActivityFile result = new ActivityFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package com.brainspeedtech.swarm.designer.client;" + NL + "" + NL + "import com.google.gwt.activity.shared.AbstractActivity;" + NL + "import com.google.gwt.event.shared.EventBus;" + NL + "import com.google.gwt.user.client.ui.AcceptsOneWidget;" + NL + "" + NL + "public class MyActivity extends AbstractActivity {" + NL + "" + NL + "\t@Override" + NL + "\tpublic void start(AcceptsOneWidget panel, EventBus eventBus) {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
