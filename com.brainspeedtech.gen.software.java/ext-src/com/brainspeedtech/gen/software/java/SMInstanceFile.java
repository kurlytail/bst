package com.brainspeedtech.gen.software.java;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.java.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;
import com.brainspeedtech.swarm.sm.*;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.*;;

public class SMInstanceFile
{
  protected static String nl;
  public static synchronized SMInstanceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SMInstanceFile result = new SMInstanceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ";" + NL + "" + NL + "import java.lang.Exception;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_4 = " {" + NL + "" + NL + "\tpublic enum STATE {";
  protected final String TEXT_5 = NL + "\t\t";
  protected final String TEXT_6 = ",";
  protected final String TEXT_7 = NL + "\t\tMAX_STATE" + NL + "\t}" + NL;
  protected final String TEXT_8 = NL + NL + "\tpublic enum TRANSITION {" + NL + "\t\tNULL,";
  protected final String TEXT_9 = NL + "\t\tMAX_TRANSITION" + NL + "\t}" + NL + "\t" + NL + "\tpublic abstract STATE getState();";
  protected final String TEXT_10 = NL + "// Compute the right transition for ";
  protected final String TEXT_11 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_12 = NL + "//\t\t";
  protected final String TEXT_13 = NL + "//\t\tNULL" + NL + "\tprotected abstract TRANSITION compute_";
  protected final String TEXT_14 = "_transition();";
  protected final String TEXT_15 = NL + "\tpublic abstract STATE" + NL + "\t\tsetState(" + NL + "\t\t\tTRANSITION transition," + NL + "\t\t\tSTATE state" + NL + "\t\t\t);";
  protected final String TEXT_16 = NL + "\tprotected void process_";
  protected final String TEXT_17 = "_state() throws Exception" + NL + "\t{" + NL + "\t\tTRANSITION transition;" + NL + "\t" + NL + "\t\ttransition = compute_";
  protected final String TEXT_18 = "_transition();" + NL + "\t\tswitch(transition) {";
  protected final String TEXT_19 = NL + "\t\tcase ";
  protected final String TEXT_20 = ":" + NL + "\t\t\tsetState(TRANSITION.";
  protected final String TEXT_21 = ", " + NL + "\t\t\t\tSTATE.";
  protected final String TEXT_22 = ");" + NL + "\t\tbreak;";
  protected final String TEXT_23 = NL + "\t\tcase NULL:" + NL + "\t\t\tsetState(TRANSITION.NULL, STATE.";
  protected final String TEXT_24 = ");" + NL + "\t\t\tbreak;" + NL + "\t\tdefault:" + NL + "\t\t\tthrow(new Exception(\"Unexpected transition\\n\"));" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_25 = NL + "\tpublic void sm() throws Exception" + NL + "\t{" + NL + "\t\tSTATE current_state;" + NL + "\t" + NL + "\t\tcurrent_state = getState();" + NL + "\t\tswitch(current_state) {";
  protected final String TEXT_26 = ":" + NL + "\t\t\tprocess_";
  protected final String TEXT_27 = "_state();" + NL + "\t\t\tbreak;";
  protected final String TEXT_28 = NL + "\t\tdefault:" + NL + "\t\t\tthrow(new Exception(\"Unexpected transition\\n\"));" + NL + "\t\t}" + NL + "\t}" + NL + "}" + NL + NL + NL + NL;
  protected final String TEXT_29 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Resource resource = (Resource)argument;
StateMachine instance = (StateMachine) EcoreUtil.getObjectByType(
		resource.getContents(), SmPackage.eINSTANCE.getStateMachine());
Collection<StateGroup> groups = ProjectUtil.getReferringInstances(instance.getState(), StateGroup.class);
		
String className = instance.eResource().getURI().lastSegment().replaceAll("\\.sm$", "");
String packageName;
JavaPackage javaPackage = ProjectUtil.getReferringInstance(instance,JavaPackage.class);

if (javaPackage != null) {
	packageName = javaPackage.getName();
} else {
    packageName = TransactionUtil.getEditingDomain(resource).getID() + ".gen.struct";
}

    stringBuffer.append(TEXT_2);
    stringBuffer.append(packageName);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_4);
    
int stateCount = 0;
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    
	++stateCount;
}
    stringBuffer.append(TEXT_7);
    
	Set<String> transitions = new HashSet<String>();
	for (Transition transition : instance.getTransition()) {
		transitions.add(transition.getName().toUpperCase());
	}

    stringBuffer.append(TEXT_8);
    
int enumCount = 1;
for(String transition: transitions) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_6);
    
	++enumCount;
}
    stringBuffer.append(TEXT_9);
    
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_11);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(transition.getName().toUpperCase());
     }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_18);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(transition.getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_22);
     }
    stringBuffer.append(TEXT_23);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append(TEXT_29);
    return stringBuffer.toString();
  }
}
