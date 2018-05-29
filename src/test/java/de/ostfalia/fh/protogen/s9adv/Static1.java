package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static1 {
	static int x;
	
	public static void main(String[] args) {
		int a = 1;
		int b = 42;
		while (x < 5) {
			a = a + (b % 4);
			b--;
			x += a;
		}	
	}
}
