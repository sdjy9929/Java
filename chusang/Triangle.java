package chusang;

public class Triangle extends Shape {

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("삼각형을 그립니다.");
        Triangle t = new Triangle();
        t.move(30,30);
    }
    
}
