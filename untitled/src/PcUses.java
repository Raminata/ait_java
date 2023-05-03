/* Medium - 1
- The PC uses 500W per hour.
- 1 hour has 60 minutes.
- You use the PC for 10 hours in the morning.
- You use the PC for 4 hours in the night.
- The price for electricty is 0.311 for 1 kWh for night.
- The price for electricty is 0.223 for 1 kWh for day.
- 1 kWh = 1000 W
  Write a program which will print:
    - How many hours per year you use the pc?
    - How much eletricty do you use per year using the pc? */

import java.util.Scanner;

public class PcUses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("How many minutes  in the morning do you uses the PC?:");
        System.out.print("> \t");
        int pcUseDay = input.nextInt();

        System.out.println("---------------------------------------------");
        System.out.println("How many minutes  in the EVENING do you uses the PC?:");
        System.out.print("> \t");
        int pcUseNight = input.nextInt();

        int pcUses = 500;
        int oneHour = 60;
        double priceElectricityDay = 0.223;
        double priceElectricityNight = 0.311;
        int onekWh = 1000;
        int useHours = pcUseDay + pcUseNight;
        int useHoursPerYearDay = pcUseDay * 365;
        int useHoursPerYearNight = pcUseNight * 365;
        int hoursPerYear = useHours * 365;
        System.out.println("Per year you use the PC " + hoursPerYear + " hours");
        double kWhPcUses = pcUses * hoursPerYear;
        System.out.println("You use per year eletricity for PC " + kWhPcUses + " kWh");
        double payForDay = useHoursPerYearDay * priceElectricityDay;
        double payForNight = useHoursPerYearNight * priceElectricityNight;
        double pay = payForDay + payForNight;
        System.out.println("You pay per year eletricity for PC " + pay);


    }
}