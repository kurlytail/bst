package com.brainspeedtech.gen.software.python;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.python.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;;

public class StructHeaderFile
{
  protected static String nl;
  public static synchronized StructHeaderFile create(String lineSeparator)
  {
    nl = lineSeparator;
    StructHeaderFile result = new StructHeaderFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "import struct" + NL + "import gen_swarm_struct_base ";
  protected final String TEXT_2 = NL + "import gen_";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "class ";
  protected final String TEXT_6 = "(gen_swarm_struct_base.swarm_struct_base):" + NL + "    def __init__(self):";
  protected final String TEXT_7 = NL + "        self.";
  protected final String TEXT_8 = " = 0";
  protected final String TEXT_9 = NL + "        self.";
  protected final String TEXT_10 = " = 0";
  protected final String TEXT_11 = NL + "        self.";
  protected final String TEXT_12 = " = [0] * ";
  protected final String TEXT_13 = NL + "        self.";
  protected final String TEXT_14 = " = 0";
  protected final String TEXT_15 = NL + "        self.";
  protected final String TEXT_16 = " = [0] * ";
  protected final String TEXT_17 = NL + "        self.";
  protected final String TEXT_18 = " = 0";
  protected final String TEXT_19 = NL + "        self.";
  protected final String TEXT_20 = " = [0] * ";
  protected final String TEXT_21 = NL + "        self.";
  protected final String TEXT_22 = " = ";
  protected final String TEXT_23 = "()";
  protected final String TEXT_24 = NL + "        self.";
  protected final String TEXT_25 = " = [";
  protected final String TEXT_26 = "()] * ";
  protected final String TEXT_27 = NL + NL + "    def unpack(self, byteBuffer):" + NL + "        offset = 0" + NL + "        last_value = 0";
  protected final String TEXT_28 = NL + "        last_value = struct.unpack('I', byteBuffer[offset:offset + struct.calcsize('I')])[0]" + NL + "        offset = offset + struct.calcsize('I')";
  protected final String TEXT_29 = NL + "        self.";
  protected final String TEXT_30 = " = (last_value & ";
  protected final String TEXT_31 = ")" + NL + "        last_value = last_value >> ";
  protected final String TEXT_32 = NL + "        self.";
  protected final String TEXT_33 = " = struct.unpack('Q', byteBuffer[offset:offset + struct.calcsize('Q')])[0]" + NL + "        offset = offset + struct.calcsize('Q')";
  protected final String TEXT_34 = NL + "        for i in range(0,";
  protected final String TEXT_35 = "):" + NL + "            self.";
  protected final String TEXT_36 = "[i] = struct.unpack('Q', byteBuffer[offset:offset + struct.calcsize('Q')])[0]" + NL + "            offset = offset + struct.calcsize('Q')" + NL + "            ";
  protected final String TEXT_37 = NL + "        self.";
  protected final String TEXT_38 = " = struct.unpack('I',byteBuffer[offset:offset + struct.calcsize('I')])[0]" + NL + "        offset = offset + struct.calcsize('I')";
  protected final String TEXT_39 = NL + "        for i in range(0,";
  protected final String TEXT_40 = "):" + NL + "            self.";
  protected final String TEXT_41 = "[i] = struct.unpack('I',byteBuffer[offset:offset + struct.calcsize('I')])[0]" + NL + "            offset = offset + struct.calcsize('I')";
  protected final String TEXT_42 = NL + "        self.";
  protected final String TEXT_43 = " = struct.unpack('H',byteBuffer[offset:offset + struct.calcsize('H')])[0]" + NL + "        offset = offset + struct.calcsize('H')";
  protected final String TEXT_44 = NL + "        for i in range(0,";
  protected final String TEXT_45 = "):" + NL + "            self.";
  protected final String TEXT_46 = "[i] = struct.unpack('H',byteBuffer[offset:offset + struct.calcsize('H')])[0]" + NL + "            offset = offset + struct.calcsize('H')";
  protected final String TEXT_47 = NL + "        self.";
  protected final String TEXT_48 = ".unpack(byteBuffer[offset:offset + ";
  protected final String TEXT_49 = ".getByteSize()])" + NL + "        offset = offset + ";
  protected final String TEXT_50 = ".getByteSize()";
  protected final String TEXT_51 = NL + "        for i in range(0,";
  protected final String TEXT_52 = "):" + NL + "            self.";
  protected final String TEXT_53 = "[i].unpack(byteBuffer[offset:offset + ";
  protected final String TEXT_54 = ".getByteSize()])" + NL + "            offset = offset + ";
  protected final String TEXT_55 = ".getByteSize()";
  protected final String TEXT_56 = NL + "\t" + NL + "    def pack(self):" + NL + "        last_value = 0" + NL + "        byteBuffer = \"\"";
  protected final String TEXT_57 = NL + "        last_value = last_value | ((self.";
  protected final String TEXT_58 = " & ";
  protected final String TEXT_59 = ") << ";
  protected final String TEXT_60 = ")";
  protected final String TEXT_61 = NL + "        byteBuffer += struct.pack(\"I\", last_value)" + NL + "        last_value = 0";
  protected final String TEXT_62 = NL + "        byteBuffer += struct.pack(\"Q\", self.";
  protected final String TEXT_63 = ")";
  protected final String TEXT_64 = NL + "        for i in range(0, ";
  protected final String TEXT_65 = "):" + NL + "            byteBuffer += struct.pack(\"Q\", self.";
  protected final String TEXT_66 = "[i])";
  protected final String TEXT_67 = NL + "        byteBuffer += struct.pack(\"I\", self.";
  protected final String TEXT_68 = ")";
  protected final String TEXT_69 = NL + "        for i in range(0, ";
  protected final String TEXT_70 = "):" + NL + "            byteBuffer += struct.pack(\"I\", self.";
  protected final String TEXT_71 = "[i])";
  protected final String TEXT_72 = NL + "        byteBuffer += struct.pack(\"H\", self.";
  protected final String TEXT_73 = ")";
  protected final String TEXT_74 = NL + "        for i in range(0, ";
  protected final String TEXT_75 = "):" + NL + "            byteBuffer += struct.pack(\"H\", self.";
  protected final String TEXT_76 = "[i])";
  protected final String TEXT_77 = NL + "        byteBuffer += self.";
  protected final String TEXT_78 = ".pack()";
  protected final String TEXT_79 = NL + "        for i in range(0, ";
  protected final String TEXT_80 = "):" + NL + "            byteBuffer += self.";
  protected final String TEXT_81 = "[i].pack()";
  protected final String TEXT_82 = NL + "        byteBuffer += struct.pack_to(\"I\", last_value)";
  protected final String TEXT_83 = "\t\t" + NL + "        return byteBuffer" + NL + "    " + NL + "    @staticmethod    " + NL + "    def getByteSize():" + NL + "        return ";
  protected final String TEXT_84 = NL + NL + "class ";
  protected final String TEXT_85 = ":";
  protected final String TEXT_86 = NL + "    ";
  protected final String TEXT_87 = " = ";
  protected final String TEXT_88 = NL;
  protected final String TEXT_89 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Resource resource = (Resource)argument;

    
	String fileName = resource.getURI().lastSegment()
						.replaceAll("\\.struct$", "");
	List<Atom> atoms = new ArrayList<Atom>();
	Set<Document> includeFiles = new HashSet<Document>();

	TreeIterator<EObject> contents = resource.getAllContents();
	while(contents.hasNext()) {
		EObject eObject = contents.next();
		if (eObject instanceof Atom) {
			Atom atom = (Atom) eObject;
			atoms.add((Atom) eObject);
			if (atom.getAtom() != null) {
				if (atom.getAtom().eResource() == resource)
					continue;
				includeFiles.add((Document)EcoreUtil.getObjectByType(atom.getAtom().eResource().getContents(),
					StructPackage.eINSTANCE.getDocument()));
			}
			if (atom instanceof Struct) {
				Struct str = (Struct) atom;
				for (Field f : str.getField()) {
					if (f.getAtom() != null) {
						if (f.getAtom().eResource() == resource)
							continue;
						includeFiles.add((Document)EcoreUtil.getObjectByType(f.getAtom().eResource().getContents(),
							StructPackage.eINSTANCE.getDocument()));
					}
				}
			}
		}
	}
	
	Collection<Struct> structs = EcoreUtil.getObjectsByType(
		atoms, StructPackage.eINSTANCE.getStruct());
		
	Document currentDoc = (Document)EcoreUtil.getObjectByType(resource.getContents(),
			StructPackage.eINSTANCE.getDocument());
					
	String className = currentDoc.eResource().getURI().lastSegment().replaceAll("\\.struct$", "");
	

    stringBuffer.append(TEXT_1);
    for (Document includeFile : includeFiles) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(includeFile.eResource().getURI().lastSegment().replaceAll("\\.struct$", ""));
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    for(Atom atom: atoms) {
	if(ProjectUtil.getReferringInstance(atom, NativeType.class) != null)
		continue;
	if(atom instanceof Struct) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_6);
    		for (Field f : ((Struct) atom).getField()) {
			if (f.getAtom() == null) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_8);
    		
		} else if(f.getAtom().getName().equals("uint16")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_10);
    
				} else {

    stringBuffer.append(TEXT_11);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(StructUtil.getFieldCount(f));
    				}
			} else if(f.getAtom().getName().equals("uint32")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_14);
    
				} else {

    stringBuffer.append(TEXT_15);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(StructUtil.getFieldCount(f));
    				}
			} else if(f.getAtom().getName().equals("uint64")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_18);
    
				} else {

    stringBuffer.append(TEXT_19);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(StructUtil.getFieldCount(f));
    				}
			} else {
			    String isLocal = "gen_";
			    if (StructGenerator.getHeirarchicalName(f).split("\\.").length == 1) isLocal = "";
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(isLocal);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_23);
    
				} else {

    stringBuffer.append(TEXT_24);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(isLocal);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(StructUtil.getFieldCount(f));
    				}
			}
		}

    stringBuffer.append(TEXT_27);
    		
		int bits_remaining = 0;
		for (Field f : ((Struct) atom).getField()) {
			if(f.getAtom() == null) {
				int mask = ((1 << StructUtil.getFieldCount(f)) - 1);
				if(StructUtil.getFieldCount(f) == 32) mask = 0xffffffff;
			
				if (bits_remaining == 0) {

    stringBuffer.append(TEXT_28);
    
					bits_remaining = 32;
				}

    stringBuffer.append(TEXT_29);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(mask);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(StructUtil.getFieldCount(f));
    
				bits_remaining -= StructUtil.getFieldCount(f);
			}
		
				if(f.getAtom() != null) {
					if(f.getAtom().getName().equals("uint64")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_32);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_33);
    
						} else {

    stringBuffer.append(TEXT_34);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(f.getName() );
    stringBuffer.append(TEXT_36);
    
						}
					}
					else if(f.getAtom().getName().equals("uint32")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_37);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_38);
    
						} else {

    stringBuffer.append(TEXT_39);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_41);
    
						}
					}
					else if(f.getAtom().getName().equals("uint16")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_42);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_43);
    
						} else {

    stringBuffer.append(TEXT_44);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_46);
    
						}
					}
					else if(f.getAtom() instanceof Atom) {
                        String isLocal = "gen_";
                        String hName = StructGenerator.getHeirarchicalName(f);
                        if (hName.split("\\.").length == 1) isLocal = "";
					   
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_47);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(isLocal);
    stringBuffer.append(hName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(isLocal);
    stringBuffer.append(hName);
    stringBuffer.append(TEXT_50);
    
						} else {

    stringBuffer.append(TEXT_51);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(isLocal);
    stringBuffer.append(hName);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(isLocal);
    stringBuffer.append(hName);
    stringBuffer.append(TEXT_55);
    
						}
					}
				}
		}

    stringBuffer.append(TEXT_56);
    	
		long buffer_size = 0;
		bits_remaining = 32;
		for (Field f : ((Struct) atom).getField()) {
			if(f.getAtom() == null) {
				int mask = ((1 << StructUtil.getFieldCount(f)) - 1);
				if(StructUtil.getFieldCount(f) == 32) mask = 0xffffffff;

    stringBuffer.append(TEXT_57);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(mask);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(32-bits_remaining);
    stringBuffer.append(TEXT_60);
    
				bits_remaining -= StructUtil.getFieldCount(f);
				if (bits_remaining == 0) {

    stringBuffer.append(TEXT_61);
    
					bits_remaining = 32;
					buffer_size += 4;
				}
				
			}
		
		
				if(f.getAtom() != null) {
					buffer_size += (StructUtil.getFieldCount(f) * StructUtil.getAtomSize(f.getAtom()))/8;
					if(f.getAtom().getName().equals("uint64")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_62);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_63);
    
						} else {

    stringBuffer.append(TEXT_64);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_66);
    
						}
					}
					else if(f.getAtom().getName().equals("uint32")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_67);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_68);
    
						} else {

    stringBuffer.append(TEXT_69);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_71);
    
						}
					}
					else if(f.getAtom().getName().equals("uint16")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_72);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_73);
    
						} else {

    stringBuffer.append(TEXT_74);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_76);
    
						}
					}
					else if(f.getAtom() instanceof Atom) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_77);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_78);
    
						} else {

    stringBuffer.append(TEXT_79);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_81);
    
						}
					}
				}
		}
		if (bits_remaining != 32) {

    stringBuffer.append(TEXT_82);
    
			bits_remaining = 32;
			buffer_size += 4;
			
		}
		

    stringBuffer.append(TEXT_83);
    stringBuffer.append(buffer_size);
    
	} else if (atom instanceof com.brainspeedtech.struct.Enum) {

    stringBuffer.append(TEXT_84);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_85);
    		for (EnumTerm et : ((com.brainspeedtech.struct.Enum) atom).getTerm()) {
    stringBuffer.append(TEXT_86);
    stringBuffer.append(et.getName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(et.getValue());
    		}
    stringBuffer.append(TEXT_88);
    
	}
}
    stringBuffer.append(TEXT_89);
    return stringBuffer.toString();
  }
}
