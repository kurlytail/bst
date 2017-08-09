package com.brainspeedtech.gen.verilog;

import java.util.*;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.constraint.hardware.verilog.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.struct.*;
import org.eclipse.emf.ecore.*;;

public class DesignModuleFile
{
  protected static String nl;
  public static synchronized DesignModuleFile create(String lineSeparator)
  {
    nl = lineSeparator;
    DesignModuleFile result = new DesignModuleFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "`timescale 1ns/100ps" + NL + "" + NL + "`include \"gen_";
  protected final String TEXT_2 = "_design.vh\"" + NL + "" + NL + "module gen_";
  protected final String TEXT_3 = "_wrapper(/*AUTOARG*/);" + NL;
  protected final String TEXT_4 = NL + NL + "\tinput wire ";
  protected final String TEXT_5 = ";" + NL + "\tinput wire ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "\tinput wire ";
  protected final String TEXT_8 = "_clk;" + NL + "\tinput wire ";
  protected final String TEXT_9 = "_rst_n;";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "\toutput wire [";
  protected final String TEXT_12 = ":0] ";
  protected final String TEXT_13 = "_data;" + NL + "\toutput wire ";
  protected final String TEXT_14 = "_rdy;" + NL + "\tinput wire ";
  protected final String TEXT_15 = "_pop;" + NL + "\twire [";
  protected final String TEXT_16 = ":0] ";
  protected final String TEXT_17 = "_before_width_data;" + NL + "\twire ";
  protected final String TEXT_18 = "_before_width_rdy;" + NL + "\twire ";
  protected final String TEXT_19 = "_before_width_pop;" + NL + "\twire [";
  protected final String TEXT_20 = ":0] ";
  protected final String TEXT_21 = "_sync_data;" + NL + "\twire ";
  protected final String TEXT_22 = "_sync_rdy;" + NL + "\twire ";
  protected final String TEXT_23 = "_sync_pop;";
  protected final String TEXT_24 = NL + "\tgen_width_";
  protected final String TEXT_25 = "_to_";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = "_width_change(" + NL + "\t\t.clk(";
  protected final String TEXT_28 = ")," + NL + "\t\t.rst_n(";
  protected final String TEXT_29 = ")," + NL + "\t\t.rdy_o(";
  protected final String TEXT_30 = "_rdy)," + NL + "\t\t.pop_o(";
  protected final String TEXT_31 = "_pop)," + NL + "\t\t.data_o(";
  protected final String TEXT_32 = "_data)," + NL + "\t\t.rdy_i(";
  protected final String TEXT_33 = "_before_width_rdy)," + NL + "\t\t.pop_i(";
  protected final String TEXT_34 = "_before_width_pop)," + NL + "\t\t.data_i(";
  protected final String TEXT_35 = "_before_width_data)," + NL + "\t\t);";
  protected final String TEXT_36 = NL + "\tassign ";
  protected final String TEXT_37 = "_data = ";
  protected final String TEXT_38 = "_before_width_data;" + NL + "\tassign ";
  protected final String TEXT_39 = "_rdy = ";
  protected final String TEXT_40 = "_before_width_rdy;" + NL + "\tassign ";
  protected final String TEXT_41 = "_before_width_pop = ";
  protected final String TEXT_42 = "_pop;";
  protected final String TEXT_43 = NL + "\tgen_";
  protected final String TEXT_44 = "_async_fifo ";
  protected final String TEXT_45 = "_async_fifo(" + NL + "\t\t.clk_o(";
  protected final String TEXT_46 = ")," + NL + "\t\t.rst_n_o(";
  protected final String TEXT_47 = ")," + NL + "\t\t.rdy_o(";
  protected final String TEXT_48 = "_before_width_rdy)," + NL + "\t\t.pop_o(";
  protected final String TEXT_49 = "_before_width_pop)," + NL + "\t\t.data_o(";
  protected final String TEXT_50 = "_before_width_data)," + NL + "\t\t.clk_i(";
  protected final String TEXT_51 = ")," + NL + "\t\t.rst_n_i(";
  protected final String TEXT_52 = ")," + NL + "\t\t.rdy_i(";
  protected final String TEXT_53 = "_sync_rdy)," + NL + "\t\t.pop_i(";
  protected final String TEXT_54 = "_sync_pop)," + NL + "\t\t.data_i(";
  protected final String TEXT_55 = "_sync_data)," + NL + "\t\t);";
  protected final String TEXT_56 = NL + "\tassign ";
  protected final String TEXT_57 = "_before_width_data = ";
  protected final String TEXT_58 = "_sync_data;" + NL + "\tassign ";
  protected final String TEXT_59 = "_before_width_rdy = ";
  protected final String TEXT_60 = "_sync_rdy;" + NL + "\tassign ";
  protected final String TEXT_61 = "_sync_pop = ";
  protected final String TEXT_62 = "_before_width_pop;";
  protected final String TEXT_63 = NL + "\tgen_";
  protected final String TEXT_64 = "_";
  protected final String TEXT_65 = "_pack" + NL + "\t\t";
  protected final String TEXT_66 = "_";
  protected final String TEXT_67 = "_";
  protected final String TEXT_68 = "_pack(/*AUTOINST*/);" + NL + "\t\t";
  protected final String TEXT_69 = NL;
  protected final String TEXT_70 = NL + "\tinput wire [";
  protected final String TEXT_71 = ":0] ";
  protected final String TEXT_72 = "_data;" + NL + "\tinput wire ";
  protected final String TEXT_73 = "_rdy;" + NL + "\toutput wire ";
  protected final String TEXT_74 = "_pop;" + NL + "\twire [";
  protected final String TEXT_75 = ":0] ";
  protected final String TEXT_76 = "_after_width_data;" + NL + "\twire ";
  protected final String TEXT_77 = "_after_width_rdy;" + NL + "\twire ";
  protected final String TEXT_78 = "_after_width_pop;" + NL + "\twire [";
  protected final String TEXT_79 = ":0] ";
  protected final String TEXT_80 = "_sync_data;" + NL + "\twire ";
  protected final String TEXT_81 = "_sync_rdy;" + NL + "\twire ";
  protected final String TEXT_82 = "_sync_pop;";
  protected final String TEXT_83 = NL + "\tgen_width_";
  protected final String TEXT_84 = "_to_";
  protected final String TEXT_85 = " ";
  protected final String TEXT_86 = "_width_change(" + NL + "\t\t.clk(";
  protected final String TEXT_87 = ")," + NL + "\t\t.rst_n(";
  protected final String TEXT_88 = ")," + NL + "\t\t.rdy_i(";
  protected final String TEXT_89 = "_rdy)," + NL + "\t\t.pop_i(";
  protected final String TEXT_90 = "_pop)," + NL + "\t\t.data_i(";
  protected final String TEXT_91 = "_data)" + NL + "\t\t.rdy_o(";
  protected final String TEXT_92 = "_after_width_rdy)," + NL + "\t\t.pop_o(";
  protected final String TEXT_93 = "_after_width_pop)," + NL + "\t\t.data_o(";
  protected final String TEXT_94 = "_after_width_data)" + NL + "\t\t);";
  protected final String TEXT_95 = NL + "\tassign ";
  protected final String TEXT_96 = "_after_width_data = ";
  protected final String TEXT_97 = "_data;" + NL + "\tassign ";
  protected final String TEXT_98 = "_after_width_rdy = ";
  protected final String TEXT_99 = "_rdy;" + NL + "\tassign ";
  protected final String TEXT_100 = "_pop = ";
  protected final String TEXT_101 = "_after_width_pop;";
  protected final String TEXT_102 = NL + "\tgen_";
  protected final String TEXT_103 = "_async_fifo ";
  protected final String TEXT_104 = "_async_fifo(" + NL + "\t\t.clk_i(";
  protected final String TEXT_105 = ")," + NL + "\t\t.rst_n_i(";
  protected final String TEXT_106 = ")," + NL + "\t\t.rdy_i(";
  protected final String TEXT_107 = "_after_width_rdy)," + NL + "\t\t.pop_i(";
  protected final String TEXT_108 = "_after_width_pop)," + NL + "\t\t.data_i(";
  protected final String TEXT_109 = "_after_width_data)," + NL + "\t\t.clk_o(";
  protected final String TEXT_110 = ")," + NL + "\t\t.rst_n_o(";
  protected final String TEXT_111 = ")," + NL + "\t\t.rdy_o(";
  protected final String TEXT_112 = "_sync_rdy)," + NL + "\t\t.pop_o(";
  protected final String TEXT_113 = "_sync_pop)," + NL + "\t\t.data_o(";
  protected final String TEXT_114 = "_sync_data)," + NL + "\t\t);";
  protected final String TEXT_115 = NL + "\tassign ";
  protected final String TEXT_116 = "_sync_data = ";
  protected final String TEXT_117 = "_after_width_data;" + NL + "\tassign ";
  protected final String TEXT_118 = "_sync_rdy = ";
  protected final String TEXT_119 = "_after_width_rdy;" + NL + "\tassign ";
  protected final String TEXT_120 = "_after_width_pop = ";
  protected final String TEXT_121 = "_sync_pop;";
  protected final String TEXT_122 = NL + NL;
  protected final String TEXT_123 = NL + "\tgen_";
  protected final String TEXT_124 = "_";
  protected final String TEXT_125 = "_unpack" + NL + "\t\t";
  protected final String TEXT_126 = "_";
  protected final String TEXT_127 = "_";
  protected final String TEXT_128 = "_unpack(/*AUTOINST*/);" + NL + "\t\t";
  protected final String TEXT_129 = NL + NL + NL + "endmodule" + NL + "" + NL + "" + NL + "// Local Variables:" + NL + "// verilog-library-directories:(\".\")" + NL + "// verilog-library-files:()" + NL + "// verilog-library-extensions:(\".v\" \".vh\")" + NL + "// eval:(verilog-read-includes)" + NL + "// eval:(setq verilog-auto-output-ignore-regexp \"^w_.*\")" + NL + "// eval:(setq verilog-auto-input-ignore-regexp \"^w_.*\")" + NL + "// End:" + NL;
  protected final String TEXT_130 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CellInstance cell = (CellInstance) argument;
long defaultFrequency = 125000000;
long moduleFrequency = defaultFrequency;
String moduleClockName = "clk";
String moduleResetName = "rst_n";
ClockDomain moduleDomain = ProjectUtil.getReferringInstance(cell.getCell(), ClockDomain.class);
if(moduleDomain != null) {
	moduleClockName = moduleDomain.getName() + "_clk";
	moduleResetName = moduleDomain.getName() + "_rst_n";
}

    stringBuffer.append(TEXT_1);
    stringBuffer.append(((Instance)cell.eContainer()).getName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(cell.getName());
    stringBuffer.append(TEXT_3);
    

Set<ClockDomain> clockDomains = ProjectUtil.getReferringInstances(cell.getCell().getInput(), ClockDomain.class);
clockDomains.addAll(ProjectUtil.getReferringInstances(cell.getCell().getOutput(), ClockDomain.class));

Set<MasterTube> processedOutputTubes = new HashSet<MasterTube>();
Set<MasterTube> processedInputTubes = new HashSet<MasterTube>();


    stringBuffer.append(TEXT_4);
    stringBuffer.append(moduleClockName);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(moduleResetName);
    stringBuffer.append(TEXT_6);
    for(ClockDomain domain: clockDomains) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(domain.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(domain.getName());
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    for(TubeInstance ti: cell.getOutput()) {
	BusWidth widthConstraint = ProjectUtil.getReferringInstance(ti.getTube(), BusWidth.class);
	int width = 32;
	if (widthConstraint != null) {
		width = widthConstraint.getWidth();
	}
	String clockname = "clk";
	String resetname = "rst_n";
	ClockDomain clockDomain = ProjectUtil.getReferringInstance(ti.getTube(), ClockDomain.class);
	long tubeFrequency = defaultFrequency;
	if(clockDomain != null) {
		tubeFrequency = clockDomain.getFrequency().longValue();
		clockname = clockDomain.getName() + "_clk";
		resetname = clockDomain.getName() + "_rst_n";
	}
	int finalWidth = (int)((width * tubeFrequency + moduleFrequency - 1) / moduleFrequency);
	//finalWidth = 1 << (int)(Math.ceil(Math.log(finalWidth) / Math.log(2)));

    stringBuffer.append(TEXT_11);
    stringBuffer.append((width-1));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append((finalWidth-1));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append((finalWidth-1));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_23);
    	if (width != finalWidth) { 
    stringBuffer.append(TEXT_24);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(width);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(clockname);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(resetname);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_35);
     } else { 
    stringBuffer.append(TEXT_36);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_42);
    }
    	if (tubeFrequency != moduleFrequency) { 
    stringBuffer.append(TEXT_43);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(clockname);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(resetname);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(moduleClockName);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(moduleResetName);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_55);
     } else { 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_62);
    }
    
	if(processedOutputTubes.contains(ti.getTube())) continue;
	processedOutputTubes.add(ti.getTube());

	Collection<Struct> structList = MasterUtil.getDescriptors(ti.getTube());
	if (structList.isEmpty()) continue;
	
	Struct descriptorStruct = null;
	for (Struct struct: structList) {
		descriptorStruct = struct;
		break;
	}
	

    stringBuffer.append(TEXT_63);
    stringBuffer.append(descriptorStruct.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(descriptorStruct.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    for(TubeInstance ti: cell.getInput()) {
	BusWidth widthConstraint = ProjectUtil.getReferringInstance(ti.getTube(), BusWidth.class);
	int width = 32;
	if (widthConstraint != null) {
		width = widthConstraint.getWidth();
	}
	String clockname = "clk";
	String resetname = "rst_n";
	ClockDomain clockDomain = ProjectUtil.getReferringInstance(ti.getTube(), ClockDomain.class);
	long tubeFrequency = defaultFrequency;
	if(clockDomain != null) {
		tubeFrequency = clockDomain.getFrequency().longValue();
		clockname = clockDomain.getName() + "_clk";
		resetname = clockDomain.getName() + "_rst_n";
	}
	int finalWidth = (int)((width * tubeFrequency + moduleFrequency - 1) / moduleFrequency);
	//finalWidth = 1 << (int)(Math.ceil(Math.log(finalWidth) / Math.log(2)));

    stringBuffer.append(TEXT_70);
    stringBuffer.append((width-1));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_73);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_74);
    stringBuffer.append((finalWidth-1));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_77);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append((finalWidth-1));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_82);
    	if (width != finalWidth) { 
    stringBuffer.append(TEXT_83);
    stringBuffer.append(width);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(clockname);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(resetname);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_90);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_94);
     } else { 
    stringBuffer.append(TEXT_95);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_99);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_101);
    }
    	if (tubeFrequency != moduleFrequency) { 
    stringBuffer.append(TEXT_102);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_103);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(clockname);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(resetname);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(moduleClockName);
    stringBuffer.append(TEXT_110);
    stringBuffer.append(moduleResetName);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_112);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_113);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_114);
     } else { 
    stringBuffer.append(TEXT_115);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_116);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_118);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(ti.getName());
    stringBuffer.append(TEXT_121);
    }
    stringBuffer.append(TEXT_122);
    
	if(processedInputTubes.contains(ti.getTube())) continue;
	processedInputTubes.add(ti.getTube());
	
	Collection<Struct> structList = MasterUtil.getDescriptors(ti.getTube());
	if (structList.isEmpty()) continue;
	
	Struct descriptorStruct = null;
	for (Struct struct: structList) {
		descriptorStruct = struct;
		break;
	}


    stringBuffer.append(TEXT_123);
    stringBuffer.append(descriptorStruct.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(ti.getTube().getName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(descriptorStruct.getName());
    stringBuffer.append(TEXT_127);
    stringBuffer.append(finalWidth);
    stringBuffer.append(TEXT_128);
    }
    stringBuffer.append(TEXT_129);
    stringBuffer.append(TEXT_130);
    return stringBuffer.toString();
  }
}
