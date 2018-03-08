package test.java.de.ostfalia.fh.protogen.s7data;

import org.junit.Test;

import de.ostfalia.fh.protogen.TestBase2;

public class TestData1 extends TestBase2 {
	String[][] stack = { 
			{ "5", "o=2x1" }, 
			{ "6", "o=2x1" }, 
			{ "7", "o=2x1", "p=2x4" }, 
			{ "8", "o=2x1", "p=2x4" },
			{ "9", "o=2x1", "p=2x4" }, 
			{ "10", "o=2x1", "p=2x1" } 
	};

	String[][] heap = { 
			{ "5", "?", "x=0",	"y=0", "?", "?",	"?" },
			{ "6", "?", "x=5",	"y=0", "?", "?",	"?" },
			{ "7", "?", "x=5",	"y=0", "?", "x=0",	"y=0" },
			{ "8", "?", "x=5",	"y=0", "?", "x=-5",	"y=0" },
			{ "9", "?", "x=5",	"y=0", "?", "x=-5", "y=5" },
			{ "10", "?", "x=5",	"y=0", "?", "x=-5", "y=5" }, 
	};
	
	@Test //(timeout=5000)
	public void test () {
		runTest("s7data/", "Data1", stack, heap);
	}
}
