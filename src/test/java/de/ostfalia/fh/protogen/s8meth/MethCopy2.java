package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethCopy2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Y2 y = new Y2(1, 2);
		MethCopy2_X2 x2 = new MethCopy2_X2(y);
		MethCopy2_X2 x22 = (MethCopy2_X2)x2.clone();
	}
}

class MethCopy2_X2 {
	private Y2 y;

	public MethCopy2_X2(Y2 y) {
		super(); this.y = y;
	}

	public Object clone() throws CloneNotSupportedException {
		Y2 y = new Y2(this.y.f, this.y.s);
		MethCopy2_X2 x2 = new MethCopy2_X2(y);
		return x2;
	}
}

class Y2 {
	int f, s;

	public Y2(int f, int s) {
		this.f = f;
		this.s = s;
	}
}