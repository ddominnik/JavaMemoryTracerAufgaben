package test.java.de.ostfalia.fh.protogen.s7data;

public class Data3 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		b1.z = 9;
		b1.n = 4;
		b2.z = 6;
		b2.n = 4;
		f(b1);
		f(b2);
		b1 = g(b2);
	}

	public static void f(B b) {
		b.b = b.z / b.n;
	}

	public static B g(B b) {
		if (b.z % 2 == 0 && b.n % 2 == 0) {
			b.z /= 2;
			b.n /= 2;
		}
		return b;

	}
}

class B {
	float z;
	float n;
	float b;
}