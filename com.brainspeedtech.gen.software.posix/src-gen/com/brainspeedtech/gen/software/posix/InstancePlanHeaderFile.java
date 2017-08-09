package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.layer.*;
import org.eclipse.emf.ecore.*;;

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
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_6 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_7 = "_H__" + NL + "" + NL + "#include <unistd.h>" + NL + "#include \"gen_";
  protected final String TEXT_8 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_9 = "_counters.h\"" + NL + NL + NL;
  protected final String TEXT_10 = NL + "int get_";
  protected final String TEXT_11 = "_flow(";
  protected final String TEXT_12 = "_t* hdr);" + NL + "int ";
  protected final String TEXT_13 = "_transaction_id(";
  protected final String TEXT_14 = "_t* hdr) __attribute__((weak));";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = "_handler(";
  protected final String TEXT_18 = "_t* hdr);";
  protected final String TEXT_19 = NL;
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = "_";
  protected final String TEXT_22 = "_handler(";
  protected final String TEXT_23 = "_t* hdr);" + NL + "int ";
  protected final String TEXT_24 = "_";
  protected final String TEXT_25 = "_transaction_id(";
  protected final String TEXT_26 = "_t* hdr) __attribute__((weak));";
  protected final String TEXT_27 = NL + "int ";
  protected final String TEXT_28 = "_init();" + NL + "int ";
  protected final String TEXT_29 = "_idle();" + NL + "" + NL + "" + NL + "#define TASK_";
  protected final String TEXT_30 = "_INSTANCE_COUNT (";
  protected final String TEXT_31 = ")" + NL;
  protected final String TEXT_32 = NL;
  protected final String TEXT_33 = NL + "void ";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = "_mem_init();";
  protected final String TEXT_36 = NL;
  protected final String TEXT_37 = NL + "void ";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = "_mem_init();";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = NL + "extern ";
  protected final String TEXT_42 = "_t* ";
  protected final String TEXT_43 = ";";
  protected final String TEXT_44 = NL;
  protected final String TEXT_45 = NL + NL + "#ifdef TASK_";
  protected final String TEXT_46 = NL + "#define TASK_";
  protected final String TEXT_47 = "_INSTANCE ";
  protected final String TEXT_48 = NL + "#define GEN_";
  protected final String TEXT_49 = "_INSTANCE_ID ";
  protected final String TEXT_50 = NL + "#define GEN_";
  protected final String TEXT_51 = "_INSTANCE_ID ";
  protected final String TEXT_52 = NL + NL + "#define TASK_";
  protected final String TEXT_53 = "_INSTANCE ";
  protected final String TEXT_54 = NL + "#define GEN_TASK_NAME \"";
  protected final String TEXT_55 = "\"" + NL;
  protected final String TEXT_56 = NL + "extern ";
  protected final String TEXT_57 = "_t* ";
  protected final String TEXT_58 = "_";
  protected final String TEXT_59 = ";" + NL + "#define shared_";
  protected final String TEXT_60 = "_";
  protected final String TEXT_61 = " (*";
  protected final String TEXT_62 = "_";
  protected final String TEXT_63 = ")";
  protected final String TEXT_64 = NL;
  protected final String TEXT_65 = NL + "extern char* pending_ptr_";
  protected final String TEXT_66 = ";" + NL + "extern size_t pending_size_";
  protected final String TEXT_67 = ";" + NL + "extern fd_pair_t INPUT_";
  protected final String TEXT_68 = ";" + NL + "#define INPUT_";
  protected final String TEXT_69 = "_";
  protected final String TEXT_70 = "_MAPPED_TO_BYPASS INPUT_";
  protected final String TEXT_71 = NL + "#define SWARM_RECV_INPUT_";
  protected final String TEXT_72 = "_";
  protected final String TEXT_73 = "(__ptr__, __size__) {\\" + NL + "\t_SWARM_RECV_INTERNAL_(INPUT_";
  protected final String TEXT_74 = ", (char*)(__ptr__), (__size__)); \\";
  protected final String TEXT_75 = NL + "    COUNTER_";
  protected final String TEXT_76 = "_INC;\\";
  protected final String TEXT_77 = NL + "}" + NL + "#define SWARM_RECV_LOGGED_INPUT_";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "(__ptr__, __size__) {\\" + NL + "\t_SWARM_RECV_INTERNAL_LOGGED_(INPUT_";
  protected final String TEXT_80 = ", (char*)(__ptr__), (__size__)); \\";
  protected final String TEXT_81 = NL + "    COUNTER_";
  protected final String TEXT_82 = "_INC;\\";
  protected final String TEXT_83 = NL + "}" + NL + "#define SWARM_RECV_NONBLOCKING_INPUT_";
  protected final String TEXT_84 = "_";
  protected final String TEXT_85 = "(__ptr__, __size__) \\" + NL + "\t_SWARM_RECV_INTERNAL_NONBLOCKING_(INPUT_";
  protected final String TEXT_86 = ", (char*)(__ptr__), (__size__))" + NL + "#define SWARM_RECV_BUSY_INPUT_";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = " ({\\" + NL + "    int status = \t_SWARM_RECV_BUSY_INTERNAL_(INPUT_";
  protected final String TEXT_89 = ");\\";
  protected final String TEXT_90 = NL + "    if (!status) { \\" + NL + "        COUNTER_";
  protected final String TEXT_91 = "_INC;\\" + NL + "    }\\";
  protected final String TEXT_92 = NL + "    status;\\" + NL + "})" + NL;
  protected final String TEXT_93 = NL + "#define ";
  protected final String TEXT_94 = "_CHILD_TUBE_COUNT (";
  protected final String TEXT_95 = ")" + NL + "extern fd_pair_t* ";
  protected final String TEXT_96 = "_input_instances[];" + NL + "#define SWARM_RECV_RELATIVE_INPUT_";
  protected final String TEXT_97 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_98 = "_input_instances[(__instance__) % ";
  protected final String TEXT_99 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_100 = "_input_instances[(__instance__) % ";
  protected final String TEXT_101 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_102 = "_input_instances[(__instance__) % ";
  protected final String TEXT_103 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\" + NL + "\tswarm_read_fd(\"INPUT_";
  protected final String TEXT_104 = "_relative \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_105 = "_input_instances[(__instance__) % ";
  protected final String TEXT_106 = "_CHILD_TUBE_COUNT], 0, 0);\\";
  protected final String TEXT_107 = NL + "    COUNTER_";
  protected final String TEXT_108 = "_INC;\\";
  protected final String TEXT_109 = NL + "}" + NL + "#define SWARM_RECV_RELATIVE_LOGGED_INPUT_";
  protected final String TEXT_110 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_111 = "_input_instances[(__instance__) % ";
  protected final String TEXT_112 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_113 = "_input_instances[(__instance__) % ";
  protected final String TEXT_114 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_115 = "_input_instances[(__instance__) % ";
  protected final String TEXT_116 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\" + NL + "\tswarm_read_fd(\"INPUT_";
  protected final String TEXT_117 = "_relative \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_118 = "_input_instances[(__instance__) % ";
  protected final String TEXT_119 = "_CHILD_TUBE_COUNT], 1, 0);\\";
  protected final String TEXT_120 = NL + "    COUNTER_";
  protected final String TEXT_121 = "_INC;\\";
  protected final String TEXT_122 = NL + "}" + NL + "#define SWARM_RECV_NONBLOCKING_RELATIVE_INPUT_";
  protected final String TEXT_123 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_124 = "_input_instances[(__instance__) % ";
  protected final String TEXT_125 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_126 = "_input_instances[(__instance__) % ";
  protected final String TEXT_127 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_128 = "_input_instances[(__instance__) % ";
  protected final String TEXT_129 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\" + NL + "\tswarm_read_fd(\"INPUT_";
  protected final String TEXT_130 = "_relative \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_131 = "_input_instances[(__instance__) % ";
  protected final String TEXT_132 = "_CHILD_TUBE_COUNT], 0, 1);\\" + NL + "}" + NL + "#define SWARM_RECV_BUSY_RELATIVE_INPUT_";
  protected final String TEXT_133 = "(__instance__) ({\\" + NL + "\tswarm_read_fd(\"INPUT_";
  protected final String TEXT_134 = "_relative \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_135 = "_input_instances[(__instance__) % ";
  protected final String TEXT_136 = "_CHILD_TUBE_COUNT], 0, 1);\\";
  protected final String TEXT_137 = NL + "    if (";
  protected final String TEXT_138 = "_input_instances[(__instance__) % ";
  protected final String TEXT_139 = "_CHILD_TUBE_COUNT]->pending_size != 0) { \\" + NL + "        COUNTER_";
  protected final String TEXT_140 = "_INC;\\" + NL + "    }\\";
  protected final String TEXT_141 = NL + "\t";
  protected final String TEXT_142 = "_input_instances[(__instance__) % ";
  protected final String TEXT_143 = "_CHILD_TUBE_COUNT]->pending_size != 0;\\" + NL + "})" + NL;
  protected final String TEXT_144 = NL;
  protected final String TEXT_145 = NL + "extern char* pending_ptr_";
  protected final String TEXT_146 = ";" + NL + "extern size_t pending_size_";
  protected final String TEXT_147 = ";" + NL + "extern fd_pair_t OUTPUT_";
  protected final String TEXT_148 = ";" + NL + "#define OUTPUT_";
  protected final String TEXT_149 = "_";
  protected final String TEXT_150 = "_MAPPED_TO_BYPASS OUTPUT_";
  protected final String TEXT_151 = NL + "#define SWARM_SEND_OUTPUT_";
  protected final String TEXT_152 = "_";
  protected final String TEXT_153 = "(__ptr__, __size__) {\\";
  protected final String TEXT_154 = NL + "    COUNTER_";
  protected final String TEXT_155 = "_INC;\\";
  protected final String TEXT_156 = NL + "\t_SWARM_SEND_INTERNAL_(OUTPUT_";
  protected final String TEXT_157 = ", (char*)(__ptr__), (__size__));\\" + NL + "}" + NL + "#define SWARM_SEND_LOGGED_OUTPUT_";
  protected final String TEXT_158 = "_";
  protected final String TEXT_159 = "(__ptr__, __size__) {\\";
  protected final String TEXT_160 = NL + "    COUNTER_";
  protected final String TEXT_161 = "_INC;\\";
  protected final String TEXT_162 = NL + "\t_SWARM_SEND_INTERNAL_LOGGED_(OUTPUT_";
  protected final String TEXT_163 = ", (char*)(__ptr__), (__size__));\\" + NL + "}" + NL + "" + NL + "#define SWARM_SEND_NONBLOCKING_OUTPUT_";
  protected final String TEXT_164 = "_";
  protected final String TEXT_165 = "(__ptr__, __size__){\\";
  protected final String TEXT_166 = NL + "    COUNTER_";
  protected final String TEXT_167 = "_INC;\\";
  protected final String TEXT_168 = NL + "\t _SWARM_SEND_INTERNAL_NONBLOCKING_(OUTPUT_";
  protected final String TEXT_169 = ", (char*)(__ptr__), (__size__));\\" + NL + "}" + NL + "#define SWARM_SEND_BUSY_OUTPUT_";
  protected final String TEXT_170 = "_";
  protected final String TEXT_171 = " _SWARM_SEND_BUSY_INTERNAL_(OUTPUT_";
  protected final String TEXT_172 = ")";
  protected final String TEXT_173 = NL + NL + "/* Map tube ids to task relative ids */";
  protected final String TEXT_174 = NL + "#define ";
  protected final String TEXT_175 = "_CHILD_TUBE_COUNT (";
  protected final String TEXT_176 = ")" + NL + "extern fd_pair_t* ";
  protected final String TEXT_177 = "_output_instances[];" + NL + "#define SWARM_SEND_RELATIVE_OUTPUT_";
  protected final String TEXT_178 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_179 = "_output_instances[(__instance__) % ";
  protected final String TEXT_180 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_181 = "_output_instances[(__instance__) % ";
  protected final String TEXT_182 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_183 = "_output_instances[(__instance__) % ";
  protected final String TEXT_184 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\";
  protected final String TEXT_185 = NL + "    COUNTER_";
  protected final String TEXT_186 = "_INC;\\";
  protected final String TEXT_187 = NL + "\tswarm_write_fd(\"OUTPUT_";
  protected final String TEXT_188 = "_relative_ \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_189 = "_output_instances[(__instance__) % ";
  protected final String TEXT_190 = "_CHILD_TUBE_COUNT], 0, 0);\\" + NL + "}" + NL + "#define SWARM_SEND_RELATIVE_LOGGED_OUTPUT_";
  protected final String TEXT_191 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_192 = "_output_instances[(__instance__) % ";
  protected final String TEXT_193 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_194 = "_output_instances[(__instance__) % ";
  protected final String TEXT_195 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_196 = "_output_instances[(__instance__) % ";
  protected final String TEXT_197 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\";
  protected final String TEXT_198 = NL + "    COUNTER_";
  protected final String TEXT_199 = "_INC;\\";
  protected final String TEXT_200 = NL + "\tswarm_write_fd(\"OUTPUT_";
  protected final String TEXT_201 = "_relative_ \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_202 = "_output_instances[(__instance__) % ";
  protected final String TEXT_203 = "_CHILD_TUBE_COUNT], 1, 0);\\" + NL + "}" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE_OUTPUT_";
  protected final String TEXT_204 = "(__instance__, __ptr__, __size__) {\\" + NL + "\tassert(";
  protected final String TEXT_205 = "_output_instances[(__instance__) % ";
  protected final String TEXT_206 = "_CHILD_TUBE_COUNT]->pending_size == 0); \\" + NL + "\t";
  protected final String TEXT_207 = "_output_instances[(__instance__) % ";
  protected final String TEXT_208 = "_CHILD_TUBE_COUNT]->pending_ptr = (char*)(__ptr__);\\" + NL + "\t";
  protected final String TEXT_209 = "_output_instances[(__instance__) % ";
  protected final String TEXT_210 = "_CHILD_TUBE_COUNT]->pending_size = (__size__);\\";
  protected final String TEXT_211 = NL + "    COUNTER_";
  protected final String TEXT_212 = "_INC;\\";
  protected final String TEXT_213 = NL + "\tswarm_write_fd(\"OUTPUT_";
  protected final String TEXT_214 = "_relative_ \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_215 = "_output_instances[(__instance__) % ";
  protected final String TEXT_216 = "_CHILD_TUBE_COUNT], 0, 1);\\" + NL + "}" + NL + "#define SWARM_SEND_BUSY_RELATIVE_OUTPUT_";
  protected final String TEXT_217 = "(__instance__) ({\\" + NL + "\tswarm_write_fd(\"OUTPUT_";
  protected final String TEXT_218 = "_relative_ \" # __instance__, \\" + NL + "\t\t";
  protected final String TEXT_219 = "_output_instances[(__instance__) % ";
  protected final String TEXT_220 = "_CHILD_TUBE_COUNT], 0, 1);\\" + NL + "\t";
  protected final String TEXT_221 = "_output_instances[(__instance__) % ";
  protected final String TEXT_222 = "_CHILD_TUBE_COUNT]->pending_size != 0\\" + NL + "\t\t|| (";
  protected final String TEXT_223 = "_output_instances[(__instance__) % ";
  protected final String TEXT_224 = "_CHILD_TUBE_COUNT]->credit_fd >= 0 && \\" + NL + "\t\t";
  protected final String TEXT_225 = "_output_instances[(__instance__) % ";
  protected final String TEXT_226 = "_CHILD_TUBE_COUNT]->init_credits == 0);\\" + NL + "})" + NL;
  protected final String TEXT_227 = NL + NL;
  protected final String TEXT_228 = NL;
  protected final String TEXT_229 = NL + "extern ";
  protected final String TEXT_230 = "_t* ";
  protected final String TEXT_231 = ";" + NL + "#define shared_";
  protected final String TEXT_232 = " (*";
  protected final String TEXT_233 = ")";
  protected final String TEXT_234 = NL + NL + NL + "#endif";
  protected final String TEXT_235 = NL;
  protected final String TEXT_236 = NL + "extern ";
  protected final String TEXT_237 = "_counters_t *counter_file;";
  protected final String TEXT_238 = NL + "#define COUNTER_";
  protected final String TEXT_239 = "_INC (++counter_file->";
  protected final String TEXT_240 = ")" + NL + "#define COUNTER_";
  protected final String TEXT_241 = "_DEC (--counter_file->";
  protected final String TEXT_242 = ")" + NL + "#define COUNTER_";
  protected final String TEXT_243 = "_ADD(__value__) (counter_file->";
  protected final String TEXT_244 = " += (__value__))" + NL + "#define COUNTER_";
  protected final String TEXT_245 = "_SUB(__value__) (counter_file->";
  protected final String TEXT_246 = " -= (__value__))" + NL + "#define COUNTER_";
  protected final String TEXT_247 = "_SET(__value__) (counter_file->";
  protected final String TEXT_248 = " = (__value__))";
  protected final String TEXT_249 = NL + NL + "#endif";
  protected final String TEXT_250 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     MasterCell cell = (MasterCell) argument; 
    stringBuffer.append(TEXT_1);
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    
Collection<CellInstance> cellInstances =  ProjectUtil.getReferringInstances(cell, CellInstance.class);

    stringBuffer.append(TEXT_5);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(((MasterDesign)cell.eContainer()).getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(((MasterDesign)cell.eContainer()).getName());
    stringBuffer.append(TEXT_9);
    for(MasterTube ti : cell.getInput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;

    
    String returnType = ProjectUtil.getReferringInstance(ti, BlockingReceiver.class) == null ? "void" : "int";

    stringBuffer.append(TEXT_10);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_14);
    if(ProjectUtil.getReferringInstance(ti, SingleTubeHandler.class) != null) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_18);
    } else {
    for(Flow flow : MasterUtil.getFlows(ti)) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(returnType);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_26);
    }
    } // SingleTubeHandler 
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(cell.getName().toUpperCase());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(cellInstances.size());
    stringBuffer.append(TEXT_31);
    
  Collection<SharedVariable> sharedVariables = ProjectUtil.getReferringInstances(cell, SharedVariable.class);
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell.getInput(), SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), SharedMemoryTube.class));

    stringBuffer.append(TEXT_32);
    for(SharedVariable svar: sharedVariables) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
    stringBuffer.append(TEXT_37);
    stringBuffer.append(svar.getTube().get(0).getFrom().getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_39);
    
}
    stringBuffer.append(TEXT_40);
    for(SharedVariable svar: sharedVariables) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    
for (CellInstance ci: cellInstances) { 

    stringBuffer.append(TEXT_45);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(ci.getCell().getName().toUpperCase());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ci.getCell().getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(((Instance)ci.eContainer()).getName().toUpperCase());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ci.getCell().getName().toUpperCase());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(ci.getInstance());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_55);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	Collection<MasterTube> tubes = new HashSet<MasterTube>(cell.getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(cell.getOutput());
	sharedTubes.retainAll(tubes);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(ci.getOutput());
	instTubes.addAll(ci.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    stringBuffer.append(TEXT_56);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_63);
    		instanceUsed.add(ti.getInstance());
 	}

    }
    stringBuffer.append(TEXT_64);
    
Map<MasterTube, Integer> indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : ci.getInput()) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_65);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_74);
    
    TubeReceiveCounter rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_75);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_77);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_80);
    
    rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_82);
    }
    stringBuffer.append(TEXT_83);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_89);
    
    rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_90);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    
	i ++;
	indexMap.put(ti.getTube(),new Integer(i));
}

for(MasterTube ti: ci.getCell().getInput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	if (ci != null)
		childTubes.retainAll(ci.getInput());
	Collection<Struct> structList = MasterUtil.getDescriptors(ti);
	String descriptorPrint = "";
	for (Struct struct: structList) {
		descriptorPrint = "swarm_print_struct_" + struct.getName() + "((" + struct.getName() + "_t*)(__ptr__)" + ",0)";
	}
	if(childTubes.size() == 0) continue;

    stringBuffer.append(TEXT_93);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_106);
    
    TubeReceiveCounter rcounter = ProjectUtil.getReferringInstance(ti, TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_119);
    
    rcounter = ProjectUtil.getReferringInstance(ti, TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_120);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_136);
    
    rcounter = ProjectUtil.getReferringInstance(ti, TubeReceiveCounter.class);
    if(rcounter != null) {
    stringBuffer.append(TEXT_137);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_138);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_140);
    }
    stringBuffer.append(TEXT_141);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_143);
    }
    stringBuffer.append(TEXT_144);
    
indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : ci.getOutput()) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_145);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_153);
    
    TubeTransmitCounter tcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_155);
    }
    stringBuffer.append(TEXT_156);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_159);
    
    tcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_160);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_165);
    
    tcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_166);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(TEXT_168);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(ti.getTube().getName().toUpperCase());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_172);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
	}

    stringBuffer.append(TEXT_173);
    for(MasterTube ti: ci.getCell().getOutput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	if (ci != null)
		childTubes.retainAll(ci.getOutput());
	Collection<Struct> structList = MasterUtil.getDescriptors(ti);
	String descriptorPrint = "";
	for (Struct struct: structList) {
		descriptorPrint = "swarm_print_struct_" + struct.getName() + "((" + struct.getName() + "_t*)(__ptr__)" + ",0)";
	}
	if(childTubes.size() == 0) continue;

    stringBuffer.append(TEXT_174);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_175);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_183);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_184);
    
    TubeTransmitCounter tcounter = ProjectUtil.getReferringInstance(ti, TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_186);
    }
    stringBuffer.append(TEXT_187);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_188);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_197);
    
    tcounter = ProjectUtil.getReferringInstance(ti, TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_199);
    }
    stringBuffer.append(TEXT_200);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_208);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_209);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_210);
    
    tcounter = ProjectUtil.getReferringInstance(ti, TubeTransmitCounter.class);
    if(tcounter != null) {
    stringBuffer.append(TEXT_211);
    stringBuffer.append(tcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_214);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_215);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_218);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_221);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_226);
    }
    stringBuffer.append(TEXT_227);
    
  Collection<SharedVariable> ciSharedVariables = ProjectUtil.getReferringInstances(ci.getCell(), SharedVariable.class);

    stringBuffer.append(TEXT_228);
    for(SharedVariable svar: ciSharedVariables) {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_233);
    }
    stringBuffer.append(TEXT_234);
    
}

    stringBuffer.append(TEXT_235);
    
Collection<Counter> counters = ProjectUtil.getReferringInstances(cell, Counter.class);
counters.addAll(ProjectUtil.getReferringInstances(cell.getInput(), TubeReceiveCounter.class));
counters.addAll(ProjectUtil.getReferringInstances(cell.getOutput(), TubeTransmitCounter.class));
if(counters.size() != 0) {

    stringBuffer.append(TEXT_236);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_237);
    for(Counter counter: counters) {
        String type;
        switch(counter.getWidth()) {
        case _16BIT: type = "uint16_t"; break;
        case _32BIT: type = "uint32_t"; break;
        case _64BIT: type = "uint64_t"; break;
        }
    
    stringBuffer.append(TEXT_238);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_243);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_244);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(counter.getName().toUpperCase());
    stringBuffer.append(TEXT_247);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_248);
      }
}
    stringBuffer.append(TEXT_249);
    stringBuffer.append(TEXT_250);
    return stringBuffer.toString();
  }
}
