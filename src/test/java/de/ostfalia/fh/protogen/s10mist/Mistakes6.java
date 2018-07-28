package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes6 {
	public static void main(String[] args) {
		int[] a = {7, 4, 2, 5};
		int res = 0;
		for (int i = a.length - 1; i > 0; i-- ) {
			res = (a[i] + 3) % 4;
			a[i] = res;
		}
		System.out.println(res);
	}
}
