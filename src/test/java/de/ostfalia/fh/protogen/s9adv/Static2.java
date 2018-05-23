package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static2 {
	static int stat = 0;
	
	public Static2(int i) {
		super(); stat = i;
	}
	
	int inc (int i) {
		stat += i;
		return stat;
	}
	
	public static void main(String[] args) {
		Static2 a = new Static2(0);
		int x = a.inc(2);
		Static2 aclone = a;
		int y = a.inc(2);
		Static2 a2 = new Static2(1);
		int z = a2.inc(5);
		if (a.stat != a2.stat) {
			a.inc(1);
			a2.inc(1);
		}
	}
}