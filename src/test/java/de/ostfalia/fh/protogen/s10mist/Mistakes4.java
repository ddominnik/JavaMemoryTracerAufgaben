package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes4 {
	public static void main(String[] args) {
		boolean t = false;
		X x1 = new X(4,3);
		X x2 = new X(4,3);
		int v1 = x1.calcVal(),
			v2 = x2.calcVal();	
		if (v1 == v2) {
			if (x1 == x2) {
				t = true;
			} else {
				t = false;
			}
		}
	}
}

class X {
	int[] a;
	
	public X(int x, int y) {
		super(); this.a = new int[]{x, y};
	}
	
	int calcVal() {
		return (this.a[0] * this.a[1]); 
	}
}
