public class StringTest {
    public static void main(String[] args) {
        String proverb = "A barkng dog"; //new 연산자 생략 가능
        String s1, s2, s3, s4; //참조 변수로서, 메소드에서 반환된 참조값을 받음

        System.out.println("문자의 길이 = " + proverb.length()); // length는 문자의 길이를 알 수 있음

        s1 = proverb.concat(" never Bites!"); //concat은 문자열을 결합함
        s2 = proverb.replace('b', 'B'); //replace는 문자를 교환
        s3 = proverb.substring(2, 5); //substring은 지정한 부분의 문자열을 추출
        s4 = proverb.toUpperCase(); //toUpperCase는 대문자로 변환

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int size = "Hello World!".length(); //문자열의 크기
        System.out.println(size); //12가 출력

        //문자열의 결합
        String subject = "Money";
        String other = " has no value if it is not used";
        String sectence = subject + other;
        System.out.println(sectence); //"Money has no value if it is not used"가 출력

        //수치값을 문자열로 변환
        int x = 20;
        System.out.println(x); //20이 출력

        String answer = "The answer is " + 100;
        System.out.println(answer); // "The answer is 100"이 출력
        System.out.println("100" + 20); //10020이 출력 -> 20대신에 x가 20이므로 x를 넣어도 같은 결과가 나옴
        System.out.println(100 + 20); //120이 출력

        //문자열을 수치값으로 변환
        int i = Integer.parseInt("123"); //변수 i에 정수 123이 저장
        double d = Double.parseDouble("3.141592"); //변수 d에 실수 3.141592가 저장
        System.out.println(i);
        System.out.println(d);
    }
}
