package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethEquals {
	public static void main(String[] args) {
		boolean equalsVar = false;
		A a0 = new A(0, true);
		A a1 = a0;
		equalsVar = (a0 == a1);
		a1.aktiv = false;
		equalsVar = (a0 == a1);
		A a2 = new A(1, false);
		equalsVar = (a0 == a2);
		A a3 = new A(1, false);
		equalsVar = a2.equals(a3);
		B b0 = new B(0, true);
		equalsVar = a0.equals(b0);
		equalsVar = b0.equals(a0);
		B b1 = new B(0, false);
		equalsVar = b0.equals(b1);
		b1.aktiv = true;
		equalsVar = (b0 == b1);
	}

}

class A {
	int id;
	boolean aktiv;

	public A(int id, boolean aktiv) {
		this.id = id;
		this.aktiv = aktiv;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

class B {
	int id;
	boolean aktiv;

	public B(int id, boolean aktiv) {
		this.id = id;
		this.aktiv = aktiv;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof B))
			return false;
		B b = (B) obj;
		if (this.id == b.id)
			return true;
		else
			return false;

	}
}