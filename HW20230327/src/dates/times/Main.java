package dates.times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Получить и вывести на экран:
 * -текущую дату
 * -текущий год, месяц и день
 * Создать дату , например день рождения и вывести на экран
 * Создать две даты и проверить на равенство
 * Получить и вывести на экран текущее время
 * текущее время + 3 часа
 * Создать дату на неделю позже сегодняшней
 * Создать дату, которая была на год раньше сегодняшней используя метод minus
 * Создать дату на год позже сегодняшней используя plus метод
 * Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 * *Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий
 * количество дней между самой ранней и поздней датами
 */
public class Main {
    public static void main(String[] args) {
        //-текущую дату
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //-текущий год, месяц и день
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());


        //Создать дату , например день рождения и вывести на экран
        LocalDate myBirthday = LocalDate.parse("1991-01-01");
        System.out.println(myBirthday);

        //Создать две даты и проверить на равенство
        boolean comparison = LocalDate.now().equals(LocalDate.parse("2023-03-26"));
        System.out.println(comparison);

        //Получить и вывести на экран текущее время
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        //текущее время + 3 часа
        LocalTime time = LocalTime.now().plusHours(3);
        System.out.println(time);

        //Создать дату на неделю позже сегодняшней
        LocalDate oneWeekAgo = LocalDate.now().minusWeeks(1);
        System.out.println(oneWeekAgo);

        //Создать дату, которая была на год раньше сегодняшней используя метод minus
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        System.out.println(oneYearAgo);

        //Создать дату на год позже сегодняшней используя plus метод
        LocalDate oneYearPlus = LocalDate.now().plusYears(1);
        System.out.println(oneYearPlus);

        //Создать даты tomorrow и yesterday и проверить находятся ли они до или
        // после сегодняшней
        LocalDate yesterday = LocalDate.now().minus(1, ChronoUnit.DAYS);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        boolean before = yesterday.isBefore(LocalDate.now());
        boolean after = tomorrow.isAfter(LocalDate.now());
        System.out.println(before);
        System.out.println(after);

        //Написать метод, принимающий лист из нескольких дат типа LocalDate и
        // возвращающий количество дней между самой ранней и поздней датами
        List<LocalDate> listDate = new ArrayList<>();
        listDate.add(LocalDate.of(2022, 1, 5));
        listDate.add(LocalDate.of(2022, 1, 1));
        listDate.add(LocalDate.of(2022, 1, 7));
        listDate.add(LocalDate.of(2022, 1, 6));
        listDate.add(LocalDate.of(2022, 1, 10));

        long diffDay = calculateDayDiff(listDate);
        System.out.println(diffDay);
    }

    private static long calculateDayDiff(List<LocalDate> listDate) {
        LocalDate first = listDate.get(0);
        LocalDate last = listDate.get(0);

        for (LocalDate d : listDate) {
            if (d.isBefore(first)) {
                first = d;
            }

            if (d.isAfter(last)) {
                last = d;
            }
        }

        return ChronoUnit.DAYS.between(first, last);
    }
}