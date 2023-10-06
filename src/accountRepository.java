public class accountRepository {
    //예금액
    private int dipositMoney;

    public accountRepository() {
    }

    public int getDipositMoney() {
        return dipositMoney;
    }

    public void setDipositMoney(int dipositMoney) {
        this.dipositMoney = dipositMoney;
    }
    //예금액 출력
    public void showMoney(){
        System.out.println(dipositMoney);
    }
}
