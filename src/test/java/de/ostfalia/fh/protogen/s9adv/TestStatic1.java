package test.java.de.ostfalia.fh.protogen.s9adv;

import org.junit.Test;
import de.ostfalia.fh.protogen.TestBase2;

public class TestStatic1 extends TestBase2{

	String[][] stack = {
			{"5", "this=1x0","i=0"},
			{"22","this=1x0","i=0"},
			{"5","a=1x0"},
			{"6","a=1x0","ret=?","this=1x0","i=2"},
			{"26","a=1x0","ret=?","this=1x0","i=2"},
			{"27","a=1x0","ret=2","this=1x0","i=2"},
			{"6","a=1x0","x=2"},
			{"7","a=1x0","x=2","aclone=1x0"},
			{"8","a=1x0","x=2","aclone=1x0","ret=?","this=1x0","i=2"},
			{"26","a=1x0","x=2","aclone=1x0","ret=?","this=1x0","i=2"},
			{"27","a=1x0","x=2","aclone=1x0","ret=4","this=1x0","i=2"},
			{"8","a=1x0","x=2","aclone=1x0","y=4"},
			{"9","a=1x0","x=2","aclone=1x0","y=4","this=1x1","i=1"},
			{"22","a=1x0","x=2","aclone=1x0","y=4","this=1x1","i=1"},
			{"9","a=1x0","x=2","aclone=1x0","y=4","a2=1x1"},
			{"10","a=1x0","x=2","aclone=1x0","y=4","a2=1x1","ret=?","this=1x1","i=5"},
			{"26","a=1x0","x=2","aclone=1x0","y=4","a2=1x1","ret=?","this=1x1","i=5"},
			{"27","a=1x0","x=2","aclone=1x0","y=4","a2=1x1","ret=6","this=1x1","i=5"},
			{"10","a=1x0","x=2","aclone=1x0","y=4","a2=1x1","z=6"},
			{"11","a=1x0","x=2","aclone=1x0","y=4","a2=1x1","z=6"},
	};
	
	String[][] heap = {
			{"5"},{"22"},{"5"},{"6"},{"26"},{"27"},{"6"},{"7"},{"8"},{"26"},{"27"},{"8"},
			{"9"},{"22"},{"9"},{"10"},{"26"},{"27"},{"10"},{"11"}
	};
	
	String[][] stat = {
			{"5","stat=0"},
			{"22","stat=0"},
			{"5","stat=0"},
			{"6","stat=0"},
			{"26","stat=2"},
			{"27","stat=2"},
			{"6","stat=2"},
			{"7","stat=2"},
			{"8","stat=2"},
			{"26","stat=4"},
			{"27","stat=4"},
			{"8","stat=4"},
			{"9","stat=4"},
			{"22","stat=1"},
			{"9","stat=1"},
			{"10","stat=1"},
			{"26","stat=6"},
			{"27","stat=6"},
			{"10","stat=6"},
			{"11","stat=6"}
	};
	
	@Test
	public void test () {
		runTest("s9adv/", "Static1", stack, heap, stat);
	}
}
