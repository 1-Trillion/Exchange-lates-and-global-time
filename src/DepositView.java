public class DepositView {
    AccountRepository accountRepository = new AccountRepository();

    public DepositView() {
        DepositMenu();
    }

    private void DepositMenu() {
        while (true) {
            showDeposit();
            String select = Utility.input("ATM 메뉴를 선택해주세요 : ");
            switch (select) {
                case "1":
                    inputdeposit();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    LoanInterest.start();
                    break;
                case "5":
                    break;
            }
        }
    }

    private void showDeposit() {
        System.out.println("\n =============== ATM 메뉴 ===============");
        System.out.println("# 1. 예금");
        System.out.println("# 2. 출금");
        System.out.println("# 3. 예금 이자 계산");
        System.out.println("# 4. 대출 이자 계산");
        System.out.println("# 5. 뒤로가기");
    }

    private void inputdeposit() {
        int deposit = Integer.parseInt(Utility.input("예금할 금액을 입력 해주세요 : "));
        accountRepository.setDipositMoney(deposit);
        accountRepository.showMoney();
        return;
    }
}
