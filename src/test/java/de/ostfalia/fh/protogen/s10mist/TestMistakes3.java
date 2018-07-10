package test.java.de.ostfalia.fh.protogen.s10mist;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestMistakes3 extends TestBase2 {
	String[][] stack = {
		{"11","a=12"},
		{"12","a=12","b=12"},
		{"13","a=12","b=12","this=0x0","a=12"},
		{"6","a=12","b=12","this=0x0","a=12"},
		{"7","a=12","b=12","this=0x0","a=12"},
		{"13","a=12","b=12","m=0x0"},
		{"14","a=12","b=12","m=0x0"},
		{"16","a=12"},
		{"17","a=12","this=0x0","a=12"},
		{"6","a=12","this=0x0","a=12"},
		{"7","a=12","this=0x0","a=12"},
		{"17","a=12","m1=0x0"},
		{"18","a=12","m1=0x0"},
		{"19","a=12","m1=0x0"}
	}, 
	
	stat = {
		{"11","a=0"},
		{"12","a=0"},
		{"13","a=0"},
		{"6","a=0"},
		{"7","a=12"},
		{"13","a=12"},
		{"14","a=12"},
		{"16","a=12"},
		{"17","a=12"},
		{"6","a=12"},
		{"7","a=12"},
		{"17","a=12"},
		{"18","a=12"},
		{"19","a=12"}
	};
	
	@Test
	public void test() {
		runTest("s10mist/", "Mistakes3", stack, null, stat);
	}
}
