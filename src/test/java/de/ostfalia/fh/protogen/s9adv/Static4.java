package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static4 {
	static int x;
	int y;
	
	public Static4(int i) { super(); this.x = i; this.y = 0;	}
	
	public static void main(String[] args) {
		int x = 4; 
		Static4 first = new Static4(x);
		I.incX(first, 3);
		I.incY(first, x);
		Static4 second = new Static4(x);
		I.incX(second, first.y);
		I.incX(first, second.y);
	}
}

class I {
	static void incX(Static4 o, int i) { o.x += i;}
	static void incY(Static4 o, int i) { o.y += i;} 
}
