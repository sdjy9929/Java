public class MyCounterTest1 {
    public static void main(String[] args) {
        MyCounter1 obj1 = new MyCounter1();// 생성자를 호출
        MyCounter1 obj2 = new MyCounter1(100); // 생성자가 매개 변수를 가질 수 있다.

        System.out.println("객체 1의 counter = " + obj1.counter);
        System.out.println("객체 2의 counter = " + obj2.counter);
    }
}
