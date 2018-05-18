package test.java.de.ostfalia.fh.protogen.s9adv;

public class AdvBit1 {
	public static void main(String[] args) {
		byte a = 0b00110101;
		byte komp_a = (byte)~a;
		byte b = (byte)(a & komp_a);
		byte c = (byte)(a | komp_a);
		b = a;
		a = 0b01100110;
		c = (byte)(a | b);
		c = (byte)(a ^ b);
	}
}
