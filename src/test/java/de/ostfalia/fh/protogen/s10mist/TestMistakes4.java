package test.java.de.ostfalia.fh.protogen.s10mist;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMistakes4 extends TestBase2 {

	String [][] stack = {
		{"5","t=false"},
		{"6","t=false","x1=1x0"},
		{"7","t=false","x1=1x0","x2=1x4"},
		{"8","t=false","x1=1x0","x2=1x4","v1=12"},
		{"9","t=false","x1=1x0","x2=1x4","v1=12","v2=12"},
		{"10","t=false","x1=1x0","x2=1x4","v1=12","v2=12"},
		{"11","t=false","x1=1x0","x2=1x4","v1=12","v2=12"},
		{"14","t=false","x1=1x0","x2=1x4","v1=12","v2=12"}
	},
			
	heap = {
		{"5"},
		{"6","a=3x1","length=2","[0]=4","[1]=3"},
		{"7","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"},
		{"8","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"},
		{"9","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"},
		{"10","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"},
		{"11","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"},
		{"14","a=3x1","length=2","[0]=4","[1]=3","a=3x5","length=2","[0]=4","[1]=3"}
	};
	
	@Test
	public void test() {
		runTest("s10mist/", "Mistakes4", stack, heap);
	}
}
