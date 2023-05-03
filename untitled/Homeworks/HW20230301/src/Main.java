
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week only 3 letters -> ");
        String dayWeek = scanner.next().toLowerCase(); // user enter text
        DayOfWeek enumWeek = getWeekdayForString(dayWeek); // text to enum
        boolean isWeekendDay = isWeekendDay(enumWeek);
        System.out.println(isWeekendDay);
    }

    public static boolean isWeekendDay(DayOfWeek enumWeek) {
        System.out.println(enumWeek.name());
        switch (enumWeek) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    public static DayOfWeek getWeekdayForString(String s) {
        switch (s) {
            case "mon":
                return DayOfWeek.MONDAY;
            case "tue":
                return DayOfWeek.TUESDAY;
            case "wed":
                return DayOfWeek.WEDNESDAY;
            case "thu":
                return DayOfWeek.THURSDAY;
            case "fri":
                return DayOfWeek.FRIDAY;
            case "sat":
                return DayOfWeek.SATURDAY;
            case "sun":
                return DayOfWeek.SUNDAY;
            default:
                throw new IllegalArgumentException();
        }
    }
}