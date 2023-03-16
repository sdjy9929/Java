public class Account {
    //private는 클래스 내부에서만 사용 가능하다.
    private int regNumber;
    private String name;
    private int balance;

    //접근자와 생성자
    public String getName(){
        return name;
    }
    //name에 대한 접근자 getName
    public void setName(String name){
        this.name = name;
    }
    //name에 대한 설정자 setName
    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}
