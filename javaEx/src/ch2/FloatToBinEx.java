package ch2;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.12345678901234567890f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n ", f);
		System.out.printf("%X%n", i);		// 16진수로 출력
	}
}
