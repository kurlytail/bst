package com.brainspeedtech.gen.html;

import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.*;
import com.brainspeedtech.swarm.project.util.*;
import com.brainspeedtech.struct.util.*;
import org.eclipse.emf.ecore.resource.*;
import com.brainspeedtech.struct.*;
import com.brainspeedtech.reg.*;
import com.brainspeedtech.swarm.master.*;
import com.brainspeedtech.swarm.master.util.*;
import com.brainspeedtech.swarm.inst.*;
import com.brainspeedtech.swarm.flow.*;;

public class TexStructFile
{
  protected static String nl;
  public static synchronized TexStructFile create(String lineSeparator)
  {
    nl = lineSeparator;
    TexStructFile result = new TexStructFile();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\\subsection{";
  protected final String TEXT_3 = " ";
  protected final String TEXT_4 = "}" + NL + "\t\t\t";
  protected final String TEXT_5 = NL + "\\begin{tabularx}{\\linewidth}{l l l r}" + NL + "\\hline" + NL + "\\bf Field & \\bf Type & \\bf{Unit Size} & \\bf Count \\\\" + NL + "\\hline";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = " &";
  protected final String TEXT_8 = NL + "\t\t\t\t";
  protected final String TEXT_9 = NL + "\t\t\t\tbit &";
  protected final String TEXT_10 = NL + "\t\t\t";
  protected final String TEXT_11 = " Bytes &";
  protected final String TEXT_12 = " Bit &";
  protected final String TEXT_13 = " \\\\";
  protected final String TEXT_14 = NL + "\t\t\\multicolumn{4}{X}{";
  protected final String TEXT_15 = "}\\\\";
  protected final String TEXT_16 = NL + "\\end{tabularx}";
  protected final String TEXT_17 = NL + "\\begin{tabularx}{\\linewidth}{l r}" + NL + "\\hline" + NL + "\\bf Field & \\bf Type \\\\" + NL + "\\hline" + NL;
  protected final String TEXT_18 = " & ";
  protected final String TEXT_19 = NL + "\\multicolumn{2}{X}{";
  protected final String TEXT_20 = NL + "\\end{tabularx}" + NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Document doc = (Document) argument;
  String fileName = doc.eResource().getURI().lastSegment().replaceAll(".struct", "");

    stringBuffer.append(TEXT_1);
    
Collection<Atom> atoms = EcoreUtil.getObjectsByType(doc.eContents(),
		StructPackage.eINSTANCE.getAtom());
for(Atom atom: atoms) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(atom.eClass().getName().replace("_", "\\_"));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(atom.getName().replace("_", "\\_"));
    stringBuffer.append(TEXT_4);
     if (atom.getBlurb() != null) {
    stringBuffer.append(atom.getBlurb().replace("_","\\_"));
    }
    	if(atom instanceof Struct) {
		Struct struct = (Struct)atom;
		
    stringBuffer.append(TEXT_5);
    
	for(Field field : struct.getField()) {

    stringBuffer.append(TEXT_6);
    stringBuffer.append(field.getName().replace("_", "\\_"));
    stringBuffer.append(TEXT_7);
    
			if(field.getAtom() != null) {

    stringBuffer.append(TEXT_8);
    stringBuffer.append(field.getAtom().getName().replace("_", "\\_"));
    stringBuffer.append(TEXT_7);
    
			} else {

    stringBuffer.append(TEXT_9);
    
			}

    
			long unitSize = StructUtil.getAtomSize(field.getAtom());
			if ((unitSize % 8) == 0) {

    stringBuffer.append(TEXT_10);
    stringBuffer.append((unitSize/8));
    stringBuffer.append(TEXT_11);
    
			} else {

    stringBuffer.append(TEXT_10);
    stringBuffer.append(unitSize);
    stringBuffer.append(TEXT_12);
    
			}

    stringBuffer.append(TEXT_10);
    stringBuffer.append(StructUtil.getFieldCount(field));
    stringBuffer.append(TEXT_13);
    if(field.getBlurb() != null && field.getBlurb().length() != 0) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(field.getBlurb().replace("_","\\_"));
    stringBuffer.append(TEXT_15);
    }
    		} 
    stringBuffer.append(TEXT_16);
    
	}

    	if(atom instanceof com.brainspeedtech.struct.Enum) {
		com.brainspeedtech.struct.Enum enumeration = (com.brainspeedtech.struct.Enum)atom;
		
    stringBuffer.append(TEXT_17);
    
	for(EnumTerm term : enumeration.getTerm()) {

    stringBuffer.append(TEXT_6);
    stringBuffer.append(term.getName().replace("_", "\\_"));
    stringBuffer.append(TEXT_18);
    
	if (term.getValue() != null) {

    stringBuffer.append(TEXT_6);
    stringBuffer.append(term.getValue().replace("_", "\\_"));
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_13);
    if(term.getBlurb() != null && term.getBlurb().length() != 0) { 
    stringBuffer.append(TEXT_19);
    stringBuffer.append(term.getBlurb().replace("_", "\\_"));
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_6);
    		} 
    stringBuffer.append(TEXT_20);
    
	}
}
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
