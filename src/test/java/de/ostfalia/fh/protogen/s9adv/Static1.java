package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static1 {
static int stat = 0;
	
	public Static1(int i) {
		super(); stat = i;
	}
	
	int inc (int i) {
		stat = stat + i;
		return stat;
	}
	
	public static void main(String[] args) {
		Static1 a = new Static1(0);
		int x = a.inc(2);
		Static1 aclone = a;
		int y = a.inc(2);
		Static1 a2 = new Static1(1);
		int z = a2.inc(5);
		if (a.stat != a2.stat) {
			a.inc(1);
			a2.inc(1);
		}
	}
}

