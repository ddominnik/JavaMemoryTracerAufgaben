package test.java.de.ostfalia.fh.protogen.s8meth;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMethFunc extends TestBase2 {

	String[][] stack = {
			{"10","this=1x0"},
			{"7","this=1x0"},
			{"10","m=1x0"},
			{"11","m=1x0","ret=?","this=1x0"},
			{"16","m=1x0","ret=?","this=1x0","i=0"},
			{"17","m=1x0","ret=?","this=1x0","i=0"},
			{"21","m=1x0","ret=0","this=1x0","i=0"},
			{"11","m=1x0"},
			{"12","m=1x0","ret=?"},
			{"25","m=1x0","ret=?","i=1"},
			{"26","m=1x0","ret=?","i=1"},
			{"27","m=1x0","ret=?","i=1"},
			{"28","m=1x0","ret=?","i=3"},
			{"30","m=1x0","ret=3","i=3"},
			{"12","m=1x0"}};
	String[][] heap = {
			{"10","a=0"},
			{"7","a=42"},
			{"10","a=42"},
			{"11","a=42"},
			{"16","a=42"},
			{"17","a=42"},
			{"21","a=42"},
			{"11","a=42"},
			{"12","a=42"},
			{"25","a=42"},
			{"26","a=42"},
			{"27","a=42"},
			{"28","a=42"},
			{"30","a=42"},
			{"12","a=42"}
	};
	
	String[][] stat = {
			{"10","b=42"}, {"7","b=42"},
			{"10","b=42"},
			{"11","b=42"},
			{"16","b=42"},
			{"17","b=42"},
			{"21","b=42"},
			{"11","b=42"},
			{"12","b=42"},
			{"25","b=42"},
			{"26","b=42"},
			{"27","b=3"},
			{"28","b=3"},
			{"30","b=3"},
			{"12","b=3"}
	};
	
	@Test
	public void test() {
		runTest("s8meth/", "MethFunc", stack, heap, stat);
	}
}
