package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethCopy1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Y1 y = new Y1(1, 2);
		MethCopy1_X1 x1 = new MethCopy1_X1(y);
		MethCopy1_X1 x11 = (MethCopy1_X1) x1.clone();
	}
}

class MethCopy1_X1 {
	private Y1 y;

	public MethCopy1_X1(Y1 y) {
		super(); this.y = y;
	}

	public Object clone() throws CloneNotSupportedException {
		MethCopy1_X1 x1 = new MethCopy1_X1(this.y);
		return x1;
	}
}

class Y1 {
	int f, s;

	public Y1(int f, int s) {
		this.f = f;
		this.s = s;
	}
}