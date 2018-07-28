package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes5 {
	public static void main(String[] args) {
		int x = 12, y = 6;
		int result = 0;
		char operand = '*';
		switch (operand) {
			case '+': result = x + y;
			case '-': result = x - y;
			case '*': result = x * y; 
			case '/': result = x / y;
			default : result = x + y;
		}
	}
}
