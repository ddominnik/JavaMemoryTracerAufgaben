package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic3 extends TestBase2 {

	String[][] stack = { 
			{"11","this=0x0","i=0"},
			{"7","this=0x0","i=0"},
			{"11","a=0x0"},
			{"12","a=0x0","x=2"},
			{"13","a=0x0","x=2","aclone=0x0"},
			{"14","a=0x0","x=2","aclone=0x0","y=4"},
			{"15","a=0x0","x=2","aclone=0x0","y=4","this=0x0","i=1"},
			{"7","a=0x0","x=2","aclone=0x0","y=4","this=0x0","i=1"},
			{"15","a=0x0","x=2","aclone=0x0","y=4","a2=0x0"},
			{"16","a=0x0","x=2","aclone=0x0","y=4","a2=0x0","z=4"},
			{"17","a=0x0","x=2","aclone=0x0","y=4","a2=0x0","z=4"}
	};

	String[][] stat = { 
			{"11","stat=0"},
			{"7","stat=0"},
			{"11","stat=0"},
			{"12","stat=2"},
			{"13","stat=2"},
			{"14","stat=4"},
			{"15","stat=4"},
			{"7","stat=1"},
			{"15","stat=1"},
			{"16","stat=4"},
			{"17","stat=4"}
	};

	@Test
	public void test() {
		runTest("s9adv/", "Static3", stack, null, stat);
	}
}
