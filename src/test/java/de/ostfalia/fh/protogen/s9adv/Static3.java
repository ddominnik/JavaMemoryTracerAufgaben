package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static3 {
	static int stat = 0;

	public Static3(int i) {
		super(); stat = i;
	}

	public static void main(String[] args) {
		Static3 a = new Static3(0);
		int x = Inc.f(a, 2);
		Static3 aclone = a;
		int y = Inc.f(a, 2);
		Static3 a2 = new Static3(1);
		int z = Inc.f(a2, 3);
		if (a.stat != a2.stat) {
			Inc.f(a, 1);
			Inc.f(a2, 1);
		}
	}
}

class Inc {
	static int f(Static3 o, int i) {
		o.stat += i; return o.stat;
	}
}