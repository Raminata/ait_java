import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW {
    public static void main(String[] args) throws IOException {
        start();
    }
    public static void start() throws IOException {
        DayOfWeek dayOfWeek = readDayOfWeek();
        System.out.println("It is " + isDayOff(dayOfWeek));
    }
    private static DayOfWeek readDayOfWeek() throws  IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter day of week > ");
        String day = br.readLine();
        DayOfWeek enumDay = DayOfWeek.valueOf(day.toUpperCase());
        return enumDay;
    }
    private static boolean isDayOff (DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default: return false;
        }
    }
}
