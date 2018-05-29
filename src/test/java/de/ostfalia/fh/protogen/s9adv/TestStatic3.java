package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic3 extends TestBase2 {

	String[][] stack = { 
			{ "16", "this=0x0", "i=0" }, 
			{ "7", "this=0x0", "i=0" }, 
			{ "16", "a=0x0" },
			{ "17", "a=0x0", "ret=?", "this=0x0", "i=2" }, 
			{ "11", "a=0x0", "ret=?", "this=0x0", "i=2" },
			{ "12", "a=0x0", "ret=2", "this=0x0", "i=2" }, 
			{ "17", "a=0x0", "x=2" },
			{ "18", "a=0x0", "x=2", "aclone=0x0" }, 
			{ "19", "a=0x0", "x=2", "aclone=0x0", "ret=?", "this=0x0", "i=2" },
			{ "11", "a=0x0", "x=2", "aclone=0x0", "ret=?", "this=0x0", "i=2" },
			{ "12", "a=0x0", "x=2", "aclone=0x0", "ret=4", "this=0x0", "i=2" },
			{ "19", "a=0x0", "x=2", "aclone=0x0", "y=4" },
			{ "20", "a=0x0", "x=2", "aclone=0x0", "y=4", "this=0x1", "i=1" },
			{ "7", "a=0x0", "x=2", "aclone=0x0", "y=4", "this=0x1", "i=1" },
			{ "20", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1" },
			{ "21", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1", "ret=?", "this=0x1", "i=5" },
			{ "11", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1", "ret=?", "this=0x1", "i=5" },
			{ "12", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1", "ret=6", "this=0x1", "i=5" },
			{ "21", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1", "z=6" },
			{ "22", "a=0x0", "x=2", "aclone=0x0", "y=4", "a2=0x1", "z=6" } };

	String[][] stat = { 
			{ "16", "stat=0" }, { "7", "stat=0" }, { "16", "stat=0" }, { "17", "stat=0" },
			{ "11", "stat=2" }, { "12", "stat=2" }, { "17", "stat=2" }, { "18", "stat=2" }, { "19", "stat=2" },
			{ "11", "stat=4" }, { "12", "stat=4" }, { "19", "stat=4" }, { "20", "stat=4" }, { "7", "stat=1" },
			{ "20", "stat=1" }, { "21", "stat=1" }, { "11", "stat=6" }, { "12", "stat=6" }, { "21", "stat=6" },
			{ "22", "stat=6" } };

	@Test
	public void test() {
		runTest("s9adv/", "Static3", stack, null, stat);
	}
}
