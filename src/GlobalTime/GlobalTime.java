package GlobalTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class GlobalTime {

    static Scanner scanner = new Scanner(System.in);

    protected static String globalTime(String name, String country) {

        ZoneId zonTimer = ZoneId.of(country);
        ZonedDateTime kt = ZonedDateTime.now(zonTimer);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return name + " | " + kt.format(dateformat) + " " + kt.format(timeFormat) + "\t";
    }

    public static void timeAnimating() {
        AtomicBoolean shouldExit = new AtomicBoolean(false);

        String[] imgList = {
            "\uD83C\uDDF0\uD83C\uDDF7",
            "\uD83C\uDDE8\uD83C\uDDF3",
            "\uD83C\uDDEF\uD83C\uDDF5",
            "\uD83C\uDDFA\uD83C\uDDF8",
            "\uD83C\uDDE9\uD83C\uDDEA"
        };


        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press Enter to stop...");

            for (String img: imgList) {
                System.out.print(img);
                System.out.print("\t \t \t \t \t \t \t \t");
            }
            System.out.println();

            scanner.nextLine(); // 대기하면서 Enter 키 입력 확인
            shouldExit.set(true);
//            scanner.close();
        });

        inputThread.start(); // 입력을 대기하는 스레드 시작

        StringBuilder output = new StringBuilder();
        
        while (!shouldExit.get()) {
            output.setLength(0); // 이전 출력 내용 초기화

            output.append(globalTime("한국", "Asia/Seoul"));
            output.append(globalTime("중국", "Asia/Shanghai"));
            output.append(globalTime("일본", "Asia/Tokyo"));
            output.append(globalTime("미국", "America/Chicago"));
            output.append(globalTime("독일", "Europe/Berlin"));

            System.out.print(output.toString() + "\r");

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.fillInStackTrace();

            }

        }
        inputThread.interrupt();

    }

}