public class CircleTest {
    public static void main(String[] args) {
        Point p = new Point(25, 75);
        Circle c = new Circle(p, 10); //Circle 객체를 생성할 때, Point 객체 참조값을 넘긴다.
        System.out.println(c);
    }
}
