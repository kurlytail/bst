package com.brainspeedtech.gen.software.mray;

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
  protected final String TEXT_1 = "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "// Copyright Mangstor LLC," + NL + "// All rights reserved." + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_SM_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_SM_H__" + NL + "" + NL + "#ifdef DEBUG_";
  protected final String TEXT_4 = NL + "#define DEBUG_";
  protected final String TEXT_5 = "_PRINT1(__str__, __arg__) MPX_Print(__str__, __arg__)" + NL + "#define DEBUG_";
  protected final String TEXT_6 = "_PRINT0(__str__) MPX_Print(__str__)" + NL + "#else" + NL + "#define DEBUG_";
  protected final String TEXT_7 = "_PRINT1(__str__, __arg__)" + NL + "#define DEBUG_";
  protected final String TEXT_8 = "_PRINT0(__str__)" + NL + "#endif" + NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = "typedef enum _ENUM_";
  protected final String TEXT_11 = "_STATE {" + NL + "\tENUM_";
  protected final String TEXT_12 = "_UNINITIALIZED_STATE = 0,";
  protected final String TEXT_13 = NL + "\tENUM_";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = "_STATE = ";
  protected final String TEXT_16 = ",";
  protected final String TEXT_17 = NL + "\tENUM_";
  protected final String TEXT_18 = "_MAX_STATE = ";
  protected final String TEXT_19 = NL + "} ENUM_";
  protected final String TEXT_20 = "_STATE;" + NL;
  protected final String TEXT_21 = NL + NL + "typedef enum _ENUM_";
  protected final String TEXT_22 = "_TRANSITION {" + NL + "\tENUM_";
  protected final String TEXT_23 = "_NULL_TRANSITION = 0,";
  protected final String TEXT_24 = NL + "\tENUM_";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = "_TRANSITION = ";
  protected final String TEXT_27 = ",";
  protected final String TEXT_28 = NL + "\tENUM_";
  protected final String TEXT_29 = "_MAX_TRANSITION = ";
  protected final String TEXT_30 = NL + "} ENUM_";
  protected final String TEXT_31 = "_TRANSITION;" + NL + "" + NL + "#if 0";
  protected final String TEXT_32 = NL + "// Compute the right transition for ";
  protected final String TEXT_33 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_34 = NL + "//\t\tENUM_";
  protected final String TEXT_35 = "_";
  protected final String TEXT_36 = "_TRANSITION";
  protected final String TEXT_37 = NL + "//\t\tENUM_";
  protected final String TEXT_38 = "_NULL_TRANSITION" + NL + "static inline ENUM_";
  protected final String TEXT_39 = "_TRANSITION ";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = "_compute_";
  protected final String TEXT_42 = "_transition()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn ENUM_";
  protected final String TEXT_43 = "_NULL_TRANSITION;" + NL + "}";
  protected final String TEXT_44 = NL + NL + "// Get/set the state variable" + NL + "static inline ENUM_";
  protected final String TEXT_45 = "_STATE " + NL + "get_";
  protected final String TEXT_46 = "_state()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "static inline void\tset_";
  protected final String TEXT_47 = "_state(" + NL + "\tENUM_";
  protected final String TEXT_48 = "_TRANSITION transition," + NL + "\tENUM_";
  protected final String TEXT_49 = "_STATE state)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "}" + NL + "" + NL + "static inline int get_";
  protected final String TEXT_50 = "_resource()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "#endif" + NL + "#endif" + NL + NL;
  protected final String TEXT_51 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    StateMachine smReference = (StateMachine) argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_12);
    
int stateCount = 0;
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(stateCount+1);
    stringBuffer.append(TEXT_16);
    
	++stateCount;
}
    stringBuffer.append(TEXT_17);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(stateCount);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    
	Set<String> transitions = new HashSet<String>();
	for (Transition transition : smReference.getTransition()) {
		transitions.add(transition.getName());
	}

    stringBuffer.append(TEXT_21);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_23);
    
int enumCount = 0;
for(String transition: transitions) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(enumCount+1);
    stringBuffer.append(TEXT_27);
    
	++enumCount;
}
    stringBuffer.append(TEXT_28);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(enumCount);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_31);
    
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_33);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_34);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_36);
     }
    stringBuffer.append(TEXT_37);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(TEXT_51);
    return stringBuffer.toString();
  }
}
