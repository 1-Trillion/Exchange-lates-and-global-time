package GlobalTime;

public class Main {
    public static void main(String[] args) {

        GlobalTime gt =  new GlobalTime();

        while (true){
            gt.globalTime("한국","Asia/Seoul");
            gt.globalTime("중국","Asia/Shanghai");
            gt.globalTime("일본","Asia/Tokyo");
            gt.globalTime("미국","America/Chicago");
            gt.globalTime("독일","Europe/Berlin");

            System.out.print("\r");

            try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }

        }

    }

}
