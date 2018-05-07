package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethEquals2 {
	public static void main(String[] args) {
		boolean equalsVar = false;
		B b0 = new B(0, false);
		B b1 = b0;
		equalsVar = b0.equals(b1);
		C c0 = new C(0, false);
		equalsVar = c0.equals(b0);
		C c1 = new C(0,false);
		equalsVar = c1.equals(c0);
		c1.aktiv = true;
		equalsVar = c1.equals(c0);
	}
}

class B {
	int id;
	boolean aktiv;

	public B(int id, boolean aktiv) {
		this.id = id;
		this.aktiv = aktiv;
	}
}

class C {
	int id;
	boolean aktiv;

	public C(int id, boolean aktiv) {
		this.id = id;
		this.aktiv = aktiv;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof C))
			return false;
		C b = (C) obj;
		if (this.id == b.id)
			return true;
		else
			return false;

	}
}