package test.java.de.ostfalia.fh.protogen.s8meth;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMeth1 extends TestBase2{   
	
	String stack [][] = {
			{"5", "a=2x0"},
			{"6", "a=2x0"},
			{"7", "a=2x0"},
			{"8", "a=2x0", "sum=?", "this=2x0"},
			{"16", "a=2x0", "sum=?", "this=2x0", "z=42"},
			{"17", "a=2x0", "sum=42", "this=2x0", "z=42"},
			{"8", "a=2x0", "sum=42"}
	};
	
	String[][] heap = {
			{"5", "x=0", "y=0"},
			{"6", "x=23", "y=0"},
			{"7", "x=23", "y=19"},
			{"8", "x=23", "y=19"},
			{"16", "x=23", "y=19"},
			{"17", "x=23", "y=19"},
			{"8", "x=23", "y=19"},
	};
	
	@Test 
	public void test() {
		runTest("s8meth/", "Meth1", stack, heap);
	}
}
