public class ArrayProc1 {
    void inc(int[] array) { //[]은 배열을 의미한다.
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }
}
