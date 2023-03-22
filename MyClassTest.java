public class MyClassTest {
    public static void main(String[] args) {
        //정적 변수가 사용되기 때문에 정적 블록에 의해 초기화된다.
        System.out.println(MyClass.x);

        class Sample {
            public static int myVar = initialize();

            private static int initialize() {
                //정적 변수들을 초기화한다.
                return 300;
            }
        }
    }
}
