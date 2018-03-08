package test.java.de.ostfalia.fh.protogen.s7data;

public class Data1 {
	public static void main(String[] args) {
		A o = new A();
		o.x = 5;
		A p = new A();
		p.x = o.y - o.x;
		p.y = o.x;
		p = o;
	}
}

class A {
	int x, y;
}