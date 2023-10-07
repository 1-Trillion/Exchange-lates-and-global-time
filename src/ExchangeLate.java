public class ExchangeLate {

    public final int KRW = 1;
    public static final int USD = 1350;
    public static final int JPY = 906;
    public static final int CNY = 184;
    public static final int EUR = 1422;
    public static final int GBP = 1642;

    public static void startExchangeLate() {
        Utility.clearScreen();
        while (true) {
            showMainScreen();
            selectMenu();
        }
    }

    private static void selectMenu() {
        String menuNum = Utility.input("- 메뉴 번호 : ");

        switch (menuNum) {
            case "1":
                Utility.clearScreen();
                checkTarget();
                inputCheckTarget();
                break;
            case "2":
                View.start();
                break;
            default:
                System.out.println("없는 번호임");
        }
    }

    private static void checkTarget() {
        System.out.println("========== 확인할 외화의 형식을 선택해주세요 =========");
        System.out.println(" # 1. 달러(UBD)");
        System.out.println(" # 2. 엔(JPY)");
        System.out.println(" # 3. 위안(CNY)");
        System.out.println(" # 4. 유로(EUR)");
        System.out.println(" # 5. 파운드(GBP)");
    }

    private static void inputCheckTarget() {
        String menuNum = Utility.input("- 메뉴 번호 : ");


        switch (menuNum) {
            case "1":
                Utility.clearScreen();
                String UBD = Utility.input("# 원화를 입력해주세요 : ");
                try {
                    int parseDollor = Integer.parseInt(UBD);
                    System.out.printf("# 달러의 가치 : %d$ 입니다.", parseDollor / USD);
                } catch (NumberFormatException e) {
                    System.out.println("# 똑바로 입력하셈");
                }
                break;
            case "2":
                Utility.clearScreen();
                String Japan = Utility.input("# 원화를 입력해주세요 : ");
                try{
                    int parseJPY = Integer.parseInt(Japan);
                    System.out.printf("# 엔의 가치 : %d￥ 입니다.", parseJPY / JPY);
                } catch (NumberFormatException e) {
                    System.out.println("# 똑바로 입력하셈");
                }
                break;
            case "3":
                Utility.clearScreen();
                String China = Utility.input("# 원화를 입력해주세요 : ");
                try {
                    int parseCNY = Integer.parseInt(China);
                    System.out.printf("# 위안의 가치 : %d￥ 입니다.", parseCNY / CNY);
                } catch (NumberFormatException e) {
                    System.out.println("# 똑바로 입력하셈");
                }
                break;
            case "4":
                Utility.clearScreen();
                String EU = Utility.input("# 원화를 입력해주세요 : ");
                try {
                    int parseEu = Integer.parseInt(EU);
                    System.out.printf("# 유로의 가치 : %d€ 입니다.", parseEu / EUR);
                } catch (NumberFormatException e) {
                    System.out.println("# 똑바로 입력하셈");
                }
                break;
            case "5":
                Utility.clearScreen();
                String France = Utility.input("# 원화를 입력해주세요 : ");
                try {
                    int parseFrance = Integer.parseInt(France);
                    System.out.printf("# 파운드의 가치 : %d£ 입니다.", parseFrance / GBP);
                } catch (NumberFormatException e) {
                    System.out.println("# 똑바로 입력하셈");
                }
                break;
            default:
                System.out.println("없는 번호임");
                break;
        }
    }

    private static void exchangeTarget() {
        System.out.println("");
    }

    private static void showMainScreen() {
        System.out.println("\n =============== 환전 업무 ===============");
        System.out.println(" # 1. 환율 확인");
        System.out.println(" # 2. 이전 메뉴로 나가기");
    }
}
