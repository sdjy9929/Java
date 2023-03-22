public class MyCounterTest3 {
    public static void main(String[] args) {
        MyCounter3 obj = new MyCounter3();

        System.out.println("obj.value = " + obj.value);
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);
        //inc() 메소드 안에서 전달된 객체의 내용을 변경하면
        //원본 객체의 내용도 변경된다.
    }
}
