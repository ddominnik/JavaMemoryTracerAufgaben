package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static1 {
	public static void main(String[] args) {
		Static1A a = new Static1A(0);
		int x = a.inc(2);
		Static1A aclone = a;
		int y = a.inc(2);
		Static1A a2 = new Static1A(1);
		int z = a2.inc(5);
		if (a.stat != a2.stat) {
			a.inc(1);
			a2.inc(1);
		}
	}
}

class Static1A {
	static int stat = 0;
	
	public Static1A(int i) {
		super(); stat = i;
	}
	
	int inc (int i) {
		stat += i;
		return stat;
	}
}

