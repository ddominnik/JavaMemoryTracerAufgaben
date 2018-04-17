package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethAttr {
	public static void main(String[] args) {
		MethAttr_A a = new MethAttr_A();
		a.f(30, 3, 98);
	}
}

class MethAttr_A {
	int a, b, c;

	MethAttr_A() {
		this.a = this.b = this.c = 1;
	}

	void f(int a, int b, int c) {
		a = b * 3;
		this.b = a;
		b = this.c;
		c = a * this.a + b;
		this.c = 6 * this.b;
		while (b > 0) {
			this.b /= 2;
			b = this.b - 1;
			this.c = this.b;
		}
	}
}
