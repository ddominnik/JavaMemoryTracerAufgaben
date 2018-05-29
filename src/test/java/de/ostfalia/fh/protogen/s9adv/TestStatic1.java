package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic1 extends TestBase2 {
	String[][] stack = {
		{"7","a=1"},
		{"8","a=1","b=42"},
		{"9","a=1","b=42"},
		{"10","a=3","b=42"},
		{"11","a=3","b=41"},
		{"12","a=3","b=41"},
		{"9","a=3","b=41"},
		{"10","a=4","b=41"},
		{"11","a=4","b=40"},
		{"12","a=4","b=40"}
	};
	
	String[][] stat = {
		{"7","x=0"},
		{"8","x=0"},
		{"9","x=0"},
		{"10","x=0"},
		{"11","x=0"},
		{"12","x=3"},
		{"9","x=3"},
		{"10","x=3"},
		{"11","x=3"},
		{"12","x=7"}
	};
	
	@Test
	public void test() {
		runTest("s9adv/", "Static1", stack, null, stat);
	}
}
