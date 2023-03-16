public class SafeArray {
    private int a[];
    public int length;

    public SafeArray(int size){
        a = new int[size];
        length = size;
    }

    public int get(int index){
        if (index >= 0 && index < length){
            return a[index];
        }
        return -1;
    }

    //설정자에서 잘못된 index번호를 차단할 수 있다.
    public void put(int index, int value) {
        if(index >= 0 && index < length) {
            a[index] = value;
        } else {
            System.out.println("잘못된 인덱스 " + index);
        }
    }
}
