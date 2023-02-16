package javaEx.src.ch2;

public class CastingEx3 {
    public static void main(String [] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d);
        System.out.printf("d2 = %20.18f\n", d2);

        /* 변수 f와 d에 같은 값을 저장했지만 실제로 저장되는 값은 다르다.
        같은 값을 저장해도 float와 double의 정밀도 차이때무에 서로 다른 값이 저장된다.
        저장할 때 이미 값이 달라졌기 때문에, 형변환을 해도 값이 같아지지 않는다.
        * */
    }
}
