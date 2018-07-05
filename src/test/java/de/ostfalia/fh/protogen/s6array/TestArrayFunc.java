package test.java.de.ostfalia.fh.protogen.s6array;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestArrayFunc extends TestBase2 {

	String [][] stack = {
		{"5","a=4x0"},
		{"6","a=4x0","arr=4x0","i=3"},
		{"12","a=4x0","arr=4x0","i=3"},
		{"13","a=4x0","arr=4x0","i=3"},
		{"14","a=4x0","arr=4x0","i=3"},
		{"6","a=4x0"},
		{"7","a=4x0","arr=4x0","i=2"},
		{"12","a=4x0","arr=4x0","i=2"},
		{"13","a=4x0","arr=4x0","i=2"},
		{"14","a=4x0","arr=4x0","i=2"},
		{"7","a=4x0"}
	},
	
	heap = {
		{"5","length=3","[0]=5","[1]=3","[2]=4"},
		{"6","length=3","[0]=5","[1]=3","[2]=4"},
		{"12","length=3","[0]=6","[1]=3","[2]=4"},
		{"13","length=3","[0]=6","[1]=0","[2]=4"},
		{"14","length=3","[0]=6","[1]=0","[2]=8"},
		{"6","length=3","[0]=6","[1]=0","[2]=8"},
		{"7","length=3","[0]=6","[1]=0","[2]=8"},
		{"12","length=3","[0]=5","[1]=0","[2]=8"},
		{"13","length=3","[0]=5","[1]=1","[2]=8"},
		{"14","length=3","[0]=5","[1]=1","[2]=6"},
		{"7","length=3","[0]=5","[1]=1","[2]=6"}	
	};
	
	@Test
	public void test () {
		runTest("s6array/", "ArrayFunc", stack, heap, null);
	}
}
