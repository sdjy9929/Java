public class Date {
    private int year;
    private String month;
    private int day;

    public Date() {
        this(1900, "1월", 1); // 기본 생성자
    }

    public Date(int year) {
        this(year, "1월", 1); // 생성자
    }

    public Date(int year, String month, int day) {
        //this는 현재 객체를 가리킨다.
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date [year = " + year + ", month = " + month + ", day = " + day +"]";
    }
}
