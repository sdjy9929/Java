class Shape {
    protected int x, y;
}

class Rectangle extends Shape {
    private int width, height;
}

class Triangle extends Shape {
    private int base, height;
}

class Circle extends Shape {
    private int radius;
}

public class ShapeTest2 {
    public static void main(String args[]) {
        Shape s = new Rectangle(); // 부모 클래스의 참조변수로 자식 클래스의 객체를 가리키는 것은
                                   // 합법적이다.
        Rectangle r = new Rectangle();
        s.x = 0; //Shape 클래스의 필드와 메소드에 접근하는 것은 가능하다
        s.y = 0;
        //s.width = 100; -> s를 통해서는 Rectangle 클래스의 필드와 메소드에 접근할 수 없다.
        // s.height = 100;
    }
}
