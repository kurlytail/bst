package com.brainspeedtech.gen.software.java;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import com.brainspeedtech.constraint.software.java.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import java.util.*;
import org.eclipse.emf.transaction.util.*;;

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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.nio.ByteBuffer;" + NL;
  protected final String TEXT_3 = NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";";
  protected final String TEXT_6 = NL + NL + "public class ";
  protected final String TEXT_7 = " {" + NL;
  protected final String TEXT_8 = NL + "\tpublic static class ";
  protected final String TEXT_9 = " extends SwarmStructBase {";
  protected final String TEXT_10 = NL + "\t\tpublic int ";
  protected final String TEXT_11 = " = 0;";
  protected final String TEXT_12 = NL + "\t\tpublic short ";
  protected final String TEXT_13 = " = 0;";
  protected final String TEXT_14 = NL + "\t\tpublic short ";
  protected final String TEXT_15 = "[] = new short[";
  protected final String TEXT_16 = "];";
  protected final String TEXT_17 = NL + "\t\tpublic int ";
  protected final String TEXT_18 = " = 0;";
  protected final String TEXT_19 = NL + "\t\tpublic int ";
  protected final String TEXT_20 = "[] = new int[";
  protected final String TEXT_21 = "];";
  protected final String TEXT_22 = NL + "\t\tpublic long ";
  protected final String TEXT_23 = " = 0;";
  protected final String TEXT_24 = NL + "\t\tpublic long ";
  protected final String TEXT_25 = "[] = new long[";
  protected final String TEXT_26 = "];";
  protected final String TEXT_27 = NL + "\t\tpublic ";
  protected final String TEXT_28 = " ";
  protected final String TEXT_29 = " = new ";
  protected final String TEXT_30 = "();";
  protected final String TEXT_31 = NL + "\t\tpublic ";
  protected final String TEXT_32 = " ";
  protected final String TEXT_33 = "[] = new ";
  protected final String TEXT_34 = "[";
  protected final String TEXT_35 = "];" + NL + "\t\t{" + NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_36 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_37 = "[i] = new  ";
  protected final String TEXT_38 = "();" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_39 = NL + "\t\tpublic void unpack(ByteBuffer byteBuffer) {" + NL + "\t\t\t" + NL + "\t\t\tint last_value = 0;";
  protected final String TEXT_40 = NL + "\t\t\tlast_value = byteBuffer.getInt();";
  protected final String TEXT_41 = NL + "\t\t\t";
  protected final String TEXT_42 = " = (last_value & ";
  protected final String TEXT_43 = ");" + NL + "\t\t\tlast_value >>>= ";
  protected final String TEXT_44 = ";";
  protected final String TEXT_45 = NL + "\t\t\t";
  protected final String TEXT_46 = " = byteBuffer.getLong();";
  protected final String TEXT_47 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_48 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_49 = "[i] = byteBuffer.getLong();" + NL + "\t\t\t}";
  protected final String TEXT_50 = NL + "\t\t\t";
  protected final String TEXT_51 = " = byteBuffer.getInt();";
  protected final String TEXT_52 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_53 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_54 = "[i] = byteBuffer.getInt();" + NL + "\t\t\t}";
  protected final String TEXT_55 = NL + "\t\t\t";
  protected final String TEXT_56 = " = byteBuffer.getShort();";
  protected final String TEXT_57 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_58 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_59 = "[i] = byteBuffer.getShort();" + NL + "\t\t\t}";
  protected final String TEXT_60 = NL + "\t\t\t";
  protected final String TEXT_61 = ".unpack(byteBuffer);";
  protected final String TEXT_62 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_63 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_64 = "[i].unpack(byteBuffer);" + NL + "\t\t\t}";
  protected final String TEXT_65 = NL + "\t\t}" + NL + "\t" + NL + "\t\tpublic void pack(ByteBuffer byteBuffer) {" + NL + "\t\t\tint last_value = 0;";
  protected final String TEXT_66 = NL + "\t\t\tlast_value |= ((int)(";
  protected final String TEXT_67 = " & ";
  protected final String TEXT_68 = ")) << ";
  protected final String TEXT_69 = ";";
  protected final String TEXT_70 = NL + "\t\t\t\t\tbyteBuffer.putInt(last_value);" + NL + "\t\t\t\t\tlast_value = 0;";
  protected final String TEXT_71 = NL + "\t\t\tbyteBuffer.putLong(";
  protected final String TEXT_72 = ");";
  protected final String TEXT_73 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_74 = "; ++i) {" + NL + "\t\t\t\tbyteBuffer.putLong(";
  protected final String TEXT_75 = "[i]);" + NL + "\t\t\t}";
  protected final String TEXT_76 = NL + "\t\t\tbyteBuffer.putInt(";
  protected final String TEXT_77 = ");";
  protected final String TEXT_78 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_79 = "; ++i) {" + NL + "\t\t\t\t byteBuffer.putInt(";
  protected final String TEXT_80 = "[i]);" + NL + "\t\t\t}";
  protected final String TEXT_81 = NL + "\t\t\tbyteBuffer.putShort(";
  protected final String TEXT_82 = ");";
  protected final String TEXT_83 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_84 = "; ++i) {" + NL + "\t\t\t\t byteBuffer.putShort(";
  protected final String TEXT_85 = "[i]);" + NL + "\t\t\t}";
  protected final String TEXT_86 = NL + "\t\t\t";
  protected final String TEXT_87 = ".pack(byteBuffer);";
  protected final String TEXT_88 = NL + "\t\t\tfor(int i = 0; i < ";
  protected final String TEXT_89 = "; ++i) {" + NL + "\t\t\t\t";
  protected final String TEXT_90 = "[i].pack(byteBuffer);" + NL + "\t\t\t}";
  protected final String TEXT_91 = NL + "\t\t\tbyteBuffer.putInt(last_value);";
  protected final String TEXT_92 = "\t\t" + NL + "\t\t}" + NL + "\t" + NL + "\t\tpublic long getByteSize() {" + NL + "\t\t\treturn ";
  protected final String TEXT_93 = ";" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL;
  protected final String TEXT_94 = NL + "\tpublic enum ";
  protected final String TEXT_95 = " {";
  protected final String TEXT_96 = NL + "\t\t";
  protected final String TEXT_97 = " (";
  protected final String TEXT_98 = "),";
  protected final String TEXT_99 = NL + "\t\t";
  protected final String TEXT_100 = "_MAX;" + NL + "\t\tprivate static long maxValue = 0;" + NL + "\t\tprivate long value;" + NL + "\t\t" + NL + "\t\tprivate void setValue(long v) {" + NL + "\t\t\tvalue = v;" + NL + "\t\t\tmaxValue = v + 1;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate void setValue() {" + NL + "\t\t\tvalue = maxValue ++;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_101 = "(int value) {" + NL + "\t\t\tsetValue(value);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_102 = "() {" + NL + "\t\t\tsetValue();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tpublic long getValue() {" + NL + "\t\t\treturn value;" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_103 = NL + "}";
  protected final String TEXT_104 = NL;

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
		
	JavaPackage javaPackage = ProjectUtil.getReferringInstance(currentDoc,JavaPackage.class);
			
	String className = currentDoc.eResource().getURI().lastSegment().replaceAll("\\.struct$", "");
	String packageName;
	if (javaPackage != null) {
		packageName = javaPackage.getName();
	} else {
		packageName = TransactionUtil.getEditingDomain(resource).getID() + ".gen.struct";
	}
	

    stringBuffer.append(TEXT_1);
    stringBuffer.append(packageName);
    stringBuffer.append(TEXT_2);
    for (Document includeFile : includeFiles) {
	javaPackage = ProjectUtil.getReferringInstance(includeFile,
			JavaPackage.class);

    if(javaPackage != null){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(javaPackage.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(includeFile.eResource().getURI().lastSegment().replaceAll("\\.struct$", ""));
    stringBuffer.append(TEXT_5);
    } else {
    }
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_7);
    for(Atom atom: atoms) {
	if(ProjectUtil.getReferringInstance(atom, NativeType.class) != null)
		continue;
	if(atom instanceof Struct) { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_9);
    		for (Field f : ((Struct) atom).getField()) {
			if (f.getAtom() == null) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_11);
    		
		} else if(f.getAtom().getName().equals("uint16")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_13);
    
				} else {

    stringBuffer.append(TEXT_14);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_16);
    				}
			} else if(f.getAtom().getName().equals("uint32")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_18);
    
				} else {

    stringBuffer.append(TEXT_19);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_21);
    				}
			} else if(f.getAtom().getName().equals("uint64")) {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_23);
    
				} else {

    stringBuffer.append(TEXT_24);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_26);
    				}
			} else {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_27);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_30);
    
				} else {

    stringBuffer.append(TEXT_31);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(StructGenerator.getHeirarchicalName(f));
    stringBuffer.append(TEXT_38);
    				}
			}
		}

    stringBuffer.append(TEXT_39);
    		
		int bits_remaining = 0;
		for (Field f : ((Struct) atom).getField()) {
			if(f.getAtom() == null) {
				int mask = ((1 << StructUtil.getFieldCount(f)) - 1);
				if(StructUtil.getFieldCount(f) == 32) mask = 0xffffffff;
			
				if (bits_remaining == 0) {

    stringBuffer.append(TEXT_40);
    
					bits_remaining = 32;
				}

    stringBuffer.append(TEXT_41);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(mask);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_44);
    
				bits_remaining -= StructUtil.getFieldCount(f);
			}
		
				if(f.getAtom() != null) {
					if(f.getAtom().getName().equals("uint64")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_45);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_46);
    
						} else {

    stringBuffer.append(TEXT_47);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_49);
    
						}
					}
					else if(f.getAtom().getName().equals("uint32")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_50);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_51);
    
						} else {

    stringBuffer.append(TEXT_52);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_54);
    
						}
					}
					else if(f.getAtom().getName().equals("uint16")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_55);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_56);
    
						} else {

    stringBuffer.append(TEXT_57);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_59);
    
						}
					}
					else if(f.getAtom() instanceof Atom) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_60);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_61);
    
						} else {

    stringBuffer.append(TEXT_62);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_64);
    
						}
					}
				}
		}

    stringBuffer.append(TEXT_65);
    		
		long buffer_size = 0;
		bits_remaining = 32;
		for (Field f : ((Struct) atom).getField()) {
			if(f.getAtom() == null) {
				int mask = ((1 << StructUtil.getFieldCount(f)) - 1);
				if(StructUtil.getFieldCount(f) == 32) mask = 0xffffffff;

    stringBuffer.append(TEXT_66);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(mask);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(32-bits_remaining);
    stringBuffer.append(TEXT_69);
    
				bits_remaining -= StructUtil.getFieldCount(f);
				if (bits_remaining == 0) {

    stringBuffer.append(TEXT_70);
    
					bits_remaining = 32;
					buffer_size += 4;
				}
				
			}
		
		
				if(f.getAtom() != null) {
					buffer_size += (StructUtil.getFieldCount(f) * StructUtil.getAtomSize(f.getAtom()))/8;
					if(f.getAtom().getName().equals("uint64")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_71);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_72);
    
						} else {

    stringBuffer.append(TEXT_73);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_75);
    
						}
					}
					else if(f.getAtom().getName().equals("uint32")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_76);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_77);
    
						} else {

    stringBuffer.append(TEXT_78);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_80);
    
						}
					}
					else if(f.getAtom().getName().equals("uint16")) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_81);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_82);
    
						} else {

    stringBuffer.append(TEXT_83);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_85);
    
						}
					}
					else if(f.getAtom() instanceof Atom) {
						if(StructUtil.getFieldCount(f) <= 1) {

    stringBuffer.append(TEXT_86);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_87);
    
						} else {

    stringBuffer.append(TEXT_88);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_90);
    
						}
					}
				}
		}
		if (bits_remaining != 32) {

    stringBuffer.append(TEXT_91);
    
			bits_remaining = 32;
			buffer_size += 4;
			
		}
		

    stringBuffer.append(TEXT_92);
    stringBuffer.append(buffer_size);
    stringBuffer.append(TEXT_93);
    
	} else if (atom instanceof com.brainspeedtech.struct.Enum) {

    stringBuffer.append(TEXT_94);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_95);
    		for (EnumTerm et : ((com.brainspeedtech.struct.Enum) atom).getTerm()) {
    stringBuffer.append(TEXT_96);
    stringBuffer.append(et.getName());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(et.getValue());
    stringBuffer.append(TEXT_98);
    		}
    stringBuffer.append(TEXT_99);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_102);
    
	}
}
    stringBuffer.append(TEXT_103);
    stringBuffer.append(TEXT_104);
    return stringBuffer.toString();
  }
}
