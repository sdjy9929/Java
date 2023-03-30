public class Manager extends Employee2 {
    private int bonus;

    public Manager(String name, String address, int salary, int rrn) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    void test() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("salary = " + salary);
        //System.out.println("rrn = " + rrn); -> private 필드에는 접근할 수 없다.
    }
}