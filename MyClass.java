public class MyClass {
    static int x; //정적 변수
    int y;

    //정적 초기화 블록
    static {
        x = 10;
        System.out.println("정적 블록이 호출되었습니다!");
    }
}
