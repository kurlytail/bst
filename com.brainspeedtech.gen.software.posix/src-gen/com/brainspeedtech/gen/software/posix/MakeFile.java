package com.brainspeedtech.gen.software.posix;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.inst.*;
import org.eclipse.emf.ecore.resource.*;
import com.brainspeedtech.struct.util.*;

public class MakeFile
{
  protected static String nl;
  public static synchronized MakeFile create(String lineSeparator)
  {
    nl = lineSeparator;
    MakeFile result = new MakeFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "# ";
  protected final String TEXT_3 = NL + NL + "BIN_DIR := ." + NL + "SOURCE_DIR := ." + NL + "QUIET ?= @" + NL + NL;
  protected final String TEXT_4 = NL + "SOURCE_";
  protected final String TEXT_5 = " := $(SOURCE_DIR)/gen_";
  protected final String TEXT_6 = "_plan.c" + NL + "EXTRADEP_";
  protected final String TEXT_7 = " :=" + NL + "CFLAGS_";
  protected final String TEXT_8 = " :=" + NL + "LDFLAGS_";
  protected final String TEXT_9 = " :=";
  protected final String TEXT_10 = NL + NL + "-include Makefile.defs" + NL + "" + NL + "all: $(BIN_DIR)/dump_counters $(BIN_DIR)/";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = " $(BIN_DIR)/";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = NL + NL + "$(BIN_DIR)/";
  protected final String TEXT_15 = ": $(SOURCE_DIR)/Makefile-posix $(SOURCE_DIR)/gen_";
  protected final String TEXT_16 = ".c Makefile.defs" + NL + "\t@echo \"Building  ";
  protected final String TEXT_17 = "\"" + NL + "\t$(QUIET)$(CC) $(CFLAGS) -MD -pthread -o $(BIN_DIR)/";
  protected final String TEXT_18 = "  $(SOURCE_DIR)/gen_";
  protected final String TEXT_19 = ".c $(LDFLAGS)" + NL;
  protected final String TEXT_20 = NL + "$(BIN_DIR)/";
  protected final String TEXT_21 = ": $(SOURCE_DIR)/Makefile-posix $(EXTRADEP_";
  protected final String TEXT_22 = ") $(SOURCE_DIR)/gen_";
  protected final String TEXT_23 = ".c $(SOURCE_DIR)/gen_";
  protected final String TEXT_24 = "_swarm_lib.c $(SOURCE_";
  protected final String TEXT_25 = ") Makefile.defs" + NL + "\t@echo \"Building  ";
  protected final String TEXT_26 = "\"" + NL + "\t$(QUIET)$(CC) $(CFLAGS_";
  protected final String TEXT_27 = ") $(CFLAGS) -MD -D TASK_";
  protected final String TEXT_28 = " -o $(BIN_DIR)/";
  protected final String TEXT_29 = " $(SOURCE_DIR)/gen_";
  protected final String TEXT_30 = ".c ";
  protected final String TEXT_31 = " $(SOURCE_DIR)/gen_";
  protected final String TEXT_32 = "_swarm_lib.c $(SOURCE_";
  protected final String TEXT_33 = ") $(LDFLAGS_";
  protected final String TEXT_34 = ") $(LDFLAGS) -pthread" + NL;
  protected final String TEXT_35 = NL + NL + "$(BIN_DIR)/dump_counters: $(SOURCE_DIR)/Makefile-posix $(SOURCE_DIR)/gen_";
  protected final String TEXT_36 = "_print_counters.c Makefile.defs" + NL + "\t@echo \"Building dump_counters\"" + NL + "\t$(QUIET)$(CC) $(CFLAGS) -MD -pthread -o $(BIN_DIR)/dump_counters  $(SOURCE_DIR)/gen_";
  protected final String TEXT_37 = "_print_counters.c $(LDFLAGS)" + NL + "" + NL + "" + NL + "" + NL + "clean:" + NL + "\trm -f $(BIN_DIR)/dump_counters" + NL + "\trm -f $(BIN_DIR)/*.o" + NL + "\trm -f *.d" + NL + "\trm -f $(BIN_DIR)/";
  protected final String TEXT_38 = NL + "\trm -f $(BIN_DIR)/";
  protected final String TEXT_39 = NL + "\t";
  protected final String TEXT_40 = NL + "-include ";
  protected final String TEXT_41 = ".d";
  protected final String TEXT_42 = NL + NL;
  protected final String TEXT_43 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Instance instance = (Instance) argument;   	
	String[] copyrightMessage = LayerUtil.getCopyrightMessage(instance);
	String headerDebugFiles = "";
		for (Resource includeResource : instance.eResource().getResourceSet()
				.getResources()) {
			if (includeResource instanceof StructResourceImpl) {
				headerDebugFiles += " $(SOURCE_DIR)/gen_" + includeResource.getURI().lastSegment()
						.replaceAll("\\.struct$", ".c");
			}
		}
	
  
    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(message);
    }
    stringBuffer.append(TEXT_3);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_9);
    } }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_11);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_13);
    } }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_19);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(headerDebugFiles);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_34);
    } }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(instance.getName());
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(ci.getName());
    } }
    stringBuffer.append(TEXT_39);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_41);
    } }
    stringBuffer.append(TEXT_42);
    stringBuffer.append(TEXT_43);
    return stringBuffer.toString();
  }
}
