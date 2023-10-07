public class View {


    public static void start() {
        while (true) {
            showMainScreen();
            selectMenu();
        }
    }

    private static void selectMenu() {
        String menuNum = Utility.input("- 메뉴 번호 : ");

        switch (menuNum) {
            case "1":
                ExchangeLate.startExchangeLate();
                break;
            case "2":
                break;
            case "3":
                DepositView depositView=new DepositView();
                break;
            case "4":
                String answer = Utility.input("# 정말로 종료합니까? [y/n] : ");
                if (answer.toLowerCase().charAt(0) == 'y') {
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                } else {
                    break;
                }
                break;
            case  "5":
                break;
            default:
                System.out.println("없는 번호임");
        }
    }

    private static void showMainScreen() {
        System.out.println("\n =============== 은행 업무 ===============");
        System.out.println("# 1. 환율 / 환전");
        System.out.println("# 2. 세계 시간");
        System.out.println("# 3. ATM 메뉴");
        System.out.println("# 4. 시스템 종료");
    }
}