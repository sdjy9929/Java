class A {
    A() {

    }
}
class B extends A { //B는 A로부터 상속받아 작성된다.
    B() {

    }
}

public class TypeTest2 {
    public static void main(String[] args) {
        A a = new B(); //부모 클래스의 참조 변수로 자식 클래스의 객체를 참조할 수 있다.
    }
}