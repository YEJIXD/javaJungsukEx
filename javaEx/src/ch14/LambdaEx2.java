package src.ch14;

@FunctionalInterface
interface MyFunction2{
    void myMethod();        // public abstract void myMethod();
}

class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {};            //MyFunction f = (MyFunction) (()->{});
        Object obj = (MyFunction2) (()-> {});  // Object 타입으로 형변환이 생략됨
        String str = ((Object)(MyFunction2) (()-> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//      System.out.println(()->{});     // Error : 람다식은 Object 타입으로 형변환 안됨
        System.out.println((MyFunction2)(()-> {}));
//      System.out.println((MyFunction2) (()->{}).toString());   // Error
        System.out.println(((Object)(MyFunction2)(()->{})).toString());
    }
}
