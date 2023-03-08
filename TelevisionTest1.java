public class TelevisionTest1 {
    public static void main(String[] args) {
        Television1 tv = new Television1();
        tv.channel = 7;
        tv.volume = 9;
        tv.onOff = true;
        System.out.println("텔레비전의 채널은 "+tv.channel+"이고 볼륨은 "+tv.volume+"입니다.");
    }
}
