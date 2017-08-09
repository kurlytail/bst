package com.brainspeedtech.gen.software.mray;

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
import com.brainspeedtech.constraint.hardware.hx.*;
import com.brainspeedtech.constraint.software.hx.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.*;;

public class InstancePlanSourceFile
{
  protected static String nl;
  public static synchronized InstancePlanSourceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    InstancePlanSourceFile result = new InstancePlanSourceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_2 = ".h\"" + NL + NL;
  protected final String TEXT_3 = NL + "#include \"gen_";
  protected final String TEXT_4 = "_sm.h\"";
  protected final String TEXT_5 = NL + "// Compute the right transition for ";
  protected final String TEXT_6 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_7 = NL + "//\t\tENUM_";
  protected final String TEXT_8 = "_";
  protected final String TEXT_9 = "_TRANSITION";
  protected final String TEXT_10 = NL + "//\t\tENUM_";
  protected final String TEXT_11 = "_NULL_TRANSITION" + NL + "static inline ENUM_";
  protected final String TEXT_12 = "_TRANSITION ";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = "_compute_";
  protected final String TEXT_15 = "_transition()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn ENUM_";
  protected final String TEXT_16 = "_NULL_TRANSITION;" + NL + "}";
  protected final String TEXT_17 = NL + NL + "// Get/set the state variable" + NL + "static inline ENUM_";
  protected final String TEXT_18 = "_STATE " + NL + "get_";
  protected final String TEXT_19 = "_state()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "static inline void\tset_";
  protected final String TEXT_20 = "_state(" + NL + "\tENUM_";
  protected final String TEXT_21 = "_TRANSITION transition," + NL + "\tENUM_";
  protected final String TEXT_22 = "_STATE state)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "}" + NL + "" + NL + "static inline int get_";
  protected final String TEXT_23 = "_resource()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "#include \"gen_";
  protected final String TEXT_24 = "_sm.c\"";
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = NL + "void ";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "_mem_init() " + NL + "{" + NL + "\tmemset(&shared_";
  protected final String TEXT_29 = ", 0, sizeof(shared_";
  protected final String TEXT_30 = "));" + NL + "}";
  protected final String TEXT_31 = NL;
  protected final String TEXT_32 = NL + "void ";
  protected final String TEXT_33 = "_";
  protected final String TEXT_34 = "_mem_init()" + NL + "{";
  protected final String TEXT_35 = NL + "#ifdef shared_";
  protected final String TEXT_36 = "_";
  protected final String TEXT_37 = NL + "\tmemset(&shared_";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = ", 0, " + NL + "\tsizeof(shared_";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = "));" + NL + "#endif";
  protected final String TEXT_42 = NL + NL + "}";
  protected final String TEXT_43 = NL + NL + NL + "int ";
  protected final String TEXT_44 = "_init()" + NL + "{";
  protected final String TEXT_45 = NL + "\tmemset(&shared_";
  protected final String TEXT_46 = ", 0, sizeof(shared_";
  protected final String TEXT_47 = "));";
  protected final String TEXT_48 = NL;
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + NL + "\treturn 0;" + NL + "}" + NL;
  protected final String TEXT_51 = NL + NL + NL + "int ";
  protected final String TEXT_52 = "_idle()" + NL + "{" + NL + "\t//SWARM_FATAL_ERROR;";
  protected final String TEXT_53 = NL + "\tstatic ";
  protected final String TEXT_54 = "_t dummy_";
  protected final String TEXT_55 = ";";
  protected final String TEXT_56 = NL + "#ifdef ";
  protected final String TEXT_57 = "_CHILD_TUBE_COUNT" + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_58 = ", ";
  protected final String TEXT_59 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_60 = ", SWARM_SIZEOF(";
  protected final String TEXT_61 = "_t));" + NL + "#endif";
  protected final String TEXT_62 = NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL;
  protected final String TEXT_63 = NL + "/*" + NL + "\t";
  protected final String TEXT_64 = "\tRelated flows for tube ";
  protected final String TEXT_65 = NL + "\t\tFlow ";
  protected final String TEXT_66 = NL + "*/" + NL + "int get_";
  protected final String TEXT_67 = "_flow(";
  protected final String TEXT_68 = "_t* hdr)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}";
  protected final String TEXT_69 = NL;
  protected final String TEXT_70 = NL + NL + "/* Using the SingleTubeHandler constraint */" + NL;
  protected final String TEXT_71 = NL;
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = "_handler(";
  protected final String TEXT_74 = "_t* hdr)" + NL + "{" + NL + "\t//SWARM_FATAL_ERROR;";
  protected final String TEXT_75 = "\t" + NL + "\tstatic ";
  protected final String TEXT_76 = "_t dummy_";
  protected final String TEXT_77 = ";";
  protected final String TEXT_78 = NL + "#ifdef ";
  protected final String TEXT_79 = "_CHILD_TUBE_COUNT\t" + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_80 = ", ";
  protected final String TEXT_81 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_82 = ", SWARM_SIZEOF(";
  protected final String TEXT_83 = "_t));" + NL + "#endif";
  protected final String TEXT_84 = NL + "\tSWARM_FATAL_ERROR;" + NL + "\t";
  protected final String TEXT_85 = ";" + NL + "}" + NL;
  protected final String TEXT_86 = NL + NL;
  protected final String TEXT_87 = NL + "/*" + NL + "\t";
  protected final String TEXT_88 = NL + "\tOriginating Cell ";
  protected final String TEXT_89 = " for flow ";
  protected final String TEXT_90 = NL + "\t\tPotential Targets in flow ";
  protected final String TEXT_91 = NL + "\t\t\t\tTube ";
  protected final String TEXT_92 = " to Cell ";
  protected final String TEXT_93 = NL + NL + "\t\tPotential flows to trigger";
  protected final String TEXT_94 = NL + "\t\t\t\tFlow ";
  protected final String TEXT_95 = " Tube ";
  protected final String TEXT_96 = " to Cell ";
  protected final String TEXT_97 = NL + NL + "\t\tPotential targets across flows";
  protected final String TEXT_98 = NL + "\t\t\t\tFlow ";
  protected final String TEXT_99 = " Tube ";
  protected final String TEXT_100 = " to Cell ";
  protected final String TEXT_101 = NL + "*/";
  protected final String TEXT_102 = NL;
  protected final String TEXT_103 = " ";
  protected final String TEXT_104 = "_";
  protected final String TEXT_105 = "_handler(";
  protected final String TEXT_106 = "_t* hdr)" + NL + "{" + NL + "\t//SWARM_FATAL_ERROR;";
  protected final String TEXT_107 = "\t" + NL + "\tstatic ";
  protected final String TEXT_108 = "_t dummy_";
  protected final String TEXT_109 = "_";
  protected final String TEXT_110 = ";";
  protected final String TEXT_111 = NL + "#ifdef ";
  protected final String TEXT_112 = "_CHILD_TUBE_COUNT " + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_113 = ", ";
  protected final String TEXT_114 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_115 = "_";
  protected final String TEXT_116 = ", SWARM_SIZEOF(";
  protected final String TEXT_117 = "_t));" + NL + "#endif";
  protected final String TEXT_118 = NL + "\tSWARM_FATAL_ERROR;" + NL + "\t";
  protected final String TEXT_119 = ";" + NL + "}" + NL;
  protected final String TEXT_120 = NL;
  protected final String TEXT_121 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
MasterCell cell = (MasterCell) argument;  	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_2);
    
	// Find all cross references
	Collection<CrossReference> crossReferences = ProjectUtil.getReferringInstances(cell, CrossReference.class);
	Collection<StateMachine> smReferences = new HashSet<StateMachine>();

      for(CrossReference crossReference : crossReferences) { 
		smReferences.addAll((Collection<? extends StateMachine>)EcoreUtil.getObjectsByType(crossReference.getObject(), SmPackage.eINSTANCE.getStateMachine()));
	} 

      for(StateMachine smReference : smReferences) {

    stringBuffer.append(TEXT_3);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_4);
    
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_6);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_9);
     }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_24);
    
	} 

    stringBuffer.append(TEXT_25);
    
 Collection<SharedVariable> sharedVariables = ProjectUtil.getReferringInstances(cell, SharedVariable.class);
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell, SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell, SharedMemoryTube.class));

    for(SharedVariable svar: sharedVariables) {
	if(cell == svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_30);
    	}
}
    stringBuffer.append(TEXT_31);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	if(cell.getOutput().contains(svar.getTube().get(0))) {

    stringBuffer.append(TEXT_32);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_34);
    
	Collection<MasterTube> tubes = new HashSet<MasterTube>(cell.getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(cell.getOutput());
	sharedTubes.retainAll(tubes);
	
	CellInstance ci = ProjectUtil.getReferringInstance(cell, CellInstance.class);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(ci.getOutput());
	instTubes.addAll(ci.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    stringBuffer.append(TEXT_35);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_41);
    		instanceUsed.add(ti.getInstance());
 	}

    stringBuffer.append(TEXT_42);
    	}
}
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_44);
    for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_45);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_47);
    
}
    stringBuffer.append(TEXT_48);
    
	Tap tap = ProjectUtil.getReferringInstance(cell, Tap.class);
	if (tap != null) { 
		for(MasterTube ti: tap.getTube()) {
		if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
		
		int i = 0;
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
		for(TubeInstance tInstance: tubeInstances) {

    stringBuffer.append(TEXT_49);
    
			++i;
			break;
		}
	}
}
    stringBuffer.append(TEXT_50);
     
if(ProjectUtil.getReferringInstance(cell, CustomMasterCell.class) == null) {

    stringBuffer.append(TEXT_51);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_52);
    
for (MasterTube mt: cell.getOutput()) {
    if(ProjectUtil.getReferringInstance(mt, IgnoreHyperxTube.class) != null) continue;
	ExternalPort extPort = ProjectUtil.getReferringInstance(
		ProjectUtil.getReferringInstance(mt, TubeInstance.class), ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;

	Set<Flow> outputFlows = MasterUtil.getFlows(mt);
	Set<Flow> inputFlows = new HashSet<Flow>();
	for(MasterTube ti: cell.getInput()) {
		inputFlows = MasterUtil.getFlows(ti);
		inputFlows.retainAll(outputFlows);
		if (!inputFlows.isEmpty()) {
			break;
		}
	}
	
	if (inputFlows.isEmpty()) {
		int globalTubeIndex = 0;
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(mt, TubeInstance.class);

    stringBuffer.append(TEXT_53);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_55);
    
		int i = 0;
		for(TubeInstance ti : tubeInstances) {

    stringBuffer.append(TEXT_56);
    stringBuffer.append(mt.getName().toUpperCase());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(mt.getName().toUpperCase());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_61);
    
			++i;
			++globalTubeIndex;
		}
	}
}

    stringBuffer.append(TEXT_62);
    for(MasterTube mt : cell.getInput()) {
	Collection<Flow> flows = MasterUtil.getFlows(mt);

    if (flows.size() > 1) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(mt.getName());
    for(Tube tube: mt.getDesignTubes()) {
    stringBuffer.append(TEXT_65);
    stringBuffer.append(((Flow)tube.eContainer()).getName());
    }
    stringBuffer.append(TEXT_66);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    
    String returnType = ProjectUtil.getReferringInstance(mt, BlockingReceiver.class) == null ? "void" : "int";
    String returnValue = ProjectUtil.getReferringInstance(mt, BlockingReceiver.class) == null ? "return" : "return 0";

    if(ProjectUtil.getReferringInstance(mt, SingleTubeHandler.class) != null) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_74);
    for(MasterTube ti : cell.getOutput()) {
    if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
		ExternalPort extPort = ProjectUtil.getReferringInstance(
		ProjectUtil.getReferringInstance(ti, TubeInstance.class), ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;

    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_77);
    {
		int i = 0;
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
		for(TubeInstance tInstance: tubeInstances) {

    stringBuffer.append(TEXT_78);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_83);
           }
   }
}
    stringBuffer.append(TEXT_84);
    stringBuffer.append(returnValue);
    stringBuffer.append(TEXT_85);
    } else {
    stringBuffer.append(TEXT_86);
    for(Flow flow : MasterUtil.getFlows(mt)) {
    stringBuffer.append(TEXT_87);
    for(Tube tube: mt.getDesignTubes()) {
	if(tube.eContainer() == flow) {

    stringBuffer.append(TEXT_88);
    stringBuffer.append(tube.getFrom().getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_90);
    		for(Tube targetTube: tube.getTo().getOutput()) {
    stringBuffer.append(TEXT_91);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(targetTube.getTo().getName());
    		}
    stringBuffer.append(TEXT_93);
    		for(Cell designCell: cell.getDesignCells()) {
			if(designCell.getInput().isEmpty() && !designCell.getOutput().isEmpty()) {
				for(Tube targetTube: designCell.getOutput()) {

    stringBuffer.append(TEXT_94);
    stringBuffer.append(((Flow)designCell.eContainer()).getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(targetTube.getTo().getName());
    				}
			}
		}
    stringBuffer.append(TEXT_97);
    		for(MasterTube targetTube: cell.getOutput()) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(((Flow)targetTube.getDesignTubes().get(0).eContainer()).getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(targetTube.getTo().getName());
    		}
    
	}
}
    stringBuffer.append(TEXT_101);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_103);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_106);
    for(MasterTube ti : cell.getOutput()) {
   if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
		ExternalPort extPort = ProjectUtil.getReferringInstance(
		ProjectUtil.getReferringInstance(ti, TubeInstance.class), ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;

    stringBuffer.append(TEXT_107);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_110);
    
	if(MasterUtil.getFlows(ti).contains(flow)) {
		int i = 0;
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
		for(TubeInstance tInstance: tubeInstances) {

    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_117);
    
			++i;
		}
	}
}
    stringBuffer.append(TEXT_118);
    stringBuffer.append(returnValue);
    stringBuffer.append(TEXT_119);
    }
    } // SingleTubeHandler 
    }
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    return stringBuffer.toString();
  }
}
