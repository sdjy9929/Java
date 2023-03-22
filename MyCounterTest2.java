public class MyCounterTest2 {
    public static void main(String[] args) {
        MyCounter2 obj = new MyCounter2();
        int x = 10;

        //inc() 메소드로 변수 x의 복사본이 전달된다.
        //따라서 inc()는 x값에 영향을 주지 않는다.
        obj.inc(x);
        System.out.println("x = " + x);
    }
}
