public class SportsCarTest {
    public static void main(String[] args) {
        SportsCar obj = new SportsCar(); //자식 클래스 객체 생성
        //부모 클래스의 필드와 메소드 사용
        obj.speed = 10;
        obj.setSpeed(60);
        //자체 메소드 사용
        obj.setTurbo(true);
    }
}
