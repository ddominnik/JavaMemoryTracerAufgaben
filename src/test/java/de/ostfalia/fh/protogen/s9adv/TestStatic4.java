package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic4 extends TestBase2 {
	String[][] stack = {
			{"10","x=4"},
			{"11","x=4","this=1x0","i=4"},
			{"7","x=4","this=1x0","i=4"},
			{"11","x=4","first=1x0"},
			{"12","x=4","first=1x0"},
			{"13","x=4","first=1x0"},
			{"14","x=4","first=1x0","this=1x1","i=4"},
			{"7","x=4","first=1x0","this=1x1","i=4"},
			{"14","x=4","first=1x0","second=1x1"},
			{"15","x=4","first=1x0","second=1x1"},
			{"16","x=4","first=1x0","second=1x1"},
	};
	
	String[][] heap = {
			{"10"},
			{"11","y=0"},
			{"7","y=0"},
			{"11","y=0"},
			{"12","y=0"},
			{"13","y=4"},
			{"14","y=4","y=0"},
			{"7","y=4","y=0"},
			{"14","y=4","y=0"},
			{"15","y=4","y=0"},
			{"16","y=4","y=0"}
	};
	
	String[][] stat = {
			{"10","x=0"},
			{"11","x=0"},
			{"7","x=4"},
			{"11","x=4"},
			{"12","x=7"},
			{"13","x=7"},
			{"14","x=7"},
			{"7","x=4"},
			{"14","x=4"},
			{"15","x=8"},
			{"16","x=8"}
	};
	
	@Test
	public void test () {
		runTest("s9adv/", "Static4", stack, heap, stat);
	}
	
}
