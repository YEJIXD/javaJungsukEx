package javaEx.src.ch2;

public class CastingEx2 {
    public static void main(String [] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

        b = 10;
        i = (int)b;
        System.out.printf("[byte - > int] b=%d -> b=%d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte - > int] b=%d -> b=%d%n", b, i);

        System.out.println("i="+Integer.toBinaryString(i));
        // Integer.toBinaryString(int i ) : 10진 정소를 2진 정수로 변환한 문자열을 얻을 수 있다.
    }
}
