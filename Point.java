public class Point {
    private int x = 0;
    private int y = 0;

    //생성자
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public String toString() {
        return "Point [x = " + x +", y = " + y +"]";
    }

    /* this는 매개변수와 필드의 이름이 같은 경우에 편리하다.
     * this.를 붙이면 필드가 된다.
     * 위와 같은 경우에는 this를 사용하면 문장의 길이가 증가하기만
     * 하기 때문에 사용할 이유가 없다.
     * private int x = 0;
     * private int y = 0;
     * 
     * public Point(int x, int y) {
     *      this.x = x;
     *      this.y = y;
     * }
     */
}
