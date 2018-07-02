package test.java.de.ostfalia.fh.protogen.s9adv;

public class StaticCount {
	static int c = 0;
	int i;
	
	public StaticCount (int i) {
		super(); this.i = i;
		StaticCount.c ++;
	}
	
	public static void main(String[] args) {
		StaticCount o1 = new StaticCount(5);
		StaticCount o2 = o1;
		o2.i = 9;
		StaticCount o3 = new StaticCount(7);
		StaticCount o4 = new StaticCount(4);
		o3.i = o4.i - o2.i;
		o1.i = StaticCount.c;
	}
}
