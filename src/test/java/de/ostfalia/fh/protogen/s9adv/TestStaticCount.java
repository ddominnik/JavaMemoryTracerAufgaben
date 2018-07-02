package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStaticCount extends TestBase2 {
	String[][] stack = {
		{"13","this=1x0","i=5"},
		{"8","this=1x0","i=5"},
		{"9","this=1x0","i=5"},
		{"13","o1=1x0"},
		{"14","o1=1x0","o2=1x0"},
		{"15","o1=1x0","o2=1x0"},
		{"16","o1=1x0","o2=1x0","this=1x1","i=7"},
		{"8","o1=1x0","o2=1x0","this=1x1","i=7"},
		{"9","o1=1x0","o2=1x0","this=1x1","i=7"},
		{"16","o1=1x0","o2=1x0","o3=1x1"},
		{"17","o1=1x0","o2=1x0","o3=1x1","this=1x2","i=4"},
		{"8","o1=1x0","o2=1x0","o3=1x1","this=1x2","i=4"},
		{"9","o1=1x0","o2=1x0","o3=1x1","this=1x2","i=4"},
		{"17","o1=1x0","o2=1x0","o3=1x1","o4=1x2"},
		{"18","o1=1x0","o2=1x0","o3=1x1","o4=1x2"},
		{"19","o1=1x0","o2=1x0","o3=1x1","o4=1x2"}
	},
			
	heap = {
		{"13","i=0"},
		{"8","i=5"},
		{"9","i=5"},
		{"13","i=5"},
		{"14","i=5"},
		{"15","i=9"},
		{"16","i=9","i=0"},
		{"8","i=9","i=7"},
		{"9","i=9","i=7"},
		{"16","i=9","i=7"},
		{"17","i=9","i=7","i=0"},
		{"8","i=9","i=7","i=4"},
		{"9","i=9","i=7","i=4"},
		{"17","i=9","i=7","i=4"},
		{"18","i=9","i=-5","i=4"},
		{"19","i=3","i=-5","i=4"}
	},
	
	stat = {
		{"13","c=0"},
		{"8","c=0"},
		{"9","c=1"},
		{"13","c=1"},
		{"14","c=1"},
		{"15","c=1"},
		{"16","c=1"},
		{"8","c=1"},
		{"9","c=2"},
		{"16","c=2"},
		{"17","c=2"},
		{"8","c=2"},
		{"9","c=3"},
		{"17","c=3"},
		{"18","c=3"},
		{"19","c=3"}
	};
	
	@Test
	public void runTest() {
		runTest("s9adv/", "StaticCount", stack, heap, stat);
	}
}
