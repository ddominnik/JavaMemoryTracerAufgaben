package test.java.de.ostfalia.fh.protogen.s10mist;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestMistakes1 extends TestBase2 {
	String[][] stack = {
			{"5","f=false"},
			{"6","f=false","g=false"},
			{"7","f=false","g=false","i=0"},
			{"8","f=true","g=false","i=0"},
			{"9","f=true","g=false","i=5"},
			{"10","f=true","g=true","i=5"},
			{"11","f=true","g=true","i=1"}
	};
	
	@Test
	public void test() {
		runTest("s10mist/", "Mistakes1", stack, null, null);
	}
}
