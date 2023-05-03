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

public class MarkoZadaca2A {
    public static void main(String[] args) {
        double pcUses = 0.5;  //kWh in a hour
        int oneHour = 60;  //min
        int pcUseDay = 10;   //hours per Day
        int pcUseNight = 4;  //hours per Night
        double priceDay = 0.233;  //The price for electricty Day
        double priceNight = 0.311;  //The price for electricty Night
        int onekWh = 1000;  //1 kWh = 1000 W

        //How many hours per year you use the pc?
        int pcUse = pcUseDay + pcUseNight;  //PC use per Day and Night
        int pcUsePerYear = pcUse * 365;  //PC use per Year in hours
        System.out.println("You use PC per year " + pcUsePerYear + " hours");

        //How much eletricty do you use per year using the pc?
        double eletrictyUse = pcUses * pcUsePerYear;
        System.out.println("You use eletricty per year for PC " + eletrictyUse + " kWh");

        //How much you pay per year for eletricty if using the PC?
        int pcUseDayPerYear = pcUseDay * 365;  //hours day per year
        int pcUseNightPerYear = pcUseNight * 365;  //hours night per year
        double priceDayEletricityDay = pcUseDayPerYear * priceDay;  //price for day per year
        double priceDayEletricityNight = pcUseNightPerYear * priceNight;  //price for night per year
        double payEletricity = priceDayEletricityDay + priceDayEletricityNight / 1000;
        System.out.println("You pay eletricity per year " + payEletricity + " Euro");

    }
}