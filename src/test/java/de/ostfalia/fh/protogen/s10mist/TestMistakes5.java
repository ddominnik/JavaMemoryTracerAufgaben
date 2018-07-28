package test.java.de.ostfalia.fh.protogen.s10mist;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestMistakes5 extends TestBase2{
	String[][] stack = {
		{"5","x=12","y=6"},
		{"6","x=12","y=6","result=0"},
		{"7","x=12","y=6","result=0","operand=*"},
		{"8","x=12","y=6","result=0","operand=*"},
		{"11","x=12","y=6","result=72","operand=*"},
		{"12","x=12","y=6","result=2","operand=*"},
		{"13","x=12","y=6","result=18","operand=*"}
	};
	
	@Test
	public void test() {
		runTest("s10mist/", "Mistakes5", stack, null);
	}

}
