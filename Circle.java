public class Circle {
    private int radius;
    private Point center; // Point 참조 변수가 필드로 선언

    //생성자
    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + radius +", center = " + center +"]";
    }
}
