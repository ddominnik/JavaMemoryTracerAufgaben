package test.java.de.ostfalia.fh.protogen.s8meth;

public class MethFunc {
	int a;
	static int b = 42;
	
	public MethFunc () { super(); a = 42; }
	
	public static void main(String[] args) {
		MethFunc m = new MethFunc();
		m.f();
		MethFunc.g();			
	}
	
	int f() {
		int i = (a / 3) % 2;
		if (i >= 1 && i <= 2) {
			a += i;
			i *= 2;
		}
		return i;
	}
	
	static int g() {
		int i = (b / 6) % 3;
		if (i != 0) {
			b = i + 2;
			i *= 3;
		}
		return i;
	}
}
