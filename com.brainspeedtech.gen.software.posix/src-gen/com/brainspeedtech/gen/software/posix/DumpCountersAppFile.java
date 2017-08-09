package com.brainspeedtech.gen.software.posix;

import java.util.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.flow.*;;

public class DumpCountersAppFile
{
  protected static String nl;
  public static synchronized DumpCountersAppFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DumpCountersAppFile result = new DumpCountersAppFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    ";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#define _XOPEN_SOURCE 500" + NL + "#include <sys/stat.h>" + NL + "#include <sys/types.h>" + NL + "#include <sys/wait.h>" + NL + "#include <sys/mman.h>" + NL + "#include <fcntl.h>" + NL + "#include <stdio.h>" + NL + "#include <errno.h>" + NL + "#include <stdlib.h>" + NL + "#include <unistd.h>" + NL + "#include <string.h>" + NL + "#include <signal.h>" + NL + "#include <time.h>" + NL + "#include <ftw.h>" + NL + "#include <semaphore.h>" + NL + "#include \"gen_";
  protected final String TEXT_5 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_6 = "_counters.h\"" + NL + "#include \"gen_";
  protected final String TEXT_7 = "_print_counters.h\"" + NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = "_counters_t* counter_file_";
  protected final String TEXT_10 = " = NULL;";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = "_counters_t counter_file_";
  protected final String TEXT_13 = "_init = { 0 };";
  protected final String TEXT_14 = NL + NL + "char *program_instance_name = \"";
  protected final String TEXT_15 = "_logs\";" + NL + "int mem_file;" + NL + "" + NL + "int main(int argc, char* argv[])" + NL + "{" + NL + "" + NL + "\tint work_dir_fd;" + NL + "" + NL + "\tif (argc > 1) {" + NL + "\t\tprogram_instance_name = argv[1];" + NL + "\t}" + NL + "" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd < 0) {" + NL + "\t\tperror(\"Error opening work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_16 = NL + "    mem_file = openat(work_dir_fd, \"counter__";
  protected final String TEXT_17 = "\", O_RDONLY);" + NL + "    if (mem_file < 0) {" + NL + "        perror(\"Error oepning stats file counter__";
  protected final String TEXT_18 = "\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    counter_file_";
  protected final String TEXT_19 = " = (";
  protected final String TEXT_20 = "_counters_t*)mmap(NULL, " + NL + "        sizeof(";
  protected final String TEXT_21 = "_counters_t), PROT_READ," + NL + "        MAP_SHARED, mem_file, 0);" + NL + "    if (counter_file_";
  protected final String TEXT_22 = "  == NULL) {" + NL + "        perror(\"Error mapping stats file counter__";
  protected final String TEXT_23 = "\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    print_";
  protected final String TEXT_24 = "_counters(\"";
  protected final String TEXT_25 = "\", counter_file_";
  protected final String TEXT_26 = ");" + NL + "    close(mem_file);";
  protected final String TEXT_27 = NL + NL + NL + "\treturn 0;" + NL + "" + NL + "}" + NL + NL;
  protected final String TEXT_28 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_1);
    
 	String[] copyrightMessage = LayerUtil.getCopyrightMessage((EObject)argument);

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_7);
    for(CellInstance ci: instance.getCell()) {
    
    Collection<Counter> counters = ProjectUtil.getReferringInstances(ci.getCell(), Counter.class);
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), TubeReceiveCounter.class));
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {
    
    stringBuffer.append(TEXT_8);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_13);
    }
}
    stringBuffer.append(TEXT_14);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_15);
    int index = 0;
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { ++index; 
    
    Collection<Counter> counters = ProjectUtil.getReferringInstances(ci.getCell(), Counter.class);
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), TubeReceiveCounter.class));
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {
    
    stringBuffer.append(TEXT_16);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_26);
    }
	}
}
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
