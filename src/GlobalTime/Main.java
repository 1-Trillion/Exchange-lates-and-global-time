package GlobalTime;

public class Main {
    public static void main(String[] args) {

        GlobalTime gt =  new GlobalTime();

//            gt.KoreanTime();
        while (true){
//            System.out.print("한국 시간: "+gt.KoreanTime()+ " || "+ "중국 시간: "+gt.ChinaTime());
            System.out.print("한국 시간: " + gt.globalTime("Asia/Seoul") + " || ");
            System.out.print("중국 시간: " + gt.globalTime("Asia/Shanghai") + " || ");
            System.out.print("일본 시간: " + gt.globalTime("Asia/Tokyo") + " || ");
            System.out.print("벨기에 시간: " + gt.globalTime("Europe/Brussels") + " || ");
            System.out.print("독일 시간: " + gt.globalTime("Europe/Berlin"));

            //            System.out.println();
//            System.out.print("중국 시간: "+gt.ChinaTime());
            System.out.print("\r");
//            System.out.println();

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
