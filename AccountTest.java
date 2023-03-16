public class AccountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom"); //설정자(setName, setBalance)를 사용
        obj.setBalance(100000);
        System.out.println("이름은 " + obj.getName() + ", 통장 잔고는 " + obj.getBalance() + "입니다." );
        //접근자(getName, getBalance)를 사용
    }
}
