package com.brainspeedtech.gen.software.mray;

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
  protected final String TEXT_3 = NL + NL + "BIN_DIR := ." + NL + "SOURCE_DIR := ." + NL + "QUIET ?= @" + NL + "XTENSA_CORE_OPTIONS := --xtensa-system=/home/akamath/xtensa/XtDevTools/install/builds/RE-2013.4-linux/mray/config --xtensa-core=mray --xtensa-params=" + NL + "CC := /home/akamath/xtensa/XtDevTools/install/tools/RE-2013.4-linux/XtensaTools/bin/xt-xcc" + NL + "OBJDUMP := /home/akamath/xtensa/XtDevTools/install/tools/RE-2013.4-linux/XtensaTools/bin/xt-objdump" + NL + "SIZE := /home/akamath/xtensa/XtDevTools/install/tools/RE-2013.4-linux/XtensaTools/bin/xt-size" + NL + "CFLAGS := -g -fmessage-length=0 -DPROC_mray -DCONFIG_mray $(XTENSA_CORE_OPTIONS)" + NL + NL;
  protected final String TEXT_4 = NL + "SOURCE_";
  protected final String TEXT_5 = " := $(SOURCE_DIR)/gen_";
  protected final String TEXT_6 = "_plan.c" + NL + "EXTRADEP_";
  protected final String TEXT_7 = " :=" + NL + "CFLAGS_";
  protected final String TEXT_8 = " :=" + NL + "LDFLAGS_";
  protected final String TEXT_9 = " :=";
  protected final String TEXT_10 = NL + NL + "-include Makefile.defs" + NL + "" + NL + "all: ";
  protected final String TEXT_11 = " $(BIN_DIR)/";
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "$(BIN_DIR)/";
  protected final String TEXT_15 = ": $(SOURCE_DIR)/Makefile-mray $(EXTRADEP_";
  protected final String TEXT_16 = ") $(SOURCE_DIR)/gen_";
  protected final String TEXT_17 = ".c $(SOURCE_";
  protected final String TEXT_18 = ") Makefile.defs" + NL + "\t@echo \"Building  ";
  protected final String TEXT_19 = "\"" + NL + "\t$(QUIET)$(CC) $(CFLAGS_";
  protected final String TEXT_20 = ") $(CFLAGS) -MD -D TASK_";
  protected final String TEXT_21 = " -o $(BIN_DIR)/";
  protected final String TEXT_22 = " $(SOURCE_DIR)/gen_";
  protected final String TEXT_23 = ".c $(SOURCE_";
  protected final String TEXT_24 = ") $(LDFLAGS_";
  protected final String TEXT_25 = ") $(LDFLAGS)" + NL + "\t$(QUIET)$(OBJDUMP) $(XTENSA_CORE_OPTIONS) -S -D $(BIN_DIR)/";
  protected final String TEXT_26 = " > $(BIN_DIR)/";
  protected final String TEXT_27 = ".lst" + NL + "\t$(QUIET)$(SIZE) -C $(BIN_DIR)/";
  protected final String TEXT_28 = " > $(BIN_DIR)/";
  protected final String TEXT_29 = ".size";
  protected final String TEXT_30 = NL + NL + NL + "clean:" + NL + "\trm -f $(BIN_DIR)/*.o" + NL + "\trm -f *.d";
  protected final String TEXT_31 = NL + "\trm -f $(BIN_DIR)/";
  protected final String TEXT_32 = NL + "\t";
  protected final String TEXT_33 = NL + "-include ";
  protected final String TEXT_34 = ".d";
  protected final String TEXT_35 = NL + NL;
  protected final String TEXT_36 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Instance instance = (Instance) argument;   	
	String[] copyrightMessage = LayerUtil.getCopyrightMessage(instance);
  
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
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_12);
    } }
    stringBuffer.append(TEXT_13);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_29);
    } }
    stringBuffer.append(TEXT_30);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(ci.getName());
    } }
    stringBuffer.append(TEXT_32);
    for(CellInstance ci: instance.getCell()) { if (!ci.getCell().isExternal()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_34);
    } }
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    return stringBuffer.toString();
  }
}
