package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethConstr {
	public static void main(String[] args) {
		MethConstr42 first42 = new MethConstr42();
		MethConstr42 second42 = new MethConstr42(43, 2);
		MethConstr42 third42 = new MethConstr42(3);
	}
}

class MethConstr42 {
	int z, n;

	public MethConstr42(int z, int n) {
		this.n = n;
		if (z/n == 42) {
			this.z = z;
		} else {
			this.z = 42 * n;
		}
	}

	public MethConstr42(int n) {
		this(1, n);
	}

	public MethConstr42() {
		this(42, 1);
	}

}