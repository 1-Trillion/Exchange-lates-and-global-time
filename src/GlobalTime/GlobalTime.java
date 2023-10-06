package GlobalTime;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GlobalTime {

    public static String getCurrentTime(String timeFormat){
        return new SimpleDateFormat(timeFormat).format(System.currentTimeMillis());
    }


    protected void KoreanTime(){
//        LocalTime kt = LocalTime.now();

        ZoneId zonk = ZoneId.of("Asia/Seoul");
        ZonedDateTime kt = ZonedDateTime.now(zonk);

        DateTimeFormatter ktfm = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String timeformat = kt.format(ktfm);

        System.out.println("한국시간 = " + timeformat);
//        System.out.flush();
    }
    protected void ChinaTime(){
        ZoneId zonk = ZoneId.of("Asia/Shanghai");
        ZonedDateTime kt = ZonedDateTime.now(zonk);

        DateTimeFormatter ktfm = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String timeformat = kt.format(ktfm);

        System.out.println("중국시간 = " + timeformat);
    }

}
