public class ArrayProcTest1 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5 };
        ArrayProc1 obj = new ArrayProc1();

        obj.inc(list);

        for (int i = 0; i < list.length; i++)
        System.out.println(list[i] + " ");
    }
}
