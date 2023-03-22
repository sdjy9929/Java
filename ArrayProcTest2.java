public class ArrayProcTest2 {
    final static int STUDENTS = 5;

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS];
        ArrayProc2 obj = new ArrayProc2();
        obj.getValues(scores);
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
