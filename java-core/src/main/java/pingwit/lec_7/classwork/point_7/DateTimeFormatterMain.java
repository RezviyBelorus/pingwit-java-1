package pingwit.lec_7.classwork.point_7;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now().plusMonths(1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss:SSSS uuuu-dd-MMMM");
        DateTimeFormatter iso = DateTimeFormatter.ISO_DATE;

        String formattedDate = dtf.format(now);

        System.out.println("now=" + now);
        System.out.println("formattedDate=" + formattedDate);
        System.out.println("iso=" + iso.format(now));

        System.out.println(ZonedDateTime.now());
    }

}
