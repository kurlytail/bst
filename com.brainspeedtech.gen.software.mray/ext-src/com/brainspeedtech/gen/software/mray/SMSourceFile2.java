package com.brainspeedtech.gen.software.mray;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.sm.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.software.*;
import java.util.*;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;;

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
  protected final String TEXT_1 = "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "// Copyright Mangstor LLC," + NL + "// All rights reserved." + NL + "" + NL + "#ifndef __";
  protected final String TEXT_2 = "_SM_C_H__" + NL + "#define __";
  protected final String TEXT_3 = "_SM_C_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_5 = "_sm.h\"" + NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = "static inline const char* ";
  protected final String TEXT_9 = "_state_str(ENUM_";
  protected final String TEXT_10 = "_STATE state)" + NL + "{" + NL + "\tstatic const char* state_str_array[] = {" + NL + "\t\t\"Uninitialized State\",";
  protected final String TEXT_11 = NL + "\t\t\"";
  protected final String TEXT_12 = "\",";
  protected final String TEXT_13 = NL + "\t};" + NL + "\tif (state > ENUM_";
  protected final String TEXT_14 = "_MAX_STATE) {" + NL + "\t\treturn \"Bad State\";" + NL + "\t}" + NL + "" + NL + "\treturn state_str_array[state];" + NL + "}" + NL + "" + NL + "" + NL + "static inline const char* ";
  protected final String TEXT_15 = "_transition_str(ENUM_";
  protected final String TEXT_16 = "_TRANSITION transition)" + NL + "{" + NL + "\tstatic const char* state_transition_array[] = {" + NL + "\t\t\"NULL_TRANSITION\",";
  protected final String TEXT_17 = NL + "\t\t\"";
  protected final String TEXT_18 = "\",";
  protected final String TEXT_19 = NL + "\t};" + NL + "\tif (transition > ENUM_";
  protected final String TEXT_20 = "_MAX_TRANSITION) {" + NL + "\t\treturn \"Bad Transition\";" + NL + "\t}" + NL + "\t" + NL + "\treturn state_transition_array[transition];" + NL + "}" + NL;
  protected final String TEXT_21 = NL + "// Compute the right transition for ";
  protected final String TEXT_22 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_23 = NL + "//\t\tENUM_";
  protected final String TEXT_24 = "_";
  protected final String TEXT_25 = "_TRANSITION";
  protected final String TEXT_26 = NL + "//\t\tENUM_";
  protected final String TEXT_27 = "_NULL_TRANSITION" + NL + "#define ";
  protected final String TEXT_28 = "_COMPUTE_";
  protected final String TEXT_29 = "_TRANSITION \\" + NL + "\t";
  protected final String TEXT_30 = "_compute_";
  protected final String TEXT_31 = "_transition()" + NL;
  protected final String TEXT_32 = NL + NL + "#ifdef DEBUG_";
  protected final String TEXT_33 = NL + "#define DEBUG_";
  protected final String TEXT_34 = "_PRINT_TRANSITION(__transition__, __state__) print_";
  protected final String TEXT_35 = "_transition(__transition__, __state__)" + NL + "#else" + NL + "#define DEBUG_";
  protected final String TEXT_36 = "_PRINT_TRANSITION(__transition__, __state__)" + NL + "#endif" + NL + "" + NL + "// Get/set the state variable" + NL + "#define GET_";
  protected final String TEXT_37 = "_STATE get_";
  protected final String TEXT_38 = "_state()" + NL + "#define SET_";
  protected final String TEXT_39 = "_STATE(__transition__, __state__) {\\" + NL + "\tif ((__transition__) != ENUM_";
  protected final String TEXT_40 = "_NULL_TRANSITION) {\\" + NL + "\t\tset_";
  protected final String TEXT_41 = "_state_wrapper(__transition__, __state__);\\" + NL + "\t}\\" + NL + "}" + NL + "#define GET_";
  protected final String TEXT_42 = "_RESOURCE get_";
  protected final String TEXT_43 = "_resource()" + NL + "" + NL + "" + NL + "static void  set_";
  protected final String TEXT_44 = "_state_wrapper(" + NL + "\tENUM_";
  protected final String TEXT_45 = "_TRANSITION transition," + NL + "\tENUM_";
  protected final String TEXT_46 = "_STATE state)" + NL + "{" + NL + "\tstatic volatile int ";
  protected final String TEXT_47 = "_log_pidx = 0;" + NL + "\tstatic volatile struct {" + NL + "\t\tint resource;" + NL + "\t\tint transition;" + NL + "\t\tint from_state;" + NL + "\t\tint to_state;" + NL + "\t} ";
  protected final String TEXT_48 = "_state_log[32] = { 0 };" + NL + "\t" + NL + "\t";
  protected final String TEXT_49 = "_state_log[";
  protected final String TEXT_50 = "_log_pidx].resource = get_";
  protected final String TEXT_51 = "_resource();" + NL + "\t";
  protected final String TEXT_52 = "_state_log[";
  protected final String TEXT_53 = "_log_pidx].transition = transition;" + NL + "\t";
  protected final String TEXT_54 = "_state_log[";
  protected final String TEXT_55 = "_log_pidx].from_state = get_";
  protected final String TEXT_56 = "_state();" + NL + "\t";
  protected final String TEXT_57 = "_state_log[";
  protected final String TEXT_58 = "_log_pidx].to_state = state;" + NL + "\t";
  protected final String TEXT_59 = "_log_pidx++;" + NL + "\t";
  protected final String TEXT_60 = "_log_pidx %= 32;" + NL + "\tset_";
  protected final String TEXT_61 = "_state(transition, state);\t" + NL + "}" + NL + "" + NL + "" + NL + "void print_";
  protected final String TEXT_62 = "_transition(ENUM_";
  protected final String TEXT_63 = "_TRANSITION transition, " + NL + "\tENUM_";
  protected final String TEXT_64 = "_STATE state)" + NL + "{" + NL + "\tENUM_";
  protected final String TEXT_65 = "_STATE current_state = GET_";
  protected final String TEXT_66 = "_STATE;" + NL + "\tint current_resource = GET_";
  protected final String TEXT_67 = "_RESOURCE;" + NL + "#if 0\t" + NL + "\tMPX_Print(\"STATE MACHINE ";
  protected final String TEXT_68 = " %F(%L:%T) \" , current_resource);" + NL + "\tMPX_Print(\"      From State \", current_state);" + NL + "\tMPX_Print(\"      Transition \", transition);" + NL + "\tMPX_Print(\"      To State   \", state);" + NL + "#endif" + NL + "}" + NL;
  protected final String TEXT_69 = NL + "void ";
  protected final String TEXT_70 = "_process_";
  protected final String TEXT_71 = "_state()" + NL + "{" + NL + "\tint transition;" + NL + "#ifdef DEBUG_";
  protected final String TEXT_72 = NL + "\tint current_resource = GET_";
  protected final String TEXT_73 = "_RESOURCE;" + NL + "#endif" + NL + "\t" + NL + "\ttransition = ";
  protected final String TEXT_74 = "_COMPUTE_";
  protected final String TEXT_75 = "_TRANSITION;" + NL + "\tswitch(transition) {";
  protected final String TEXT_76 = NL + "\tcase ENUM_";
  protected final String TEXT_77 = "_";
  protected final String TEXT_78 = "_TRANSITION:" + NL + "#if 0" + NL + "#ifdef DEBUG_";
  protected final String TEXT_79 = NL + "\t\tMPX_Print(\"STATE MACHINE ";
  protected final String TEXT_80 = " %F(%L:%T) \" , current_resource);" + NL + "\t\tMPX_Print(\"      From State ";
  protected final String TEXT_81 = "\");" + NL + "\t\tMPX_Print(\"      Transition ";
  protected final String TEXT_82 = "\");" + NL + "\t\tMPX_Print(\"      To State   ";
  protected final String TEXT_83 = "\");" + NL + "#endif" + NL + "#endif" + NL + "\t\tSET_";
  protected final String TEXT_84 = "_STATE(ENUM_";
  protected final String TEXT_85 = "_";
  protected final String TEXT_86 = "_TRANSITION, " + NL + "\t\t\tENUM_";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = NL + "\tcase ENUM_";
  protected final String TEXT_91 = "_NULL_TRANSITION:" + NL + "\t\tSET_";
  protected final String TEXT_92 = "_STATE(ENUM_";
  protected final String TEXT_93 = "_NULL_TRANSITION, " + NL + "\t\t\tENUM_";
  protected final String TEXT_94 = "_";
  protected final String TEXT_95 = "_STATE);" + NL + "\t\tbreak;" + NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad Transition %s in state %s\\n\", " + NL + "\t\t\t";
  protected final String TEXT_96 = "_transition_str(transition)," + NL + "\t\t\t";
  protected final String TEXT_97 = "_state_str(GET_";
  protected final String TEXT_98 = "_STATE));" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;";
  protected final String TEXT_99 = NL + "\t}" + NL + "}";
  protected final String TEXT_100 = NL;
  protected final String TEXT_101 = NL + "void ";
  protected final String TEXT_102 = "_sm()" + NL + "{" + NL + "\tint current_state;" + NL + "\t" + NL + "\tcurrent_state = GET_";
  protected final String TEXT_103 = "_STATE;" + NL + "\tswitch(current_state) {";
  protected final String TEXT_104 = NL + "\tcase ENUM_";
  protected final String TEXT_105 = "_";
  protected final String TEXT_106 = "_STATE:" + NL + "\t\t";
  protected final String TEXT_107 = "_process_";
  protected final String TEXT_108 = "_state();" + NL + "\t\tbreak;";
  protected final String TEXT_109 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad state %d for resource %d\\n\"," + NL + "\t\t\tcurrent_state, GET_";
  protected final String TEXT_110 = "_RESOURCE);" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_111 = NL;
  protected final String TEXT_112 = NL + "void ";
  protected final String TEXT_113 = "_";
  protected final String TEXT_114 = "_sm()" + NL + "{" + NL + "\tint current_state;" + NL + "\t" + NL + "\tcurrent_state = GET_";
  protected final String TEXT_115 = "_STATE;" + NL + "\tswitch(current_state) {";
  protected final String TEXT_116 = NL + "\tcase ENUM_";
  protected final String TEXT_117 = "_";
  protected final String TEXT_118 = "_STATE:" + NL + "\t\t";
  protected final String TEXT_119 = "_process_";
  protected final String TEXT_120 = "_state();" + NL + "\t\tbreak;";
  protected final String TEXT_121 = NL + "\t}" + NL + "}";
  protected final String TEXT_122 = NL + NL;
  protected final String TEXT_123 = NL + "void ";
  protected final String TEXT_124 = "_process_";
  protected final String TEXT_125 = "_transition()" + NL + "{" + NL + "\tint state;" + NL + "#ifdef DEBUG_";
  protected final String TEXT_126 = NL + "\tint current_resource = GET_";
  protected final String TEXT_127 = "_RESOURCE;" + NL + "#endif" + NL + "\t" + NL + "\tstate = GET_";
  protected final String TEXT_128 = "_STATE;" + NL + "\tswitch(state) {";
  protected final String TEXT_129 = NL + "\tcase ENUM_";
  protected final String TEXT_130 = "_";
  protected final String TEXT_131 = "_STATE:" + NL + "#if 0" + NL + "#ifdef DEBUG_";
  protected final String TEXT_132 = NL + "\t\tMPX_Print(\"STATE MACHINE ";
  protected final String TEXT_133 = " %F(%L:%T) \" , current_resource);" + NL + "\t\tMPX_Print(\"      From State ";
  protected final String TEXT_134 = "\");" + NL + "\t\tMPX_Print(\"      Transition ";
  protected final String TEXT_135 = "\");" + NL + "\t\tMPX_Print(\"      To State   ";
  protected final String TEXT_136 = "\");" + NL + "#endif\t" + NL + "#endif" + NL + "\t\tSET_";
  protected final String TEXT_137 = "_STATE(" + NL + "\t\t\tENUM_";
  protected final String TEXT_138 = "_";
  protected final String TEXT_139 = "_TRANSITION," + NL + "\t\t\tENUM_";
  protected final String TEXT_140 = "_";
  protected final String TEXT_141 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_142 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad State %s for transition %s\\n\", " + NL + "\t\t\t";
  protected final String TEXT_143 = "_state_str(state)," + NL + "\t\t\t\"";
  protected final String TEXT_144 = "\");" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_145 = NL;
  protected final String TEXT_146 = NL + "void ";
  protected final String TEXT_147 = "_";
  protected final String TEXT_148 = "_process_";
  protected final String TEXT_149 = "_transition()" + NL + "{" + NL + "\tint state;" + NL + "\t" + NL + "#ifdef DEBUG_";
  protected final String TEXT_150 = NL + "\tint current_resource = GET_";
  protected final String TEXT_151 = "_RESOURCE;" + NL + "#endif" + NL + "" + NL + "\tstate = GET_";
  protected final String TEXT_152 = "_STATE;" + NL + "\tswitch(state) {";
  protected final String TEXT_153 = NL + "\tcase ENUM_";
  protected final String TEXT_154 = "_";
  protected final String TEXT_155 = "_STATE:" + NL + "#if 0" + NL + "#ifdef DEBUG_";
  protected final String TEXT_156 = NL + "\t\tMPX_Print(\"STATE MACHINE ";
  protected final String TEXT_157 = " %F(%L:%T) \" , current_resource);" + NL + "\t\tMPX_Print(\"      From State ";
  protected final String TEXT_158 = "\");" + NL + "\t\tMPX_Print(\"      Transition ";
  protected final String TEXT_159 = "\");" + NL + "\t\tMPX_Print(\"      To State   ";
  protected final String TEXT_160 = "\");" + NL + "#endif" + NL + "#endif" + NL + "\t\tSET_";
  protected final String TEXT_161 = "_STATE(" + NL + "\t\t\tENUM_";
  protected final String TEXT_162 = "_";
  protected final String TEXT_163 = "_TRANSITION," + NL + "\t\t\tENUM_";
  protected final String TEXT_164 = "_";
  protected final String TEXT_165 = "_STATE);" + NL + "\t\tbreak;";
  protected final String TEXT_166 = NL + "\tdefault:" + NL + "\t\tSWARM_PRINT2(\" => Bad State %s for transition %s\\n\", " + NL + "\t\t\t";
  protected final String TEXT_167 = "_state_str(state)," + NL + "\t\t\t\"";
  protected final String TEXT_168 = "\");" + NL + "\t\tSWARM_FATAL_ERROR;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_169 = NL + "#endif" + NL + NL;
  protected final String TEXT_170 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    StateMachine instance = (StateMachine) argument;
    TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(instance);
 	String designName = domain.getID();
 	Collection<StateGroup> groups = ProjectUtil.getReferringInstances(instance.getState(), StateGroup.class);
 	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(designName);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    
	Set<String> transitions = new HashSet<String>();
	for (Transition transition : instance.getTransition()) {
		transitions.add(transition.getName());
	}

    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_10);
    
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_12);
     }
    stringBuffer.append(TEXT_13);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    	for (String transition : transitions) { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_18);
     }
    stringBuffer.append(TEXT_19);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    
for(State state: instance.getState()) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_22);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_23);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
     }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_68);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_74);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_75);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_76);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(transition.getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(transition.getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_88);
     }
    stringBuffer.append(TEXT_89);
    
	boolean ignoreInvalidTransitions = false;
	if (ProjectUtil.getReferringInstance(instance, IgnoreInvalidTransitions.class) != null)
		ignoreInvalidTransitions = true;
	if (ProjectUtil.getReferringInstance(state, IgnoreInvalidTransitions.class) != null)
		ignoreInvalidTransitions = true;
		
	if (!ignoreInvalidTransitions) {

    stringBuffer.append(TEXT_90);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_98);
    
	}

    stringBuffer.append(TEXT_99);
    }
    stringBuffer.append(TEXT_100);
    if(groups.isEmpty()) { 
    stringBuffer.append(TEXT_101);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_103);
    for(State state: instance.getState()) {
    stringBuffer.append(TEXT_104);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_110);
    }
    stringBuffer.append(TEXT_111);
    
for(StateGroup group: groups) {
    stringBuffer.append(TEXT_112);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(group.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_115);
    for(State state: group.getState()) {
	if(state.eContainer() == instance) {
    stringBuffer.append(TEXT_116);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_120);
    	}
}
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    for(String transition: transitions) {
	Map<State, Transition> states = new HashMap<State, Transition>();
	for (Transition trans : instance.getTransition()) {
		if(trans.getName().equals(transition)) {
			states.put(trans.getFrom(), trans);
		}
	}

    stringBuffer.append(TEXT_123);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_128);
     for(State state : states.keySet()) { 
    stringBuffer.append(TEXT_129);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_141);
     }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_144);
    }
    stringBuffer.append(TEXT_145);
    
for(StateGroup group: groups) {
	for(String transition: transitions) {
	Map<State, Transition> states = new HashMap<State, Transition>();
	for (Transition trans : instance.getTransition()) {
		if(trans.getName().equals(transition) &&
			group.getState().contains(trans.getFrom())) {
			states.put(trans.getFrom(), trans);
		}
	}

    stringBuffer.append(TEXT_146);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(group.getName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_149);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_152);
     for(State state : states.keySet()) { 
    stringBuffer.append(TEXT_153);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(state.getName().toUpperCase());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_159);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(transition.toUpperCase());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(states.get(state).getTo().getName().toUpperCase());
    stringBuffer.append(TEXT_165);
     }
    stringBuffer.append(TEXT_166);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(transition);
    stringBuffer.append(TEXT_168);
    }
    }
    stringBuffer.append(TEXT_169);
    stringBuffer.append(TEXT_170);
    return stringBuffer.toString();
  }
}
