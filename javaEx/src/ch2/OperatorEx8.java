package src.ch2;

public class OperatorEx8 {
    public static void main(String[] args){
        int a = 1_000_000;  //1,000,000 1백만
        int b = 2_000_000;  //2,000,000 2백만

        long c = a * b;
        System.out.println(c);
        /*
        a * b의 결과 값을 담는 변수 c의 자료형이 long타입(8byte)이기 때문에 2*10의12승을 저장하기에 충분하므로
        2000000000000이 출력될 것 같지만, 결과는 전혀 다른 값이 출력된다.
        그 이유는 int타입과 int타입의 연산결과는 int타입이기 때문이다.
        'a*b'의 결과가 이미 int 타입의 값 (-1454759936)이므로 long형으로 자동 형변환되어도 값은 변하지 않는다.
        * */
    }
}
