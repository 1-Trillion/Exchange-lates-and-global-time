public class DepositInterest {
    AccountRepository accountRepository=new AccountRepository();

    public DepositInterest() {
    }
    public void inputRate(){

        try {
            double principal=accountRepository.getDipositMoney();
            double rate = Double.parseDouble(Utility.input("연이율을 입력하세요 (%): "));
            String timePeriod = Utility.input("예금 기간을 입력하세요 (연 또는 개월): ");
            double time;

            if (timePeriod.equalsIgnoreCase("연")) {
                time = Double.parseDouble(Utility.input("예금 기간(년)을 입력하세요: "));
            } else if (timePeriod.equalsIgnoreCase("개월")) {
                time = Double.parseDouble(Utility.input("예금 기간(개월)을 입력하세요: "));
            } else {
                System.out.println("올바른 예금 기간 단위를 입력하세요 (연 또는 개월).");
                return;
            }

            int taxOption = Integer.parseInt(Utility.input("이자 과세 방식을 선택하세요 (1: 일반과세, 2: 비과세, 3: 세금우대): "));
            // 이자 계산
            double interest = calculateInterest(principal, rate, time, taxOption);
            // 결과 출력
            System.out.println("이자: " + (int)interest+"원");
        }catch (NumberFormatException e){
            System.out.println("유효한 값이 아닙니다.");
        }



    }

    public static double calculateInterest(double principal, double rate, double time, int taxOption) {
        // 단리 또는 복리 이자 계산
        double interest;
        if (taxOption == 1) {
            // 일반과세
            interest = principal * (rate / 100) * time;
        } else if (taxOption == 2) {
            // 비과세
            interest = principal * (rate / 100) * time;
            interest = interest - (interest * 0.154); // 비과세율 15.4% 공제
        } else if (taxOption == 3) {
            // 세금우대
            interest = principal * (rate / 100) * time;
            interest = interest - (interest * 0.07); // 세금우대율 7% 공제
        } else {
            System.out.println("올바른 세금 과세 방식을 선택하세요 (1: 일반과세, 2: 비과세, 3: 세금우대).");
            return 0;
        }

        return interest;
    }

}
