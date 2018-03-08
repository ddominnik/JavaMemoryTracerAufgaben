package de.ostfalia.fh.protogen;

import org.junit.Assert;

//import de.ostfalia.fh.protogen.build.ConversionTest;
import de.ostfalia.fh.protogen.build.ProtocolGenerator;
import de.ostfalia.fh.protogen.grade.ProtocolGrader;


public class TestBase2 {

	public void runTest(String subfolder, String classname, String[][] stacks, String[][] heaps) {
		ProtocolGenerator.setFolders("./src/test/java/de/ostfalia/fh/protogen/" + subfolder, "./out/");

//		ConversionTest.convertStringToJsonTest(stacks, heaps);
//		ConversionTest.convertVarStringToVarTableTest(stacks, heaps);
		
		final IVarTable trace = ProtocolGenerator.compileAndRun(classname);
		System.out.println("auto-generated memory trace:\n" + (trace));
		
		IVarTable truth = ProtocolGenerator.convert(stacks, heaps);
		System.out.println("reference memory trace:\n" + (truth));

		//runTest(trace, stacks, heaps);
		Assert.assertTrue(ProtocolGrader.grade(trace, truth).size()==0);
		
		// if comparison was successful: remove variable names from stack and switch roles
		for (int r=0;r<stacks.length;++r) 
			for (int c=1;c<stacks[r].length;++c) // skip line number
				stacks[r][c]=stacks[r][c].split("=")[1]; 
		IVarTable nonames = ProtocolGenerator.convert(stacks, heaps);
		//System.out.println(Conversion.convertToJSON(stacks, heaps));
		Assert.assertTrue(ProtocolGrader.grade(nonames,trace).size()==0);
	}
  
}

