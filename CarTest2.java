public class CarTest2 {
    public static void main(String[] args) {
        //생성자 호출
        Car2 c1 = new Car2("S600", "white", 80);
        Car2 c2 = new Car2("E500", "blue", 20);
        /*정적 메소드
        int n = Car2.numbers;
        */
        int n = Car2.getNumberOfCars(); //정적 메소드 호출
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
