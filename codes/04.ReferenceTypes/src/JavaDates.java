import java.time.*;

public class JavaDates {
    public static void main(String[] args) {
        // java uses JODA API for dates
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);


        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println(today.lengthOfYear());
        System.out.println(today.plusDays(100));
        System.out.println(today.minusYears(100));

        //LocalDate class is immutable
        LocalDate twoHundredYearsBefore = today.minusYears(200);
        System.out.println(twoHundredYearsBefore);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        LocalDate yesterday = LocalDate.of(2018,01,31);
        System.out.println(yesterday);
        System.out.println(today.withYear(2016));
        System.out.println(today.withDayOfMonth(20));
        System.out.println(today.withDayOfYear(0));
        System.out.println(today.isBefore(yesterday));
        System.out.println(today.isAfter(yesterday));
    }
}
