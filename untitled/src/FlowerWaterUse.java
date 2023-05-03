import java.util.Scanner;

public class FlowerWaterUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("how often per week do you water the flowers?:");
        System.out.print("> \t");
        int tames = input.nextInt();

        System.out.println("how many flowers do you have?:");
        int flower = input.nextInt();

        System.out.println("how many ml water do you user per flower ?:");
        double flowerWater = input.nextDouble();

        int weeks = 52;
        int amount = weeks * tames;

        System.out.println("This is " + amount + " watering amount ");
        double flowerWaterUse = flower * flowerWater;
        System.out.println("One watering needs " + flowerWaterUse + " ml for " + flower);
        double waterYear = amount * flowerWaterUse;
        System.out.println("Flower use per year " + waterYear + " ml");
        if (waterYear > 50000) {
            System.out.println("Too mach water use");
        }
        double waterCost = 0.00192;
        double oneLiter = 1000;
        System.out.println("One liter is " + oneLiter);
        System.out.println("One liter cost " + waterCost);
        double waterMoneyLose = (waterYear / oneLiter) * waterCost;
        System.out.println("You pay per year " + waterMoneyLose);

    }
}