package com.brainspeedtech.gen.software.posix;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.sm.*;
import com.brainspeedtech.swarm.project.util.*;
import java.util.*;
import com.brainspeedtech.constraint.software.*;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class SMSourceFile2
{
  protected static String nl;
  public static synchronized SMSourceFile2 create(String lineSeparator)
  {
    nl = lineSeparator;
    SMSourceFile2 result = new SMSourceFile2();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#ifndef __";
  protected final String TEXT_4 = "_SM_C_H__" + NL + "#define __";
  protected final String TEXT_5 = "_SM_C_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_6 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_7 = "_swarm_lib.h\"" + NL + "#include \"gen_";
  protected final String TEXT_8 = "_sm.h\"" + NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = "static inline const char* ";
  protected final String TEXT_12 = "_state_str(ENUM_";
  protected final String TEXT_13 = "_STATE state)" + NL + "{" + NL + "\tstatic const char* state_str_array[] = {" + NL + "\t\t\"Uninitialized State\",";
  protected final String TEXT_14 = NL + "\t\t\"";
  protected final String TEXT_15 = "\",";
  protected final String TEXT_16 = NL + "\t};" + NL + "\tif (state > ENUM_";
  protected final String TEXT_17 = "_MAX_STATE) {" + NL + "\t\treturn \"Bad State\";" + NL + "\t}" + NL + "" + NL + "\treturn state_str_array[state];" + NL + "}" + NL + "" + NL + "" + NL + "static inline const char* ";
  protected final String TEXT_18 = "_transition_str(ENUM_";
  protected final String TEXT_19 = "_TRANSITION transition)" + NL + "{" + NL + "\tstatic const char* state_transition_array[] = {" + NL + "\t\t\"NULL_TRANSITION\",";
  protected final String TEXT_20 = NL + "\t\t\"";
  protected final String TEXT_21 = "\",";
  protected final String TEXT_22 = NL + "\t};" + NL + "\tif (transition > ENUM_";
  protected final String TEXT_23 = "_MAX_TRANSITION) {" + NL + "\t\treturn \"Bad Transition\";" + NL + "\t}" + NL + "\t" + NL + "\treturn state_transition_array[transition];" + NL + "}" + NL;
  protected final String TEXT_24 = NL + "// Compute the right transition for ";
  protected final String TEXT_25 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_26 = NL + "//\t\tENUM_";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "_TRANSITION";
  protected final String TEXT_29 = NL + "//\t\tENUM_";
  protected final String TEXT_30 = "_NULL_TRANSITION" + NL + "#define ";
  protected final String TEXT_31 = "_COMPUTE_";
  protected final String TEXT_32 = "_TRANSITION \\" + NL + "\t";
  protected final String TEXT_33 = "_compute_";
  protected final String TEXT_34 = "_transition()" + NL;
  protected final String TEXT_35 = NL + NL + "// Get/set the state variable" + NL + "#define GET_";
  protected final String TEXT_36 = "_STATE get_";
  protected final String TEXT_37 = "_state()" + NL + "#define SET_";
  protected final String TEXT_38 = "_STATE(__transition__, __state__) {\\" + NL + "\tif ((__transition__) != ENUM_";
  protected final String TEXT_39 = "_NULL_TRANSITION) {\\" + NL + "\t\tSWARM_PRINT4(\"STATE MACHINE ";
  protected final String TEXT_40 = " %s(%d) => %s => %s\\n\",";
  protected final String TEXT_41 = "_state_str(GET_";
  protected final String TEXT_42 = "_STATE),\\" + NL + "\t\t\tGET_";
  protected final String TEXT_43 = "_RESOURCE, \\" + NL + "\t\t\t";
  protected final String TEXT_44 = "_transition_str(__transition__),\\" + NL + "\t\t\t";
  protected final String TEXT_45 = "_state_str(__state__)); \\" + NL + "\t\tset_";
  protected final String TEXT_46 = "_state(__transition__, __state__);\\" + NL + "\t}\\" + NL + "}" + NL + "#define GET_";
  protected final String TEXT_47 = "_RESOURCE get_";
  protected final String TEXT_48 = "_resource()" + NL;
  protected final String TEXT_49 = NL + "void ";
  protected final String TEXT_50 = "_process_";
  protected final String TEXT_51 = "_state()" + NL + "{" + NL + "\tint transition;" + NL + "\t" + NL + "\tif(GET_";
  protected final String TEXT_52 = "_STATE !=" + NL + "\t\tENUM_";
  protected final String TEXT_53 = "_";
  protected final String TEXT_54 = "_STATE) {" + NL + "\t\tSWARM_PRINT2(\"";
  protected final String TEXT_55 = "_sm(%d): Invalid State %s expected ";
  protected final String TEXT_56 = "\\n\"," + NL + "\t\t\tGET_";
  protected final String TEXT_57 = "_RESOURCE," + NL + "\t\t\t";
  protected final String TEXT_58 = "_state_str(GET_";
  protected final String TEXT_59 = "_STATE));" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t}" + NL + "\t" + NL + "\ttransition = ";
  protected final String TEXT_60 = "_COMPUTE_";
  protected final String TEXT_61 = "_TRANSITION;" + NL + "\tswitch(transition) {";
  protected final String TEXT_62 = NL + "\tcase ENUM_";
  protected final String TEXT_63 = "_";
  protected final String TEXT_64 = "_TRANSITION:" + NL + "\t\tSET_";
  protected final String TEXT_65 = "_STATE(transition, " + NL + "\t\t\tENUM_";
  protected final String TEXT_66 = "_";
  protected final String TEXT_67 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_68 = NL + "\tcase ENUM_";
  protected final String TEXT_69 = "_NULL_TRANSITION:" + NL + "\t\tSET_";
  protected final String TEXT_70 = "_STATE(transition, " + NL + "\t\t\tENUM_";
  protected final String TEXT_71 = "_";
  protected final String TEXT_72 = "_STATE);" + NL + "\t\tbreak;" + NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad Transition %s in state %s\\n\", " + NL + "\t\t\t";
  protected final String TEXT_73 = "_transition_str(transition)," + NL + "\t\t\t";
  protected final String TEXT_74 = "_state_str(GET_";
  protected final String TEXT_75 = "_STATE));" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_76 = NL + NL + "void ";
  protected final String TEXT_77 = "_sm()" + NL + "{" + NL + "\tint current_state;" + NL + "\t" + NL + "\tcurrent_state = GET_";
  protected final String TEXT_78 = "_STATE;" + NL + "\tswitch(current_state) {";
  protected final String TEXT_79 = NL + "\tcase ENUM_";
  protected final String TEXT_80 = "_";
  protected final String TEXT_81 = "_STATE:" + NL + "\t\t";
  protected final String TEXT_82 = "_process_";
  protected final String TEXT_83 = "_state();" + NL + "\t\tbreak;";
  protected final String TEXT_84 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad state %d for resource %d\\n\"," + NL + "\t\t\tcurrent_state, GET_";
  protected final String TEXT_85 = "_RESOURCE);" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}" + NL + NL;
  protected final String TEXT_86 = NL + "void ";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = "_sm()" + NL + "{" + NL + "\tint current_state;" + NL + "\t" + NL + "\tcurrent_state = GET_";
  protected final String TEXT_89 = "_STATE;" + NL + "\tswitch(current_state) {";
  protected final String TEXT_90 = NL + "\tcase ENUM_";
  protected final String TEXT_91 = "_";
  protected final String TEXT_92 = "_STATE:" + NL + "\t\t";
  protected final String TEXT_93 = "_process_";
  protected final String TEXT_94 = "_state();" + NL + "\t\tbreak;";
  protected final String TEXT_95 = NL + "\t}" + NL + "}";
  protected final String TEXT_96 = NL + NL;
  protected final String TEXT_97 = NL + "void ";
  protected final String TEXT_98 = "_process_";
  protected final String TEXT_99 = "_transition()" + NL + "{" + NL + "\tint state;" + NL + "\t" + NL + "\tstate = GET_";
  protected final String TEXT_100 = "_STATE;" + NL + "\tswitch(state) {";
  protected final String TEXT_101 = NL + "\tcase ENUM_";
  protected final String TEXT_102 = "_";
  protected final String TEXT_103 = "_STATE:" + NL + "\t\tSET_";
  protected final String TEXT_104 = "_STATE(" + NL + "\t\t\tENUM_";
  protected final String TEXT_105 = "_";
  protected final String TEXT_106 = "_TRANSITION," + NL + "\t\t\tENUM_";
  protected final String TEXT_107 = "_";
  protected final String TEXT_108 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_109 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT3(\"STATE MACHINE ";
  protected final String TEXT_110 = " %s(%d) => Bad State %s for transition ";
  protected final String TEXT_111 = "\\n\", " + NL + "\t\t\t";
  protected final String TEXT_112 = "_state_str(GET_";
  protected final String TEXT_113 = "_STATE)," + NL + "\t\t\tGET_";
  protected final String TEXT_114 = "_RESOURCE, ";
  protected final String TEXT_115 = "_state_str(state));" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_116 = NL;
  protected final String TEXT_117 = NL + "void ";
  protected final String TEXT_118 = "_";
  protected final String TEXT_119 = "_process_";
  protected final String TEXT_120 = "_transition()" + NL + "{" + NL + "\tint state;" + NL + "\t" + NL + "\tstate = GET_";
  protected final String TEXT_121 = "_STATE;" + NL + "\tswitch(state) {";
  protected final String TEXT_122 = NL + "\tcase ENUM_";
  protected final String TEXT_123 = "_";
  protected final String TEXT_124 = "_STATE:" + NL + "\t\tSET_";
  protected final String TEXT_125 = "_STATE(" + NL + "\t\t\tENUM_";
  protected final String TEXT_126 = "_";
  protected final String TEXT_127 = "_TRANSITION," + NL + "\t\t\tENUM_";
  protected final String TEXT_128 = "_";
  protected final String TEXT_129 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_130 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT3(\"STATE MACHINE ";
  protected final String TEXT_131 = " %s(%d) => Bad State %s for transition ";
  protected final String TEXT_132 = "\\n\", " + NL + "\t\t\t";
  protected final String TEXT_133 = "_state_str(GET_";
  protected final String TEXT_134 = "_STATE)," + NL + "\t\t\tGET_";
  protected final String TEXT_135 = "_RESOURCE, ";
  protected final String TEXT_136 = "_state_str(state));" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_137 = NL + NL + "#endif" + NL;
  protected final String TEXT_138 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    StateMachine instance = (StateMachine) argument;
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(instance);
 	String designName = domain.getID();

    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(designName);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(designName);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_8);
    
	Set<String> transitions = new HashSet<String>();
	for (Transition transition : instance.getTransition()) {
		transitions.add(transition.getName());
	}

    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_13);
    
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_15);
     }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_19);
    	for (String transition : transitions) { 
    stringBuffer.append(TEXT_20);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_21);
     }
    stringBuffer.append(TEXT_22);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_23);
    
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_25);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
     }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_48);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_61);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_62);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(transition.getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_67);
     }
    stringBuffer.append(TEXT_68);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_75);
    }
    stringBuffer.append(TEXT_76);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_78);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_79);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_83);
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_85);
    
Collection<StateGroup> groups = ProjectUtil.getReferringInstances(instance.getState(), StateGroup.class);
for(StateGroup group: groups) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(group.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_89);
    for(State state: group.getState()) {
	if(state.eContainer() == instance) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_94);
    	}
}
    stringBuffer.append(TEXT_95);
    }
    stringBuffer.append(TEXT_96);
    for(String transition: transitions) {
	Map<State, Transition> states = new HashMap<State, Transition>();
	for (Transition trans : instance.getTransition()) {
		if(trans.getName().equals(transition)) {
			states.put(trans.getFrom(), trans);
		}
	}

    stringBuffer.append(TEXT_97);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_100);
     for(State state : states.keySet()) { 
    stringBuffer.append(TEXT_101);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_108);
     }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_115);
    }
    stringBuffer.append(TEXT_116);
    
for(StateGroup group: groups) {
	for(String transition: transitions) {
	Map<State, Transition> states = new HashMap<State, Transition>();
	for (Transition trans : instance.getTransition()) {
		if(trans.getName().equals(transition) &&
			group.getState().contains(trans.getFrom())) {
			states.put(trans.getFrom(), trans);
		}
	}

    stringBuffer.append(TEXT_117);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(group.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_120);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_121);
     for(State state : states.keySet()) { 
    stringBuffer.append(TEXT_122);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_129);
     }
    stringBuffer.append(TEXT_130);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_136);
    }
    }
    stringBuffer.append(TEXT_137);
    stringBuffer.append(TEXT_138);
    return stringBuffer.toString();
  }
}
