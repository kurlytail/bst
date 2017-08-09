package com.brainspeedtech.gen.software.mray;

import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.constraint.software.hx.*;
import com.brainspeedtech.constraint.hardware.hx.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.swarm.layer.*;
import java.util.*;
import com.brainspeedtech.swarm.project.util.*;;

public class InstancePlanHeaderFile
{
  protected static String nl;
  public static synchronized InstancePlanHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    InstancePlanHeaderFile result = new InstancePlanHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_2 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_3 = "_H__" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_5 = "_counters.h\"" + NL;
  protected final String TEXT_6 = NL + "extern ";
  protected final String TEXT_7 = "_t ";
  protected final String TEXT_8 = "[];" + NL;
  protected final String TEXT_9 = NL + NL + "int get_";
  protected final String TEXT_10 = "_flow(";
  protected final String TEXT_11 = "_t* hdr);";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = "_handler(";
  protected final String TEXT_15 = "_t* hdr);";
  protected final String TEXT_16 = NL;
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = "_handler(";
  protected final String TEXT_20 = "_t* hdr);";
  protected final String TEXT_21 = NL + "int ";
  protected final String TEXT_22 = "_idle();";
  protected final String TEXT_23 = NL + NL + "int ";
  protected final String TEXT_24 = "_init();" + NL + "" + NL + "" + NL + "#define TASK_";
  protected final String TEXT_25 = "_INSTANCE_COUNT (";
  protected final String TEXT_26 = ")" + NL;
  protected final String TEXT_27 = NL + NL + "extern uint8_t __data[];" + NL + "" + NL + "#ifdef TASK_";
  protected final String TEXT_28 = NL + NL + "#define TASK_";
  protected final String TEXT_29 = "_INSTANCE (";
  protected final String TEXT_30 = ")" + NL + "#define GEN_";
  protected final String TEXT_31 = "_INSTANCE_ID (";
  protected final String TEXT_32 = ")" + NL + "#define GEN_";
  protected final String TEXT_33 = "_INSTANCE_ID (";
  protected final String TEXT_34 = ")" + NL + "#define GEN_TASK_NAME \"";
  protected final String TEXT_35 = "\"" + NL;
  protected final String TEXT_36 = NL + "#define INPUT_";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = " FIFO_";
  protected final String TEXT_39 = NL + "#define SWARM_RECV_INPUT_";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = "(__ptr__, __size__) {\\" + NL + "\tint remaining_size = ((__size__) + 3)/4;\\" + NL + "\tmemcpy(__ptr__, __data, remaining_size);\\";
  protected final String TEXT_42 = NL + "    COUNTER_";
  protected final String TEXT_43 = "_INC;\\";
  protected final String TEXT_44 = NL + "}" + NL + "" + NL + "extern uint32_t __nonblocking_remaining_count_";
  protected final String TEXT_45 = ";" + NL + "extern uint32_t* __nonblocking_ptr_";
  protected final String TEXT_46 = ";" + NL + "#define SWARM_RECV_NONBLOCKING_INPUT_";
  protected final String TEXT_47 = "_";
  protected final String TEXT_48 = "(__ptr__, __size__) \\" + NL + "\t{\\" + NL + "\t\t__nonblocking_remaining_count_";
  protected final String TEXT_49 = " = (__size__);\\" + NL + "\t\t__nonblocking_ptr_";
  protected final String TEXT_50 = " = (uint32_t*)(__ptr__);\\" + NL + "\t}" + NL + "\t" + NL + "#define SWARM_RECV_BUSY_INPUT_";
  protected final String TEXT_51 = "_";
  protected final String TEXT_52 = " ({\\" + NL + "\tmemcpy(__nonblocking_ptr_";
  protected final String TEXT_53 = ", __data, __nonblocking_remaining_count_";
  protected final String TEXT_54 = ");\\";
  protected final String TEXT_55 = NL + "    if(__nonblocking_remaining_count_";
  protected final String TEXT_56 = " == 0) {\\" + NL + "        COUNTER_";
  protected final String TEXT_57 = "_INC;\\" + NL + "    }\\";
  protected final String TEXT_58 = NL + "\t__nonblocking_remaining_count_";
  protected final String TEXT_59 = " != 0;\\" + NL + "\t})" + NL;
  protected final String TEXT_60 = NL + "#define OUTPUT_";
  protected final String TEXT_61 = "_";
  protected final String TEXT_62 = " FIFO_";
  protected final String TEXT_63 = NL + "#define SWARM_SEND_OUTPUT_";
  protected final String TEXT_64 = "_";
  protected final String TEXT_65 = "(__ptr__, __size__){\\";
  protected final String TEXT_66 = NL + "    COUNTER_";
  protected final String TEXT_67 = "_INC;\\";
  protected final String TEXT_68 = NL + "\tint remaining_size = ((__size__) + 3)/4;\\" + NL + "\tmemcpy(__data, __ptr__, remaining_size);\\" + NL + "}" + NL + "" + NL + "extern uint32_t __nonblocking_remaining_count_";
  protected final String TEXT_69 = ";" + NL + "extern uint32_t* __nonblocking_ptr_";
  protected final String TEXT_70 = ";" + NL + "#define SWARM_SEND_NONBLOCKING_OUTPUT_";
  protected final String TEXT_71 = "_";
  protected final String TEXT_72 = "(__ptr__, __size__) {\\";
  protected final String TEXT_73 = NL + "    COUNTER_";
  protected final String TEXT_74 = "_INC;\\";
  protected final String TEXT_75 = NL + "\t{\\" + NL + "\t\t__nonblocking_remaining_count_";
  protected final String TEXT_76 = " = (__size__);\\" + NL + "\t\t__nonblocking_ptr_";
  protected final String TEXT_77 = " = (uint32_t*)(__ptr__);\\" + NL + "\t}\\" + NL + "}" + NL + "#define SWARM_SEND_BUSY_OUTPUT_";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = " ({\\" + NL + "\tmemcpy(__data, __nonblocking_ptr_";
  protected final String TEXT_80 = ", __nonblocking_remaining_count_";
  protected final String TEXT_81 = ");\\" + NL + "\t__nonblocking_remaining_count_";
  protected final String TEXT_82 = " != 0;\\" + NL + "})";
  protected final String TEXT_83 = NL + NL;
  protected final String TEXT_84 = NL;
  protected final String TEXT_85 = NL + "void ";
  protected final String TEXT_86 = "_";
  protected final String TEXT_87 = "_mem_init();";
  protected final String TEXT_88 = NL;
  protected final String TEXT_89 = NL + "void ";
  protected final String TEXT_90 = "_";
  protected final String TEXT_91 = "_mem_init();";
  protected final String TEXT_92 = NL;
  protected final String TEXT_93 = NL;
  protected final String TEXT_94 = NL + "#define shared_";
  protected final String TEXT_95 = " ";
  protected final String TEXT_96 = "__";
  protected final String TEXT_97 = NL + "extern ";
  protected final String TEXT_98 = "_t ";
  protected final String TEXT_99 = "__";
  protected final String TEXT_100 = ";" + NL + "extern int ";
  protected final String TEXT_101 = "__";
  protected final String TEXT_102 = "_groupmembers;";
  protected final String TEXT_103 = NL + NL + "/* Map tube ids to task relative ids */";
  protected final String TEXT_104 = NL + "#define ";
  protected final String TEXT_105 = "_CHILD_TUBE_COUNT (";
  protected final String TEXT_106 = ")" + NL + "#define SWARM_SEND_RELATIVE_OUTPUT_";
  protected final String TEXT_107 = "(__instance__, __ptr__, __size__) \\" + NL + "    SWARM_SEND(OUTPUT_";
  protected final String TEXT_108 = "_0, __ptr__, __size__)" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE_OUTPUT_";
  protected final String TEXT_109 = "(__instance__, __ptr__, __size__) \\" + NL + "    SWARM_SEND_NONBLOCKING(OUTPUT_";
  protected final String TEXT_110 = "_0, __ptr__, __size__)" + NL + "#define SWARM_SEND_BUSY_RELATIVE_OUTPUT_";
  protected final String TEXT_111 = "(__instance__) \\" + NL + "    SWARM_SEND_BUSY(OUTPUT_";
  protected final String TEXT_112 = "_0)";
  protected final String TEXT_113 = NL;
  protected final String TEXT_114 = NL + "#define ";
  protected final String TEXT_115 = "_CHILD_TUBE_COUNT (";
  protected final String TEXT_116 = ")" + NL + "#define SWARM_RECV_RELATIVE_INPUT_";
  protected final String TEXT_117 = "(__instance__, __ptr__, __size__) \\" + NL + "    SWARM_RECV(INPUT_";
  protected final String TEXT_118 = "_0, __ptr__, __size__)" + NL + "#define SWARM_RECV_NONBLOCKING_RELATIVE_INPUT_";
  protected final String TEXT_119 = "(__instance__, __ptr__, __size__) \\" + NL + "    SWARM_RECV_NONBLOCKING(INPUT_";
  protected final String TEXT_120 = "_0, __ptr__, __size__)" + NL + "#define SWARM_RECV_BUSY_RELATIVE_INPUT_";
  protected final String TEXT_121 = "(__instance__) \\" + NL + "    SWARM_RECV_BUSY(INPUT_";
  protected final String TEXT_122 = "_0)";
  protected final String TEXT_123 = NL + NL + "#endif";
  protected final String TEXT_124 = NL + NL + NL;
  protected final String TEXT_125 = NL + "extern ";
  protected final String TEXT_126 = "_counters_t counter_file;";
  protected final String TEXT_127 = NL + "#define COUNTER_";
  protected final String TEXT_128 = "_INC (++counter_file.";
  protected final String TEXT_129 = ")" + NL + "#define COUNTER_";
  protected final String TEXT_130 = "_DEC (--counter_file.";
  protected final String TEXT_131 = ")" + NL + "#define COUNTER_";
  protected final String TEXT_132 = "_ADD(__value__) (counter_file.";
  protected final String TEXT_133 = " += (__value__))" + NL + "#define COUNTER_";
  protected final String TEXT_134 = "_SUB(__value__) (counter_file.";
  protected final String TEXT_135 = " -= (__value__))" + NL + "#define COUNTER_";
  protected final String TEXT_136 = "_SET(__value__) (counter_file.";
  protected final String TEXT_137 = " = (__value__))";
  protected final String TEXT_138 = NL + NL + NL + "#endif";
  protected final String TEXT_139 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     
MasterCell cell = (MasterCell) argument;  	
String[] copyrightMessage = LayerUtil.getCopyrightMessage(cell);
Collection<CellInstance> cellInstances =  ProjectUtil.getReferringInstances(cell, CellInstance.class);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(((MasterDesign)cell.eContainer()).getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(((MasterDesign)cell.eContainer()).getName());
    stringBuffer.append(TEXT_5);
     
if(ProjectUtil.getReferringInstance(cell, CustomMasterCell.class) == null) {

    for(MasterTube ti : cell.getInput()) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_8);
    
    String returnType = ProjectUtil.getReferringInstance(ti, BlockingReceiver.class) == null ? "void" : "int";

    stringBuffer.append(TEXT_9);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_11);
    if(ProjectUtil.getReferringInstance(ti, SingleTubeHandler.class) != null) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_15);
    } else {
    for(Flow flow : MasterUtil.getFlows(ti)) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_20);
    }
    } // SingleTubeHandler 
    }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(cellInstances.size());
    stringBuffer.append(TEXT_26);
    
for (CellInstance ci: cellInstances) {

    stringBuffer.append(TEXT_27);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ci.getCell().getName().toUpperCase());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ci.getCell().getName().toUpperCase());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(((Instance)ci.eContainer()).getName().toUpperCase());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_35);
    
int tubeIndex = 0;
HashMap<MasterTube, Integer> indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : ci.getInput()) {
   if(ProjectUtil.getReferringInstance(ti.getTube(), IgnoreHyperxTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_36);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_41);
    
    TubeReceiveCounter rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_42);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_54);
    
    rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_59);
    
	tubeIndex ++;
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
}

indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : ci.getOutput()) {
   if(ProjectUtil.getReferringInstance(ti.getTube(), IgnoreHyperxTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_60);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_65);
    
    TubeTransmitCounter tcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_66);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_72);
    
    tcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
	
	}

    stringBuffer.append(TEXT_83);
    
 Collection<SharedVariable> sharedVariables = ProjectUtil.getReferringInstances(ci.getCell(), SharedVariable.class);
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell, SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell, SharedMemoryTube.class));

    stringBuffer.append(TEXT_84);
    for(SharedVariable svar: sharedVariables) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_87);
    }
    stringBuffer.append(TEXT_88);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
    stringBuffer.append(TEXT_89);
    stringBuffer.append(svar.getTube().get(0).getFrom().getName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_91);
    
}
    stringBuffer.append(TEXT_92);
    
for(SharedVariable svar: sharedVariables) {
	int cellCount = 0;
	for(MasterCell mCell : svar.getMasterCell()) {
		if(ci.getCell() != svar.getMasterCell().get(0) &&
			mCell == ci.getCell()) {

    		}
		++cellCount;
	}
	if(ci.getCell() == svar.getMasterCell().get(0)) {
      }
}
    stringBuffer.append(TEXT_93);
    
for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}

    stringBuffer.append(TEXT_94);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append((ci.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append((ci.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append((ci.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    for(MasterTube ti: cell.getOutput()) {
   if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
    List<TubeInstance> childTubes = new LinkedList<TubeInstance>();
    childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
    childTubes.retainAll(ci.getOutput());
    if (childTubes.size() == 0) continue;

    stringBuffer.append(TEXT_104);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_112);
    }
    stringBuffer.append(TEXT_113);
    for(MasterTube ti: cell.getInput()) {
   if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
    List<TubeInstance> childTubes = new LinkedList<TubeInstance>();
    childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
    childTubes.retainAll(ci.getInput());
    if (childTubes.size() == 0) continue;

    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    
}

    stringBuffer.append(TEXT_124);
    
Collection<Counter> counters = ProjectUtil.getReferringInstances(cell, Counter.class);
counters.addAll(ProjectUtil.getReferringInstances(cell.getInput(), TubeReceiveCounter.class));
counters.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), TubeTransmitCounter.class));
if(counters.size() != 0) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_126);
    for(Counter counter: counters) {
        String type;
        switch(counter.getWidth()) {
        case _16BIT: type = "uint16_t"; break;
        case _32BIT: type = "uint32_t"; break;
        case _64BIT: type = "uint64_t"; break;
        }
    
    stringBuffer.append(TEXT_127);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_137);
      }
}
    stringBuffer.append(TEXT_138);
    stringBuffer.append(TEXT_139);
    return stringBuffer.toString();
  }
}
