package com.brainspeedtech.gen.verilog;

import java.util.*;
import java.util.Map.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.hardware.verilog.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.*;;

public class UnpackFile
{
  protected static String nl;
  public static synchronized UnpackFile create(String lineSeparator)
  {
    nl = lineSeparator;
    UnpackFile result = new UnpackFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "`timescale 1ns/100ps";
  protected final String TEXT_2 = "\t" + NL + "" + NL + "module gen_";
  protected final String TEXT_3 = "_unpack(/*AUTOARG*/);" + NL + "" + NL + "\tinput wire clk;" + NL + "\tinput wire rst_n;" + NL + "\tinput wire [";
  protected final String TEXT_4 = ":0] snoop_data;" + NL + "\tinput wire snoop_rdy;" + NL + "\tinput wire parse;" + NL + "\tinput wire snoop_pop;" + NL + "\toutput wire parse_valid;" + NL;
  protected final String TEXT_5 = NL + "\treg [";
  protected final String TEXT_6 = ":0] ";
  protected final String TEXT_7 = "_reg;" + NL + "\treg ";
  protected final String TEXT_8 = "_valid_reg;" + NL + "\toutput wire [";
  protected final String TEXT_9 = ":0] ";
  protected final String TEXT_10 = ";" + NL + "\toutput wire ";
  protected final String TEXT_11 = "_valid;";
  protected final String TEXT_12 = NL + "\treg [";
  protected final String TEXT_13 = ":0] beat_index;" + NL + "\twire [";
  protected final String TEXT_14 = ":0] parse_beat_index;" + NL + "\treg parse_valid_reg;" + NL + "\t" + NL + "\tassign parse_valid = (parse_valid_reg & ~parse) | (parse_beat_index == ";
  protected final String TEXT_15 = "'d";
  protected final String TEXT_16 = ");" + NL + "\tassign parse_beat_index = (parse & snoop_rdy)? ";
  protected final String TEXT_17 = "'b0 : beat_index;" + NL + "\t";
  protected final String TEXT_18 = NL + "\tassign ";
  protected final String TEXT_19 = " = ";
  protected final String TEXT_20 = "_reg;" + NL + "\tassign ";
  protected final String TEXT_21 = "_valid = ";
  protected final String TEXT_22 = "_valid_reg;";
  protected final String TEXT_23 = NL + NL + "\t" + NL + "\talways@(posedge clk or negedge rst_n)" + NL + "\tbegin" + NL + "\t\tif (~rst_n)" + NL + "\t\tbegin" + NL + "\t\t\tparse_valid_reg <= 1'b0;" + NL + "\t\t\tbeat_index <= ";
  protected final String TEXT_24 = "'d";
  protected final String TEXT_25 = ";";
  protected final String TEXT_26 = NL + "\t\t\t";
  protected final String TEXT_27 = "_reg <= ";
  protected final String TEXT_28 = "'b0;" + NL + "\t\t\t";
  protected final String TEXT_29 = "_valid_reg <= 1'b0;";
  protected final String TEXT_30 = NL + "\t\tend" + NL + "\t\telse" + NL + "\t\tbegin" + NL + "\t\t\tbeat_index <= parse ? 1'b1 : (snoop_pop ? beat_index + 1 : beat_index);" + NL + "\t\t\tparse_valid_reg <= parse ? parse_valid : parse_valid_reg;" + NL;
  protected final String TEXT_31 = NL + "\t\t\t";
  protected final String TEXT_32 = "_reg <= ";
  protected final String TEXT_33 = ";" + NL + "\t\t\t";
  protected final String TEXT_34 = "_valid_reg <= ";
  protected final String TEXT_35 = "_valid;";
  protected final String TEXT_36 = "\t" + NL + "\t\t\tcase (parse_beat_index)";
  protected final String TEXT_37 = NL + "\t\t\t\tend" + NL + "\t\t\t";
  protected final String TEXT_38 = NL + "\t\t\t\t";
  protected final String TEXT_39 = "'d";
  protected final String TEXT_40 = ":" + NL + "\t\t\t\tbegin" + NL + "\t";
  protected final String TEXT_41 = "\t" + NL + "\t\t\t\t\t";
  protected final String TEXT_42 = "_reg[";
  protected final String TEXT_43 = ":";
  protected final String TEXT_44 = "] <= snoop_data[";
  protected final String TEXT_45 = ":";
  protected final String TEXT_46 = "];" + NL + "\t\t\t\t\t";
  protected final String TEXT_47 = "_valid_reg <= 1'b";
  protected final String TEXT_48 = ";";
  protected final String TEXT_49 = NL + "\t\t\t\tend" + NL + "\t\t\tendcase" + NL + "\t\tend" + NL + "\tend" + NL + "endmodule" + NL + "" + NL + "// Local Variables:" + NL + "// verilog-library-directories:(\".\")" + NL + "// verilog-library-files:()" + NL + "// verilog-library-extensions:(\".v\" \".vh\")" + NL + "// eval:(verilog-read-includes)" + NL + "// eval:(setq verilog-auto-output-ignore-regexp \"^w_.*\")" + NL + "// eval:(setq verilog-auto-input-ignore-regexp \"^w_.*\")" + NL + "// End:" + NL;
  protected final String TEXT_50 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Entry<String, Struct> entry = (Entry<String, Struct>) argument;
   String widthString = entry.getKey().replace(entry.getValue().getName() + "_", "");
   Integer width = Integer.valueOf(widthString);

    stringBuffer.append(TEXT_2);
    stringBuffer.append(entry.getKey());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(width-1);
    stringBuffer.append(TEXT_4);
    
List<Entry<String, Field>> entries = StructUtil.squash(entry.getValue());
long descriptor_beat_count = (StructUtil.getAtomSize(entry.getValue()) + width - 1)/width;
long descriptor_beat_width = (long)(Math.log(descriptor_beat_count)/Math.log(2)) + 1;
for(Entry<String, Field> fieldEntry: entries) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(StructUtil.getFieldCount(fieldEntry.getValue())-1);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(StructUtil.getFieldCount(fieldEntry.getValue())-1);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(descriptor_beat_width-1);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(descriptor_beat_width-1);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(descriptor_beat_width);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(descriptor_beat_count-1);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(descriptor_beat_width);
    stringBuffer.append(TEXT_17);
    for(Entry<String, Field> fieldEntry: entries) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_22);
    }
    stringBuffer.append(TEXT_23);
    stringBuffer.append(descriptor_beat_width);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(descriptor_beat_count);
    stringBuffer.append(TEXT_25);
    for(Entry<String, Field> fieldEntry: entries) {
    stringBuffer.append(TEXT_26);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(StructUtil.getFieldCount(fieldEntry.getValue()));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    for(Entry<String, Field> fieldEntry: entries) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
    
	long bits_done = 0;
	int last_beat_index = -1;
	long bits_in_field = 0;
	Entry<String, Field> fieldEntry = null;
	Iterator<Entry<String, Field>> it = entries.iterator();

    while(it.hasNext() || fieldEntry != null) {
	if (fieldEntry == null) {
		fieldEntry = it.next();
	}
	long beat_index = bits_done / width;
	long source_bit_start = bits_in_field;
	long source_bit_end = StructUtil.getFieldCount(fieldEntry.getValue()) - 1;
	long input_bit_start = bits_done % width;
	int entry_done = 0;
	if (bits_in_field == 0) {
		bits_in_field = StructUtil.getFieldCount(fieldEntry.getValue());
	}
	long input_bit_end = bits_in_field + input_bit_start - 1;
	if (input_bit_end > width - 1) {
		source_bit_end -= input_bit_end - width + 1;
		bits_in_field = source_bit_end - source_bit_start + 1;
		input_bit_end = width - 1;
		entry_done = 0;
	} else {
		entry_done = 1;
	}
	bits_done = bits_done + bits_in_field;
	if (last_beat_index != beat_index) {
			++last_beat_index; 
			if (last_beat_index != 0) {
    stringBuffer.append(TEXT_37);
    }
    stringBuffer.append(TEXT_38);
    stringBuffer.append(descriptor_beat_width);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(beat_index);
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(source_bit_end);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(source_bit_start);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(input_bit_end);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(input_bit_start);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(fieldEntry.getKey());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(entry_done);
    stringBuffer.append(TEXT_48);
    {
	if(entry_done == 1) {
		fieldEntry = null;
		bits_in_field = 0;
	}
}
    }
    stringBuffer.append(TEXT_49);
    stringBuffer.append(TEXT_50);
    return stringBuffer.toString();
  }
}
