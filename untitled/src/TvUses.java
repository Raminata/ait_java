/* ### Easy - 1

- The TV uses 1200W per hour.
- 1 hour has 60 minutes.
- You watch per day 2 hours and 30 minutes the TV.
- Write a program which will print:
    - How many hours per year you watch the tv?
    - How much electricity do you use per year watching the tv? */

import java.util.Scanner;

public class TvUses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("How many minutes per day do you watch the TV?:");
        System.out.print("> \t");
        int perDayHoursWatch = input.nextInt();
        int tvUses = 1200;
        int oneHour = 60;
        System.out.println("You watch per day " + perDayHoursWatch + " min TV");
        double perYearWatchMin = perDayHoursWatch * 365;
        double watchHour = perYearWatchMin / oneHour;
        System.out.printf("Per year you watch the TV %.2f  hour \n", watchHour);
        double electricityUse = watchHour * tvUses;
        double eletricity = electricityUse / 1000;
        System.out.println("Per year you use electricity " + eletricity + " kWh");
    }
}