package GlobalTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class GlobalTime {

    protected void globalTime(String name, String country){

        ZoneId zonCountry = ZoneId.of(country);
        ZonedDateTime kt = ZonedDateTime.now(zonCountry);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

        System.out.print(name + " | " + kt.format(timeFormat) + "\t"+"\t");

    }

}
