package test.java.de.ostfalia.fh.protogen.s9adv;

public class Static2 {
	static int i, j = 10;
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		int res1 = f(x);
		int res2 = f(y);
		if (res1 == res2) {
			boolean eq = true;
		}
		
	}
	
	static int f (int a) {
		++i; j -= i;
		a = a + j; 
		return a;
	}
}
