package test.java.de.ostfalia.fh.protogen.s10mist;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestMistakes2 extends TestBase2{
	String[][] stack = {
		{"6","x=5"},
		{"7","x=5","y=3"},
		{"8","x=5","y=3","ret=?","x=5","y=3"},
		{"16","x=5","y=3","ret=?","x=5","y=3","bruch=1.0"},
		{"17","x=5","y=3","ret=1.0","x=5","y=3","bruch=1.0"},
		{"8","x=5","y=3","b=1.0"},
		{"9","x=5","y=3","b=1.0"}
	};
	
	@Test
	public void test () {
		runTest ("s10mist/", "Mistakes2", stack, null, null);
	}
}
