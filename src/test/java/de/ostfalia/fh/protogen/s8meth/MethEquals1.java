package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethEquals1 {
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
		equalsVar = (a2 == a3);
		equalsVar = a2.equals(a3);
	}

}

class A {
	int id;
	boolean aktiv;

	public A(int id, boolean aktiv) {
		this.id = id;
		this.aktiv = aktiv;
	}
}

