package com.brainspeedtech.gen.software.posix.vpi;

import java.util.*;
import com.brainspeedtech.swarm.layer.util.*;
import com.brainspeedtech.swarm.layer.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.posix.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.swarm.flow.*;
import com.brainspeedtech.gen.software.posix.*;
import org.eclipse.emf.ecore.*;
import com.brainspeedtech.swarm.layer.util.*;;

public class MakefileVPIFile
{
  protected static String nl;
  public static synchronized MakefileVPIFile create(String lineSeparator)
  {
    nl = lineSeparator;
    MakefileVPIFile result = new MakefileVPIFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "BIN_DIR := ." + NL + "SOURCE_DIR := ." + NL;
  protected final String TEXT_2 = NL + "# ";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "SOURCE_";
  protected final String TEXT_5 = " := $(SOURCE_DIR)/gen_";
  protected final String TEXT_6 = "_plan.c" + NL + "EXTRADEP_";
  protected final String TEXT_7 = " :=";
  protected final String TEXT_8 = NL + NL + "VPI_CC := gcc" + NL + "VPI_CFLAGS := $(shell iverilog-vpi --cflags) $(shell iverilog-vpi --ldflags)" + NL + "VPI_LIBS := $(shell iverilog-vpi --ldlibs)" + NL + "" + NL + "-include $(SOURCE_DIR)/Makefile.defs" + NL + "" + NL + "all: ";
  protected final String TEXT_9 = " $(BIN_DIR)/";
  protected final String TEXT_10 = ".vpi ";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "$(BIN_DIR)/";
  protected final String TEXT_13 = ".vpi: $(SOURCE_DIR)/Makefile-vpi $(EXTRADEP_";
  protected final String TEXT_14 = ") $(SOURCE_DIR)/gen_";
  protected final String TEXT_15 = "_vpi.c $(SOURCE_DIR)/gen_";
  protected final String TEXT_16 = "_swarm_lib.c $(SOURCE_DIR)/gen_";
  protected final String TEXT_17 = ".c $(SOURCE_";
  protected final String TEXT_18 = ")  $(SOURCE_DIR)/Makefile.defs" + NL + "\t$(VPI_CC) $(VPI_CFLAGS) -MD -DTASK_";
  protected final String TEXT_19 = " -DTASK_NAME=\\\"";
  protected final String TEXT_20 = "\\\" -o $(BIN_DIR)/";
  protected final String TEXT_21 = ".vpi $(SOURCE_DIR)/gen_";
  protected final String TEXT_22 = "_vpi.c $(SOURCE_DIR)/gen_";
  protected final String TEXT_23 = "_swarm_lib.c $(SOURCE_DIR)/gen_";
  protected final String TEXT_24 = ".c $(SOURCE_";
  protected final String TEXT_25 = ") $(VPI_LIBS)" + NL;
  protected final String TEXT_26 = NL + NL + "clean:" + NL + "\trm -f $(BIN_DIR)/*.o" + NL + "\trm -f *.d";
  protected final String TEXT_27 = NL + "\trm -f $(BIN_DIR)/";
  protected final String TEXT_28 = ".vpi";
  protected final String TEXT_29 = NL;
  protected final String TEXT_30 = NL + "-include ";
  protected final String TEXT_31 = ".d";
  protected final String TEXT_32 = NL + NL;
  protected final String TEXT_33 = NL;

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
    for(CellInstance ci: instance.getCell()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(ci.getCell().getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    for(CellInstance ci: instance.getCell()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    for(CellInstance ci: instance.getCell()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(instance.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(ci.getName().toUpperCase());
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    for(CellInstance ci: instance.getCell()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    for(CellInstance ci: instance.getCell()) {
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ci.getName());
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    return stringBuffer.toString();
  }
}
