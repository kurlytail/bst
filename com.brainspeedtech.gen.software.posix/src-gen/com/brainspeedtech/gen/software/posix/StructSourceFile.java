package com.brainspeedtech.gen.software.posix;

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
import com.brainspeedtech.struct.util.*;
import java.util.*;;

public class StructSourceFile
{
  protected static String nl;
  public static synchronized StructSourceFile create(String lineSeparator)
  {
    nl = lineSeparator;
    StructSourceFile result = new StructSourceFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "#define __STDC_FORMAT_MACROS" + NL + "" + NL + "#include <inttypes.h>" + NL + "#include <stdint.h>" + NL + "#include <stdio.h>" + NL + "#include <string.h>" + NL + "" + NL + "extern void swarm_print(int level, const char* format, ...);" + NL;
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + "#include \"gen_";
  protected final String TEXT_4 = "\"";
  protected final String TEXT_5 = NL + "#include \"gen_";
  protected final String TEXT_6 = ".h\"" + NL;
  protected final String TEXT_7 = NL + "void swarm_print_struct_";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = "_t *value, int level)" + NL + "{";
  protected final String TEXT_10 = NL + "\t\tswarm_print(-1, \"0x%\" SCNx32 \" \", *value);";
  protected final String TEXT_11 = NL + "\t\tswarm_print(-1, \"0x%\" SCNx64 \" \", *value);";
  protected final String TEXT_12 = NL + "\tif (level == 0) swarm_print(-1, \"\\n\");" + NL + "}";
  protected final String TEXT_13 = NL + "void swarm_print_struct_";
  protected final String TEXT_14 = "(";
  protected final String TEXT_15 = "_t *value, int level)" + NL + "{" + NL + "\tint i;" + NL + "\tint current_level = level;" + NL + "\t++level;" + NL + "\tswarm_print(-1, \"{ \");";
  protected final String TEXT_16 = NL + "\tswarm_print(-1, \"";
  protected final String TEXT_17 = " = 0x%\" SCNx32 \" \", value->";
  protected final String TEXT_18 = ");";
  protected final String TEXT_19 = NL + "\tswarm_print(-1, \"";
  protected final String TEXT_20 = " = 0x%\" SCNx32 \" \", value->";
  protected final String TEXT_21 = ");";
  protected final String TEXT_22 = NL + "\tfor(i = 0; i < ";
  protected final String TEXT_23 = "; ++i) {" + NL + "\t\tswarm_print(-1, \"";
  protected final String TEXT_24 = "[%d] = 0x%\" SCNx32 \" \", i, value->";
  protected final String TEXT_25 = "[i]);" + NL + "\t}";
  protected final String TEXT_26 = NL + "\tfor(i = 0; i < ";
  protected final String TEXT_27 = "; ++i) {" + NL + "\t\tswarm_print(-1, \"";
  protected final String TEXT_28 = "[%d] = \", i);" + NL + "\t\tswarm_print_struct_";
  protected final String TEXT_29 = "(&value->";
  protected final String TEXT_30 = "[i], level);" + NL + "\t}";
  protected final String TEXT_31 = NL + "\tswarm_print(-1, \"";
  protected final String TEXT_32 = " = \");" + NL + "\tswarm_print_struct_";
  protected final String TEXT_33 = "(&value->";
  protected final String TEXT_34 = ", level);";
  protected final String TEXT_35 = NL + "\tswarm_print(-1, \"";
  protected final String TEXT_36 = " = \");" + NL + "\tswarm_print_struct_";
  protected final String TEXT_37 = "(&value->";
  protected final String TEXT_38 = ", level);";
  protected final String TEXT_39 = NL + "\tfor(i = 0; i < ";
  protected final String TEXT_40 = "; ++i) {" + NL + "\t\tswarm_print(-1, \"";
  protected final String TEXT_41 = "[%d] = \", i);" + NL + "\t\tswarm_print_struct_";
  protected final String TEXT_42 = "(&value->";
  protected final String TEXT_43 = "[i], level);" + NL + "\t}";
  protected final String TEXT_44 = NL + "\tswarm_print(-1, \"} \");" + NL + "\tif(current_level == 0) swarm_print(-1, \"\\n\");" + NL + "}";
  protected final String TEXT_45 = NL;
  protected final String TEXT_46 = NL;
  protected final String TEXT_47 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Resource resource = (Resource) argument;
	String fileName = resource.getURI().lastSegment()
						.replaceAll("\\.struct$", "");

    stringBuffer.append(TEXT_1);
    
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

    stringBuffer.append(TEXT_2);
    for (String includeFile : includeFiles.keySet()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append((new File(includeFile)).getName().replaceAll("\\.struct$", ".h"));
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    stringBuffer.append(fileName);
    stringBuffer.append(TEXT_6);
    for(Atom atom: atoms) {
	if(ProjectUtil.getReferringInstance(atom, NativeType.class) != null) {
		if(atom instanceof Struct) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_9);
    	if(StructUtil.getAtomSize(atom) <= 32) { 
    stringBuffer.append(TEXT_10);
    	} else {  
    stringBuffer.append(TEXT_11);
    	} 
    stringBuffer.append(TEXT_12);
    		}
		continue;
	}
		
	if(atom instanceof Struct) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(atom.getName());
    stringBuffer.append(TEXT_15);
    		for (Field f : ((Struct) atom).getField()) {
			if (f.getAtom() == null || ProjectUtil.getReferringInstance(atom, NativeType.class) != null) {
				if (StructUtil.getFieldCount(f) <= 32) {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_18);
    				}
			} else if (f.getAtom() instanceof com.brainspeedtech.struct.Enum) {
				if (StructUtil.getFieldCount(f) <= 1) {
					if (f.getAtom().getCount() <= 32) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_21);
    
					} else {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_25);
    					}
				} else {
					if (StructUtil.getFieldCount(f) > 1) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_30);
    					} else {

    stringBuffer.append(TEXT_31);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_34);
    					}

    				}
			} else {
				if (StructUtil.getFieldCount(f) <= 1) { 
    stringBuffer.append(TEXT_35);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_38);
    
				} else {

    stringBuffer.append(TEXT_39);
    stringBuffer.append(StructUtil.getFieldCount(f));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(f.getAtom().getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(f.getName());
    stringBuffer.append(TEXT_43);
    				}
			}
		} 
    stringBuffer.append(TEXT_44);
    	}

    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_46);
    stringBuffer.append(TEXT_47);
    return stringBuffer.toString();
  }
}
