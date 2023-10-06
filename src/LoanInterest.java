import java.util.Scanner;

public class LoanInterest {

    static double totalInterest;
    static double monthlyPayment;
    static Scanner sc = new Scanner(System.in);

    public static void start() {
        process();
    }
    static void selector() {
        System.out.println("\n****** 상환방법을 선택 해주세요. ******");
        System.out.println("# 1. 원리금 균등");
        System.out.println("# 2. 원금균등");
        System.out.println("# 3. 만기일시");
    }

    static void process() {
        while (true) {
            System.out.println("대출 금액을 입력 해주세요.");
            double principal  = Integer.parseInt(input(">>"));
            if (principal  <= 0) {
                System.out.println("대출 금액은 1보다 작을 수 없습니다.");
                continue;
            }
            System.out.println("대출 기간을 입력 해주세요.");
            int months = Integer.parseInt(input(">>"));
            if (months <= 0) {
                System.out.println("대출 기간은 1보다 작을 수 없습니다.");
                continue;
            }
            System.out.println("연이자율을 입력 해주세요.(%)");
            double annualInterest  = Double.parseDouble(input(">>"));
            if (annualInterest  <= 0) {
                System.out.println("연이자율은 1보다 작을 수 없습니다.");
                continue;
            }
            double annualInterestRate =  annualInterest/ 100.0;

            selector();
            String menuNum = input(">>  ");
            switch (menuNum) {
                case "1":
                    double monthlyInterestRate = annualInterestRate / 12;
                    monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -months));
                    totalInterest = (monthlyPayment * months) - principal;

                    System.out.println("매월 상환액: " + Math.ceil(monthlyPayment) + "원");
                    System.out.println("대출 이자 총액: " + Math.ceil(totalInterest) + "원");
                    System.out.println("대출 총 상환액: " + Math.ceil((principal + totalInterest)) + "원");
                    break;
                case "2":
                    double monthlyPrincipalPayment = principal / months;
                    totalInterest = 0;
                    System.out.println("매월 상환액(원금): " + Math.ceil(monthlyPrincipalPayment) + "원");
                    System.out.println("대출 이자 총액: " + Math.ceil(totalInterest) + "원");
                    for (int i = 0; i < months; i++) {
                        double monthlyInterest = principal * annualInterestRate / 12;
                        monthlyPayment = monthlyPrincipalPayment + monthlyInterest;
                        totalInterest += monthlyInterest;
                        principal -= monthlyPrincipalPayment;
                        System.out.println("월 " + (i + 1) + ": 이자 " + Math.ceil(monthlyInterest) + "원, 원금 "
                                + Math.ceil(monthlyPrincipalPayment) + "원, 상환액 " + Math.ceil(monthlyPayment) + "원");
                    }
                    break;
                case "3":
                    totalInterest = principal * annualInterestRate * months / 12;
                    double totalPayment = principal + totalInterest;
                    System.out.println("대출 이자 총액: " + Math.ceil(totalInterest) + "원");
                    System.out.println("대출 총 상환액: " + Math.ceil(totalPayment) + "원");
                    break;
            }
            return;
        }
    }

    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
