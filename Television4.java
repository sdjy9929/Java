public class Television4 {
    int channel; //채널 번호
    int volume; //볼륨
    boolean onOff; //전원 상태

    void print(){
        System.out.println("채널은 "+channel+"이고, 볼륨은 "+volume+"입니다.");
    }

    //channel의 값을 반환하는 메소드
    int getChannel(){
        return channel;
    }
}
