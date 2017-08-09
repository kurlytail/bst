package com.brainspeedtech.gen.software.mray;

import java.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.hx.*;
import com.brainspeedtech.constraint.hardware.hx.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.layer.*;;

public class InstanceSourceFile
{
  protected static String nl;
  public static synchronized InstanceSourceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    InstanceSourceFile result = new InstanceSourceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "\t" + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_3 = ".h\"";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = "_t ";
  protected final String TEXT_6 = "[";
  protected final String TEXT_7 = "];" + NL + "unsigned ";
  protected final String TEXT_8 = "_descr_pidx = 0;" + NL + "unsigned ";
  protected final String TEXT_9 = "_descr_cidx = 0;";
  protected final String TEXT_10 = NL + "int log__";
  protected final String TEXT_11 = "_index = 0;";
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = "_t log__";
  protected final String TEXT_14 = "[";
  protected final String TEXT_15 = "] = { 0 };";
  protected final String TEXT_16 = NL + NL;
  protected final String TEXT_17 = NL + "uint32_t __nonblocking_remaining_count_";
  protected final String TEXT_18 = ";" + NL + "uint32_t* __nonblocking_ptr_";
  protected final String TEXT_19 = ";";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + "uint32_t __nonblocking_remaining_count_";
  protected final String TEXT_22 = ";" + NL + "uint32_t* __nonblocking_ptr_";
  protected final String TEXT_23 = ";";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = "_t ";
  protected final String TEXT_28 = "[";
  protected final String TEXT_29 = "];" + NL + "unsigned ";
  protected final String TEXT_30 = "_descr_pidx MRAY_SHARED = 0;" + NL + "unsigned ";
  protected final String TEXT_31 = "_descr_cidx MRAY_SHARED = 0;";
  protected final String TEXT_32 = NL + "int log__";
  protected final String TEXT_33 = "_index = 0;";
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = "_t log__";
  protected final String TEXT_36 = "[";
  protected final String TEXT_37 = "] = { 0 };";
  protected final String TEXT_38 = NL;
  protected final String TEXT_39 = NL;
  protected final String TEXT_40 = "_t ";
  protected final String TEXT_41 = "[";
  protected final String TEXT_42 = "] MRAY_SHARED = { 0 };" + NL + "unsigned ";
  protected final String TEXT_43 = "_descr_pidx MRAY_SHARED = 0;" + NL + "unsigned ";
  protected final String TEXT_44 = "_descr_cidx MRAY_SHARED = 0;";
  protected final String TEXT_45 = NL;
  protected final String TEXT_46 = NL;
  protected final String TEXT_47 = "_counters_t counter_file = { 0 };";
  protected final String TEXT_48 = NL;
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = "_t ";
  protected final String TEXT_51 = "__";
  protected final String TEXT_52 = " MRAY_SHARED = { 0 };" + NL + "int ";
  protected final String TEXT_53 = "__";
  protected final String TEXT_54 = "_groupmembers MRAY_SHARED = 0;";
  protected final String TEXT_55 = NL + NL + "uint8_t __data[4096];" + NL + "" + NL + "int main(int argc, char* argv[])" + NL + "{" + NL;
  protected final String TEXT_56 = NL + "\t\t";
  protected final String TEXT_57 = "_";
  protected final String TEXT_58 = "_mem_init();";
  protected final String TEXT_59 = NL;
  protected final String TEXT_60 = NL + "\t\t";
  protected final String TEXT_61 = "_";
  protected final String TEXT_62 = "_mem_init();";
  protected final String TEXT_63 = NL;
  protected final String TEXT_64 = NL + " \t";
  protected final String TEXT_65 = "__";
  protected final String TEXT_66 = "_groupmembers = 1;";
  protected final String TEXT_67 = NL;
  protected final String TEXT_68 = NL + " \twhile(";
  protected final String TEXT_69 = "__";
  protected final String TEXT_70 = "_groupmembers == 0);";
  protected final String TEXT_71 = NL + NL + NL;
  protected final String TEXT_72 = NL + "\tint call_idle = " + NL + "\t";
  protected final String TEXT_73 = "\t";
  protected final String TEXT_74 = "_init();";
  protected final String TEXT_75 = NL;
  protected final String TEXT_76 = NL;
  protected final String TEXT_77 = NL;
  protected final String TEXT_78 = NL + "\tSWARM_RECV_NONBLOCKING_RELATIVE(INPUT_";
  protected final String TEXT_79 = ", 0,";
  protected final String TEXT_80 = NL + "                ";
  protected final String TEXT_81 = ", SWARM_SIZEOF(";
  protected final String TEXT_82 = ")/2);";
  protected final String TEXT_83 = NL + "    SWARM_RECV_NONBLOCKING_RELATIVE(INPUT_";
  protected final String TEXT_84 = ", 0,";
  protected final String TEXT_85 = NL + "                ";
  protected final String TEXT_86 = ", SWARM_SIZEOF(";
  protected final String TEXT_87 = "));";
  protected final String TEXT_88 = NL + "\t" + NL + "\twhile(1) {" + NL + "\t\tint flow = 0;" + NL + "\t\tunsigned dma_count;" + NL + "\t\tunsigned pidx;" + NL + "\t\tunsigned cidx;" + NL + "\t\tint blocked = 0;" + NL + "\t\t";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = NL + "\t\tif(!SWARM_RECV_BUSY_RELATIVE(INPUT_";
  protected final String TEXT_91 = ", 0)) {";
  protected final String TEXT_92 = NL + "            blocked =";
  protected final String TEXT_93 = NL + "            ";
  protected final String TEXT_94 = "_handler(&";
  protected final String TEXT_95 = "[0]);";
  protected final String TEXT_96 = NL + "\t\t\tflow = get_";
  protected final String TEXT_97 = "_flow(&";
  protected final String TEXT_98 = "[0]);" + NL + "\t\t\tswitch(flow) {";
  protected final String TEXT_99 = NL + "\t\t\t\tcase ENUM_";
  protected final String TEXT_100 = "_FLOW:";
  protected final String TEXT_101 = NL + "                    blocked =";
  protected final String TEXT_102 = NL + "\t\t\t\t\t";
  protected final String TEXT_103 = "_";
  protected final String TEXT_104 = "_handler(&";
  protected final String TEXT_105 = "[0]);";
  protected final String TEXT_106 = NL + "\t\t\t\t\tbreak;";
  protected final String TEXT_107 = " ";
  protected final String TEXT_108 = NL + "\t\t\t\tdefault:" + NL + "\t\t\t\t\tSWARM_FATAL_ERROR;" + NL + "\t\t\t}";
  protected final String TEXT_109 = NL + "\t\t\tcall_idle = 1;";
  protected final String TEXT_110 = NL + "            if(!blocked) {";
  protected final String TEXT_111 = NL + "            log__";
  protected final String TEXT_112 = "[log__";
  protected final String TEXT_113 = "_index] = ";
  protected final String TEXT_114 = "[0];" + NL + "            log__";
  protected final String TEXT_115 = "_index = (log__";
  protected final String TEXT_116 = "_index + 1) % ";
  protected final String TEXT_117 = ";";
  protected final String TEXT_118 = NL + "            SWARM_RECV_NONBLOCKING_RELATIVE(INPUT_";
  protected final String TEXT_119 = ", 0, ";
  protected final String TEXT_120 = ", SWARM_SIZEOF(";
  protected final String TEXT_121 = "));";
  protected final String TEXT_122 = NL + "            }";
  protected final String TEXT_123 = "       " + NL + "" + NL + "\t\t}";
  protected final String TEXT_124 = NL + "        dma_count = 1;" + NL + "        if(!SWARM_RECV_BUSY_RELATIVE(INPUT_";
  protected final String TEXT_125 = ", 0)) dma_count = ";
  protected final String TEXT_126 = ";" + NL + "        pidx = ";
  protected final String TEXT_127 = "_descr_pidx + dma_count;" + NL + "        cidx = ";
  protected final String TEXT_128 = "_descr_cidx;" + NL + "        if (cidx != pidx) {" + NL + "            if(dma_count == ";
  protected final String TEXT_129 = ") {" + NL + "                if(((";
  protected final String TEXT_130 = "_descr_pidx + ";
  protected final String TEXT_131 = ") - cidx) <= ";
  protected final String TEXT_132 = ") {" + NL + "                \t";
  protected final String TEXT_133 = "_descr_pidx += ";
  protected final String TEXT_134 = ";" + NL + "                \tunsigned buffer_id = (";
  protected final String TEXT_135 = "_descr_pidx % ";
  protected final String TEXT_136 = ");" + NL + "                    SWARM_RECV_NONBLOCKING_RELATIVE(INPUT_";
  protected final String TEXT_137 = ", 0," + NL + "                            &";
  protected final String TEXT_138 = "[buffer_id], SWARM_SIZEOF(";
  protected final String TEXT_139 = ")/2);" + NL + "                }" + NL + "            }";
  protected final String TEXT_140 = NL + "            blocked =";
  protected final String TEXT_141 = NL + "            ";
  protected final String TEXT_142 = "_handler(&";
  protected final String TEXT_143 = "[cidx%";
  protected final String TEXT_144 = "]);";
  protected final String TEXT_145 = NL + "            flow = get_";
  protected final String TEXT_146 = "_flow(&";
  protected final String TEXT_147 = "[cidx%";
  protected final String TEXT_148 = "]);" + NL + "            switch(flow) {";
  protected final String TEXT_149 = NL + "                case ENUM_";
  protected final String TEXT_150 = "_FLOW:";
  protected final String TEXT_151 = NL + "                    blocked =";
  protected final String TEXT_152 = NL + "                    ";
  protected final String TEXT_153 = "_";
  protected final String TEXT_154 = "_handler(&";
  protected final String TEXT_155 = "[cidx%";
  protected final String TEXT_156 = "]);";
  protected final String TEXT_157 = NL + "                    break;";
  protected final String TEXT_158 = " ";
  protected final String TEXT_159 = NL + "                default:" + NL + "                    SWARM_FATAL_ERROR;" + NL + "            }";
  protected final String TEXT_160 = NL + "            if(!blocked) {";
  protected final String TEXT_161 = "       ";
  protected final String TEXT_162 = NL + "            log__";
  protected final String TEXT_163 = "[log__";
  protected final String TEXT_164 = "_index] = ";
  protected final String TEXT_165 = "[cidx%";
  protected final String TEXT_166 = "];" + NL + "            log__";
  protected final String TEXT_167 = "_index = (log__";
  protected final String TEXT_168 = "_index + 1) % ";
  protected final String TEXT_169 = ";";
  protected final String TEXT_170 = NL + "            ";
  protected final String TEXT_171 = "_descr_cidx = (cidx + 1);";
  protected final String TEXT_172 = NL + "            }";
  protected final String TEXT_173 = "       ";
  protected final String TEXT_174 = NL + "            call_idle = 1;";
  protected final String TEXT_175 = NL + "        }";
  protected final String TEXT_176 = NL;
  protected final String TEXT_177 = NL + "        pidx = ";
  protected final String TEXT_178 = "_descr_pidx;" + NL + "        cidx = ";
  protected final String TEXT_179 = "_descr_cidx;" + NL + "        if (cidx != pidx) {";
  protected final String TEXT_180 = NL + "            blocked =";
  protected final String TEXT_181 = NL + "            ";
  protected final String TEXT_182 = "_handler(&";
  protected final String TEXT_183 = "[cidx%";
  protected final String TEXT_184 = "]);";
  protected final String TEXT_185 = NL + "            flow = get_";
  protected final String TEXT_186 = "_flow(&";
  protected final String TEXT_187 = "[cidx%";
  protected final String TEXT_188 = "]);" + NL + "            switch(flow) {";
  protected final String TEXT_189 = NL + "                case ENUM_";
  protected final String TEXT_190 = "_FLOW:";
  protected final String TEXT_191 = NL + "                    blocked =";
  protected final String TEXT_192 = NL + "                    ";
  protected final String TEXT_193 = "_";
  protected final String TEXT_194 = "_handler(&";
  protected final String TEXT_195 = "[cidx%";
  protected final String TEXT_196 = "]);";
  protected final String TEXT_197 = NL + "                    break;";
  protected final String TEXT_198 = " ";
  protected final String TEXT_199 = NL + "                default:" + NL + "                    SWARM_FATAL_ERROR;" + NL + "            }";
  protected final String TEXT_200 = NL + "            if(!blocked) {";
  protected final String TEXT_201 = "       ";
  protected final String TEXT_202 = NL + "            log__";
  protected final String TEXT_203 = "[log__";
  protected final String TEXT_204 = "_index] = ";
  protected final String TEXT_205 = "[cidx%";
  protected final String TEXT_206 = "];" + NL + "            log__";
  protected final String TEXT_207 = "_index = (log__";
  protected final String TEXT_208 = "_index + 1) % ";
  protected final String TEXT_209 = ";";
  protected final String TEXT_210 = NL + "            ";
  protected final String TEXT_211 = "_descr_cidx = (cidx + 1);";
  protected final String TEXT_212 = NL + "            }";
  protected final String TEXT_213 = "       ";
  protected final String TEXT_214 = NL + "            call_idle = 1;";
  protected final String TEXT_215 = NL + "        }";
  protected final String TEXT_216 = NL;
  protected final String TEXT_217 = NL + "\t\tif (call_idle) {" + NL + "\t\t\tcall_idle = ";
  protected final String TEXT_218 = "_idle();" + NL + "\t\t}";
  protected final String TEXT_219 = NL + "\t}";
  protected final String TEXT_220 = NL + "\treturn 0;" + NL + "}" + NL + NL;
  protected final String TEXT_221 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    	
 	CellInstance instance = (CellInstance) argument;
 	MasterCell mCell = instance.getCell();
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage(instance);
 	NoIdleHandler noIdle = ProjectUtil.getReferringInstance(instance.getCell(), NoIdleHandler.class);
 	NoInitHandler noInit = ProjectUtil.getReferringInstance(instance.getCell(), NoInitHandler.class);

    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_3);
    for(MasterTube ti : instance.getCell().getInput()) {
	if(ProjectUtil.getReferringInstance(ti, MemoryFIFO.class) != null) continue;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti, BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2;

    stringBuffer.append(TEXT_4);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_9);
    TubeDescriptorLog logger = ProjectUtil.getReferringInstance(ti, TubeDescriptorLog.class);
if (logger != null) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(logger.getCount());
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    for(TubeInstance ti : instance.getInput()) {
   	if(ProjectUtil.getReferringInstance(ti.getTube(), MemoryFIFO.class) != null) continue;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2;

    stringBuffer.append(TEXT_17);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    for(TubeInstance ti : instance.getOutput()) {
   	if(ProjectUtil.getReferringInstance(ti.getTube(), MemoryFIFO.class) != null) continue;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2;

    stringBuffer.append(TEXT_21);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    for(TubeInstance ti : instance.getInput()) {
   	if(ProjectUtil.getReferringInstance(ti.getTube(), MemoryFIFO.class) == null) continue;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2;

    stringBuffer.append(TEXT_25);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_31);
    TubeDescriptorLog logger = ProjectUtil.getReferringInstance(ti.getTube(), TubeDescriptorLog.class);
if (logger != null) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(logger.getCount());
    stringBuffer.append(TEXT_37);
    }
    }
    stringBuffer.append(TEXT_38);
    for(TubeInstance ti : instance.getOutput()) {
   	if(ProjectUtil.getReferringInstance(ti.getTube(), MemoryFIFO.class) == null) continue;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2;

    stringBuffer.append(TEXT_39);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    
Collection<Counter> counters = ProjectUtil.getReferringInstances(mCell, Counter.class);
counters.addAll(ProjectUtil.getReferringInstances(mCell.getInput(), TubeReceiveCounter.class));
counters.addAll(ProjectUtil.getReferringInstances(mCell.getOutput(), TubeTransmitCounter.class));
if(counters.size() != 0) {

    stringBuffer.append(TEXT_46);
    stringBuffer.append(mCell.getName());
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    
Collection<SharedVariable> sharedVariables = ProjectUtil.getReferringInstances(mCell, SharedVariable.class);
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(mCell, SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(mCell, SharedMemoryTube.class));

    for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}

    stringBuffer.append(TEXT_49);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    for(SharedVariable svar: sharedVariables) {
	if(instance.getCell() == svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_56);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_58);
    	}
}
    stringBuffer.append(TEXT_59);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	if(instance.getCell().getOutput().contains(svar.getTube().get(0))) {

    stringBuffer.append(TEXT_60);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_62);
    	}
}
    stringBuffer.append(TEXT_63);
    for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}
	if(instance.getCell() == svar.getMasterCell().get(0)) {
    stringBuffer.append(TEXT_64);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_66);
    	}
}
    stringBuffer.append(TEXT_67);
    for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}
	if(instance.getCell() != svar.getMasterCell().get(0)) {
    stringBuffer.append(TEXT_68);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_70);
    	}
}
    stringBuffer.append(TEXT_71);
    if(noIdle == null && noInit == null) {
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    if(noInit == null) { 
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
      if (ProjectUtil.getReferringInstance(instance, CustomInstanceCell.class) == null &&
		ProjectUtil.getReferringInstance(instance.getCell(), CustomMasterCell.class) == null) {

    stringBuffer.append(TEXT_76);
    for(MasterTube mt: instance.getCell().getInput()) {
    if(ProjectUtil.getReferringInstance(mt, IgnoreHyperxTube.class) != null) continue;
	if(ProjectUtil.getReferringInstance(mt, CustomTube.class) != null||
       ProjectUtil.getReferringInstance(mt, CustomHyperxTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(mt, MemoryFIFO.class) != null) continue;
    Collection<TubeInstance> tCollection = ProjectUtil.getReferringInstances(mt, TubeInstance.class);
    TubeInstance ti = null;
    for(TubeInstance tryThis: tCollection) {
       if(tryThis.getTo() == instance) ti = tryThis;
    }
	if (ti == null) continue;
	ExternalPort extPort = ProjectUtil.getReferringInstance(ti, ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;

    stringBuffer.append(TEXT_77);
    
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(mt, BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) {
        count = (count + 1)/2 * 2; 
    stringBuffer.append(TEXT_78);
    stringBuffer.append(mt.getName().toUpperCase());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_82);
     } else { 
    stringBuffer.append(TEXT_83);
    stringBuffer.append(mt.getName().toUpperCase());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(mt.getName());
    stringBuffer.append(TEXT_87);
     }
    
}
    stringBuffer.append(TEXT_88);
    for(MasterTube ti : instance.getCell().getInput()) {
    if(ProjectUtil.getReferringInstance(ti, IgnoreHyperxTube.class) != null) continue;
	if(ProjectUtil.getReferringInstance(ti, CustomTube.class) != null||
       ProjectUtil.getReferringInstance(ti, CustomHyperxTube.class) != null) continue;
	Collection<TubeInstance> tCollection = ProjectUtil.getReferringInstances(ti, TubeInstance.class);
	TubeInstance t = null;
	for(TubeInstance tryThis: tCollection) {
	   if(tryThis.getTo() == instance) t = tryThis;
	}
	if (t == null) continue;
	ExternalPort extPort = ProjectUtil.getReferringInstance(t, ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;
	if (ProjectUtil.getReferringInstance(ti, MemoryFIFO.class) != null) continue;
	Collection<Flow> flows = MasterUtil.getFlows(ti);

    
    boolean blocking = ProjectUtil.getReferringInstance(ti, BlockingReceiver.class) != null;

    stringBuffer.append(TEXT_89);
    
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti, BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2; 
      if (count == 1) { 
    stringBuffer.append(TEXT_90);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_91);
    if(ProjectUtil.getReferringInstance(ti, SingleTubeHandler.class) != null) {
    if(blocking) {
    stringBuffer.append(TEXT_92);
    }
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_95);
    } else {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_96);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_98);
    }
    for(Flow flow: flows) {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_99);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_100);
    }
    if(blocking) {
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_105);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_106);
    }
    }
    stringBuffer.append(TEXT_107);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_108);
    }
    }
    if(noIdle == null) { 
    stringBuffer.append(TEXT_109);
    }
    if(blocking) {
    stringBuffer.append(TEXT_110);
    }
    TubeDescriptorLog logger = ProjectUtil.getReferringInstance(ti, TubeDescriptorLog.class);
if (logger != null) {
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(logger.getCount());
    stringBuffer.append(TEXT_117);
    }
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_121);
    if(blocking) {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
     } else { 
    stringBuffer.append(TEXT_124);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(count/2);
    stringBuffer.append(TEXT_126);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(count/2);
    stringBuffer.append(TEXT_129);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(count/2);
    stringBuffer.append(TEXT_131);
    stringBuffer.append(count/2);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(count/2);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_137);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_139);
    if(ProjectUtil.getReferringInstance(ti, SingleTubeHandler.class) != null) {
    if(blocking) {
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_144);
    } else {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_148);
    }
    for(Flow flow: flows) {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_150);
    }
    if(blocking) {
    stringBuffer.append(TEXT_151);
    }
    stringBuffer.append(TEXT_152);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_156);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_157);
    }
    }
    stringBuffer.append(TEXT_158);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_159);
    }
    }
    if(blocking) {
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    TubeDescriptorLog logger = ProjectUtil.getReferringInstance(ti, TubeDescriptorLog.class);
if (logger != null) {
    stringBuffer.append(TEXT_162);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_166);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(logger.getCount());
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_171);
    if(blocking) {
    stringBuffer.append(TEXT_172);
    }
    stringBuffer.append(TEXT_173);
    if(noIdle == null) { 
    stringBuffer.append(TEXT_174);
    }
    stringBuffer.append(TEXT_175);
     }
    }
    stringBuffer.append(TEXT_176);
    for(TubeInstance ti : instance.getInput()) {
    if(ProjectUtil.getReferringInstance(ti.getTube(), IgnoreHyperxTube.class) != null) continue;
	if(ProjectUtil.getReferringInstance(ti.getTube(), CustomTube.class) != null||
       ProjectUtil.getReferringInstance(ti.getTube(), CustomHyperxTube.class) != null) continue;
	ExternalPort extPort = ProjectUtil.getReferringInstance(ti, ExternalPort.class);
	if (extPort != null) if (extPort.getType().equals(TypeType.DDR2)) continue;
	if(ProjectUtil.getReferringInstance(ti.getTube(), MemoryFIFO.class) == null) continue; 
	Collection<Flow> flows = MasterUtil.getFlows(ti.getTube());
    boolean blocking = ProjectUtil.getReferringInstance(ti.getTube(), BlockingReceiver.class) != null;
    BufferDepth bufferDepth = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
    int count = 1;
    if (bufferDepth != null) count = bufferDepth.getDepth();
    if (count != 1) count = (count + 1)/2 * 2; 
    stringBuffer.append(TEXT_177);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_179);
    if(ProjectUtil.getReferringInstance(ti.getTube(), SingleTubeHandler.class) != null) {
    if(blocking) {
    stringBuffer.append(TEXT_180);
    }
    stringBuffer.append(TEXT_181);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_184);
    } else {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_188);
    }
    for(Flow flow: flows) {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_190);
    }
    if(blocking) {
    stringBuffer.append(TEXT_191);
    }
    stringBuffer.append(TEXT_192);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_196);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_197);
    }
    }
    stringBuffer.append(TEXT_198);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_199);
    }
    }
    if(blocking) {
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    TubeDescriptorLog logger = ProjectUtil.getReferringInstance(ti, TubeDescriptorLog.class);
if (logger != null) {
    stringBuffer.append(TEXT_202);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(count);
    stringBuffer.append(TEXT_206);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(logger.getCount());
    stringBuffer.append(TEXT_209);
    }
    stringBuffer.append(TEXT_210);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_211);
    if(blocking) {
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    if(noIdle == null) { 
    stringBuffer.append(TEXT_214);
    }
    stringBuffer.append(TEXT_215);
     }
    stringBuffer.append(TEXT_216);
    if(noIdle == null) { 
    stringBuffer.append(TEXT_217);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_218);
    }
    stringBuffer.append(TEXT_219);
    }
    stringBuffer.append(TEXT_220);
    stringBuffer.append(TEXT_221);
    return stringBuffer.toString();
  }
}
