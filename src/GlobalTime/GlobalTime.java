package GlobalTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GlobalTime {

    protected static void globalTime(String name, String country){

        ZoneId zonTimer = ZoneId.of(country);
        ZonedDateTime kt = ZonedDateTime.now(zonTimer);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print(name + " | " + kt.format(dateformat) + " "+ kt.format(timeFormat) + "\t"+"\t");

    }

    public static void main(String[] args) {
        while (true){
            globalTime("한국","Asia/Seoul");
            globalTime("중국","Asia/Shanghai");
            globalTime("일본","Asia/Tokyo");
            globalTime("미국","America/Chicago");
            globalTime("독일","Europe/Berlin");

            System.out.print("\r");

            try{
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.fillInStackTrace();

            }

        }

    }

}
