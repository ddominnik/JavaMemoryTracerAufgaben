package test.java.de.ostfalia.fh.protogen.s7data;

public class Data2 {
	public static void main(String[] args) {
		X x = new X();
		x.i = 2;
		x.y = new Y();
		x.y.j = 5;

		x.y.k = new int[3];
		for (int a = 0; a < x.y.k.length; a++) {
			x.y.k[a] = x.i-- + x.y.j++;
			x.y.k[a + 1] = a;
		}
	}
}

class X {
	int i;
	public Y y;
}

class Y {
	int j;
	int[] k;
}