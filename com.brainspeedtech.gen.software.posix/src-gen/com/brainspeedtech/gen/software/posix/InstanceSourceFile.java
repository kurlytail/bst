package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.swarm.master.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.layer.util.*;;

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
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#include <sys/select.h>" + NL + "#include <sys/types.h>" + NL + "#include <sys/socket.h>" + NL + "#include <unistd.h>" + NL + "#include <fcntl.h>" + NL + "#include <stdio.h>" + NL + "#include <errno.h>" + NL + "#include <stdlib.h>" + NL + "#include <sched.h>" + NL + "#include <stdint.h>" + NL + "#include <sys/mman.h>" + NL + "#include <semaphore.h>" + NL + "#include <signal.h>" + NL + "#include \"gen_";
  protected final String TEXT_4 = ".h\"" + NL + "" + NL + "const char* taskname = \"";
  protected final String TEXT_5 = "\";" + NL + "const char* log_file_name = \"log__";
  protected final String TEXT_6 = "_circ_0\";" + NL + "const char* log_file_name_second = \"log__";
  protected final String TEXT_7 = "_circ_1\";" + NL + "" + NL + "char name_buffer[4096];" + NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = "_counters_t *counter_file;";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = "_t* ";
  protected final String TEXT_13 = ";" + NL + "sem_t *mem_init_";
  protected final String TEXT_14 = "_sem;";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = "_t* ";
  protected final String TEXT_17 = "_";
  protected final String TEXT_18 = ";" + NL + "sem_t *mem_init_";
  protected final String TEXT_19 = "_";
  protected final String TEXT_20 = "_sem;";
  protected final String TEXT_21 = NL;
  protected final String TEXT_22 = NL + "fd_pair_t* ";
  protected final String TEXT_23 = "_output_instances[";
  protected final String TEXT_24 = "];";
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = NL + "fd_pair_t* ";
  protected final String TEXT_27 = "_input_instances[";
  protected final String TEXT_28 = "];";
  protected final String TEXT_29 = NL;
  protected final String TEXT_30 = NL + "int listen_";
  protected final String TEXT_31 = " = 0;";
  protected final String TEXT_32 = NL + "int connect_";
  protected final String TEXT_33 = " = 0;";
  protected final String TEXT_34 = NL;
  protected final String TEXT_35 = NL;
  protected final String TEXT_36 = "_t ";
  protected final String TEXT_37 = ";";
  protected final String TEXT_38 = NL;
  protected final String TEXT_39 = NL + "fd_pair_t INPUT_";
  protected final String TEXT_40 = " = { -1, -1, 0 };";
  protected final String TEXT_41 = NL;
  protected final String TEXT_42 = NL + "fd_pair_t OUTPUT_";
  protected final String TEXT_43 = " = { -1, -1, 0 };";
  protected final String TEXT_44 = NL + NL + "int work_dir_fd;" + NL + "" + NL + "void terminate_all()" + NL + "{" + NL + "\t\t";
  protected final String TEXT_45 = NL + "\tif(OUTPUT_";
  protected final String TEXT_46 = ".fd != -1) {" + NL + "\t\tclose(OUTPUT_";
  protected final String TEXT_47 = ".fd);" + NL + "\t}";
  protected final String TEXT_48 = NL + "\tif(INPUT_";
  protected final String TEXT_49 = ".fd != -1) {" + NL + "\t\tclose(INPUT_";
  protected final String TEXT_50 = ".fd);" + NL + "\t}";
  protected final String TEXT_51 = NL + "\tif(INPUT_";
  protected final String TEXT_52 = ".fd != -1) {" + NL + "\t\tclose(INPUT_";
  protected final String TEXT_53 = ".fd);" + NL + "\t}";
  protected final String TEXT_54 = NL + "\tif(OUTPUT_";
  protected final String TEXT_55 = ".fd != -1) {" + NL + "\t\tclose(OUTPUT_";
  protected final String TEXT_56 = ".fd);" + NL + "\t}";
  protected final String TEXT_57 = NL + "}" + NL + "" + NL + "extern int log_file_size;" + NL + "" + NL + "void kill_handler(int signum)" + NL + "{" + NL + "\tswarm_print(0, \"";
  protected final String TEXT_58 = " Received signal %d, exiting \\n\", signum);" + NL + "\texit(-1);" + NL + "}" + NL + "" + NL + "int main(int argc, char* argv[])" + NL + "{" + NL + "\tchar* program_instance_name = argv[2];" + NL + "\tint iofd;" + NL + "\tint32_t read_size;" + NL + "\tint call_idle = 1;" + NL + "\tint nfds;" + NL + "\tint mem_file;" + NL + "" + NL + "\tlog_file_size = atoi(argv[1]);" + NL;
  protected final String TEXT_59 = NL + "\tfd_set listenfdset;" + NL + "\tfd_set connectfdset;" + NL + "\tint total_connections;";
  protected final String TEXT_60 = NL + NL + "\tatexit(terminate_all);" + NL + "\tsignal(SIGINT, kill_handler);" + NL + "\tsignal(SIGTERM, kill_handler);" + NL + "\t" + NL + "" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd < 0) {" + NL + "\t\tperror(\"Error opening work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\t// Setup all read pipes";
  protected final String TEXT_61 = NL + "\tswarm_print(0, \"Setting up tube ";
  protected final String TEXT_62 = "\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_63 = "\", O_RDONLY | O_NONBLOCK);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_64 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tINPUT_";
  protected final String TEXT_65 = ".fd = iofd;";
  protected final String TEXT_66 = NL;
  protected final String TEXT_67 = NL + "\tswarm_print(0, \"Setting up credit tube ";
  protected final String TEXT_68 = "\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_69 = "_credit\", O_RDONLY | O_NONBLOCK);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_70 = "_credit\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tOUTPUT_";
  protected final String TEXT_71 = ".credit_fd = iofd;" + NL + "\tOUTPUT_";
  protected final String TEXT_72 = ".init_credits = ";
  protected final String TEXT_73 = ";";
  protected final String TEXT_74 = NL + NL + "\t// Setup all server sockets";
  protected final String TEXT_75 = NL + "\tiofd = swarm_tcp_server_socket(\"";
  protected final String TEXT_76 = "\", \"";
  protected final String TEXT_77 = "\", ";
  protected final String TEXT_78 = " + getuid());" + NL + "\tlisten_";
  protected final String TEXT_79 = " = iofd;";
  protected final String TEXT_80 = NL + "\tiofd = swarm_unix_server_socket(\"";
  protected final String TEXT_81 = "\", program_instance_name);" + NL + "\tlisten_";
  protected final String TEXT_82 = " = iofd;";
  protected final String TEXT_83 = NL + NL + "\t// Setup all write pipes";
  protected final String TEXT_84 = NL + "\tswarm_print(0, \"Setting up tube ";
  protected final String TEXT_85 = "\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_86 = "\", O_WRONLY);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_87 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_88 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tOUTPUT_";
  protected final String TEXT_89 = ".fd = iofd;";
  protected final String TEXT_90 = NL + NL + "\t// Setup all credit write pipes";
  protected final String TEXT_91 = NL + "\tswarm_print(0, \"Setting up tube ";
  protected final String TEXT_92 = "_credit\\n\");" + NL + "\tiofd = openat(work_dir_fd, \"fifo_";
  protected final String TEXT_93 = "_credit\", O_WRONLY);" + NL + "\tif (iofd < 0) {" + NL + "\t\tperror(\"Error opening fifo fifo_";
  protected final String TEXT_94 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tINPUT_";
  protected final String TEXT_95 = ".credit_fd = iofd;" + NL + "\tINPUT_";
  protected final String TEXT_96 = ".init_credits = ";
  protected final String TEXT_97 = ";";
  protected final String TEXT_98 = NL + NL + NL + NL + "\t// Setup all client sockets";
  protected final String TEXT_99 = NL + "\tiofd = swarm_tcp_client_socket(\"";
  protected final String TEXT_100 = "\", \"";
  protected final String TEXT_101 = "\", ";
  protected final String TEXT_102 = " + getuid());";
  protected final String TEXT_103 = NL + "\tiofd = swarm_unix_client_socket(\"";
  protected final String TEXT_104 = "\", program_instance_name);";
  protected final String TEXT_105 = NL + "\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK ) < 0) {" + NL + "\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_106 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tconnect_";
  protected final String TEXT_107 = " = iofd;";
  protected final String TEXT_108 = NL + NL + "\t// Finish accept on servers and connects on client sockets";
  protected final String TEXT_109 = NL + "\ttotal_connections = ";
  protected final String TEXT_110 = ";" + NL + "\twhile(total_connections) {" + NL + "\t\tFD_ZERO(&listenfdset);" + NL + "\t\tFD_ZERO(&connectfdset);" + NL + "\t\tnfds = 0;" + NL + "\t\t";
  protected final String TEXT_111 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_112 = ".fd == -1) {" + NL + "\t\t\tFD_SET(listen_";
  protected final String TEXT_113 = ", &listenfdset);" + NL + "\t\t\tif (nfds <= listen_";
  protected final String TEXT_114 = ")" + NL + "\t\t\t\tnfds = listen_";
  protected final String TEXT_115 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_116 = NL + "\t\tif(INPUT_";
  protected final String TEXT_117 = ".fd == -1) {" + NL + "\t\t\tFD_SET(listen_";
  protected final String TEXT_118 = ", &listenfdset);" + NL + "\t\t\tif (nfds <= listen_";
  protected final String TEXT_119 = ")" + NL + "\t\t\t\tnfds = listen_";
  protected final String TEXT_120 = " + 1;" + NL + "\t\t\t" + NL + "\t\t}";
  protected final String TEXT_121 = NL;
  protected final String TEXT_122 = NL + "\t\tif(INPUT_";
  protected final String TEXT_123 = ".fd == -1) {" + NL + "\t\t\tFD_SET(connect_";
  protected final String TEXT_124 = ", &connectfdset);" + NL + "\t\t\tif (nfds <= connect_";
  protected final String TEXT_125 = ")" + NL + "\t\t\t\tnfds = connect_";
  protected final String TEXT_126 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_127 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_128 = ".fd == -1) {" + NL + "\t\t\tFD_SET(connect_";
  protected final String TEXT_129 = ", &connectfdset);" + NL + "\t\t\tif (nfds <= connect_";
  protected final String TEXT_130 = ")" + NL + "\t\t\t\tnfds = connect_";
  protected final String TEXT_131 = " + 1;" + NL + "\t\t}";
  protected final String TEXT_132 = NL + NL + "\t\tif(select(nfds, &listenfdset, &connectfdset, NULL, NULL) < 0) {" + NL + "\t\t\tperror(\"Error in socket connection establishment\");" + NL + "\t\t\texit(-1);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_133 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_134 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(listen_";
  protected final String TEXT_135 = ", &listenfdset)) {" + NL + "\t\t\t\tiofd = OUTPUT_";
  protected final String TEXT_136 = ".fd = " + NL + "\t\t\t\t\taccept(listen_";
  protected final String TEXT_137 = ", NULL, NULL);";
  protected final String TEXT_138 = NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_139 = ".credit_fd = iofd;" + NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_140 = ".init_credits = ";
  protected final String TEXT_141 = ";";
  protected final String TEXT_142 = NL + "\t\t\t\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\t\t\t\tperror(\"Could not set non blocking flag for <";
  protected final String TEXT_143 = "\");" + NL + "\t\t\t\t\texit(-1);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tclose(listen_";
  protected final String TEXT_144 = ");\t\t" + NL + "\t\t\t\tswarm_print(0, \"Server connected on socket tube ";
  protected final String TEXT_145 = "\\n\");" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_146 = NL + "\t\tif(INPUT_";
  protected final String TEXT_147 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(listen_";
  protected final String TEXT_148 = ", &listenfdset)) {" + NL + "\t\t\t\tiofd = INPUT_";
  protected final String TEXT_149 = ".fd = " + NL + "\t\t\t\t\taccept(listen_";
  protected final String TEXT_150 = ",NULL, NULL);";
  protected final String TEXT_151 = NL + "\t\t\t\tINPUT_";
  protected final String TEXT_152 = ".credit_fd = iofd;" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_153 = ".init_credits = ";
  protected final String TEXT_154 = ";";
  protected final String TEXT_155 = NL + "\t\t\t\tif(fcntl(iofd, F_SETFL, fcntl(iofd, F_GETFL) | O_NONBLOCK) < 0) {" + NL + "\t\t\t\t\tperror(\"Could not set non blocking flag for ";
  protected final String TEXT_156 = "\");" + NL + "\t\t\t\t\texit(-1);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tclose(listen_";
  protected final String TEXT_157 = ");\t\t" + NL + "\t\t\t\tswarm_print(0, \"Server connected on socket tube ";
  protected final String TEXT_158 = "\\n\"); " + NL + "\t\t" + NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_159 = NL;
  protected final String TEXT_160 = NL + "\t\tif(INPUT_";
  protected final String TEXT_161 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(connect_";
  protected final String TEXT_162 = ", &connectfdset)) {" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_163 = ".fd = connect_";
  protected final String TEXT_164 = ";";
  protected final String TEXT_165 = NL + "\t\t\t\tINPUT_";
  protected final String TEXT_166 = ".credit_fd = INPUT_";
  protected final String TEXT_167 = ".fd;" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_168 = ".init_credits = ";
  protected final String TEXT_169 = ";";
  protected final String TEXT_170 = NL + "\t\t\t\tINPUT_";
  protected final String TEXT_171 = ".credit_fd = INPUT_";
  protected final String TEXT_172 = ".fd;" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_173 = ".init_credits = ";
  protected final String TEXT_174 = " * sizeof(";
  protected final String TEXT_175 = ");";
  protected final String TEXT_176 = NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t\tswarm_print(0, \"Client connected on socket tube ";
  protected final String TEXT_177 = "\\n\");" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_178 = NL + "\t\tif(OUTPUT_";
  protected final String TEXT_179 = ".fd == -1) {" + NL + "\t\t\tif(FD_ISSET(connect_";
  protected final String TEXT_180 = ", &connectfdset)) {" + NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_181 = ".fd = connect_";
  protected final String TEXT_182 = ";";
  protected final String TEXT_183 = NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_184 = ".credit_fd = OUTPUT_";
  protected final String TEXT_185 = ".fd;" + NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_186 = ".init_credits = ";
  protected final String TEXT_187 = ";";
  protected final String TEXT_188 = NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_189 = ".credit_fd = OUTPUT_";
  protected final String TEXT_190 = ".fd;" + NL + "\t\t\t\tOUTPUT_";
  protected final String TEXT_191 = ".init_credits = ";
  protected final String TEXT_192 = " * sizeof(";
  protected final String TEXT_193 = ");";
  protected final String TEXT_194 = NL + "\t\t\t\t--total_connections;" + NL + "\t\t\t\tswarm_print(0, \"Client connected on socket tube ";
  protected final String TEXT_195 = "\\n\");" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_196 = NL + NL + "\t}";
  protected final String TEXT_197 = NL + "\t// Map shared memories" + NL + "\t";
  protected final String TEXT_198 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_199 = "_";
  protected final String TEXT_200 = "\", O_RDWR);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_201 = "_";
  protected final String TEXT_202 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_203 = " = (";
  protected final String TEXT_204 = "_t*)mmap(NULL, " + NL + "\t\tsizeof(";
  protected final String TEXT_205 = "_t) * ";
  protected final String TEXT_206 = ", PROT_READ | PROT_WRITE," + NL + "\t\tMAP_SHARED, mem_file, 0);" + NL + "\tif (";
  protected final String TEXT_207 = " == NULL) {" + NL + "\t\tperror(\"Error mapping memfile mem__";
  protected final String TEXT_208 = "_";
  protected final String TEXT_209 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_210 = "_init\", getuid(), program_instance_name);" + NL + "\tmem_init_";
  protected final String TEXT_211 = "_sem = sem_open(name_buffer, 0, S_IRUSR | S_IWUSR, 0);" + NL + "\tif (mem_init_";
  protected final String TEXT_212 = "_sem == NULL) {" + NL + "\t\tperror(\"Error opening semaphore mem_init_";
  protected final String TEXT_213 = "_sem\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL;
  protected final String TEXT_214 = NL + NL;
  protected final String TEXT_215 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_216 = "_";
  protected final String TEXT_217 = "\", O_RDWR);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_218 = "_";
  protected final String TEXT_219 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_220 = "_";
  protected final String TEXT_221 = " = (";
  protected final String TEXT_222 = "_t*)mmap(NULL, " + NL + "\t\tsizeof(";
  protected final String TEXT_223 = "_t), PROT_READ | PROT_WRITE," + NL + "\t\tMAP_SHARED, mem_file, 0);" + NL + "\tif (";
  protected final String TEXT_224 = "_";
  protected final String TEXT_225 = " == NULL) {" + NL + "\t\tperror(\"Error mapping memfile mem__";
  protected final String TEXT_226 = "_";
  protected final String TEXT_227 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_228 = "_";
  protected final String TEXT_229 = "_init\", getuid(), program_instance_name);" + NL + "\tmem_init_";
  protected final String TEXT_230 = "_";
  protected final String TEXT_231 = "_sem = sem_open(name_buffer, 0, S_IRUSR | S_IWUSR, 0);" + NL + "\tif (mem_init_";
  protected final String TEXT_232 = "_";
  protected final String TEXT_233 = "_sem == NULL) {" + NL + "\t\tperror(\"Error opening semaphore mem_init_";
  protected final String TEXT_234 = "_";
  protected final String TEXT_235 = "_sem\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_236 = NL;
  protected final String TEXT_237 = NL + "    mem_file = openat(work_dir_fd, \"counter__";
  protected final String TEXT_238 = "\", O_RDWR);" + NL + "    if (mem_file < 0) {" + NL + "        perror(\"Error creating memfile counter__";
  protected final String TEXT_239 = "\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    counter_file = (";
  protected final String TEXT_240 = "_counters_t*)mmap(NULL, " + NL + "        sizeof(";
  protected final String TEXT_241 = "_counters_t), PROT_READ | PROT_WRITE," + NL + "        MAP_SHARED, mem_file, 0);" + NL + "    if (counter_file == NULL) {" + NL + "        perror(\"Error mapping memfile counter__";
  protected final String TEXT_242 = "\");" + NL + "        exit(-1);" + NL + "    }";
  protected final String TEXT_243 = NL + NL + NL;
  protected final String TEXT_244 = NL + "\t";
  protected final String TEXT_245 = "_input_instances[";
  protected final String TEXT_246 = "] = &INPUT_";
  protected final String TEXT_247 = ";";
  protected final String TEXT_248 = NL + "\t";
  protected final String TEXT_249 = "_output_instances[";
  protected final String TEXT_250 = "] = &OUTPUT_";
  protected final String TEXT_251 = ";";
  protected final String TEXT_252 = NL + NL + "\tswarm_print(0, \"All queues created\\n\");" + NL + "\t";
  protected final String TEXT_253 = NL + "\t\t";
  protected final String TEXT_254 = "_";
  protected final String TEXT_255 = "_mem_init();";
  protected final String TEXT_256 = NL;
  protected final String TEXT_257 = NL + "\t\t";
  protected final String TEXT_258 = "_";
  protected final String TEXT_259 = "_mem_init();";
  protected final String TEXT_260 = NL;
  protected final String TEXT_261 = NL + "\t\tsem_post(mem_init_";
  protected final String TEXT_262 = "_sem);";
  protected final String TEXT_263 = NL;
  protected final String TEXT_264 = NL + "\t\tsem_post(mem_init_";
  protected final String TEXT_265 = "_";
  protected final String TEXT_266 = "_sem);\t";
  protected final String TEXT_267 = NL;
  protected final String TEXT_268 = NL;
  protected final String TEXT_269 = NL + "\t\tsem_wait(mem_init_";
  protected final String TEXT_270 = "_sem);" + NL + "\t\tsem_post(mem_init_";
  protected final String TEXT_271 = "_sem);";
  protected final String TEXT_272 = NL;
  protected final String TEXT_273 = NL + "\t\tsem_wait(mem_init_";
  protected final String TEXT_274 = "_";
  protected final String TEXT_275 = "_sem);" + NL + "\t\tsem_post(mem_init_";
  protected final String TEXT_276 = "_";
  protected final String TEXT_277 = "_sem);";
  protected final String TEXT_278 = NL;
  protected final String TEXT_279 = NL + NL + "\tcall_idle = ";
  protected final String TEXT_280 = "_init();" + NL + "\t";
  protected final String TEXT_281 = NL;
  protected final String TEXT_282 = NL + "\tINPUT_";
  protected final String TEXT_283 = ".pending_ptr = (char*)&";
  protected final String TEXT_284 = ";" + NL + "\tINPUT_";
  protected final String TEXT_285 = ".pending_size = sizeof(";
  protected final String TEXT_286 = ");" + NL + "\tswarm_print(0, \"";
  protected final String TEXT_287 = "(%d): Posting receive %p(%d) type ";
  protected final String TEXT_288 = "_t\\n\", " + NL + "\t\tINPUT_";
  protected final String TEXT_289 = ".fd" + NL + "\t\t,&";
  protected final String TEXT_290 = ", (int)sizeof(";
  protected final String TEXT_291 = "));";
  protected final String TEXT_292 = NL + "\t" + NL + "\twhile(1) {" + NL;
  protected final String TEXT_293 = NL + "\t\tint flow;" + NL + "\t\tfd_set inputfdset;" + NL + "\t\tnfds = 0;" + NL + "\t\tint transaction_id;" + NL + "\t\tint blocking_count = 0;" + NL + "\t\t" + NL + "\t\tFD_ZERO(&inputfdset);";
  protected final String TEXT_294 = NL + "\t\tFD_SET(INPUT_";
  protected final String TEXT_295 = ".fd," + NL + "\t\t\t&inputfdset);" + NL + "\t\tif (nfds <= INPUT_";
  protected final String TEXT_296 = ".fd) {" + NL + "\t\t\tnfds = INPUT_";
  protected final String TEXT_297 = ".fd + 1;" + NL + "\t\t}" + NL + "\t\tif(INPUT_";
  protected final String TEXT_298 = ".blocked) {" + NL + "\t\t\t++blocking_count;" + NL + "\t\t}";
  protected final String TEXT_299 = NL + "\t\tif (!call_idle && blocking_count == 0) {" + NL + "\t\t\tif(select(nfds, &inputfdset, NULL, NULL, NULL) < 0) {" + NL + "\t\t\t\tperror(\"Error reading inputs\");" + NL + "\t\t\t\texit(-1);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_300 = NL + "\t\tif (FD_ISSET(INPUT_";
  protected final String TEXT_301 = ".fd," + NL + "\t\t\t&inputfdset) || INPUT_";
  protected final String TEXT_302 = ".blocked) {" + NL + "\t\t\tif(!INPUT_";
  protected final String TEXT_303 = ".blocked) {" + NL + "    \t\t\tread_size = read(INPUT_";
  protected final String TEXT_304 = ".fd, " + NL + "    \t\t\t\tINPUT_";
  protected final String TEXT_305 = ".pending_ptr," + NL + "    \t\t\t\tINPUT_";
  protected final String TEXT_306 = ".pending_size);" + NL + "    \t\t\tif (read_size < 0) {" + NL + "    \t\t\t\tif(errno != EAGAIN && errno != EWOULDBLOCK) {" + NL + "    \t\t\t\t\tperror(\"Error reading from INPUT_";
  protected final String TEXT_307 = "\");" + NL + "    \t\t\t\t\tSWARM_FATAL_ERROR;" + NL + "    \t\t\t\t}" + NL + "    \t\t\t\tread_size = 0;" + NL + "    \t\t\t}" + NL + "    \t\t\tINPUT_";
  protected final String TEXT_308 = ".pending_size -= read_size;" + NL + "    \t\t\tINPUT_";
  protected final String TEXT_309 = ".pending_ptr += read_size;" + NL + "    \t\t\t";
  protected final String TEXT_310 = NL + "    \t\t\tif (read_size != 0) {" + NL + "    \t\t\t\twrite_blocking(\"";
  protected final String TEXT_311 = "\", INPUT_";
  protected final String TEXT_312 = ".credit_fd, (char*)&read_size, sizeof(read_size));" + NL + "    \t\t\t\t//printf(\"Sent %d credits\\n\", read_size);" + NL + "    \t\t\t}" + NL + "    \t\t\t";
  protected final String TEXT_313 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\tif(INPUT_";
  protected final String TEXT_314 = ".pending_size == 0) {" + NL + "\t\t\t\tSWARM_PRINT_NL(2, \"-----------------------------------------------------\\n\");" + NL + "\t\t\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_315 = "(%d): Received data type ";
  protected final String TEXT_316 = "_t\\n\", " + NL + "\t\t\t\t\tINPUT_";
  protected final String TEXT_317 = ".fd);" + NL + "\t\t\t\tswarm_dump_data(0, (char*)&";
  protected final String TEXT_318 = ", sizeof(";
  protected final String TEXT_319 = "));" + NL + "\t\t\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_320 = "(%d):descriptor:\",INPUT_";
  protected final String TEXT_321 = ".fd); ";
  protected final String TEXT_322 = ";";
  protected final String TEXT_323 = NL + "//\t\t\t\tif(";
  protected final String TEXT_324 = "_transaction_id)" + NL + "//\t\t\t\t\ttransaction_id = ";
  protected final String TEXT_325 = "_transaction_id(&";
  protected final String TEXT_326 = ");" + NL + "//\t\t\t\telse transaction_id = -1;" + NL + "//\t\t\t\tif(transaction_id != -1) " + NL + "//\t\t\t\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_327 = ":TRANSACTION_ID:%d\\n\", transaction_id);";
  protected final String TEXT_328 = NL + "                INPUT_";
  protected final String TEXT_329 = ".blocked =";
  protected final String TEXT_330 = NL + "\t\t\t\t";
  protected final String TEXT_331 = "_handler(&";
  protected final String TEXT_332 = ");";
  protected final String TEXT_333 = NL + "\t\t\t\tflow = get_";
  protected final String TEXT_334 = "_flow(&";
  protected final String TEXT_335 = ");" + NL + "\t\t\t\tswitch(flow) {";
  protected final String TEXT_336 = NL + "\t\t\t\t\tcase ENUM_";
  protected final String TEXT_337 = "_FLOW:";
  protected final String TEXT_338 = NL + "\t\t\t\t\t\tSWARM_PRINT_NL(2, \"Processing flow ";
  protected final String TEXT_339 = "\\n\");" + NL + "//\t\t\t\t\t\tif(";
  protected final String TEXT_340 = "_";
  protected final String TEXT_341 = "_transaction_id)" + NL + "//\t\t\t\t\t\t\ttransaction_id = ";
  protected final String TEXT_342 = "_";
  protected final String TEXT_343 = "_transaction_id(&";
  protected final String TEXT_344 = ");" + NL + "//\t\t\t\t\t\tif(";
  protected final String TEXT_345 = "_transaction_id)" + NL + "//\t\t\t\t\t\t\ttransaction_id = ";
  protected final String TEXT_346 = "_transaction_id(&";
  protected final String TEXT_347 = ");" + NL + "//\t\t\t\t\t\telse transaction_id = -1;" + NL + "//\t\t\t\t\t\tif(transaction_id != -1) " + NL + "//\t\t\t\t\t\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_348 = ":";
  protected final String TEXT_349 = ":TRANSACTION_ID:%d\\n\", transaction_id);";
  protected final String TEXT_350 = NL + "                        INPUT_";
  protected final String TEXT_351 = ".blocked =";
  protected final String TEXT_352 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_353 = "_";
  protected final String TEXT_354 = "_handler(&";
  protected final String TEXT_355 = ");";
  protected final String TEXT_356 = NL + "\t\t\t\t\t\tbreak;";
  protected final String TEXT_357 = " ";
  protected final String TEXT_358 = " ";
  protected final String TEXT_359 = NL + "\t\t\t\t\tdefault:" + NL + "\t\t\t\t\t\tSWARM_PRINT(\"Bad flow %s(%d) in cell instance ";
  protected final String TEXT_360 = " ->";
  protected final String TEXT_361 = "\\n\"," + NL + "\t\t\t\t\t\t\tgen_";
  protected final String TEXT_362 = "_flow_string(flow), flow);" + NL + "\t\t\t\t\t\tSWARM_FATAL_ERROR;" + NL + "\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t}";
  protected final String TEXT_363 = " ";
  protected final String TEXT_364 = NL;
  protected final String TEXT_365 = NL + "                if(!INPUT_";
  protected final String TEXT_366 = ".blocked) {";
  protected final String TEXT_367 = NL + "    \t\t\tCOUNTER_";
  protected final String TEXT_368 = "_INC;";
  protected final String TEXT_369 = NL + "\t\t\t\tINPUT_";
  protected final String TEXT_370 = ".pending_ptr = (char*)&";
  protected final String TEXT_371 = ";" + NL + "\t\t\t\tINPUT_";
  protected final String TEXT_372 = ".pending_size = sizeof(";
  protected final String TEXT_373 = ");" + NL + "\t\t\t\tSWARM_PRINT_NL(2, \"";
  protected final String TEXT_374 = "(%d): Posting receive %p(%d) type ";
  protected final String TEXT_375 = "_t\\n\", " + NL + "\t\t\t\t\tINPUT_";
  protected final String TEXT_376 = ".fd" + NL + "\t\t\t\t\t,&";
  protected final String TEXT_377 = ", (int)sizeof(";
  protected final String TEXT_378 = "));";
  protected final String TEXT_379 = NL + "                }";
  protected final String TEXT_380 = NL + "\t\t\t\tcall_idle = 1;" + NL + "\t\t\t} " + NL + "\t\t}";
  protected final String TEXT_381 = NL + "\t\tif (call_idle) {" + NL + "\t\t\tcall_idle = ";
  protected final String TEXT_382 = "_idle();" + NL + "\t\t\tsched_yield();" + NL + "\t\t}";
  protected final String TEXT_383 = NL + "\t\tif (call_idle) {" + NL + "\t\t\tcall_idle = ";
  protected final String TEXT_384 = "_idle();" + NL + "\t\t\tsched_yield();" + NL + "\t\t}" + NL + "\t\tsched_yield();";
  protected final String TEXT_385 = NL + "\t}" + NL;
  protected final String TEXT_386 = NL + "\treturn 0;" + NL + "}" + NL + NL;
  protected final String TEXT_387 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    CellInstance instance = (CellInstance) argument;
  Instance designInstance = (Instance)instance.eContainer();
  
  Set<SharedVariable> sharedVariables = new HashSet<SharedVariable>();
  sharedVariables.addAll(ProjectUtil.getReferringInstances(instance, SharedVariable.class));
  sharedVariables.addAll(ProjectUtil.getReferringInstances(instance.getCell(), SharedVariable.class));
  Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(instance.getCell().getInput(), SharedMemoryTube.class));
  sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(instance.getCell().getOutput(), SharedMemoryTube.class));
  
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
  

    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_7);
    
Collection<Counter> counters = ProjectUtil.getReferringInstances(instance.getCell(), Counter.class);
counters.addAll(ProjectUtil.getReferringInstances(instance.getCell().getInput(), TubeReceiveCounter.class));
counters.addAll(ProjectUtil.getReferringInstances(instance.getCell().getOutput(), TubeTransmitCounter.class));

if(counters.size() != 0) {

    stringBuffer.append(TEXT_8);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    for(SharedVariable svar: sharedVariables) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_14);
    }
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	Collection<MasterTube> tubes = new HashSet<MasterTube>(instance.getCell().getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(instance.getCell().getOutput());
	sharedTubes.retainAll(tubes);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(instance.getOutput());
	instTubes.addAll(instance.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    stringBuffer.append(TEXT_15);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_20);
    		instanceUsed.add(ti.getInstance());
 	}

    }
    stringBuffer.append(TEXT_21);
    for(MasterTube ti: instance.getCell().getOutput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	childTubes.retainAll(instance.getOutput());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    for(MasterTube ti: instance.getCell().getInput()) {
	if (ProjectUtil.getReferringInstance(ti, IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti, SharedMemoryTube.class) != null) continue;
	Set<TubeInstance> childTubes = new HashSet<TubeInstance>();
	childTubes.addAll(ProjectUtil.getReferringInstances(ti, TubeInstance.class));
	childTubes.retainAll(instance.getInput());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(childTubes.size());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    for(TubeInstance ti : serverSocketTubes.keySet()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_31);
    }
    for(TubeInstance ti : clientSocketTubes.keySet()) {
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_33);
    }
    stringBuffer.append(TEXT_34);
    for(TubeInstance ti : instance.getInput()) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_35);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(TEXT_38);
    for(TubeInstance ti : instance.getInput()) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_39);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    for(TubeInstance ti : instance.getOutput()) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_42);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    for(TubeInstance ti: serverSocketTubes.keySet()) {
	if (serverSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_45);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_47);
      } else { 
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_50);
    	}
}
    for(TubeInstance ti: clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_51);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_53);
      } else { 
    stringBuffer.append(TEXT_54);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_56);
    	}
}
    stringBuffer.append(TEXT_57);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_58);
    if(!serverSocketTubes.isEmpty() || !clientSocketTubes.isEmpty() ) {
    stringBuffer.append(TEXT_59);
    }
    stringBuffer.append(TEXT_60);
    for(TubeInstance ti: pipeInputs) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_61);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_65);
    
	}

    stringBuffer.append(TEXT_66);
    for(TubeInstance ti: pipeOutputs) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	long bufferDepth = (qd != null) ? qd.getDepth() : ((bd != null) ? bd.getDepth() : 0);
	if (bufferDepth == 0) continue;
	String strBufferDepth = Long.toString(bufferDepth);
	if(bd != null) strBufferDepth += "*sizeof(" + ti.getTube().getName() + "_t)";

    stringBuffer.append(TEXT_67);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_68);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_69);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(strBufferDepth);
    stringBuffer.append(TEXT_73);
    
	}

    stringBuffer.append(TEXT_74);
    for(TubeInstance ti : serverSocketTubes.keySet()) {
	if(serverSocketTubes.get(ti) instanceof TCPSocketTube) {
	TCPSocketTube socketTube = (TCPSocketTube)serverSocketTubes.get(ti);

    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(socketTube.getServerIP());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(socketTube.getServerPort());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_79);
    }
    
	if(serverSocketTubes.get(ti) instanceof UnixSocketTube) {
	UnixSocketTube socketTube = (UnixSocketTube)serverSocketTubes.get(ti);

    stringBuffer.append(TEXT_80);
    stringBuffer.append(socketTube.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
    }
    }
    stringBuffer.append(TEXT_83);
    for(TubeInstance ti: pipeOutputs) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;

    stringBuffer.append(TEXT_84);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_89);
    
	}

    stringBuffer.append(TEXT_90);
    for(TubeInstance ti: pipeInputs) {
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	long bufferDepth = (qd != null) ? qd.getDepth() : ((bd != null) ? bd.getDepth() : 0);
	if (bufferDepth == 0) continue;
	String strBufferDepth = Long.toString(bufferDepth);
	if(bd != null) strBufferDepth += "*sizeof(" + ti.getTube().getName() + "_t)";
	

    stringBuffer.append(TEXT_91);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(strBufferDepth);
    stringBuffer.append(TEXT_97);
    
	}

    stringBuffer.append(TEXT_98);
    for(TubeInstance ti : clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti) instanceof TCPSocketTube) {
	TCPSocketTube socketTube = (TCPSocketTube)clientSocketTubes.get(ti);

    stringBuffer.append(TEXT_99);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(socketTube.getServerIP());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(socketTube.getServerPort());
    stringBuffer.append(TEXT_102);
    }
    
	if (clientSocketTubes.get(ti) instanceof UnixSocketTube) {
	UnixSocketTube socketTube = (UnixSocketTube)clientSocketTubes.get(ti);

    stringBuffer.append(TEXT_103);
    stringBuffer.append(socketTube.getName());
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_105);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_107);
    }
    stringBuffer.append(TEXT_108);
    if(!serverSocketTubes.isEmpty() || !clientSocketTubes.isEmpty() ) {
    stringBuffer.append(TEXT_109);
    stringBuffer.append(serverSocketTubes.size() + clientSocketTubes.size());
    stringBuffer.append(TEXT_110);
    for(TubeInstance ti: serverSocketTubes.keySet()) {
	if (serverSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_115);
      } else { 
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_120);
    
	}
}
    stringBuffer.append(TEXT_121);
    for(TubeInstance ti: clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_122);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_126);
      } else { 
    stringBuffer.append(TEXT_127);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_129);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_131);
    
	}
}
    stringBuffer.append(TEXT_132);
    for(TubeInstance ti: serverSocketTubes.keySet()) {
	if (serverSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_133);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_135);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_136);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_137);
    
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	long bufferDepth = (qd != null) ? qd.getDepth() : ((bd != null) ? bd.getDepth() : 0);
	if (bufferDepth != 0) {
		String strBufferDepth = Long.toString(bufferDepth);
		if(bd != null) strBufferDepth += "*sizeof(" + ti.getTube().getName() + "_t)";
	

    stringBuffer.append(TEXT_138);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(strBufferDepth);
    stringBuffer.append(TEXT_141);
    }
    stringBuffer.append(TEXT_142);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_145);
      } else { 
    stringBuffer.append(TEXT_146);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_149);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_150);
    
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	long bufferDepth = (qd != null) ? qd.getDepth() : ((bd != null) ? bd.getDepth() : 0);
	if (bufferDepth != 0) {
		String strBufferDepth = Long.toString(bufferDepth);
		if(bd != null) strBufferDepth += "*sizeof(" + ti.getTube().getName() + "_t)";
	

    stringBuffer.append(TEXT_151);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(strBufferDepth);
    stringBuffer.append(TEXT_154);
    }
    stringBuffer.append(TEXT_155);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_158);
    
	}
}
    stringBuffer.append(TEXT_159);
    for(TubeInstance ti: clientSocketTubes.keySet()) {
	if (clientSocketTubes.get(ti).isClientReceiver()) {

    stringBuffer.append(TEXT_160);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_161);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_162);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_163);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_164);
    
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	if (qd != null) {

    stringBuffer.append(TEXT_165);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_167);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_168);
    stringBuffer.append(qd.getDepth());
    stringBuffer.append(TEXT_169);
    }
    
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	if (bd != null) {

    stringBuffer.append(TEXT_170);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_172);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_173);
    stringBuffer.append(bd.getDepth());
    stringBuffer.append(TEXT_174);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_175);
    }
    stringBuffer.append(TEXT_176);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_177);
      } else { 
    stringBuffer.append(TEXT_178);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_182);
    
	QueueDepth qd = ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class);
	if (qd != null) {

    stringBuffer.append(TEXT_183);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_184);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_185);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_186);
    stringBuffer.append(qd.getDepth());
    stringBuffer.append(TEXT_187);
    }
    
	BufferDepth bd = ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class);
	if (bd != null) {

    stringBuffer.append(TEXT_188);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_189);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_190);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_191);
    stringBuffer.append(bd.getDepth());
    stringBuffer.append(TEXT_192);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_193);
    }
    stringBuffer.append(TEXT_194);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_195);
    
	}
}
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(TEXT_197);
    for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}

    stringBuffer.append(TEXT_198);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_199);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_203);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_204);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_205);
    stringBuffer.append(svar.getCount());
    stringBuffer.append(TEXT_206);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_208);
    stringBuffer.append((instance.getInstance()%varInstanceCount));
    stringBuffer.append(TEXT_209);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_210);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_211);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_212);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_213);
    }
    stringBuffer.append(TEXT_214);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	Collection<MasterTube> tubes = new HashSet<MasterTube>(instance.getCell().getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(instance.getCell().getOutput());
	sharedTubes.retainAll(tubes);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(instance.getOutput());
	instTubes.addAll(instance.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    stringBuffer.append(TEXT_215);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_216);
    stringBuffer.append(ti.getInstance());
    stringBuffer.append(TEXT_217);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_218);
    stringBuffer.append((ti.getInstance()));
    stringBuffer.append(TEXT_219);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_220);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_221);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_222);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_223);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_224);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append((ti.getInstance()));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_228);
    stringBuffer.append(ti.getInstance());
    stringBuffer.append(TEXT_229);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_231);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_233);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(ti.getInstance());
    stringBuffer.append(TEXT_235);
    		instanceUsed.add(ti.getInstance());
 	}
}
    stringBuffer.append(TEXT_236);
    
if(counters.size() != 0) {

    stringBuffer.append(TEXT_237);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_240);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_242);
    }
    stringBuffer.append(TEXT_243);
    
Map<MasterTube, Integer> indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : instance.getInput()) {
	if(ProjectUtil.getReferringInstance(ti.getTube(), Tap.class) != null &&
		ProjectUtil.getReferringInstance(ti.getTube(), Tap.class).getCell() == instance.getCell()) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_244);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_245);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_246);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_247);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
}
indexMap = new HashMap<MasterTube, Integer>();
for(TubeInstance ti : instance.getOutput()) {
	if(ProjectUtil.getReferringInstance(ti.getTube(), Tap.class) != null &&
		ProjectUtil.getReferringInstance(ti.getTube(), Tap.class).getCell() == instance.getCell()) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
	if(!indexMap.containsKey(ti.getTube())) indexMap.put(ti.getTube(),new Integer(0));
	int i = indexMap.get(ti.getTube()).intValue();

    stringBuffer.append(TEXT_248);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_249);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_250);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_251);
    
	i++;
	indexMap.put(ti.getTube(),new Integer(i));
	}

    stringBuffer.append(TEXT_252);
    for(SharedVariable svar: sharedVariables) {
	if(instance.getCell() == svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_253);
    stringBuffer.append(svar.getMasterCell().get(0).getName());
    stringBuffer.append(TEXT_254);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_255);
    	}
}
    stringBuffer.append(TEXT_256);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	if(instance.getCell().getOutput().contains(svar.getTube().get(0))) {

    stringBuffer.append(TEXT_257);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_258);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_259);
    	}
}
    stringBuffer.append(TEXT_260);
    for(SharedVariable svar: sharedVariables) {
	if(instance.getCell() == svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_261);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_262);
    	} 
} 
    stringBuffer.append(TEXT_263);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	Collection<MasterTube> tubes = new HashSet<MasterTube>(instance.getCell().getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(instance.getCell().getOutput());
	sharedTubes.retainAll(tubes);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(instance.getOutput());
	instTubes.addAll(instance.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    	if(instance.getCell().getOutput().contains(svar.getTube().get(0))) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_266);
      }
    stringBuffer.append(TEXT_267);
    		instanceUsed.add(ti.getInstance());
 	}
}
    stringBuffer.append(TEXT_268);
    for(SharedVariable svar: sharedVariables) {
	if(instance.getCell() != svar.getMasterCell().get(0)) {

    stringBuffer.append(TEXT_269);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_270);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_271);
    	} 
} 
    stringBuffer.append(TEXT_272);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
	Collection<MasterTube> tubes = new HashSet<MasterTube>(instance.getCell().getInput());
	Collection<MasterTube> sharedTubes = new HashSet<MasterTube>(svar.getTube());
	tubes.addAll(instance.getCell().getOutput());
	sharedTubes.retainAll(tubes);
	
	Collection<TubeInstance> instTubes = new LinkedList<TubeInstance>(instance.getOutput());
	instTubes.addAll(instance.getInput());

	Set<Integer> instanceUsed = new HashSet<Integer>();	
	for(TubeInstance ti: instTubes) {
		if(!sharedTubes.contains(ti.getTube())) continue;
		if(instanceUsed.contains(ti.getInstance())) continue;

    	if(!instance.getCell().getOutput().contains(svar.getTube().get(0))) {
    stringBuffer.append(TEXT_273);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_274);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_275);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_276);
    stringBuffer.append(instanceUsed.size());
    stringBuffer.append(TEXT_277);
      }
    stringBuffer.append(TEXT_278);
    		instanceUsed.add(ti.getInstance());
 	}
}
    stringBuffer.append(TEXT_279);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_280);
      if (ProjectUtil.getReferringInstance(instance, CustomInstanceCell.class) == null &&
		ProjectUtil.getReferringInstance(instance.getCell(), CustomMasterCell.class) == null) {

    stringBuffer.append(TEXT_281);
    for(TubeInstance ti : instance.getInput()) {
    if (ProjectUtil.getReferringInstance(instance.getCell(), Tap.class) != null &&
        ti.getTube().eContainer() != instance.getCell()) continue;  

	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
    if (ProjectUtil.getReferringInstance(ti.getTube(), CustomTube.class) != null ||
        ProjectUtil.getReferringInstance(ti.getTube(), CustomPosixTube.class) != null) continue;

    stringBuffer.append(TEXT_282);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_283);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_284);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_286);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_287);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_288);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_289);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_290);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_291);
    }
    stringBuffer.append(TEXT_292);
    if(instance.getInput().size() > 0) {
    stringBuffer.append(TEXT_293);
    for(TubeInstance ti : instance.getInput()) {
    if (ProjectUtil.getReferringInstance(instance.getCell(), Tap.class) != null &&
        ti.getTube().eContainer() != instance.getCell()) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
    if (ProjectUtil.getReferringInstance(ti.getTube(), CustomTube.class) != null ||
        ProjectUtil.getReferringInstance(ti.getTube(), CustomPosixTube.class) != null) continue;
	//if(ti.getTube().eContainer() != instance.getCell()) continue;

    stringBuffer.append(TEXT_294);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_296);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_297);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_298);
    }
    stringBuffer.append(TEXT_299);
    for(TubeInstance ti : instance.getInput()) {
	//if(ti.getTube().eContainer() != instance.getCell()) continue;
    if (ProjectUtil.getReferringInstance(instance.getCell(), Tap.class) != null &&
        ti.getTube().eContainer() != instance.getCell()) continue;	
	if (ProjectUtil.getReferringInstance(ti.getTube(), IgnorePosixTube.class) != null) continue;
	if (ProjectUtil.getReferringInstance(ti.getTube(), SharedMemoryTube.class) != null) continue;
    if (ProjectUtil.getReferringInstance(ti.getTube(), CustomTube.class) != null ||
        ProjectUtil.getReferringInstance(ti.getTube(), CustomPosixTube.class) != null) continue;

	Collection<Struct> structList = MasterUtil.getDescriptors(ti.getTube());
	String descriptorPrint = "";
	for (Struct struct: structList) {
		descriptorPrint = "swarm_print_struct_" + struct.getName() + "((" + struct.getName() + "_t*)(&" + ti.getName() + "),0)";
	}
	Collection<Flow> flows = MasterUtil.getFlows(ti.getTube());
    boolean blocking = ProjectUtil.getReferringInstance(ti.getTube(), BlockingReceiver.class) != null;


    stringBuffer.append(TEXT_300);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_303);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_304);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_306);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_307);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_308);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_309);
    if(ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class) != null ||
    				ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class) != null) {
    stringBuffer.append(TEXT_310);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_311);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_312);
    }
    stringBuffer.append(TEXT_313);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_314);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_315);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_316);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_317);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_318);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_319);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_320);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_321);
    stringBuffer.append(descriptorPrint);
    stringBuffer.append(TEXT_322);
    if(ProjectUtil.getReferringInstance(ti.getTube(), SingleTubeHandler.class) != null) {
    stringBuffer.append(TEXT_323);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_324);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_326);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_327);
    if(blocking) {
    stringBuffer.append(TEXT_328);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_329);
    }
    stringBuffer.append(TEXT_330);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_331);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_332);
    } else {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_333);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_334);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_335);
    }
    for(Flow flow: MasterUtil.getFlows(ti.getTube())) {
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_336);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_337);
    }
    stringBuffer.append(TEXT_338);
    stringBuffer.append(flow.getName().toUpperCase());
    stringBuffer.append(TEXT_339);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_341);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_342);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_343);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_344);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_345);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_346);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_348);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_349);
    if(blocking) {
    stringBuffer.append(TEXT_350);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_351);
    }
    stringBuffer.append(TEXT_352);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_353);
    stringBuffer.append(flow.getName());
    stringBuffer.append(TEXT_354);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_355);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_356);
    }
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    if (flows.size() > 1) {
    stringBuffer.append(TEXT_359);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_360);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_361);
    stringBuffer.append(designInstance.getName());
    stringBuffer.append(TEXT_362);
    }
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    if(blocking) {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_366);
    }
    
    			TubeReceiveCounter rcounter = ProjectUtil.getReferringInstance(ti.getTube(), TubeReceiveCounter.class);
    			if(rcounter != null) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(rcounter.getName().toUpperCase());
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_371);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_374);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_375);
    stringBuffer.append(ti.getName().toUpperCase());
    stringBuffer.append(TEXT_376);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_378);
    if(blocking) {
    stringBuffer.append(TEXT_379);
    }
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_382);
    } else {
    stringBuffer.append(TEXT_383);
    stringBuffer.append(instance.getCell().getName());
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    }
    stringBuffer.append(TEXT_386);
    stringBuffer.append(TEXT_387);
    return stringBuffer.toString();
  }
}
