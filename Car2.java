public class Car2 {
    private String model;
    private String color;
    private int speed;

    //자동차 시리얼 번호
    private int id;
    static int numbers = 0;

    public Car2(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
        //자동차의 개수를 증가하고 id에 대입
        id = ++numbers;
    }

    //정적 메소드
    public static int getNumberOfCars() {
        return numbers;
    }
}
