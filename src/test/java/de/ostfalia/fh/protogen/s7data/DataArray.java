package test.java.de.ostfalia.fh.protogen.s7data;

public class DataArray {
	public static void main(String[] args) {
		O[] arr = new O[3];
		int i = 20;
		for (int j = 0; j < 3; j++) {
			arr[j] = new O();
			arr[j].x = i;
			i /= 2;
		}
	}
}

class O {
	int x;
}
