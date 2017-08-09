package com.brainspeedtech.gen.software.posix;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.project.util.*;;

public class SwarmLibFile
{
  protected static String nl;
  public static synchronized SwarmLibFile create(String lineSeparator)
  {
    nl = lineSeparator;
    SwarmLibFile result = new SwarmLibFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "#ifndef __GEN__";
  protected final String TEXT_4 = "_SWARM_LIB_H__" + NL + "#define __GEN__";
  protected final String TEXT_5 = "_SWARM_LIB_H__" + NL + "" + NL + "#include <assert.h>" + NL + "#include <stdio.h>" + NL + "#include <string.h>" + NL + "#include <stdlib.h>" + NL + "#include <time.h>" + NL + "#include <sys/time.h>" + NL + "#include <stdint.h>" + NL + "" + NL + "#define ";
  protected final String TEXT_6 = "_USE_NATIVE_UINT64" + NL + "" + NL + "#define SWARM_PASTE(__token1__, __token2__) __token1__ ## __token2__" + NL + "" + NL + "" + NL + "typedef struct {" + NL + "\tint fd;" + NL + "\tint credit_fd;" + NL + "\tint32_t init_credits;" + NL + "\tchar* pending_ptr;" + NL + "\tsize_t pending_size;" + NL + "\tint blocked;" + NL + "} fd_pair_t;" + NL + "" + NL + "" + NL + "extern void swarm_dump_data_nl(int level, unsigned int addr, char* data, size_t length);" + NL + "#define swarm_dump_data(__addr__, __data__, __length__) swarm_dump_data_nl(0, __addr__, __data__, __length__)" + NL + "extern void swarm_read_fd(const char* name, fd_pair_t* fd, int printlog, int nonblocking);" + NL + "extern void swarm_write_fd(const char* name, fd_pair_t*, int printlog, int nonblocking);" + NL + "extern int swarm_tcp_client_socket(const char* name, const char* host, int port);" + NL + "extern int swarm_tcp_server_socket(const char* name, const char* host, int port);" + NL + "extern int swarm_unix_client_socket(const char* name, const char* work_dir);" + NL + "extern int swarm_unix_server_socket(const char* name, const char* work_dir);" + NL + "extern void write_blocking(const char* name, int fd, char* buffer, size_t buffer_size);" + NL + "extern int read_blocking(const char* name, int fd, char* buffer, size_t buffer_size, int nonblocking);" + NL + "void swarm_generate_random_data(uint8_t* data, uint32_t length);" + NL + "void swarm_generate_sequential_data(uint8_t* data, uint32_t length);" + NL + "extern void swarm_fifo_thread(fd_pair_t* input, fd_pair_t* output);" + NL + "" + NL + "#define SWARM_POSIX_FIFO_THREAD(__input_fd__, __output_fd__) swarm_fifo_thread(&(__input_fd__ ## _MAPPED_TO_BYPASS), &(__output_fd__ ## _MAPPED_TO_BYPASS))" + NL + "" + NL + "#define _SWARM_RECV_INTERNAL_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_read_fd(# __queue__, &__queue__, 0, 0);\\" + NL + "}" + NL + "" + NL + "#define _SWARM_SEND_INTERNAL_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_write_fd(# __queue__, &__queue__, 0, 0);\\" + NL + "}" + NL + "" + NL + "#define _SWARM_RECV_BUSY_INTERNAL_(__queue__) ({\\" + NL + "\tswarm_read_fd(# __queue__, &__queue__, 0, 1);\\" + NL + "\t__queue__.pending_size != 0;\\" + NL + "})" + NL + "" + NL + "#define _SWARM_SEND_BUSY_INTERNAL_(__queue__) ({\\" + NL + "\tswarm_write_fd(# __queue__, &__queue__, 0, 1);\\" + NL + "\t__queue__.pending_size != 0 || (__queue__.credit_fd >= 0 && __queue__.init_credits == 0);\\" + NL + "})" + NL + "" + NL + "#define _SWARM_RECV_INTERNAL_NONBLOCKING_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_read_fd(# __queue__, &__queue__, 0, 1);\\" + NL + "}" + NL + "" + NL + "#define _SWARM_SEND_INTERNAL_NONBLOCKING_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_write_fd(# __queue__, &__queue__, 0, 1);\\" + NL + "}" + NL + "" + NL + "#define _SWARM_RECV_INTERNAL_LOGGED_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_read_fd(# __queue__, &__queue__, 1, 0);\\" + NL + "}" + NL + "" + NL + "#define _SWARM_SEND_INTERNAL_LOGGED_(__queue__, __ptr__, __size__) {\\" + NL + "\tassert(__queue__.pending_size == 0); \\" + NL + "\t__queue__.pending_ptr = (char*)(__ptr__);\\" + NL + "\t__queue__.pending_size = (__size__);\\" + NL + "\tswarm_write_fd(# __queue__, &__queue__, 1, 0);\\" + NL + "}" + NL + "" + NL + "#define SWARM_RECV(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_, __queue__)((char*)(__ptr__), (__size__))" + NL + "#define SWARM_SEND(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_, __queue__)((char*)(__ptr__), (__size__))" + NL + "#define SWARM_RECV_LOGGED(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_LOGGED_, __queue__)((char*)(__ptr__), (__size__))" + NL + "#define SWARM_SEND_LOGGED(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_LOGGED_, __queue__)((char*)(__ptr__), (__size__))" + NL + "#define SWARM_RECV_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_RELATIVE_, __queue__)(__instance__, (char*)(__ptr__), (__size__))" + NL + "#define SWARM_SEND_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_RELATIVE_, __queue__)(__instance__, (char*)(__ptr__), (__size__))" + NL + "#define SWARM_RECV_RELATIVE_LOGGED(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_RELATIVE_LOGGED_, __queue__)(__instance__, (char*)(__ptr__), (__size__))" + NL + "#define SWARM_SEND_RELATIVE_LOGGED(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_RELATIVE_LOGGED_, __queue__)(__instance__, (char*)(__ptr__), (__size__))" + NL + "" + NL + "#define SWARM_RECV_NONBLOCKING(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_NONBLOCKING_,__queue__)((__ptr__), (__size__))" + NL + "#define SWARM_SEND_NONBLOCKING(__queue__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_NONBLOCKING_,__queue__)((__ptr__), (__size__))" + NL + "#define SWARM_RECV_NONBLOCKING_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_RECV_NONBLOCKING_RELATIVE_,__queue__)((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE(__queue__, __instance__, __ptr__, __size__) SWARM_PASTE(SWARM_SEND_NONBLOCKING_RELATIVE_,__queue__)((__instance__), (__ptr__), (__size__))" + NL + "#define SWARM_RECV_BUSY(__queue__) SWARM_PASTE(SWARM_RECV_BUSY_,__queue__)" + NL + "#define SWARM_SEND_BUSY(__queue__) SWARM_PASTE(SWARM_SEND_BUSY_,__queue__)" + NL + "#define SWARM_RECV_BUSY_RELATIVE(__queue__, __instance__) SWARM_PASTE(SWARM_RECV_BUSY_RELATIVE_,__queue__)((__instance__))" + NL + "#define SWARM_SEND_BUSY_RELATIVE(__queue__, __instance__) SWARM_PASTE(SWARM_SEND_BUSY_RELATIVE_,__queue__)((__instance__))" + NL + "" + NL + "" + NL + "#define SWARM_SEND_RELATIVE_EXPANDED SWARM_SEND_RELATIVE" + NL + "#define SWARM_SEND_NONBLOCKING_RELATIVE_EXPANDED SWARM_SEND_NONBLOCKING_RELATIVE" + NL + "#define SWARM_SEND_BUSY_RELATIVE_EXPANDED SWARM_SEND_BUSY_RELATIVE" + NL + "" + NL + "" + NL + "#define SWARM_SHARED(__type__, __varname__) __type__ __varname__" + NL + "#define SWARM_PRINT0(__format__) SWARM_PRINT_NL(0, __format__)" + NL + "#define SWARM_PRINT1(__format__, __arg0__) SWARM_PRINT_NL(0, __format__, __arg0__)" + NL + "#define SWARM_PRINT2(__format__, __arg0__, __arg1__) SWARM_PRINT_NL(0, __format__, __arg0__, __arg1__)" + NL + "#define SWARM_PRINT3(__format__, __arg0__, __arg1__, __arg2__) SWARM_PRINT_NL(0, __format__, __arg0__, __arg1__, __arg2__)" + NL + "#define SWARM_PRINT4(__format__, __arg0__, __arg1__, __arg2__, __arg3__) SWARM_PRINT_NL(0, __format__, __arg0__, __arg1__, __arg2__, __arg3__)" + NL + "#define SWARM_PRINT(__format__, args...) SWARM_PRINT_NL(0, __format__, ## args)" + NL + "" + NL + "extern void swarm_print(int level, const char* format, ...);" + NL + "" + NL + "#define SWARM_PRINT_NL(__level__, __str__, args...) { \\" + NL + "\tswarm_print(__level__, __str__, ## args);\\" + NL + "}" + NL + "" + NL + "#define SWARM_FATAL_ERROR assert(0);" + NL + "" + NL + "#define SWARM_SIZEOF sizeof" + NL + "" + NL + "#endif";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_2);
    }
    Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_3);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getName().toUpperCase());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
