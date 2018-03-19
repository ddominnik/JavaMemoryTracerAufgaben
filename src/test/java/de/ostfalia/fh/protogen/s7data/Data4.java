package test.java.de.ostfalia.fh.protogen.s7data;

public class Data4 {
	public static void main(String[] args) {
		C c = new C();
		c.a = 1;
		c.b = 2;
		c.c = 3;
		C c1 = c;
		c.a = 4;
		C c2 = c;
		c1 = new C();
		c1.b = 5;
		c = c1;
		c1 = c2;
	}
}

class C {
	int a, b, c;
}
