package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static3 {
	static int stat = 0;
	
	public Static3(int i) {
		super(); stat = i;
	}
	
	int inc (int i) {
		stat += i;
		return stat;
	}
	
	public static void main(String[] args) {
		Static3 a = new Static3(0);
		int x = a.inc(2);
		Static3 aclone = a;
		int y = a.inc(2);
		Static3 a2 = new Static3(1);
		int z = a2.inc(5);
		if (a.stat != a2.stat) {
			a.inc(1);
			a2.inc(1);
		}
	}
}