/* ### Hard - 1

- The magic coffee machine has storage for
    - 1200 g of coffee beans
    - 2.8 L of water
    - 425 mL of milk
    - 1000 g of waste
- Coffee machine can make 3 drinks
    - Espresso
    - Coffee
    - Cappuccino
- Coffee machine also has option for
    - Make Single (x 1)
    - Make Double (x 2)
- In order to make a Single dose of Espresso, machine will
    - Needs 80g coffee
    - Needs 100 ml water
    - Needs 0 ml of milk
    - Makes 180 g of waste
- In order to make a Single dose of Coffee, machine will
    - Needs 120 g coffee
    - Needs 250 ml water
    - Needs 50 ml of milk
    - Makes 370 g of waste
- In order to make a Single dose of Cappuccino, machine will
    - Needs 120g coffee
    - Needs 300 ml water
    - Needs 200 ml of milk
    - Makes 420 g of waste
- Write a program which will print:
    - How much of items is there left after making a Double Espresso?
        - xxx g of coffee beans
        - xxx ml of water
        - xxx ml of milk
        - xxx g of waste
    - If there is more then 500g of waste, print ”Clean me” */

import java.util.Scanner;

public class CoffeeMashine {
    public static void main(String[] args) {
        double coffeeBeans = 1200;  //machine has 1200 g of coffee beans
        double water = 2800;
        double milk = 425;
        double waste = 1000;

        // user option
        Scanner input = new Scanner(System.in);

        System.out.println("\nI'm a magic coffee machine :)\nPlease choose which coffee you want:");
        System.out.println("1 - Espresso\n2 - Black coffee\n3 - Cappuccino");
        int coffeeOptions = input.nextInt();

        System.out.println("What dose coffee do you want?");
        System.out.println("1 - Single\n 2 - Double");
        int doseOptions = input.nextInt();


        double coffeeUsed = 0;
        double milkUsed = 0;
        double wasteUsed = 0;
        double waterUsed = 0;


// In order to make a Single dose of Espresso, machine will

        System.out.print("You choose ");
        if (doseOptions == 2) {
            System.out.print("Single ");
        } else if (doseOptions == 2) {
            System.out.print("Double ");
        }


        if (coffeeOptions == 1) {
            System.out.print("Espresso\n");
            coffeeUsed = 80 * doseOptions;
            milkUsed = 0 * doseOptions;
            wasteUsed = 180 * doseOptions;
            waterUsed = 100 * doseOptions;
        } else if (coffeeOptions == 2) {
            System.out.println("You choose Coffee");
            coffeeUsed = 120 * doseOptions;
            milkUsed = 50 * doseOptions;
            wasteUsed = 370 * doseOptions;
            waterUsed = 250 * doseOptions;
        } else if (coffeeOptions == 3) {
            System.out.println("You choose Cappuccino");
            coffeeUsed = 120 * doseOptions;
            milkUsed = 200 * doseOptions;
            wasteUsed = 420 * doseOptions;
            waterUsed = 300 * doseOptions;
        }

        double coffeeRes = coffeeBeans - coffeeUsed;
        System.out.println("Coffee has left " + coffeeRes);
        double milkRes = milk - milkUsed;
        System.out.println("Milk has left " + milkRes);
        double wasteRes = 0 + wasteUsed;
        System.out.println("Waste has left " + wasteRes);
        double waterRes = water - waterUsed;
        System.out.println("Water has left " + waterRes);

        if (wasteRes >= 500) {
            System.out.println("Clean me");
        }
    }

}
