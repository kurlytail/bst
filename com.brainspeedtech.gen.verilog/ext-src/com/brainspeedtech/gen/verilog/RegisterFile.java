package com.brainspeedtech.gen.verilog;

import java.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.StructResourceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.reg.*;
import com.brainspeedtech.struct.util.*;
import com.brainspeedtech.struct.Enum;
import org.eclipse.emf.ecore.util.*;;

public class RegisterFile
{
  protected static String nl;
  public static synchronized RegisterFile create(String lineSeparator)
  {
    nl = lineSeparator;
    RegisterFile result = new RegisterFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// ";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "`include \"gen_";
  protected final String TEXT_4 = "\"";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + NL + "module ";
  protected final String TEXT_7 = "(/*AUTOARG*/);" + NL + "\t" + NL + "\t/*AUTOINPUT*/" + NL + "\t/*AUTOOUTPUT*/" + NL + "\t/*AUTOWIRE*/" + NL + "\t" + NL + "\toutput wire o_ack;" + NL + "\t" + NL + "\tinput wire i_wr;" + NL + "\tinput wire i_req;" + NL + "\tinput wire clk;" + NL + "\tinput wire rst_n;" + NL + "\tinput wire [31:0] i_serial_addr;" + NL + "\tinput wire [31:0] i_serial_data;" + NL + "\toutput wire [31:0] o_serial_data;" + NL + "\t" + NL + "\treg r_req;" + NL + "\treg r_wr;" + NL + "\treg [31:0] r_serial_addr;" + NL + "\treg r_ack;" + NL + "\t" + NL + "\twire [31:0] w_serial_addr;" + NL;
  protected final String TEXT_8 = NL + "\toutput wire [";
  protected final String TEXT_9 = ":0] o_";
  protected final String TEXT_10 = ";" + NL + "\toutput wire o_";
  protected final String TEXT_11 = "_rd_req;" + NL + "\toutput wire o_";
  protected final String TEXT_12 = "_wr_req;" + NL + "\treg [";
  protected final String TEXT_13 = ":0] r_";
  protected final String TEXT_14 = ";" + NL + "\tassign o_";
  protected final String TEXT_15 = " = r_";
  protected final String TEXT_16 = ";" + NL + "\tinput wire i_";
  protected final String TEXT_17 = "_wr_req;" + NL + "\tinput wire [";
  protected final String TEXT_18 = ":0] i_";
  protected final String TEXT_19 = ";";
  protected final String TEXT_20 = NL + NL + "\tassign o_ack = r_ack ";
  protected final String TEXT_21 = " | w_";
  protected final String TEXT_22 = "_";
  protected final String TEXT_23 = "_ack ";
  protected final String TEXT_24 = " ;" + NL + "" + NL + "" + NL + " \talways @(posedge clk or negedge rst_n) begin" + NL + "    \tif(!rst_n) begin" + NL + "\t\t\t/*AUTORESET*/" + NL + "\t\tend else begin" + NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\t\t if(i_";
  protected final String TEXT_26 = "_wr_req) begin" + NL + "\t\t\t    r_";
  protected final String TEXT_27 = " <= i_";
  protected final String TEXT_28 = ";" + NL + "\t\t\t end";
  protected final String TEXT_29 = NL + NL + "\t \t\tif(i_req && i_wr) begin" + NL;
  protected final String TEXT_30 = NL + "\t\t\t    if (i_serial_addr == `";
  protected final String TEXT_31 = "_";
  protected final String TEXT_32 = "_START_DWORD) begin" + NL + "\t\t\t       r_";
  protected final String TEXT_33 = " <= i_serial_data[`";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = "_END_DWORD_OFFSET:`";
  protected final String TEXT_36 = "_";
  protected final String TEXT_37 = "_START_DWORD_OFFSET];" + NL + "\t\t\t    end";
  protected final String TEXT_38 = NL + "\t \t\tend" + NL + "\t\tend" + NL + "\tend" + NL + "\t" + NL + "\talways @(posedge clk or negedge rst_n) begin" + NL + "\t    if(!rst_n) begin" + NL + "\t\t\t/*AUTORESET*/" + NL + "\t    end else begin" + NL + "\t\t\tr_req <= i_req;" + NL + "\t\t\tr_wr <= i_wr;" + NL + "\t\t\tr_serial_addr <= i_serial_addr;" + NL + "\t\tend" + NL + "\tend" + NL + "\t" + NL + "\talways @(posedge clk or negedge rst_n) begin" + NL + "\t    if(!rst_n) begin" + NL + "\t\t\t/*AUTORESET*/" + NL + "\t    end else begin" + NL + "\t\t\tif(i_req) begin" + NL + "\t\t\t\tr_ack <= 0'b0;";
  protected final String TEXT_39 = NL + "\t\t\t    if (i_serial_addr == `";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = "_START_DWORD) begin" + NL + "\t\t      \t\tr_ack <= 1'b1;" + NL + "\t\t\t    end";
  protected final String TEXT_42 = NL + "\t\t \tend" + NL + "\t\tend" + NL + "\tend" + NL + "\t" + NL + "\talways @(/*AUTOSENSE*/) begin" + NL + "\t    if(r_req && ~r_wr) begin";
  protected final String TEXT_43 = NL + "\t\t    if (i_serial_addr == `";
  protected final String TEXT_44 = "_";
  protected final String TEXT_45 = "_START_DWORD) begin" + NL + "\t       \t\to_serial_data[`";
  protected final String TEXT_46 = "_";
  protected final String TEXT_47 = "_END_DWORD_OFFSET:`";
  protected final String TEXT_48 = "_";
  protected final String TEXT_49 = "_START_DWORD_OFFSET]" + NL + "\t       \t\t\t= r_";
  protected final String TEXT_50 = ";" + NL + "\t       \t\to_";
  protected final String TEXT_51 = "_rd_req = i_req & ~i_wr;" + NL + "\t       \t\to_";
  protected final String TEXT_52 = "_wr_req = i_req & i_wr;" + NL + "\t\t    end else begin" + NL + "\t       \t\to_";
  protected final String TEXT_53 = "_rd_req = 1'b0;" + NL + "\t       \t\to_";
  protected final String TEXT_54 = "_wr_req = 1'b0;" + NL + "\t\t    end";
  protected final String TEXT_55 = NL + "\t\tend" + NL + "   \tend" + NL + "   \t";
  protected final String TEXT_56 = NL + "\t/* ";
  protected final String TEXT_57 = " AUTO_TEMPLATE (" + NL + "\t\t.clk(clk)," + NL + "\t\t.rst_n(rst_n)," + NL + "\t\t.i_wr(i_wr)," + NL + "\t\t.i_serial_addr(w_serial_addr[])," + NL + "\t\t.o_ack(w_@\"vl-cell-name\"_ack)," + NL + "\t\t.i_serial_data(i_serial_data)," + NL + "\t\t.o_serial_data(w_@\"vl-cell-name\"_serial_data[])," + NL + "\t\t.i_req(w_@\"vl-cell-name\"_req[])," + NL + "\t\t.i_\\(.*\\) (i_@\"vl-cell-name\"_\\1[])," + NL + "\t\t.o_\\(.*\\) (o_@\"vl-cell-name\"_\\1[])," + NL + "\t\t.\\(.*\\) (@\"vl-cell-name\"_\\1[])," + NL + "\t\t);*/";
  protected final String TEXT_58 = NL + "\t";
  protected final String TEXT_59 = " ";
  protected final String TEXT_60 = "_";
  protected final String TEXT_61 = "(/*AUTOINST*/);";
  protected final String TEXT_62 = "   \t" + NL + "endmodule" + NL;
  protected final String TEXT_63 = NL + NL + "// Local Variables:" + NL + "// verilog-library-directories:(\".\")" + NL + "// verilog-library-files:()" + NL + "// verilog-library-extensions:(\".v\" \".vh\")" + NL + "// eval:(verilog-read-includes)" + NL + "// eval:(setq verilog-auto-output-ignore-regexp \"^w_.*\")" + NL + "// eval:(setq verilog-auto-input-ignore-regexp \"^w_.*\")" + NL + "// End:" + NL;
  protected final String TEXT_64 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     Resource resource = (Resource) argument;  	
	Document doc = (Document) EcoreUtil.getObjectByType(
	resource.getContents(), StructPackage.eINSTANCE.getDocument());
	if (doc == null)
		return "";
	Collection<Register> registers = EcoreUtil.getObjectsByType(
			doc.getStruct(), RegPackage.eINSTANCE.getRegister());
	if (registers.isEmpty())
		return "";
	String[] copyrightMessage = LayerUtil.getCopyrightMessage(doc);	

    for(String message: copyrightMessage) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(message);
    }
    stringBuffer.append(TEXT_2);
    
		Set<String> includeFiles = new HashSet<String>();

		for (Resource includeResource : doc.eResource().getResourceSet()
				.getResources()) {
			if (includeResource instanceof StructResourceImpl) {
				includeFiles.add(includeResource.getURI().lastSegment()
						.replaceAll("\\.struct$", ".vh"));
			}
		}

		for (String f : includeFiles) {

    stringBuffer.append(TEXT_3);
    stringBuffer.append(f);
    stringBuffer.append(TEXT_4);
    		}

    stringBuffer.append(TEXT_5);
    for (Register register: registers) { 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(register.getName());
    stringBuffer.append(TEXT_7);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() == null) {

    stringBuffer.append(TEXT_8);
    stringBuffer.append((StructUtil.getFieldCount(regInstance)-1));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append((StructUtil.getFieldCount(regInstance)-1));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append((StructUtil.getFieldCount(regInstance)-1));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_19);
    	}
}
    stringBuffer.append(TEXT_20);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() != null) {
		for(long index = 0; index < StructUtil.getFieldCount(field); ++index) {

    stringBuffer.append(TEXT_21);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_23);
    		}
	}
}
    stringBuffer.append(TEXT_24);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() == null) {

    stringBuffer.append(TEXT_25);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_28);
    	}
}
    stringBuffer.append(TEXT_29);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() == null) {

    stringBuffer.append(TEXT_30);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_37);
    	}
}
    stringBuffer.append(TEXT_38);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() == null) {

    stringBuffer.append(TEXT_39);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_41);
    	}
}
    stringBuffer.append(TEXT_42);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() == null) {

    stringBuffer.append(TEXT_43);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(register.getName().toUpperCase());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(regInstance.getName().toUpperCase());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_54);
    	}
}
    stringBuffer.append(TEXT_55);
    for (Field field: register.getField()) {
	RegisterInstance regInstance = (RegisterInstance)field;
	if (regInstance.getAtom() != null) {
		Register inner = (Register)regInstance.getAtom();
		long count = StructUtil.getFieldCount(field); 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(inner.getName());
    stringBuffer.append(TEXT_57);
    		for(long index = 0; index < count; ++index) {

    stringBuffer.append(TEXT_58);
    stringBuffer.append(inner.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(regInstance.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_61);
    
		}	
	}
    }
    stringBuffer.append(TEXT_62);
    }
    stringBuffer.append(TEXT_63);
    stringBuffer.append(TEXT_64);
    return stringBuffer.toString();
  }
}
