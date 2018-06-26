package test.java.de.ostfalia.fh.protogen.s9adv;

public class AdvBit2 {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		int i = 0;
		if (a && (a = b)) {	i = i + 1; }
		if (b | (b = a)) { i = i + 2; }
		if (b || (a = (b != true))) { i = i + 3; }
		if (b & (a = true)) { i = 42; }
	}
}
