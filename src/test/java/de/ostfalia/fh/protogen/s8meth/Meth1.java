package test.java.de.ostfalia.fh.protogen.s8meth;

public class Meth1 {
	public static void main(String[] args) {
		A a = new A();
		a.x = 23;
		a.y = 19;
		int sum = a.add();
	}
}

class A {
	int x, y;

	int add() {
		int z = x + y;
		return z;
	}
}
