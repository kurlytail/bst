package com.brainspeedtech.gen.software.mray;

import org.eclipse.emf.ecore.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.core.resources.*;
import com.brainspeedtech.constraint.software.*;
import java.io.*;
import org.eclipse.emf.common.util.*;
import com.brainspeedtech.swarm.project.util.*;
import org.eclipse.emf.ecore.util.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.project.util.ProjectUtil;
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
  protected final String TEXT_1 = NL + "// Copyright Mangstor LLC," + NL + "// All rights reserved." + NL;
  protected final String TEXT_2 = NL + NL + "/*" + NL + " *  (c)2013 Mangstor, LLC. All rights reserved." + NL + " */" + NL + "" + NL + "#ifndef __GEN__";
  protected final String TEXT_3 = "_H__" + NL + "#define __GEN__";
  protected final String TEXT_4 = "_H__" + NL + "#include <stdint.h>" + NL + "" + NL + "#include \"gen_";
  protected final String TEXT_5 = "_parameters.h\"";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "#include \"gen_";
  protected final String TEXT_8 = "\"";
  protected final String TEXT_9 = NL + "#ifndef SWARM_STATIC_ASSERT" + NL + "#define SWARM_STATIC_ASSERT(__condition__, __name__) \\" + NL + "\ttypedef char assert_failed_ ## __name__ [(__condition__)? 1: -1];" + NL + "#endif" + NL + "" + NL + "#ifndef SWARM_SIZEOF" + NL + "#define SWARM_SIZEOF(__arg__) (sizeof(__arg__))" + NL + "#endif" + NL + NL;
  protected final String TEXT_10 = NL + "typedef struct _";
  protected final String TEXT_11 = " {";
  protected final String TEXT_12 = NL + "\tuint32_t ";
  protected final String TEXT_13 = ":";
  protected final String TEXT_14 = ";";
  protected final String TEXT_15 = NL + "\tuint32_t ";
  protected final String TEXT_16 = ":";
  protected final String TEXT_17 = ";";
  protected final String TEXT_18 = NL + "\tstruct {" + NL + "\t\tuint32_t ";
  protected final String TEXT_19 = ":";
  protected final String TEXT_20 = ";" + NL + "\t} [";
  protected final String TEXT_21 = "];";
  protected final String TEXT_22 = NL + "\t";
  protected final String TEXT_23 = "_t ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = ";";
  protected final String TEXT_26 = NL + "\t";
  protected final String TEXT_27 = "_t ";
  protected final String TEXT_28 = ";";
  protected final String TEXT_29 = NL + "\t";
  protected final String TEXT_30 = "_t ";
  protected final String TEXT_31 = "[";
  protected final String TEXT_32 = "];";
  protected final String TEXT_33 = NL + "} ";
  protected final String TEXT_34 = "_t;" + NL + "static inline void swarm_print_struct_";
  protected final String TEXT_35 = "(";
  protected final String TEXT_36 = "_t *value)" + NL + "{" + NL + "}" + NL;
  protected final String TEXT_37 = NL + "typedef enum _";
  protected final String TEXT_38 = " {";
  protected final String TEXT_39 = NL + "\t";
  protected final String TEXT_40 = " = ";
  protected final String TEXT_41 = ",";
  protected final String TEXT_42 = NL + "\t";
  protected final String TEXT_43 = "_MAX" + NL + "} ENUM_";
  protected final String TEXT_44 = ";" + NL;
  protected final String TEXT_45 = NL;
  protected final String TEXT_46 = NL + NL + "#define ";
  protected final String TEXT_47 = "_SIZE\t(";
  protected final String TEXT_48 = "UL)";
  protected final String TEXT_49 = NL + "SWARM_STATIC_ASSERT(";
  protected final String TEXT_50 = "_SIZE == SWARM_SIZEOF(";
  protected final String TEXT_51 = "_t), __";
  protected final String TEXT_52 = "__calculated_size_mismatch);";
  protected final String TEXT_53 = NL + "#define ";
  protected final String TEXT_54 = "_";
  protected final String TEXT_55 = "_OFFSET\t(";
  protected final String TEXT_56 = "UL)" + NL + "#define ";
  protected final String TEXT_57 = "_";
  protected final String TEXT_58 = "_SIZE\t\t(";
  protected final String TEXT_59 = "UL)" + NL;
  protected final String TEXT_60 = NL + NL + NL + "#endif";
  protected final String TEXT_61 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    Resource resource = (Resource) argument;
	String fileName = resource.getURI().lastSegment()
						.replaceAll("\\.struct$", "");
    MasterDesign design = ProjectUtil.getMasterDesign(resource);

    stringBuffer.append(TEXT_2);
    stringBuffer.append(fileName.toUpperCase());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(fileName.toUpperCase());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(design.getName());
    stringBuffer.append(TEXT_5);
    
	List<Atom> atoms = new ArrayList<Atom>();
	HashMap<String, Boolean> includeFiles = new HashMap<String, Boolean>();

	TreeIterator<EObject> contents = resource.getAllContents();
	while(contents.hasNext()) {
		EObject eObject = contents.next();
		if (eObject instanceof Atom) {
			Atom atom = (Atom) eObject;
			atoms.add((Atom) eObject);
			if (atom.getAtom() != null) {
				if (atom.getAtom().eResource() == resource)
					continue;
				atom.getAtom().eResource().getURI()
                        .toFileString().length();
				includeFiles.put(atom.getAtom().eResource().getURI()
						.toFileString(), true);
			}
			if (atom instanceof Struct) {
				Struct str = (Struct) atom;
				for (Field f : str.getField()) {
					if (f.getAtom() != null) {
						if (f.getAtom().eResource() == resource)
							continue;
						EcoreUtil.resolveAll(f.getAtom());
						if (f.getAtom() == null ||
							f.getAtom().eResource() == null ||
							f.getAtom().eResource().getURI() == null) 
							continue;
                        URI uri = f.getAtom().eResource().getURI();
                        String fileString = uri.toFileString();
                        f.getAtom().eResource().getURI()
                                .toFileString().length();
						includeFiles.put(f.getAtom().eResource().getURI()
								.toFileString(), true);
					}
				}
			}
		}
	}
	
	Collection<Struct> structs = EcoreUtil.getObjectsByType(
		atoms, StructPackage.eINSTANCE.getStruct());

    stringBuffer.append(TEXT_6);
    for (String includeFile : includeFiles.keySet()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append((new File(includeFile)).getName().replaceAll("\\.struct$", ".h"));
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    for(Atom atom: atoms) {
	if(ProjectUtil.getReferringInstance(atom, NativeType.class) != null) {
		continue;
	}
	if (StructUtil.getAtomSize(atom) > 4*8*8192)
		continue;
		
	if(atom instanceof Struct) { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_11);
    		for (Field f : ((Struct) atom).getField()) {
			if (f.getAtom() == null) {
				if (StructUtil.getFieldCount(f) <= 32) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(StructUtil.getFieldCountString(f));
    stringBuffer.append(TEXT_14);
    				}
			} else if (f.getAtom() instanceof com.brainspeedtech.struct.Enum) {
				if (StructUtil.getFieldCount(f) <= 1) {
					if (f.getAtom().getCount() <= 32) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(StructUtil.getFieldCountString(f));
    stringBuffer.append(TEXT_17);
    
					} else {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(f.getAtom().getCount());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(StructUtil.getFieldCountString(f));
    stringBuffer.append(TEXT_21);
    					}
				} else {
					String fieldCount = "";
					if (StructUtil.getFieldCount(f) > 1) {
						fieldCount = "[" + StructUtil.getFieldCountString(f) + "]";
					} 

    stringBuffer.append(TEXT_22);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(fieldCount);
    stringBuffer.append(TEXT_25);
    				}
			} else {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_26);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_28);
    
				} else {

    stringBuffer.append(TEXT_29);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(StructUtil.getFieldCountString(f));
    stringBuffer.append(TEXT_32);
    				}
			}
		}

    stringBuffer.append(TEXT_33);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_36);
    
	} else if (atom instanceof com.brainspeedtech.struct.Enum) {

    stringBuffer.append(TEXT_37);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_38);
    		for (EnumTerm et : ((com.brainspeedtech.struct.Enum) atom).getTerm()) {
    stringBuffer.append(TEXT_39);
    stringBuffer.append(et.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(et.getValue());
    stringBuffer.append(TEXT_41);
    		}
    stringBuffer.append(TEXT_42);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_44);
    
	}
}
    stringBuffer.append(TEXT_45);
    for(Struct struct: structs) {
	long currentLocation = 0;

    stringBuffer.append(TEXT_46);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_47);
    stringBuffer.append(StructUtil.getAtomSize(struct)/8);
    stringBuffer.append(TEXT_48);
    if (StructUtil.getAtomSize(struct) <= 4*8*8192) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(struct.getName());
    stringBuffer.append(TEXT_52);
    }
    	for(Field field: struct.getField()) {
	long nextLocation = currentLocation + StructUtil.getFieldCount(field) * 
			StructUtil.getAtomSize(field.getAtom());

    stringBuffer.append(TEXT_53);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_55);
    stringBuffer.append((currentLocation/8));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(struct.getName().toUpperCase());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(field.getName().toUpperCase());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(((nextLocation - currentLocation)/8));
    stringBuffer.append(TEXT_59);
    	currentLocation = nextLocation;
	}
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(TEXT_61);
    return stringBuffer.toString();
  }
}
