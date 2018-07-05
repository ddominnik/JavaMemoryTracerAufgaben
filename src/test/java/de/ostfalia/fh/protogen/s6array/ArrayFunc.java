package test.java.de.ostfalia.fh.protogen.s6array;

public class ArrayFunc {
	public static void main(String[] args) {
		int[] a = { 5, 3, 4 };
		f(a, 3);
		f(a, 2);

	}

	static void f(int[] arr, int i) {
		arr[0] = i + 3;
		arr[1] = arr[0] % 2;
		arr[2] = arr[0] - arr[1] + 2;
	}
}
