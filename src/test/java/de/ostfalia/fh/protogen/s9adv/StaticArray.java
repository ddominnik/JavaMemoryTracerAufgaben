package test.java.de.ostfalia.fh.protogen.s9adv;

public class StaticArray {
	static int[] a;

	public static void main(String[] args) {
		a = new int[2];
		boolean t = false;
		int[] b = { 8, 2, 1 };
		for (int i = 0; i < b.length; i++) {
			if (b[i] <= i && i % 2 == 0) {
				a[i % 2] = b[i] + i;
				b[i] = i % 2;
				a[i % 2]++;
			}
		}
		if (a[1] < a[0]) {
			t = true;
		}
	}
}
