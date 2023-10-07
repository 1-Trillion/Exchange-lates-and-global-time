public class DepositView {
    AccountRepository accountRepository = new AccountRepository();
    DepositInterest depositInterest=new DepositInterest();
    public DepositView() {
        DepositMenu();
    }

    private void DepositMenu() {
        while (true) {
            showDeposit();
            String select = Utility.input("ATM 메뉴를 선택해주세요 : ");
            switch (select) {
                case "1":
                    inputDeposit();
                    break;
                case "2":
                    withdraw();
                    break;
                case "3":
                    depositInterest.inputRate();
                    break;
                case "4":
                    LoanInterest.start();
                    break;
                case "5":
                    return;
            }

        }
    }

    private void showDeposit() {
        System.out.printf("\n =============== ATM 메뉴(현제 잔액 : %d원) ===============\n",accountRepository.getDipositMoney());
        System.out.println("# 1. 예금");
        System.out.println("# 2. 출금");
        System.out.println("# 3. 예금 이자 계산");
        System.out.println("# 4. 대출 이자 계산");
        System.out.println("# 5. 뒤로가기");
    }
    private void inputDeposit(){
        int deposit = Integer.parseInt(Utility.input("예금할 금액을 입력 해주세요 : "));
        AccountRepository accountRepository = new AccountRepository(deposit);
        accountRepository.showMoney();
    }
    private void withdraw(){
        int withdraw = Integer.parseInt(Utility.input("출금할 금액을 입력 해주세요 : "));
        double money= accountRepository.getDipositMoney();
        int withdrawMoney= (int) (money-withdraw);
        AccountRepository accountRepository = new AccountRepository(withdrawMoney);
    }

}
