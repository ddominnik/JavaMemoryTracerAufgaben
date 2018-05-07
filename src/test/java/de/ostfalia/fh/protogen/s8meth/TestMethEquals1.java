package test.java.de.ostfalia.fh.protogen.s8meth;

import de.ostfalia.fh.protogen.TestBase2;
import org.junit.Test;

public class TestMethEquals1 extends TestBase2{
	String[][] stack = {
			{"5","equalsVar=false"},
			{"6","equalsVar=false","a0=2x0"},
			{"7","equalsVar=false","a0=2x0","a1=2x0"},
			{"8","equalsVar=true","a0=2x0","a1=2x0"},
			{"9","equalsVar=true","a0=2x0","a1=2x0"},
			{"10","equalsVar=true","a0=2x0","a1=2x0"},
			{"11","equalsVar=true","a0=2x0","a1=2x0","a2=2x2"},
			{"12","equalsVar=false","a0=2x0","a1=2x0","a2=2x2"},
			{"13","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4"},
			{"14","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4"},
			{"15","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6"},
			{"16","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6"},
			{"17","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6"},
			{"18","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6","b1=2x8"},
			{"19","equalsVar=true","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6","b1=2x8"},
			{"20","equalsVar=true","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6","b1=2x8"},
			{"21","equalsVar=false","a0=2x0","a1=2x0","a2=2x2","a3=2x4","b0=2x6","b1=2x8"}
	};
	
	String[][] heap = {
			{"5","?","?","?","?","?","?","?","?","?"},
			{"6","id=0","aktiv=true","?","?","?","?","?","?","?"},
			{"7","id=0","aktiv=true","?","?","?","?","?","?","?"},
			{"8","id=0","aktiv=true","?","?","?","?","?","?","?"},
			{"9","id=0","aktiv=false","?","?","?","?","?","?","?"},
			{"10","id=0","aktiv=false","?","?","?","?","?","?","?"},
			{"11","id=0","aktiv=false","id=1","aktiv=false","?","?","?","?","?"},
			{"12","id=0","aktiv=false","id=1","aktiv=false","?","?","?","?","?"},
			{"13","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","?","?","?"},
			{"14","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","?","?","?"},
			{"15","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","?"},
			{"16","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","?"},
			{"17","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","?"},
			{"18","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","id=0"},
			{"19","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","id=0"},
			{"20","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","id=0"},
			{"21","id=0","aktiv=false","id=1","aktiv=false","id=1","aktiv=false","id=0","aktiv=true","id=0"}
	};
	
	@Test
	public void test () {
		runTest("s8meth/", "MethEquals1", stack, heap);
	}
}
