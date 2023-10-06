package GlobalTime;

public class Main {
    public static void main(String[] args) {
        GlobalTime gt =  new GlobalTime();

        while (true){
            System.out.flush();
            gt.KoreanTime();
            gt.ChinaTime();

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
