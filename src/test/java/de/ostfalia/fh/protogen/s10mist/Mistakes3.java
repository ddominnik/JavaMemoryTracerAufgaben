package test.java.de.ostfalia.fh.protogen.s10mist;

public class Mistakes3 {
	static int a;
	
	public Mistakes3(int a) {
		Mistakes3.a = a;
	}
	
	public static void main(String[] args) {
   {int a = 12;
	int b = a;
	Mistakes3 m = new Mistakes3(a);
	m.a = a;
	};
	int a = Mistakes3.a;
	Mistakes3 m1 = new Mistakes3(a);
	if (m1.a == Mistakes3.a)
	a = Mistakes3.a;
	}
}
