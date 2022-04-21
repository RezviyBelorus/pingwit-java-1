package pingwit.lec_7.classwork.point_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(localTime);

        System.out.println(localDate.atStartOfDay());
        System.out.println(localDateTime.toLocalDate());

        LocalDate future = localDate.plusDays(5);
        System.out.println(localDate);

        System.out.println(future.isAfter(localDate));
    }

}
