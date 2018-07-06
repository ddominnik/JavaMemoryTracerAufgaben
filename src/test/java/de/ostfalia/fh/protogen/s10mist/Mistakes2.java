package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes2 {
	
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		double b = f(x,y);
		if (b + 0.01 > 1.66 && b - 0.01 < 1.66) {
			boolean t = true;
		}
	}
	
	// Berechnet den Wert eines Bruches genau
	public static double f(int x, int y) {
		double bruch = (double) (x / y);
		return bruch;
	}
}
