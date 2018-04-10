package test.java.de.ostfalia.fh.protogen.s8meth;

public class Meth1 {
	public static void main(String[] args) {
		Meth1A a = new Meth1A();
		a.x = 23;
		a.y = 19;
		int sum = a.add();
	}
}

class Meth1A {
	int x, y;

	int add() {
		int z = x + y;
		return z;
	}
}
