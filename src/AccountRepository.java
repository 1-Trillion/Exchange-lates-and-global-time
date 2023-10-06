public class AccountRepository {
    //예금액
    private  static int dipositMoney;

    public AccountRepository() {
    }

    public AccountRepository(int dipositMoney) {
        this.dipositMoney = dipositMoney;
    }

    public int getDipositMoney() {
        return dipositMoney;
    }

    public void setDipositMoney(int dipositMoney) {
        this.dipositMoney = dipositMoney;
    }
    //예금액 출력
    public void showMoney(){
        System.out.println(dipositMoney+"원");
        return;
    }
}
