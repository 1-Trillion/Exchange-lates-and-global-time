package GlobalTime;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GlobalTime {


    protected String globalTime(String country){
        ZoneId zonCountry = ZoneId.of(country);
        ZonedDateTime kt = ZonedDateTime.now(zonCountry);

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

        return kt.format(timeFormat);
    }

    protected String KoreanTime(){

        ZoneId zonk = ZoneId.of("Asia/Seoul");
        ZonedDateTime kt = ZonedDateTime.now(zonk);

        DateTimeFormatter ktfm = DateTimeFormatter.ofPattern("z HH시 mm분 ss초");
        String timeformatkor = kt.format(ktfm);

        return timeformatkor;
    }
    protected String ChinaTime(){
        ZoneId zonk = ZoneId.of("Asia/Shanghai");
        ZonedDateTime kt = ZonedDateTime.now(zonk);

        DateTimeFormatter ktfm = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        String timeformatchi = kt.format(ktfm);

        return timeformatchi;
    }

}
