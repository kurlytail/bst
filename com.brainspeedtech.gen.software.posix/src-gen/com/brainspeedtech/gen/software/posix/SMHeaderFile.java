package com.brainspeedtech.gen.software.posix;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.sm.*;
import com.brainspeedtech.swarm.project.util.*;
import java.util.*;;

public class SMHeaderFile
{
  protected static String nl;
  public static synchronized SMHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SMHeaderFile result = new SMHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_4 = "_SM_H__" + NL + "#define __GEN__";
  protected final String TEXT_5 = "_SM_H__" + NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = "typedef enum _ENUM_";
  protected final String TEXT_8 = "_STATE {" + NL + "\tENUM_";
  protected final String TEXT_9 = "_UNINITIALIZED_STATE = 0,";
  protected final String TEXT_10 = NL + "\tENUM_";
  protected final String TEXT_11 = "_";
  protected final String TEXT_12 = "_STATE = ";
  protected final String TEXT_13 = ",";
  protected final String TEXT_14 = NL + "\tENUM_";
  protected final String TEXT_15 = "_MAX_STATE = ";
  protected final String TEXT_16 = NL + "} ENUM_";
  protected final String TEXT_17 = "_STATE;" + NL;
  protected final String TEXT_18 = NL + NL + "typedef enum _ENUM_";
  protected final String TEXT_19 = "_TRANSITION {" + NL + "\tENUM_";
  protected final String TEXT_20 = "_NULL_TRANSITION = 0,";
  protected final String TEXT_21 = NL + "\tENUM_";
  protected final String TEXT_22 = "_";
  protected final String TEXT_23 = "_TRANSITION = ";
  protected final String TEXT_24 = ",";
  protected final String TEXT_25 = NL + "\tENUM_";
  protected final String TEXT_26 = "_MAX_TRANSITION = ";
  protected final String TEXT_27 = NL + "} ENUM_";
  protected final String TEXT_28 = "_TRANSITION;" + NL + "" + NL + "#if 0";
  protected final String TEXT_29 = NL + "// Compute the right transition for ";
  protected final String TEXT_30 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_31 = NL + "//\t\tENUM_";
  protected final String TEXT_32 = "_";
  protected final String TEXT_33 = "_TRANSITION";
  protected final String TEXT_34 = NL + "//\t\tENUM_";
  protected final String TEXT_35 = "_NULL_TRANSITION" + NL + "static inline ENUM_";
  protected final String TEXT_36 = "_TRANSITION ";
  protected final String TEXT_37 = NL;
  protected final String TEXT_38 = "_compute_";
  protected final String TEXT_39 = "_transition()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn ENUM_";
  protected final String TEXT_40 = "_NULL_TRANSITION;" + NL + "}";
  protected final String TEXT_41 = NL + NL + "// Get/set the state variable" + NL + "static inline ENUM_";
  protected final String TEXT_42 = "_STATE " + NL + "get_";
  protected final String TEXT_43 = "_state()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "static inline void\tset_";
  protected final String TEXT_44 = "_state(" + NL + "\tENUM_";
  protected final String TEXT_45 = "_TRANSITION transition," + NL + "\tENUM_";
  protected final String TEXT_46 = "_STATE state)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "}" + NL + "" + NL + "static inline int get_";
  protected final String TEXT_47 = "_resource()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "#endif" + NL + "#endif" + NL;
  protected final String TEXT_48 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    StateMachine smReference = (StateMachine) argument;
    stringBuffer.append(TEXT_3);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_9);
    
int stateCount = 0;
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(stateCount+1);
    stringBuffer.append(TEXT_13);
    
	++stateCount;
}
    stringBuffer.append(TEXT_14);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(stateCount);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_17);
    
	Set<String> transitions = new HashSet<String>();
	for (Transition transition : smReference.getTransition()) {
		transitions.add(transition.getName());
	}

    stringBuffer.append(TEXT_18);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    
int enumCount = 0;
for(String transition: transitions) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(enumCount+1);
    stringBuffer.append(TEXT_24);
    
	++enumCount;
}
    stringBuffer.append(TEXT_25);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(enumCount);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
    
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_30);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_31);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_33);
     }
    stringBuffer.append(TEXT_34);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    return stringBuffer.toString();
  }
}
