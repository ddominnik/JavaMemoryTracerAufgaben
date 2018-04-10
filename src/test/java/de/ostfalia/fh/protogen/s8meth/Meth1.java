package test.java.de.ostfalia.fh.protogen.s8meth;

public class Meth1 {
	public static void main(String[] args) {
		Meth1A a = new Meth1A(1,1);
		a.x = 23;
		a.y = 19;
		int sum = a.add();
	}
}

class Meth1A {
	int x, y;

	Meth1A (int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	int add() {
		int z = x + y;
		return z;
	}
}
