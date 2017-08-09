package com.brainspeedtech.gen.software.posix.vpi;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.gen.software.posix.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.layer.util.*;;

public class InstanceVPIFile
{
  protected static String nl;
  public static synchronized InstanceVPIFile create(String lineSeparator)
  {
    nl = lineSeparator;
    InstanceVPIFile result = new InstanceVPIFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "#include <vpi_user.h>" + NL + "#include <acc_user.h>" + NL + "#include <veriuser.h>" + NL + "#include <stdlib.h>" + NL + "#include <stdio.h>" + NL + "#include <errno.h>" + NL + "#include <string.h>" + NL + "#include <sys/socket.h>" + NL + "#include <sys/types.h>" + NL + "#include <netinet/in.h>" + NL + "#include <unistd.h>" + NL + "#include <arpa/inet.h>" + NL + "#include <fcntl.h>" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_3 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = "_t* ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL + "fd_pair_t* ";
  protected final String TEXT_11 = "_output_instances[";
  protected final String TEXT_12 = "];";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "fd_pair_t* ";
  protected final String TEXT_15 = "_input_instances[";
  protected final String TEXT_16 = "];";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL;
  protected final String TEXT_19 = "_t ";
  protected final String TEXT_20 = ";";
  protected final String TEXT_21 = NL;
  protected final String TEXT_22 = NL + "char* pending_ptr_";
  protected final String TEXT_23 = " = NULL;" + NL + "size_t pending_size_";
  protected final String TEXT_24 = " = 0;" + NL + "fd_pair_t INPUT_";
  protected final String TEXT_25 = " = { -1, -1, 0 };";
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = NL + "char* pending_ptr_";
  protected final String TEXT_28 = " = NULL;" + NL + "size_t pending_size_";
  protected final String TEXT_29 = " = 0;" + NL + "fd_pair_t OUTPUT_";
  protected final String TEXT_30 = " = { -1, -1, 0 };";
  protected final String TEXT_31 = NL;
  protected final String TEXT_32 = NL;
  protected final String TEXT_33 = NL + "int listen_";
  protected final String TEXT_34 = ";";
  protected final String TEXT_35 = NL + "int connect_";
  protected final String TEXT_36 = ";";
  protected final String TEXT_37 = NL + NL + "int work_dir_fd;" + NL + "int call_idle = 1;" + NL + "char* program_instance_name;" + NL + "" + NL + "static int ";
  protected final String TEXT_38 = "_compiletf(char*user_data)" + NL + "{" + NL + "\tvpiHandle systfref;" + NL + "\tvpiHandle args_iter;" + NL + "\t" + NL + "\tstruct t_vpi_value log_location_value = { .format = vpiStringVal," + NL + "\t\t\t.value.integer = 0 };" + NL + "\tvpi_printf(\"";
  protected final String TEXT_39 = " VPI\\n\");" + NL + "\t" + NL + "\t" + NL + "" + NL + "" + NL + "\tsystfref = vpi_handle(vpiSysTfCall, NULL);" + NL + "\targs_iter = vpi_iterate(vpiArgument, systfref);" + NL + "    vpi_get_value(vpi_scan(args_iter), &log_location_value);" + NL + "    " + NL + "" + NL + "\t" + NL + "\tvpi_free_object(args_iter);" + NL + "\t" + NL + "\tprogram_instance_name = log_location_value.value.str;" + NL + "\tint iofd __attribute__((unused));" + NL + "\t" + NL + "\tdesign_startup(program_instance_name);" + NL + "\t\t" + NL + "" + NL + "" + NL + "" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd < 0) {" + NL + "\t\tperror(\"Error opening work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\t// Setup all read pipes";
  protected final String TEXT_40 = NL + "\tSWARM_PRINT(\"Setting up tube ";
  protected final String TEXT_41 = "\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_42 = "\", O_RDONLY | O_NONBLOCK);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_43 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tINPUT_";
  protected final String TEXT_44 = ".fd = iofd;";
  protected final String TEXT_45 = NL + NL + "\t// Setup all server sockets";
  protected final String TEXT_46 = NL + "\tiofd = swarm_tcp_server_socket(\"";
  protected final String TEXT_47 = "\", \"";
  protected final String TEXT_48 = "\", ";
  protected final String TEXT_49 = ");" + NL + "\tlisten_";
  protected final String TEXT_50 = " = iofd;";
  protected final String TEXT_51 = NL + "\tiofd = swarm_unix_server_socket(\"";
  protected final String TEXT_52 = "\", program_instance_name);" + NL + "\tlisten_";
  protected final String TEXT_53 = " = iofd;";
  protected final String TEXT_54 = NL + NL + NL + "\treturn 0;" + NL + "}" + NL + "" + NL + "static void ";
  protected final String TEXT_55 = "_post_init()" + NL + "{" + NL + "\tstatic int first_time = 1;" + NL + "\tint iofd __attribute__((unused));" + NL + "\tint read_size __attribute__((unused));" + NL + "\tint nfds __attribute__((unused));" + NL + "\tint mem_file __attribute__((unused));" + NL + "\t" + NL + "\t" + NL + "\tif (!first_time) return;" + NL + "" + NL + "\tvpiHandle systfref;" + NL + "\tvpiHandle args_iter;" + NL + "\t" + NL + "\tsystfref = vpi_handle(vpiSysTfCall, NULL);" + NL + "\targs_iter = vpi_iterate(vpiArgument, systfref);" + NL + "\tvpi_scan(args_iter);" + NL + "" + NL + "\t// Setup all write pipes";
  protected final String TEXT_56 = NL + "\tSWARM_PRINT(\"Setting up tube ";
  protected final String TEXT_57 = "\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_58 = "\", O_WRONLY);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_59 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_60 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tOUTPUT_";
  protected final String TEXT_61 = ".fd = iofd;";
  protected final String TEXT_62 = NL + "\t// Setup all client sockets";
  protected final String TEXT_63 = NL + "\tiofd = swarm_tcp_client_socket(\"";
  protected final String TEXT_64 = "\", \"";
  protected final String TEXT_65 = "\", ";
  protected final String TEXT_66 = ");";
  protected final String TEXT_67 = NL + "\tiofd = swarm_unix_client_socket(\"";
  protected final String TEXT_68 = "\", program_instance_name);";
  protected final String TEXT_69 = NL + "\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK ) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_70 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tconnect_";
  protected final String TEXT_71 = " = iofd;";
  protected final String TEXT_72 = NL + NL + "\t// Finish accept on servers and connects on client sockets";
  protected final String TEXT_73 = NL + NL + "\tfd_set listenfdset;" + NL + "\tfd_set connectfdset;" + NL + "\tint total_connections;" + NL + "" + NL + "\ttotal_connections = ";
  protected final String TEXT_74 = ";" + NL + "\twhile(total_connections) {" + NL + "\t\tFD_ZERO(&listenfdset);" + NL + "\t\tFD_ZERO(&connectfdset);" + NL + "\t\tnfds = 0;" + NL + "\t\t";
  protected final String TEXT_75 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_76 = ".fd == -1) {" + NL + "\t\t\tFD_SET(listen_";
  protected final String TEXT_77 = ", &listenfdset);" + NL + "\t\t\tif (nfds <= listen_";
  protected final String TEXT_78 = ")" + NL + "\t\t\t\tnfds = listen_";
  protected final String TEXT_79 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_80 = NL + "\t\tif(INPUT_";
  protected final String TEXT_81 = ".fd == -1) {" + NL + "\t\t\tFD_SET(listen_";
  protected final String TEXT_82 = ", &listenfdset);" + NL + "\t\t\tif (nfds <= listen_";
  protected final String TEXT_83 = ")" + NL + "\t\t\t\tnfds = listen_";
  protected final String TEXT_84 = " + 1;" + NL + "\t\t\t" + NL + "\t\t}";
  protected final String TEXT_85 = NL;
  protected final String TEXT_86 = NL + "\t\tif(INPUT_";
  protected final String TEXT_87 = ".fd == -1) {" + NL + "\t\t\tFD_SET(connect_";
  protected final String TEXT_88 = ", &connectfdset);" + NL + "\t\t\tif (nfds <= connect_";
  protected final String TEXT_89 = ")" + NL + "\t\t\t\tnfds = connect_";
  protected final String TEXT_90 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_91 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_92 = ".fd == -1) {" + NL + "\t\t\tFD_SET(connect_";
  protected final String TEXT_93 = ", &connectfdset);" + NL + "\t\t\tif (nfds <= connect_";
  protected final String TEXT_94 = ")" + NL + "\t\t\t\tnfds = connect_";
  protected final String TEXT_95 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_96 = NL + NL + "\t\tif(select(nfds, &listenfdset, &connectfdset, NULL, NULL) < 0) {" + NL + "\t\t\tperror(\"Error in socket connection establishment\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_97 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_98 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(listen_";
  protected final String TEXT_99 = ", &listenfdset)) {" + NL + "\t\t\t\tiofd = OUTPUT_";
  protected final String TEXT_100 = ".fd = " + NL + "\t\t\t\t\taccept(listen_";
  protected final String TEXT_101 = ", NULL, NULL);" + NL + "\t\t\t\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\t\t\t\tperror(\"Could not set non blocking flag for <";
  protected final String TEXT_102 = "\");" + NL + "\t\t\t\t\texit(-1);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tclose(listen_";
  protected final String TEXT_103 = ");\t\t" + NL + "\t\t\t\tfprintf(stderr, \"Server connected on socket tube ";
  protected final String TEXT_104 = "\\n\");" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_105 = NL + "\t\tif(INPUT_";
  protected final String TEXT_106 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(listen_";
  protected final String TEXT_107 = ", &listenfdset)) {" + NL + "\t\t\t\tiofd = INPUT_";
  protected final String TEXT_108 = ".fd = " + NL + "\t\t\t\t\taccept(listen_";
  protected final String TEXT_109 = ",NULL, NULL);" + NL + "\t\t\t\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\t\t\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_110 = "\");" + NL + "\t\t\t\t\texit(-1);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tclose(listen_";
  protected final String TEXT_111 = ");\t\t" + NL + "\t\t\t\tfprintf(stderr, \"Server connected on socket tube ";
  protected final String TEXT_112 = "\\n\"); " + NL + "\t\t" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_113 = NL;
  protected final String TEXT_114 = NL + "\t\tif(INPUT_";
  protected final String TEXT_115 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(connect_";
  protected final String TEXT_116 = ", &connectfdset)) {" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_117 = ".fd = connect_";
  protected final String TEXT_118 = ";" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t\tfprintf(stderr, \"Client connected on socket tube ";
  protected final String TEXT_119 = "\\n\");" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_120 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_121 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(connect_";
  protected final String TEXT_122 = ", &connectfdset)) {" + NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_123 = ".fd = connect_";
  protected final String TEXT_124 = ";" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t\tfprintf(stderr, \"Client connected on socket tube ";
  protected final String TEXT_125 = "\\n\");" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_126 = NL + NL + "\t}";
  protected final String TEXT_127 = NL + "\t// Map shared memories";
  protected final String TEXT_128 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_129 = "\", O_RDWR);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_130 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_131 = " = (";
  protected final String TEXT_132 = "_t*)mmap(NULL, " + NL + "\t\tsizeof(";
  protected final String TEXT_133 = "_t) * ";
  protected final String TEXT_134 = ", PROT_READ | PROT_WRITE," + NL + "\t\tMAP_SHARED, mem_file, 0);" + NL + "\tif (";
  protected final String TEXT_135 = " == NULL) {" + NL + "\t\tperror(\"Error mapping memfile mem__";
  protected final String TEXT_136 = "\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_137 = NL + NL;
  protected final String TEXT_138 = NL + "\t";
  protected final String TEXT_139 = "_input_instances[";
  protected final String TEXT_140 = "] = &INPUT_";
  protected final String TEXT_141 = ";";
  protected final String TEXT_142 = NL + "\t";
  protected final String TEXT_143 = "_output_instances[";
  protected final String TEXT_144 = "] = &OUTPUT_";
  protected final String TEXT_145 = ";";
  protected final String TEXT_146 = NL + NL + "\tSWARM_PRINT(\"All queues created\\n\");\t" + NL + "\tcall_idle = ";
  protected final String TEXT_147 = "_init();" + NL;
  protected final String TEXT_148 = NL;
  protected final String TEXT_149 = NL + "\tpending_ptr_";
  protected final String TEXT_150 = " = (char*)&";
  protected final String TEXT_151 = ";" + NL + "\tpending_size_";
  protected final String TEXT_152 = " = sizeof(";
  protected final String TEXT_153 = ");" + NL + "\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_154 = "(%d): Posting receive %p(%d) type ";
  protected final String TEXT_155 = "_t\\n\", " + NL + "\t\tINPUT_";
  protected final String TEXT_156 = ".fd" + NL + "\t\t,&";
  protected final String TEXT_157 = ", (int)sizeof(";
  protected final String TEXT_158 = "));";
  protected final String TEXT_159 = NL + NL + "\tfirst_time = 0;" + NL + "\t" + NL + "}" + NL + "" + NL + "static int ";
  protected final String TEXT_160 = "_calltf(char*user_data)" + NL + "{" + NL + "\t";
  protected final String TEXT_161 = "_post_init();" + NL;
  protected final String TEXT_162 = NL + "\tint flow;" + NL + "\tint read_size;" + NL;
  protected final String TEXT_163 = NL + "\t" + NL + "\tread_size = read(INPUT_";
  protected final String TEXT_164 = ".fd, " + NL + "\t\tpending_ptr_";
  protected final String TEXT_165 = "," + NL + "\t\tpending_size_";
  protected final String TEXT_166 = ");" + NL + "\tif (read_size < 0) {" + NL + "\t\tif(errno != EAGAIN && errno != EWOULDBLOCK) {" + NL + "\t\t\tperror(\"Error reading from INPUT_";
  protected final String TEXT_167 = "\");" + NL + "\t\t\tSWARM_FATAL_ERROR;" + NL + "\t\t}" + NL + "\t\tread_size = 0;" + NL + "\t}" + NL + "\tpending_size_";
  protected final String TEXT_168 = " -= read_size;" + NL + "\tpending_ptr_";
  protected final String TEXT_169 = " += read_size;" + NL + "\t" + NL + "\tif(pending_size_";
  protected final String TEXT_170 = " == 0) {" + NL + "\t\tSWARM_PRINT_NL(";
  protected final String TEXT_171 = ", \"";
  protected final String TEXT_172 = "(%d): Received data type ";
  protected final String TEXT_173 = "_t\\n\", " + NL + "\t\t\tINPUT_";
  protected final String TEXT_174 = ".fd);" + NL + "\t\tswarm_dump_data_nl(";
  protected final String TEXT_175 = ", 0, (char*)&";
  protected final String TEXT_176 = ", sizeof(";
  protected final String TEXT_177 = "));" + NL + "\t\tflow = get_";
  protected final String TEXT_178 = "_flow(&";
  protected final String TEXT_179 = ");" + NL + "\t\tswitch(flow) {";
  protected final String TEXT_180 = NL + "\t\tcase ENUM_";
  protected final String TEXT_181 = "_";
  protected final String TEXT_182 = "_FLOW:" + NL + "\t\t\tSWARM_PRINT_NL(";
  protected final String TEXT_183 = ", \"Processing flow ";
  protected final String TEXT_184 = "\\n\");" + NL + "\t\t\t";
  protected final String TEXT_185 = "_";
  protected final String TEXT_186 = "_handler(&";
  protected final String TEXT_187 = ");" + NL + "\t\t\tbreak;";
  protected final String TEXT_188 = " " + NL + "\t\t\tdefault:" + NL + "\t\t\t\tSWARM_PRINT(\"Bad flow in cell instance ";
  protected final String TEXT_189 = " ->";
  protected final String TEXT_190 = "\\n\");" + NL + "\t\t\t\tSWARM_FATAL_ERROR;" + NL + "\t\t\t\tbreak;" + NL + "\t\t}" + NL + "\t\tpending_ptr_";
  protected final String TEXT_191 = " = (char*)&";
  protected final String TEXT_192 = ";" + NL + "\t\tpending_size_";
  protected final String TEXT_193 = " = sizeof(";
  protected final String TEXT_194 = ");" + NL + "\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_195 = "(%d): Posting receive %p(%d) type ";
  protected final String TEXT_196 = "_t\\n\", " + NL + "\t\t\tINPUT_";
  protected final String TEXT_197 = ".fd" + NL + "\t\t\t,&";
  protected final String TEXT_198 = ", (int)sizeof(";
  protected final String TEXT_199 = "));" + NL + "\t}";
  protected final String TEXT_200 = NL + NL + "\tif (call_idle) {" + NL + "\t\tcall_idle = ";
  protected final String TEXT_201 = "_idle();" + NL + "\t}" + NL + "\t" + NL + "\treturn 0;" + NL + "" + NL + "}" + NL + "" + NL + "void ";
  protected final String TEXT_202 = "_register()" + NL + "{" + NL + "\ts_vpi_systf_data tf_data;" + NL + "" + NL + "\ttf_data.type = vpiSysTask;" + NL + "\ttf_data.tfname = \"$";
  protected final String TEXT_203 = "_vpi\";" + NL + "\ttf_data.calltf = ";
  protected final String TEXT_204 = "_calltf;" + NL + "\ttf_data.compiletf = ";
  protected final String TEXT_205 = "_compiletf;" + NL + "\ttf_data.sizetf = 0;" + NL + "\ttf_data.user_data = 0;" + NL + "\tvpi_register_systf(&tf_data);" + NL + "}" + NL + "" + NL + "void (*vlog_startup_routines[])() = {" + NL + "\t";
  protected final String TEXT_206 = "_register," + NL + "\t0" + NL + "}\t;" + NL;
  protected final String TEXT_207 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    CellInstance instance = (CellInstance) argument;
  Instance designInstance = (Instance)instance.eContainer();
  
  Set<SharedVariable> sharedVariables = new HashSet<SharedVariable>();
  sharedVariables.addAll(ProjectUtil.getReferringInstances(instance, SharedVariable.class));
  sharedVariables.addAll(ProjectUtil.getReferringInstances(instance.getCell(), SharedVariable.class));
    
  Map<TubeInstance, SocketTube> serverSocketTubes = PosixUtil.getServerSocketTubes(instance);
  Map<TubeInstance, SocketTube> clientSocketTubes = PosixUtil.getClientSocketTubes(instance);
  Set<TubeInstance> pipeInputs = new HashSet<TubeInstance>();
  pipeInputs.addAll(instance.getInput());
  pipeInputs.removeAll(serverSocketTubes.keySet());
  pipeInputs.removeAll(clientSocketTubes.keySet());
  Set<TubeInstance> pipeOutputs = new HashSet<TubeInstance>();
  pipeOutputs.addAll(instance.getOutput());
  pipeOutputs.removeAll(serverSocketTubes.keySet());
  pipeOutputs.removeAll(clientSocketTubes.keySet());
  

    stringBuffer.append(TEXT_2);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(designInstance.getName());
    stringBuffer.append(TEXT_4);
    
int noiseLevel = 1;
if (instance.getCell().isExternal()) {
	noiseLevel = 2;
}

    stringBuffer.append(TEXT_5);
    for(SharedVariable svar: sharedVariables) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
      if (ProjectUtil.getReferringInstance(instance, CustomInstanceCell.class) == null &&
		ProjectUtil.getReferringInstance(instance.getCell(), CustomMasterCell.class) == null) {

    for(MasterTube ti: instance.getCell().getOutput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	childTubes.retainAll(instance.getOutput());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    for(MasterTube ti: instance.getCell().getInput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	childTubes.retainAll(instance.getInput());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    for(TubeInstance ti : instance.getInput()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    for(TubeInstance ti : instance.getInput()) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    for(TubeInstance ti : instance.getOutput()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    for(TubeInstance ti : serverSocketTubes.keySet()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_34);
    }
    for(TubeInstance ti : clientSocketTubes.keySet()) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_36);
    }
    stringBuffer.append(TEXT_37);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_39);
    for(TubeInstance ti: pipeInputs) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_44);
    
	}

    stringBuffer.append(TEXT_45);
    for(TubeInstance ti : serverSocketTubes.keySet()) {
	if(serverSocketTubes.get(ti) instanceof TCPSocketTube) {
	TCPSocketTube socketTube = (TCPSocketTube)serverSocketTubes.get(ti);

    stringBuffer.append(TEXT_46);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(socketTube.getServerIP());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(socketTube.getServerPort());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_50);
    }
    
	if(serverSocketTubes.get(ti) instanceof UnixSocketTube) {
	UnixSocketTube socketTube = (UnixSocketTube)serverSocketTubes.get(ti);

    stringBuffer.append(TEXT_51);
    stringBuffer.append(socketTube.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_53);
    }
    }
    stringBuffer.append(TEXT_54);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_55);
    for(TubeInstance ti: pipeOutputs) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_61);
    
	}

    stringBuffer.append(TEXT_62);
    for(TubeInstance ti : clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti) instanceof TCPSocketTube) {
	TCPSocketTube socketTube = (TCPSocketTube)clientSocketTubes.get(ti);

    stringBuffer.append(TEXT_63);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(socketTube.getServerIP());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(socketTube.getServerPort());
    stringBuffer.append(TEXT_66);
    }
    
	if (clientSocketTubes.get(ti) instanceof UnixSocketTube) {
	UnixSocketTube socketTube = (UnixSocketTube)clientSocketTubes.get(ti);

    stringBuffer.append(TEXT_67);
    stringBuffer.append(socketTube.getName());
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_72);
    if(!serverSocketTubes.isEmpty() || !clientSocketTubes.isEmpty() ) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(serverSocketTubes.size() + clientSocketTubes.size());
    stringBuffer.append(TEXT_74);
    for(TubeInstance ti: serverSocketTubes.keySet()) {
	if (serverSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_79);
      } else { 
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_84);
    
	}
}
    stringBuffer.append(TEXT_85);
    for(TubeInstance ti: clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_86);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_90);
      } else { 
    stringBuffer.append(TEXT_91);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_95);
    
	}
}
    stringBuffer.append(TEXT_96);
    for(TubeInstance ti: serverSocketTubes.keySet()) {
	if (serverSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_97);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_104);
      } else { 
    stringBuffer.append(TEXT_105);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_112);
    
	}
}
    stringBuffer.append(TEXT_113);
    for(TubeInstance ti: clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_119);
      } else { 
    stringBuffer.append(TEXT_120);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_121);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_125);
    
	}
}
    stringBuffer.append(TEXT_126);
    }
    stringBuffer.append(TEXT_127);
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_128);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(svar.getCount());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_136);
    
}

    stringBuffer.append(TEXT_137);
    
Map<MasterTube, Integer> indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : instance.getInput()) {
	if(ProjectUtil.getReferringInstance(ti.getTube(), Tap.class) != null &&
		ProjectUtil.getReferringInstance(ti.getTube(), Tap.class).getCell() == instance.getCell()) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_138);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_141);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
}
indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : instance.getOutput()) {
	if(ProjectUtil.getReferringInstance(ti.getTube(), Tap.class) != null &&
		ProjectUtil.getReferringInstance(ti.getTube(), Tap.class).getCell() == instance.getCell()) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_142);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_145);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
	}

    stringBuffer.append(TEXT_146);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_147);
      if (ProjectUtil.getReferringInstance(instance, CustomInstanceCell.class) == null &&
		ProjectUtil.getReferringInstance(instance.getCell(), CustomMasterCell.class) == null) {

    stringBuffer.append(TEXT_148);
    for(TubeInstance ti : instance.getInput()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_150);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_154);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_158);
    }
    }
    stringBuffer.append(TEXT_159);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_160);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_161);
    if(instance.getInput().size() > 0) {
    stringBuffer.append(TEXT_162);
    for(TubeInstance ti : instance.getInput()) {
    stringBuffer.append(TEXT_163);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_164);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_169);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_170);
    stringBuffer.append(noiseLevel);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(noiseLevel);
    stringBuffer.append(TEXT_175);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_176);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_177);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_179);
    for(Flow flow: MasterUtil.getFlows(ti.getTube())) {
    stringBuffer.append(TEXT_180);
    stringBuffer.append(((Instance)instance.eContainer()).getName().toUpperCase());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(noiseLevel);
    stringBuffer.append(TEXT_183);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_187);
    }
    stringBuffer.append(TEXT_188);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_194);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_196);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_198);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_199);
    }
    }
    stringBuffer.append(TEXT_200);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_202);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(TEXT_207);
    return stringBuffer.toString();
  }
}
