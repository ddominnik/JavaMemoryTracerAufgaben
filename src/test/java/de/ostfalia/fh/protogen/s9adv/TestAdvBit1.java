package test.java.de.ostfalia.fh.protogen.s9adv;

import de.ostfalia.fh.protogen.TestBase2;
import org.junit.Test;

public class TestAdvBit1 extends TestBase2 {
	String[][] stack = {
			{"5","a=53"},
			{"6","a=53","komp_a=-54"},
			{"7","a=53","komp_a=-54","b=0"},
			{"8","a=53","komp_a=-54","b=0","c=-1"},
			{"9","a=53","komp_a=-54","b=53","c=-1"},
			{"10","a=102","komp_a=-54","b=53","c=-1"},
			{"11","a=102","komp_a=-54","b=53","c=119"},
			{"12","a=102","komp_a=-54","b=53","c=83"}
	};
	
	String[][] heap = {
			{"5"},{"6"},{"7"},{"8"},{"9"},{"10"},{"11"},{"12"}
	};

	@Test
	public void test() {
		runTest("s9adv/", "AdvBit1", stack, heap);
	}
}
