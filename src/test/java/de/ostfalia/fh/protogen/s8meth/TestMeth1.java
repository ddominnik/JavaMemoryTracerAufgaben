package test.java.de.ostfalia.fh.protogen.s8meth;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMeth1 extends TestBase2{   
	
	String stack [][] = {
			{"5", "this=2x0", "x=1", "y=1"},
			{"16", "this=2x0", "x=1", "y=1"},
			{"17", "this=2x0", "x=1", "y=1"},
			{"5", "a=2x0"},
			{"6", "a=2x0"},
			{"7", "a=2x0"},
			{"8", "a=2x0", "ret=?", "this=2x0"},
			{"21", "a=2x0", "ret=?", "this=2x0", "z=42"},
			{"22", "a=2x0", "ret=42", "this=2x0", "z=42"},
			{"8", "a=2x0", "sum=42"}
	};
	
	String[][] heap = {
			{"5", "x=0", "y=0"},
			{"16", "x=1", "y=0"},
			{"17", "x=1", "y=1"},
			{"5", "x=1", "y=1"},
			{"6", "x=23", "y=1"},
			{"7", "x=23", "y=19"},
			{"8", "x=23", "y=19"},
			{"21", "x=23", "y=19"},
			{"22", "x=23", "y=19"},
			{"8", "x=23", "y=19"},
	};
	
	@Test 
	public void test() {
		runTest("s8meth/", "Meth1", stack, heap);
	}
}
