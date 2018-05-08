package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Y y = new Y(1, 2);
		MethCopy_X1 x1 = new MethCopy_X1(y);
		MethCopy_X2 x2 = new MethCopy_X2(y);
		MethCopy_X1 x11 = (MethCopy_X1)x1.clone();
		MethCopy_X2 x22 = (MethCopy_X2)x2.clone();
	}
}

class MethCopy_X1 {
	private Y y;
	public MethCopy_X1(Y y) { super(); this.y = y; }
	
	public Object clone() throws CloneNotSupportedException {
		return new MethCopy_X1(y);
	}
}

class MethCopy_X2 {
	private Y y;
	public MethCopy_X2(Y y) { super(); this.y = y; }

	public Object clone() throws CloneNotSupportedException {
		return new MethCopy_X2(new Y(y.f, y.s));
	}
}

class Y {
	int f, s;
	public Y(int f, int s) {
		this.f = f;
		this.s = s;
	}
}