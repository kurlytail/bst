package com.brainspeedtech.gen.software.posix.vpi;

import java.util.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.*;;

public class DesignStartupFile
{
  protected static String nl;
  public static synchronized DesignStartupFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DesignStartupFile result = new DesignStartupFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t" + NL + "" + NL + "#define _XOPEN_SOURCE 700" + NL + "#include <sys/stat.h>" + NL + "#include <sys/types.h>" + NL + "#include <sys/wait.h>" + NL + "#include <ftw.h>" + NL + "#include <fcntl.h>" + NL + "#include <stdio.h>" + NL + "#include <errno.h>" + NL + "#include <stdlib.h>" + NL + "#include <unistd.h>" + NL + "#include <string.h>" + NL + "#include <signal.h>" + NL + "#include <time.h>" + NL + "#include <fcntl.h>" + NL + "#include \"gen_";
  protected final String TEXT_2 = ".h\"" + NL + "" + NL + "" + NL + "int unlink_cb(const char *fpath, const struct stat *sb, int typeflag, struct FTW *ftwbuf)" + NL + "{" + NL + "    int rv = remove(fpath);" + NL + "" + NL + "    if (rv)" + NL + "        perror(fpath);" + NL + "" + NL + "    return rv;" + NL + "}" + NL + "" + NL + "int rmrf(char *path)" + NL + "{" + NL + "    return nftw(path, unlink_cb, 64, FTW_DEPTH | FTW_PHYS);" + NL + "}" + NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "int ";
  protected final String TEXT_5 = "_pid = 0;";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = "_t __shared__";
  protected final String TEXT_9 = "[";
  protected final String TEXT_10 = "]";
  protected final String TEXT_11 = NL + "\t= { 0 };";
  protected final String TEXT_12 = NL + NL + "int work_dir_fd;" + NL + "" + NL + "void design_startup(char* logname)" + NL + "{" + NL + "\tchar *program_instance_name = \"";
  protected final String TEXT_13 = "_logs\";" + NL + "\tint mem_file __attribute__((unused));" + NL + "\tint pid_file;" + NL + "\tint my_pid;" + NL + "\t" + NL + "\tif (logname != NULL) {" + NL + "\t\tprogram_instance_name = logname;" + NL + "\t}" + NL + "\t" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd >= 0) {" + NL + "\t\tpid_file = openat(work_dir_fd, \"pid\", O_RDONLY);" + NL + "\t\tif (pid_file >= 0) {" + NL + "\t\t\tif (read(pid_file, &my_pid, sizeof(my_pid)) == sizeof(my_pid)) {" + NL + "\t\t\t\tif (my_pid == getpid()) {" + NL + "\t\t\t\t\tSWARM_PRINT(\"VPI already initialized\\n\");" + NL + "\t\t\t\t\treturn;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tclose (pid_file);" + NL + "\t\t}" + NL + "\t\tclose(work_dir_fd);" + NL + "\t}" + NL + "\t" + NL + "\trmrf(program_instance_name);" + NL + "\t" + NL + "\tSWARM_PRINT(\"Starting VPI %s\\n\", program_instance_name);\t" + NL + "\tif (mkdir(program_instance_name, 0777) < 0) {" + NL + "\t\tperror(\"Error creating work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd < 0) {" + NL + "\t\tperror(\"Error opening work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tpid_file = openat(work_dir_fd, \"pid\", O_CREAT | O_WRONLY, 0777);" + NL + "\tif (pid_file < 0) {" + NL + "\t\tperror(\"Error opening pid file\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\tmy_pid = getpid();" + NL + "\tif (write(pid_file, &my_pid, sizeof(my_pid)) != sizeof(my_pid)) {" + NL + "\t\tperror(\"Error writing to pid file\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tclose (pid_file);" + NL;
  protected final String TEXT_14 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_15 = "\", O_CREAT | O_WRONLY);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_16 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tif(write(mem_file, &__shared__";
  protected final String TEXT_17 = ", sizeof(__shared__";
  protected final String TEXT_18 = ")) < 0) {" + NL + "\t\tperror(\"Error writing memfile mem__";
  protected final String TEXT_19 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tclose(mem_file);";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + "\tSWARM_PRINT(\"Creating fifo_";
  protected final String TEXT_22 = "\\n\");" + NL + "\tif (mkfifoat(work_dir_fd, \"fifo_";
  protected final String TEXT_23 = "\", 0777) < 0) {" + NL + "\t\tperror(\"Error creating fifo\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL;
  protected final String TEXT_24 = NL + "\treturn;" + NL + "}" + NL;
  protected final String TEXT_25 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Instance instance = (Instance) argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_2);
    
	Set<SharedVariable> sharedVariables = new HashSet<SharedVariable>();

    stringBuffer.append(TEXT_3);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_5);
    } 
	sharedVariables.addAll(ProjectUtil.getReferringInstances(ci, SharedVariable.class));
	sharedVariables.addAll(ProjectUtil.getReferringInstances(ci.getCell(), SharedVariable.class));
}
    stringBuffer.append(TEXT_6);
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_7);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(svar.getName());
    if(svar.getCount()>1){
    stringBuffer.append(TEXT_9);
    stringBuffer.append(svar.getCount());
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    
}

    stringBuffer.append(TEXT_12);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_13);
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_14);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_19);
    
}

    stringBuffer.append(TEXT_20);
    for(TubeInstance ti: instance.getTube()) { 
	Collection<SocketTube> socketTubes = ProjectUtil.getReferringInstances(ti, SocketTube.class);
	if (socketTubes.isEmpty()) {

    stringBuffer.append(TEXT_21);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    	}
}
    stringBuffer.append(TEXT_24);
    stringBuffer.append(TEXT_25);
    return stringBuffer.toString();
  }
}
