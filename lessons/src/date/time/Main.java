package date.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Main {
    //Date and time in Java

    /**
     * LocalDate
     * LocalTime
     * LocalDateTime
     * ZonedDateTime
     * Period
     * Duration
     * * LocalDate LocalTime LocalDateTime используются часто, представляя местное время
     * и в основном нужны когда указыывают временные зоны в явном виде не нужно
     */
    public static void main(String[] args) {
        //LocalDate
        //ISO-format - yyyy-mm-dd
        //получить текущую дату от системных часов
        LocalDate now = LocalDate.now();
        System.out.println("Today is " + now);

        //получить дату вида год-мес-чис, можно двумя способами
        LocalDate date = LocalDate.of(2023, 02, 26);
        LocalDate dateParse = LocalDate.parse("2023-02-26");
        System.out.println(date);
        System.out.println(dateParse);
        //method plusDays, Weeks, Months, Years
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Local date 'tomorrow' is " + tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("A month ago was " + previousMonthSameDay);

        System.out.println(LocalDate.parse("2023-02-26").getDayOfMonth());
        DayOfWeek monday = LocalDate.parse("2023-03-27").getDayOfWeek();
        System.out.println("Day of week" + monday);

        LocalDate today = LocalDate.parse("2023-03-27");
        System.out.println("Today is " + today.getDayOfYear() + " day of year");
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Is 2023 a leap year: " + leapYear);

        //отношение между датами - была ли одна раньше или позже другой - метода isBefore() &
        //isAfter()
        boolean before = LocalDate.now().isBefore(LocalDate.parse("2020-03-03"));
        boolean after = LocalDate.now().isAfter(LocalDate.parse("2020-03-03"));
        System.out.println(before);
        System.out.println(after);

        //Local  time
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        LocalTime sevenThirty = LocalTime.of(7, 30);
        System.out.println(sevenThirty);
        LocalTime eightForty = LocalTime.parse("08:40");
        System.out.println(eightForty);

        LocalTime nineForty = eightForty.plus(1, ChronoUnit.HOURS);
        System.out.println(nineForty);
        eightForty.plus(1, ChronoUnit.HOURS).plus(10, ChronoUnit.MINUTES);
        System.out.println();

        //LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(2022, Month.MARCH, 27, 12, 45);
        System.out.println(dateTime.plusDays(1));
        System.out.println(dateTime.minusHours(5));

        //  dateTime.get
        //ZonedDateTimeAPI - используется при работе с зональными датой и временем.
        ZoneId zoneId = ZoneId.of("Europe/Berlin");
        System.out.println("Berlin zone id is " + zoneId);

        Set<String> allZoneIDs = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIDs);
        System.out.println(ZonedDateTime.parse("2023-05-03T12:58:30+01:00[Europe/Paris]"));

    }
}
