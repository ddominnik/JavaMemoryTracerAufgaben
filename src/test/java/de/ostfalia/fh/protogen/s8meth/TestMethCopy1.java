package test.java.de.ostfalia.fh.protogen.s8meth;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMethCopy1 extends TestBase2 {

	String[][] stack = { 
			{"5","y=2x0"},
			{"6","y=2x0","this=1x2","y=2x0"},
			{"15","y=2x0","this=1x2","y=2x0"},
			{"6","y=2x0","x1=1x2"},
			{"7","y=2x0","x1=1x2","ret=?","this=1x2"},
			{"19","y=2x0","x1=1x2","ret=?","this=1x2","this=1x3","y=2x0"},
			{"15","y=2x0","x1=1x2","ret=?","this=1x2","this=1x3","y=2x0"},
			{"19","y=2x0","x1=1x2","ret=?","this=1x2","x1=1x3"},
			{"20","y=2x0","x1=1x2","ret=1x3","this=1x2","x1=1x3"},
			{"7","y=2x0","x1=1x2","x11=1x3"}
	};

	String[][] heap = { 
			{"5","f=1","s=2","?","?","?","?","?","?","?"},
			{"6","f=1","s=2","y=null","?","?","?","?","?","?"},
			{"15","f=1","s=2","y=2x0","?","?","?","?","?","?"},
			{"6","f=1","s=2","y=2x0","?","?","?","?","?","?"},
			{"7","f=1","s=2","y=2x0","?","?","?","?","?","?"},
			{"19","f=1","s=2","y=2x0","?","?","?","?","?","?"},
			{"15","f=1","s=2","y=2x0","y=2x0","?","?","?","?","?"},
			{"19","f=1","s=2","y=2x0","y=2x0","?","?","?","?","?"},
			{"20","f=1","s=2","y=2x0","y=2x0","?","?","?","?","?"},
			{"7","f=1","s=2","y=2x0","y=2x0","?","?","?","?","?"}
	};

	@Test
	public void test() {
		runTest("s8meth/", "MethCopy1", stack, heap);
	}
}
