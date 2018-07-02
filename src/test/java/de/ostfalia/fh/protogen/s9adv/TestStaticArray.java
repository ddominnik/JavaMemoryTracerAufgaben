package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStaticArray extends TestBase2 {

	String[][] stack = {
		{"7"},
		{"8","t=false"},
		{"9","t=false","b=4x3"},
		{"10","t=false","b=4x3","i=0"},
		{"11","t=false","b=4x3","i=0"},
		{"10","t=false","b=4x3","i=1"},
		{"11","t=false","b=4x3","i=1"},
		{"10","t=false","b=4x3","i=2"},
		{"11","t=false","b=4x3","i=2"},
		{"12","t=false","b=4x3","i=2"},
		{"13","t=false","b=4x3","i=2"},
		{"14","t=false","b=4x3","i=2"},
		{"10","t=false","b=4x3","i=3"},
		{"17","t=false","b=4x3"},
		{"18","t=true","b=4x3"}
	},
			
	heap = {
		{"7","length=2","[0]=0","[1]=0"},
		{"8","length=2","[0]=0","[1]=0"},
		{"9","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"10","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"11","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"10","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"11","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"10","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"11","length=2","[0]=0","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"12","length=2","[0]=3","[1]=0","length=3","[0]=8","[1]=2","[2]=1"},
		{"13","length=2","[0]=3","[1]=0","length=3","[0]=8","[1]=2","[2]=0"},
		{"14","length=2","[0]=4","[1]=0","length=3","[0]=8","[1]=2","[2]=0"},
		{"10","length=2","[0]=4","[1]=0","length=3","[0]=8","[1]=2","[2]=0"},
		{"17","length=2","[0]=4","[1]=0","length=3","[0]=8","[1]=2","[2]=0"},
		{"18","length=2","[0]=4","[1]=0","length=3","[0]=8","[1]=2","[2]=0"}
	}, 
	
	stat = {
		{"7","a=3x0"},
		{"8","a=3x0"},
		{"9","a=3x0"},
		{"10","a=3x0"},
		{"11","a=3x0"},
		{"10","a=3x0"},
		{"11","a=3x0"},
		{"10","a=3x0"},
		{"11","a=3x0"},
		{"12","a=3x0"},
		{"13","a=3x0"},
		{"14","a=3x0"},
		{"10","a=3x0"},
		{"17","a=3x0"},
		{"18","a=3x0"}
	};
	
	@Test
	public void test () {
		runTest("s9adv/", "StaticArray", stack, heap, stat);
	}
}
