package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes1 {
	public static void main(String[] args) {
		boolean f = false;
		boolean g = false;
		int i = 0;
		if ((f = true) || (g = true)) 
			i = 5;
			if (g = true)	
				i = i % 2;
	}
}
