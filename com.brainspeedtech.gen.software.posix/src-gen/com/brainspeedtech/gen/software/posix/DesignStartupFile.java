package com.brainspeedtech.gen.software.posix;

import java.util.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.layer.*;
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
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL + "// ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + "#define _XOPEN_SOURCE 500" + NL + "#include <sys/stat.h>" + NL + "#include <sys/types.h>" + NL + "#include <sys/wait.h>" + NL + "#include <sys/mman.h>" + NL + "#include <fcntl.h>" + NL + "#include <stdio.h>" + NL + "#include <errno.h>" + NL + "#include <stdlib.h>" + NL + "#include <unistd.h>" + NL + "#include <string.h>" + NL + "#include <signal.h>" + NL + "#include <time.h>" + NL + "#include <ftw.h>" + NL + "#include <semaphore.h>" + NL + "#include \"gen_";
  protected final String TEXT_5 = ".h\"" + NL + "#include \"gen_";
  protected final String TEXT_6 = "_counters.h\"" + NL + "" + NL + "" + NL + "char name_buffer[4096];" + NL + "char *program_instance_name = \"";
  protected final String TEXT_7 = "_logs\";" + NL + NL;
  protected final String TEXT_8 = NL + "int unlink_cb(const char *fpath, const struct stat *sb, int typeflag, struct FTW *ftwbuf)" + NL + "{" + NL + "    int rv = remove(fpath);" + NL + "" + NL + "    if (rv)" + NL + "        perror(fpath);" + NL + "" + NL + "    return rv;" + NL + "}" + NL + "" + NL + "int rmrf(char *path)" + NL + "{" + NL + "    return nftw(path, unlink_cb, 64, FTW_DEPTH | FTW_PHYS);" + NL + "}" + NL;
  protected final String TEXT_9 = NL + "int ";
  protected final String TEXT_10 = "_pid = 0;";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = "_t __shared__";
  protected final String TEXT_14 = "[";
  protected final String TEXT_15 = "]";
  protected final String TEXT_16 = NL + "\t= { 0 };" + NL + "sem_t *mem_init_";
  protected final String TEXT_17 = "_sem;\t";
  protected final String TEXT_18 = NL;
  protected final String TEXT_19 = NL;
  protected final String TEXT_20 = "_t __shared__";
  protected final String TEXT_21 = " = { 0 };" + NL + "sem_t *mem_init_";
  protected final String TEXT_22 = "_sem;\t";
  protected final String TEXT_23 = NL + NL;
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = "_counters_t* counter_file_";
  protected final String TEXT_26 = " = NULL;";
  protected final String TEXT_27 = NL;
  protected final String TEXT_28 = "_counters_t counter_file_";
  protected final String TEXT_29 = "_init = { 0 };";
  protected final String TEXT_30 = NL + NL + NL + "void terminate_all()" + NL + "{" + NL + "//\tfprintf(stderr, \"Terminating ";
  protected final String TEXT_31 = "\\n\");";
  protected final String TEXT_32 = NL + "\tif(";
  protected final String TEXT_33 = "_pid > 0) {" + NL + "//\t\tfprintf(stderr, \"Terminating ";
  protected final String TEXT_34 = "\\n\");" + NL + "\t\tkill(";
  protected final String TEXT_35 = "_pid, SIGINT);" + NL + "\t}";
  protected final String TEXT_36 = NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_37 = "_init\", getuid(), program_instance_name);" + NL + "\tsem_unlink(name_buffer);";
  protected final String TEXT_38 = NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_39 = "_";
  protected final String TEXT_40 = "_init\", getuid(), program_instance_name);" + NL + "\tsem_unlink(name_buffer);";
  protected final String TEXT_41 = NL + NL;
  protected final String TEXT_42 = NL + "    if(counter_file_";
  protected final String TEXT_43 = " != NULL) {" + NL + "        //fprintf(stdout, \"Counters for ";
  protected final String TEXT_44 = "\\n\");";
  protected final String TEXT_45 = NL + "        //fprintf(stdout, \"\\tCounter ";
  protected final String TEXT_46 = " = ";
  protected final String TEXT_47 = "\\n\", counter_file_";
  protected final String TEXT_48 = "->";
  protected final String TEXT_49 = ");";
  protected final String TEXT_50 = NL + "    }";
  protected final String TEXT_51 = NL + NL + "}" + NL + "" + NL + "void kill_handler(int signum)" + NL + "{" + NL + "\tfprintf(stderr, \"";
  protected final String TEXT_52 = " Received signal %d, exiting \\n\", signum);" + NL + "\texit(-1);" + NL + "}" + NL + "" + NL + "int work_dir_fd;" + NL + "int log_file_size = -1;" + NL + "" + NL + "int main(int argc, char* argv[])" + NL + "{" + NL + "\tchar filename[";
  protected final String TEXT_53 = "];" + NL + "\tchar *cell_argv[3];" + NL + "\tint wait_status;" + NL + "\tchar next_character;" + NL + "\tint i;" + NL + "\tint exit_pid;" + NL + "\tint mem_file;" + NL + "\t" + NL + "\t// Generate pseudo random name" + NL + "\tsrandom((unsigned int)time(NULL));" + NL + "\tatexit(terminate_all);" + NL + "\tsignal(SIGTERM, kill_handler);" + NL + "\tsignal(SIGINT, kill_handler);" + NL + "\t" + NL + "\t" + NL + "\tif (argc > 2) {" + NL + "\t\tprogram_instance_name = argv[2];" + NL + "\t}" + NL + "\t" + NL + "\tif (argc > 1) {" + NL + "\t\tlog_file_size = atoi(argv[1]);" + NL + "\t}" + NL + "\t" + NL + "\trmrf(program_instance_name);" + NL + "\t" + NL + "\tfprintf(stderr, \"Starting Design ";
  protected final String TEXT_54 = " with logs at %s\\n\", program_instance_name);\t" + NL + "\tif (mkdir(program_instance_name, 0777) < 0) {" + NL + "\t\tperror(\"Error creating work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\t" + NL + "\twork_dir_fd = open(program_instance_name, 0);" + NL + "\tif (work_dir_fd < 0) {" + NL + "\t\tperror(\"Error opening work directory\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL;
  protected final String TEXT_55 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_56 = "_";
  protected final String TEXT_57 = "\", O_CREAT | O_RDWR, 0666);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_58 = "_";
  protected final String TEXT_59 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tif(write(mem_file, &__shared__";
  protected final String TEXT_60 = ", sizeof(__shared__";
  protected final String TEXT_61 = ")) < 0) {" + NL + "\t\tperror(\"Error writing memfile mem__";
  protected final String TEXT_62 = "_";
  protected final String TEXT_63 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tclose(mem_file);";
  protected final String TEXT_64 = NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_65 = "_init\", getuid(), program_instance_name);" + NL + "\tsem_unlink(name_buffer);" + NL + "\tmem_init_";
  protected final String TEXT_66 = "_sem = sem_open(name_buffer, O_CREAT, S_IRUSR | S_IWUSR, 0);" + NL + "\tif (mem_init_";
  protected final String TEXT_67 = "_sem == NULL) {" + NL + "\t\tperror(\"Error opening semaphore mem_init_";
  protected final String TEXT_68 = "_sem\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_69 = NL;
  protected final String TEXT_70 = NL + "\tmem_file = openat(work_dir_fd, \"mem__";
  protected final String TEXT_71 = "_";
  protected final String TEXT_72 = "\", O_CREAT | O_RDWR, 0666);" + NL + "\tif (mem_file < 0) {" + NL + "\t\tperror(\"Error creating memfile mem__";
  protected final String TEXT_73 = "_";
  protected final String TEXT_74 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tif(write(mem_file, &__shared__";
  protected final String TEXT_75 = ", sizeof(__shared__";
  protected final String TEXT_76 = ")) < 0) {" + NL + "\t\tperror(\"Error writing memfile mem__";
  protected final String TEXT_77 = "_";
  protected final String TEXT_78 = "\");" + NL + "\t\texit(-1);" + NL + "\t}" + NL + "\tclose(mem_file);" + NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_79 = "_";
  protected final String TEXT_80 = "_init\", getuid(), program_instance_name);" + NL + "\tsem_unlink(name_buffer);" + NL + "\tmem_init_";
  protected final String TEXT_81 = "_sem = sem_open(name_buffer, O_CREAT, S_IRUSR | S_IWUSR, 0);" + NL + "\tif (mem_init_";
  protected final String TEXT_82 = "_sem == NULL) {" + NL + "\t\tperror(\"Error opening semaphore mem_init_";
  protected final String TEXT_83 = "_";
  protected final String TEXT_84 = "_sem\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_85 = NL;
  protected final String TEXT_86 = NL;
  protected final String TEXT_87 = NL;
  protected final String TEXT_88 = NL + "\t//fprintf(stderr, \"Creating fifo_";
  protected final String TEXT_89 = "\\n\");" + NL + "\tif (mkfifoat(work_dir_fd, \"fifo_";
  protected final String TEXT_90 = "\", 0777) < 0) {" + NL + "\t\tperror(\"Error creating fifo\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_91 = NL + "\t//fprintf(stderr, \"Creating fifo_";
  protected final String TEXT_92 = "_credit\\n\");" + NL + "\tif (mkfifoat(work_dir_fd, \"fifo_";
  protected final String TEXT_93 = "_credit\", 0777) < 0) {" + NL + "\t\tperror(\"Error creating credit fifo\");" + NL + "\t\texit(-1);" + NL + "\t}";
  protected final String TEXT_94 = NL;
  protected final String TEXT_95 = NL;
  protected final String TEXT_96 = NL + "    mem_file = openat(work_dir_fd, \"counter__";
  protected final String TEXT_97 = "\", O_CREAT | O_RDWR, 0666);" + NL + "    if (mem_file < 0) {" + NL + "        perror(\"Error creating stats file counter__";
  protected final String TEXT_98 = "\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    if(write(mem_file, &counter_file_";
  protected final String TEXT_99 = "_init, sizeof(counter_file_";
  protected final String TEXT_100 = "_init)) < 0) {" + NL + "        perror(\"Error writing memfile counter_file_";
  protected final String TEXT_101 = "_init\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    " + NL + "    " + NL + "    counter_file_";
  protected final String TEXT_102 = " = (";
  protected final String TEXT_103 = "_counters_t*)mmap(NULL, " + NL + "        sizeof(";
  protected final String TEXT_104 = "_counters_t), PROT_READ | PROT_WRITE," + NL + "        MAP_SHARED, mem_file, 0);" + NL + "    if (counter_file_";
  protected final String TEXT_105 = "  == NULL) {" + NL + "        perror(\"Error mapping stats file counter__";
  protected final String TEXT_106 = "\");" + NL + "        exit(-1);" + NL + "    }" + NL + "    memset(counter_file_";
  protected final String TEXT_107 = ", 0, sizeof(*counter_file_";
  protected final String TEXT_108 = "));";
  protected final String TEXT_109 = NL + NL + NL + "\t//fprintf(stderr, \"Forking for ";
  protected final String TEXT_110 = "\\n\");" + NL + "\t";
  protected final String TEXT_111 = "_pid = fork();" + NL + "\tif(";
  protected final String TEXT_112 = "_pid < 0) {" + NL + "\t\tperror(\"Error forking\");" + NL + "\t\texit(-1);" + NL + "\t} else if(";
  protected final String TEXT_113 = "_pid == 0) {" + NL + "\t\t/* Setup child stdout and stdin */" + NL + "\t\t//fclose(stderr);" + NL + "\t\t//fclose(stdin);" + NL + "\t\t" + NL + "\t\t//sprintf(filename, \"%s/";
  protected final String TEXT_114 = "_out.log\", program_instance_name);" + NL + "\t\t//fprintf(stderr, \"Opening output log file %s\\n\", filename);" + NL + "\t\t//stdout = fopen(filename, \"w\");" + NL + "\t\t//if (stderr == NULL) {" + NL + "\t\t//\tperror(\"Error opening output log file for ";
  protected final String TEXT_115 = "\");" + NL + "\t\t//\treturn -1;" + NL + "\t\t//}" + NL + "\t\t" + NL + "\t\t//sprintf(filename, \"%s/";
  protected final String TEXT_116 = "_err.log\", program_instance_name);" + NL + "\t\t//fprintf(stderr, \"Opening error log file %s\\n\", filename);" + NL + "\t\t//stderr = fopen(filename, \"w\");" + NL + "\t\t//if (stderr == NULL) {" + NL + "\t\t//\tperror(\"Error opening error log file for ";
  protected final String TEXT_117 = "\");" + NL + "\t\t//\treturn -1;" + NL + "\t\t//}" + NL + "\t\t" + NL + "\t\tchar str_log_file_size[64];" + NL + "\t\tsprintf(str_log_file_size, \"%d\", log_file_size);" + NL + "\t\t" + NL + "\t\t/* Exec the new process */" + NL + "\t\tcell_argv[0] = \"";
  protected final String TEXT_118 = "\";" + NL + "\t\tcell_argv[1] = str_log_file_size;" + NL + "\t\tcell_argv[2] = program_instance_name;" + NL + "\t\tcell_argv[3] = NULL;" + NL + "\t\tif(execv(\"";
  protected final String TEXT_119 = "\", cell_argv) < 0) {" + NL + "\t\t\tperror(\"Error executing program ";
  protected final String TEXT_120 = "\");" + NL + "\t\t\treturn -1;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/* Should never return after exec */" + NL + "\t\treturn -1;" + NL + "\t}";
  protected final String TEXT_121 = NL + "\texit_pid = wait(&wait_status);" + NL + "    int exit_value;" + NL + "    if (WIFEXITED(wait_status)) {" + NL + "        exit_value = WEXITSTATUS(wait_status);" + NL + "    } else {" + NL + "        exit_value = -1;" + NL + "    }";
  protected final String TEXT_122 = NL + "\tif (exit_pid == ";
  protected final String TEXT_123 = "_pid) {" + NL + "\t\tfprintf(stderr, \"Task ";
  protected final String TEXT_124 = " terminated\\n\");" + NL + "\t}";
  protected final String TEXT_125 = NL + "\tsprintf(name_buffer, \"/%d_%s_sem_";
  protected final String TEXT_126 = "_init\", getuid(), program_instance_name);" + NL + "\tsem_unlink(name_buffer);";
  protected final String TEXT_127 = NL + "\treturn exit_value;" + NL + "}" + NL;
  protected final String TEXT_128 = NL;

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
    
	Set<SharedVariable> sharedVariables = new HashSet<SharedVariable>();
	Set<SharedMemoryTube> sharedMemoryTubes = new HashSet<SharedMemoryTube>();

    stringBuffer.append(TEXT_8);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_10);
    } 
	sharedVariables.addAll(ProjectUtil.getReferringInstances(ci, SharedVariable.class));
	sharedVariables.addAll(ProjectUtil.getReferringInstances(ci.getCell(), SharedVariable.class));
	sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), SharedMemoryTube.class));
	sharedMemoryTubes.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), SharedMemoryTube.class));
}
    stringBuffer.append(TEXT_11);
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_12);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(svar.getName());
    if(svar.getCount()>1){
    stringBuffer.append(TEXT_14);
    stringBuffer.append(svar.getCount());
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_17);
    
}

    stringBuffer.append(TEXT_18);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(svar.getStruct().getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    for(CellInstance ci: instance.getCell()) {
    
    Collection<Counter> counters = ProjectUtil.getReferringInstances(ci.getCell(), Counter.class);
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), TubeReceiveCounter.class));
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {
    
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_29);
    }
}
    stringBuffer.append(TEXT_30);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_31);
    int cellNameSize = 0;
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { 
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_35);
    } 
	if(ci.getName().length() > cellNameSize) cellNameSize = ci.getName().length();
}
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_36);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_37);
    
}

    for(SharedMemoryTube svar: sharedMemoryTubes) {
	int maxSharedMemoryCount = 0;
	for(MasterTube mTube: svar.getTube()) {
		int instanceCount = ProjectUtil.getReferringInstances(mTube, TubeInstance.class).size();
		if(instanceCount > maxSharedMemoryCount) {
			maxSharedMemoryCount = instanceCount;
		}
	}
	for(int sMemInstance = 0; sMemInstance < maxSharedMemoryCount; ++sMemInstance) {

    stringBuffer.append(TEXT_38);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(sMemInstance);
    stringBuffer.append(TEXT_40);
    }
}
    stringBuffer.append(TEXT_41);
    for(CellInstance ci: instance.getCell()) {
    
    Collection<Counter> counters = ProjectUtil.getReferringInstances(ci.getCell(), Counter.class);
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), TubeReceiveCounter.class));
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {
    
    stringBuffer.append(TEXT_42);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_44);
    for(Counter counter: counters) {
            String type = "";
            switch(counter.getWidth()) {
            case _16BIT: type = "%d"; break;
            case _32BIT: type = "%d"; break;
            case _64BIT: type = "%d"; break;
            }
        
    stringBuffer.append(TEXT_45);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(type);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(counter.getName());
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_50);
    }
}
    stringBuffer.append(TEXT_51);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(instance.getName().length() + cellNameSize + 32);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_54);
    for(SharedVariable svar: sharedVariables) {
int varInstanceCount = 0;
for(MasterCell mc: svar.getMasterCell()) {
	int icCount = ProjectUtil.getReferringInstances(mc, CellInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}

    for(int i = 0; i < varInstanceCount; ++i) {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    for(SharedMemoryTube svar: sharedMemoryTubes) {
int varInstanceCount = 0;
for(MasterTube mt: svar.getTube()) {
	int icCount = ProjectUtil.getReferringInstances(mt, TubeInstance.class).size();
	if (icCount > varInstanceCount) varInstanceCount = icCount;
}

    for(int i = 0; i < varInstanceCount; ++i) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_75);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append((i));
    stringBuffer.append(TEXT_84);
    }
    }
    stringBuffer.append(TEXT_85);
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_86);
    
}

    stringBuffer.append(TEXT_87);
    for(TubeInstance ti: instance.getTube()) { 
	Collection<SocketTube> socketTubes = ProjectUtil.getReferringInstances(ti, SocketTube.class);
	if (socketTubes.isEmpty()) {

    stringBuffer.append(TEXT_88);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_90);
    
	if(ProjectUtil.getReferringInstance(ti.getTube(), QueueDepth.class) != null ||
		ProjectUtil.getReferringInstance(ti.getTube(), BufferDepth.class) != null) {

    stringBuffer.append(TEXT_91);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_93);
     } 
    	}
}
    stringBuffer.append(TEXT_94);
    int index = 0;
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { ++index; 
    stringBuffer.append(TEXT_95);
    
    Collection<Counter> counters = ProjectUtil.getReferringInstances(ci.getCell(), Counter.class);
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getInput(), TubeReceiveCounter.class));
	counters.addAll(ProjectUtil.getReferringInstances(ci.getCell().getOutput(), TubeTransmitCounter.class));
    if(counters.size() != 0) {
    
    stringBuffer.append(TEXT_96);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_103);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_108);
    }
    stringBuffer.append(TEXT_109);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_120);
     }
}

    stringBuffer.append(TEXT_121);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) { 
    stringBuffer.append(TEXT_122);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_124);
    } }
    
for(SharedVariable svar: sharedVariables) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append(svar.getName());
    stringBuffer.append(TEXT_126);
    
}

    stringBuffer.append(TEXT_127);
    stringBuffer.append(TEXT_128);
    return stringBuffer.toString();
  }
}
