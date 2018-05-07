package test.java.de.ostfalia.fh.protogen.s8meth;

import de.ostfalia.fh.protogen.TestBase2;
import org.junit.Test;

public class TestMethEquals2 extends TestBase2 {
	String[][] stack = { 
			{ "5", "equalsVar=false" }, 
			{ "6", "equalsVar=false", "b0=2x0" },
			{ "7", "equalsVar=false", "b0=2x0", "b1=2x0" }, 
			{ "8", "equalsVar=true", "b0=2x0", "b1=2x0" },
			{ "9", "equalsVar=true", "b0=2x0", "b1=2x0", "c0=2x2" },
			{ "10", "equalsVar=false", "b0=2x0", "b1=2x0", "c0=2x2" },
			{ "11", "equalsVar=false", "b0=2x0", "b1=2x0", "c0=2x2", "c1=2x4" },
			{ "12", "equalsVar=true", "b0=2x0", "b1=2x0", "c0=2x2", "c1=2x4" },
			{ "13", "equalsVar=true", "b0=2x0", "b1=2x0", "c0=2x2", "c1=2x4" },
			{ "14", "equalsVar=true", "b0=2x0", "b1=2x0", "c0=2x2", "c1=2x4" }, 
	};

	String[][] heap = { 
			{ "5", "?", "?", "?", "?", "?", "?", "?", "?", "?" },
			{ "6", "id=0", "aktiv=false", "?", "?", "?", "?", "?", "?", "?" },
			{ "7", "id=0", "aktiv=false", "?", "?", "?", "?", "?", "?", "?" },
			{ "8", "id=0", "aktiv=false", "?", "?", "?", "?", "?", "?", "?" },
			{ "9", "id=0", "aktiv=false", "id=0", "aktiv=false", "?", "?", "?", "?", "?" },
			{ "10", "id=0", "aktiv=false", "id=0", "aktiv=false", "?", "?", "?", "?", "?" },
			{ "11", "id=0", "aktiv=false", "id=0", "aktiv=false", "id=0", "aktiv=false", "?", "?", "?" },
			{ "12", "id=0", "aktiv=false", "id=0", "aktiv=false", "id=0", "aktiv=false", "?", "?", "?" },
			{ "13", "id=0", "aktiv=false", "id=0", "aktiv=false", "id=0", "aktiv=true", "?", "?", "?" },
			{ "14", "id=0", "aktiv=false", "id=0", "aktiv=false", "id=0", "aktiv=true", "?", "?", "?" }, 
	};

	@Test
	public void test() {
		runTest("s8meth/", "MethEquals2", stack, heap);
	}
}
