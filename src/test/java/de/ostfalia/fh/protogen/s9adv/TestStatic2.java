package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic2 extends TestBase2 {
	String[][] stack = {
			{"7","x=3","y=5"},
			{"8","x=3","y=5","ret=?","a=3"},
			{"17","x=3","y=5","ret=?","a=3"},
			{"18","x=3","y=5","ret=?","a=12"},
			{"19","x=3","y=5","ret=12","a=12"},
			{"8","x=3","y=5","res1=12"},
			{"9","x=3","y=5","res1=12","ret=?","a=5"},
			{"17","x=3","y=5","res1=12","ret=?","a=5"},
			{"18","x=3","y=5","res1=12","ret=?","a=12"},
			{"19","x=3","y=5","res1=12","ret=12","a=12"},
			{"9","x=3","y=5","res1=12","res2=12"},
			{"10","x=3","y=5","res1=12","res2=12"},
			{"11","x=3","y=5","res1=12","res2=12","eq=true"}
	
	};
	
	String[][] stat = {
			{"7","i=0","j=10"},
			{"8","i=0","j=10"},
			{"17","i=1","j=9"},
			{"18","i=1","j=9"},
			{"19","i=1","j=9"},
			{"8","i=1","j=9"},
			{"9","i=1","j=9"},
			{"17","i=2","j=7"},
			{"18","i=2","j=7"},
			{"19","i=2","j=7"},
			{"9","i=2","j=7"},
			{"10","i=2","j=7"},
			{"11","i=2","j=7"}
	};
	
	@Test
	public void test ()  {
		runTest("s9adv/", "Static2", stack, null, stat);
	}
}
