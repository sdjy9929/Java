public class Rectangle {
    private int x, y;
    private int width, height;

    Rectangle() {
        this(0, 0, 1, 1);
    }

    Rectangle(int width, int height) {
        this(0, 0, width, height); //this를 이용하여 다른 생성자를 호출하고 있다.
    }

    Rectangle(int x, int y, int width, int height) {
        //this를 사용한 다른 생성자 호출은 항상 첫 번째 문장이어야 한다.
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
