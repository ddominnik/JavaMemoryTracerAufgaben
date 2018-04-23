package test.java.de.ostfalia.fh.protogen.s8meth;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMethAttr extends TestBase2 {
	String[][] stack = {
			{"5", "this=3x0"},
			{"14", "this=3x0"},
			{"15", "this=3x0"},
			{"5", "a=3x0"},
			{"6", "a=3x0", "this=3x0", "a=30", "b=3", "c=98"},
			{"19", "a=3x0", "this=3x0", "a=9", "b=3", "c=98"},
			{"20", "a=3x0", "this=3x0", "a=9", "b=3", "c=98"},
			{"21", "a=3x0", "this=3x0", "a=9", "b=1", "c=98"},
			{"22", "a=3x0", "this=3x0", "a=9", "b=1", "c=10"},
			{"23", "a=3x0", "this=3x0", "a=9", "b=1", "c=10"},
			{"24", "a=3x0", "this=3x0", "a=9", "b=1", "c=10"},
			{"25", "a=3x0", "this=3x0", "a=9", "b=3", "c=10"},
			{"26", "a=3x0", "this=3x0", "a=9", "b=3", "c=10"},
			{"6", "a=3x0"},
	};
	
	String[][] heap = {
			{"5", "a=0", "b=0", "c=0"},
			{"14", "a=0", "b=0", "c=0"},
			{"15", "a=1", "b=1", "c=1"},
			{"5", "a=1", "b=1", "c=1"},
			{"6", "a=1", "b=1", "c=1"},
			{"19", "a=1", "b=1", "c=1"},
			{"20", "a=1", "b=9", "c=1"},
			{"21", "a=1", "b=9", "c=1"},
			{"22", "a=1", "b=9", "c=1"},
			{"23", "a=1", "b=9", "c=54"},
			{"24", "a=1", "b=4", "c=54"},
			{"25", "a=1", "b=4", "c=54"},
			{"26", "a=1", "b=4", "c=4"},
			{"6", "a=1", "b=4", "c=4"},
	};
	
	@Test
	public void test() {
		runTest("s8meth/", "MethAttr", stack, heap);
	}
}
