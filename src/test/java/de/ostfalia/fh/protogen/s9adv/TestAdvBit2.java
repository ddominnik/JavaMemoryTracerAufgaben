package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestAdvBit2 extends TestBase2{
	String[][] stack = {
			{"5","a=false"},
			{"6","a=false","b=true"},
			{"7","a=false","b=true","i=0"},
			{"8","a=false","b=true","i=0"},
			{"9","a=false","b=false","i=2"},
			{"10","a=true","b=false","i=5"},
			{"11","a=true","b=false","i=5"}
	};
	
	@Test
	public void test () {
		runTest("s9adv/", "AdvBit2", stack, null, null);
	}
}
