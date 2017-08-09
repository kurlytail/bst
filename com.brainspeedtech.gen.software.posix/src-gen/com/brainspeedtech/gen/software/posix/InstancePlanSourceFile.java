package com.brainspeedtech.gen.software.posix;

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
import com.brainspeedtech.constraint.software.posix.*;
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
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"" + NL;
  protected final String TEXT_5 = NL + "#include \"gen_";
  protected final String TEXT_6 = "_sm.h\"";
  protected final String TEXT_7 = NL + "// Compute the right transition for ";
  protected final String TEXT_8 = " state" + NL + "// Allowed transitions are";
  protected final String TEXT_9 = NL + "//\t\tENUM_";
  protected final String TEXT_10 = "_";
  protected final String TEXT_11 = "_TRANSITION";
  protected final String TEXT_12 = NL + "//\t\tENUM_";
  protected final String TEXT_13 = "_NULL_TRANSITION" + NL + "static inline ENUM_";
  protected final String TEXT_14 = "_TRANSITION ";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = "_compute_";
  protected final String TEXT_17 = "_transition()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn ENUM_";
  protected final String TEXT_18 = "_NULL_TRANSITION;" + NL + "}";
  protected final String TEXT_19 = NL + NL + "// Get/set the state variable" + NL + "static inline ENUM_";
  protected final String TEXT_20 = "_STATE " + NL + "get_";
  protected final String TEXT_21 = "_state()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "static inline void\tset_";
  protected final String TEXT_22 = "_state(" + NL + "\tENUM_";
  protected final String TEXT_23 = "_TRANSITION transition," + NL + "\tENUM_";
  protected final String TEXT_24 = "_STATE state)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "}" + NL + "" + NL + "static inline int get_";
  protected final String TEXT_25 = "_resource()" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}" + NL + "#include \"gen_";
  protected final String TEXT_26 = "_sm.c\"";
  protected final String TEXT_27 = NL;
  protected final String TEXT_28 = NL + "void ";
  protected final String TEXT_29 = "_";
  protected final String TEXT_30 = "_mem_init() " + NL + "{" + NL + "\tmemset(&shared_";
  protected final String TEXT_31 = ", 0, sizeof(shared_";
  protected final String TEXT_32 = "));" + NL + "}";
  protected final String TEXT_33 = NL;
  protected final String TEXT_34 = NL + "void ";
  protected final String TEXT_35 = "_";
  protected final String TEXT_36 = "_mem_init()" + NL + "{";
  protected final String TEXT_37 = NL + "#ifdef shared_";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = NL + "\tmemset(&shared_";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = ", 0, " + NL + "\tsizeof(shared_";
  protected final String TEXT_42 = "_";
  protected final String TEXT_43 = "));" + NL + "#endif";
  protected final String TEXT_44 = NL + NL + "}";
  protected final String TEXT_45 = NL + NL + "int ";
  protected final String TEXT_46 = "_init()" + NL + "{" + NL;
  protected final String TEXT_47 = NL + "#ifdef GEN_PLATFORM_POSIX" + NL + "    SWARM_POSIX_FIFO_THREAD(INPUT_";
  protected final String TEXT_48 = "_0," + NL + "            OUTPUT_";
  protected final String TEXT_49 = "_0);" + NL + "#endif";
  protected final String TEXT_50 = NL + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "int ";
  protected final String TEXT_51 = "_idle()" + NL + "{" + NL + "/*";
  protected final String TEXT_52 = NL + "\tstatic ";
  protected final String TEXT_53 = "_t dummy_";
  protected final String TEXT_54 = "_";
  protected final String TEXT_55 = ";" + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_56 = ", ";
  protected final String TEXT_57 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_58 = "_";
  protected final String TEXT_59 = ", SWARM_SIZEOF(";
  protected final String TEXT_60 = "_t));";
  protected final String TEXT_61 = NL + "*/" + NL + "\treturn 0;" + NL + "}" + NL;
  protected final String TEXT_62 = NL + "/*" + NL + "\t";
  protected final String TEXT_63 = "\tRelated flows for tube ";
  protected final String TEXT_64 = NL + "\t\tFlow ";
  protected final String TEXT_65 = NL + "*/" + NL + "int get_";
  protected final String TEXT_66 = "_flow(";
  protected final String TEXT_67 = "_t* hdr)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;" + NL + "\treturn 0;" + NL + "}";
  protected final String TEXT_68 = NL;
  protected final String TEXT_69 = NL;
  protected final String TEXT_70 = NL + NL + "/* Using the SingleTubeHandler constraint */" + NL;
  protected final String TEXT_71 = NL;
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = "_handler(";
  protected final String TEXT_74 = "_t* hdr)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;";
  protected final String TEXT_75 = "\t" + NL + "\tstatic ";
  protected final String TEXT_76 = "_t dummy_";
  protected final String TEXT_77 = ";";
  protected final String TEXT_78 = NL + "\t" + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_79 = ", ";
  protected final String TEXT_80 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_81 = ", SWARM_SIZEOF(";
  protected final String TEXT_82 = "_t));";
  protected final String TEXT_83 = NL + "}" + NL;
  protected final String TEXT_84 = NL + NL;
  protected final String TEXT_85 = NL + NL + "/*" + NL + "\t";
  protected final String TEXT_86 = NL + "\tOriginating Cell ";
  protected final String TEXT_87 = " for flow ";
  protected final String TEXT_88 = NL + "\t\tPotential Targets in flow ";
  protected final String TEXT_89 = NL + "\t\t\t\tTube ";
  protected final String TEXT_90 = " to Cell ";
  protected final String TEXT_91 = NL + NL + "\t\tPotential flows to trigger";
  protected final String TEXT_92 = NL + "\t\t\t\tFlow ";
  protected final String TEXT_93 = " Tube ";
  protected final String TEXT_94 = " to Cell ";
  protected final String TEXT_95 = NL + NL + "\t\tPotential targets across flows";
  protected final String TEXT_96 = NL + "\t\t\t\tFlow ";
  protected final String TEXT_97 = " Tube ";
  protected final String TEXT_98 = " to Cell ";
  protected final String TEXT_99 = NL + "*/";
  protected final String TEXT_100 = NL;
  protected final String TEXT_101 = " ";
  protected final String TEXT_102 = "_";
  protected final String TEXT_103 = "_handler(";
  protected final String TEXT_104 = "_t* hdr)" + NL + "{" + NL + "\tSWARM_FATAL_ERROR;";
  protected final String TEXT_105 = NL + "\tstatic ";
  protected final String TEXT_106 = "_t dummy_";
  protected final String TEXT_107 = "_";
  protected final String TEXT_108 = "_";
  protected final String TEXT_109 = ";" + NL + "\tSWARM_SEND_RELATIVE(OUTPUT_";
  protected final String TEXT_110 = ", ";
  protected final String TEXT_111 = "," + NL + "\t\t&dummy_";
  protected final String TEXT_112 = "_";
  protected final String TEXT_113 = "_";
  protected final String TEXT_114 = ", SWARM_SIZEOF(";
  protected final String TEXT_115 = "_t));";
  protected final String TEXT_116 = NL + "}" + NL;
  protected final String TEXT_117 = NL;
  protected final String TEXT_118 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    MasterCell cell = (MasterCell) argument;
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_4);
    
	// Find all cross references
	Collection<CrossReference> crossReferences = ProjectUtil.getReferringInstances(cell, CrossReference.class);
	Collection<StateMachine> smReferences = new HashSet<StateMachine>();

      for(CrossReference crossReference : crossReferences) { 
		smReferences.addAll((Collection<? extends StateMachine>)EcoreUtil.getObjectsByType(crossReference.getObject(), SmPackage.eINSTANCE.getStateMachine()));
	} 

      for(StateMachine smReference : smReferences) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_6);
    
for(State state: smReference.getState()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_8);
     for(Transition transition : state.getDest()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(transition.getName().toUpperCase());
    stringBuffer.append(TEXT_11);
     }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(state.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(smReference.getName().toUpperCase());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(smReference.getName());
    stringBuffer.append(TEXT_26);
    
	} 

    stringBuffer.append(TEXT_27);
    
 Collection<SharedVariable> sharedVariables = ProjectUtil.getReferringInstances(cell, SharedVariable.class);
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell.getInput(), SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), SharedMemoryTube.class));
 

    for(SharedVariable svar: sharedVariables) {
	if(cell == svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_28);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_32);
    	}
}
    stringBuffer.append(TEXT_33);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	if(cell.getOutput().contains(svar.getTube().get(0))) {

    stringBuffer.append(TEXT_34);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_36);
    
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

    stringBuffer.append(TEXT_37);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_43);
    		instanceUsed.add(ti.getInstance());
 	}

    stringBuffer.append(TEXT_44);
    	}
}
    stringBuffer.append(TEXT_45);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_46);
    
    Tap tap = ProjectUtil.getReferringInstance(cell, Tap.class);
    if (tap != null) { 
        for(MasterTube ti: tap.getTube()) {
        if(ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
 		if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
        
        int i = 0;
        Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
        for(TubeInstance tInstance: tubeInstances) {

    stringBuffer.append(TEXT_47);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    
            ++i;
            break;
        }
    }
}
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_51);
    
for (MasterTube mt: cell.getOutput()) {
	if (ProjectUtil.getReferringInstance(mt, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(mt, SharedMemoryTube.class) != null) continue;
	Set<Flow> outputFlows = MasterUtil.getFlows(mt);
	Set<Flow> inputFlows = new HashSet<Flow>();
	for(MasterTube ti: cell.getInput()) {
		if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
		if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
		inputFlows = MasterUtil.getFlows(ti);
		inputFlows.retainAll(outputFlows);
		if (!inputFlows.isEmpty()) {
			break;
		}
	}
	
	if (inputFlows.isEmpty()) {
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(mt, TubeInstance.class);
		CellInstance cinst = ProjectUtil.getReferringInstance(cell, CellInstance.class);
		if (cinst != null)
			tubeInstances.retainAll(cinst.getOutput());
		int tIndex = 0;
		for(TubeInstance ti : tubeInstances) {
		if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
		if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_52);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(mt.getName().toUpperCase());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_60);
    
		++tIndex;
			}
	}
}

    stringBuffer.append(TEXT_61);
    for(MasterTube mt : cell.getInput()) {
	if (ProjectUtil.getReferringInstance(mt, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(mt, SharedMemoryTube.class) != null) continue;
	Collection<Flow> flows = MasterUtil.getFlows(mt);

    if (flows.size() > 1) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(mt.getName());
    for(Tube tube: mt.getDesignTubes()) {
    stringBuffer.append(TEXT_64);
    stringBuffer.append(((Flow)tube.eContainer()).getName());
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    
    String returnType = ProjectUtil.getReferringInstance(mt, BlockingReceiver.class) == null ? "void" : "int";
    String returnValue = ProjectUtil.getReferringInstance(mt, BlockingReceiver.class) == null ? "return" : "return 0";

    stringBuffer.append(TEXT_69);
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

    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_77);
    {
		int i = 0;
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
		for(TubeInstance tInstance: tubeInstances) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_78);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
           }
   }
}
    stringBuffer.append(TEXT_83);
    } else {
    stringBuffer.append(TEXT_84);
    for(Flow flow : MasterUtil.getFlows(mt)) {
    stringBuffer.append(TEXT_85);
    for(Tube tube: mt.getDesignTubes()) {
	if(tube.eContainer() == flow) {

    stringBuffer.append(TEXT_86);
    stringBuffer.append(tube.getFrom().getName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_88);
    		for(Tube targetTube: tube.getTo().getOutput()) {
    stringBuffer.append(TEXT_89);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(targetTube.getTo().getName());
    		}
    stringBuffer.append(TEXT_91);
    		for(Cell designCell: cell.getDesignCells()) {
			if(designCell.getInput().isEmpty() && !designCell.getOutput().isEmpty()) {
				for(Tube targetTube: designCell.getOutput()) {

    stringBuffer.append(TEXT_92);
    stringBuffer.append(((Flow)designCell.eContainer()).getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(targetTube.getTo().getName());
    				}
			}
		}
    stringBuffer.append(TEXT_95);
    		for(MasterTube targetTube: cell.getOutput()) {
    stringBuffer.append(TEXT_96);
    stringBuffer.append(((Flow)targetTube.getDesignTubes().get(0).eContainer()).getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(targetTube.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(targetTube.getTo().getName());
    		}
    
	}
}
    stringBuffer.append(TEXT_99);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_104);
    for(MasterTube ti : cell.getOutput()) {
	if(MasterUtil.getFlows(ti).contains(flow)) {
		Set<TubeInstance> tubeInstances = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
		CellInstance cinst = ProjectUtil.getReferringInstance(cell, CellInstance.class);
		if (cinst != null)
			tubeInstances.retainAll(cinst.getOutput());
		int tIndex = 0;
		for(TubeInstance tInstance: tubeInstances) {
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), IgnorePosixTube.class) != null) continue;
			if (ProjectUtil.getReferringInstance(tInstance.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_105);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_108);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(tIndex);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_115);
    
			++tIndex;
		}
	}
}
    stringBuffer.append(TEXT_116);
    }
    } // SingleTubeHandler 
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(TEXT_118);
    return stringBuffer.toString();
  }
}
