import java.util.Scanner;

public class AustriaTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("What is your salary per year Brutto?");
        System.out.print("> \t");
        double salary = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("Do you own your own house or do you rent?");
        System.out.println("Press 1 - if you have own house\nPress 2 - if you rent");
        System.out.print("> \t");
        double choose = input.nextDouble();

        if (choose == 1) {
            System.out.println("You choose - OWN HOUSE");
        } else {
            System.out.println("You choose - I RENT");
        }


        int year = 12; //months
        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Rent per month?");
        System.out.print("> \t");
        double payRent = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Electricity per month?");
        System.out.print("> \t");
        double payEletricity = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Heating per month?");
        System.out.print("> \t");
        double payHeating = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Water per month?");
        System.out.print("> \t");
        double payWater = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for WI-FI per month?");
        System.out.print("> \t");
        double payWiFi = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Phone-packet per month?");
        System.out.print("> \t");
        double payPhone = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Food per month?");
        System.out.print("> \t");
        double payFoot = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Gym/Pool/Dance/Sport per month?");
        System.out.print("> \t");
        double payGym = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Insurance per month?");
        System.out.print("> \t");
        double payInsurance = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Entertaiment (party, restourants, clubs...) per month?");
        System.out.print("> \t");
        double payEntertaiment = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Utilites per month?");
        System.out.print("> \t");
        double payUtilites = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for U-bahn per year?");
        System.out.print("> \t");
        double payUBahn = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Zoo per year?");
        System.out.print("> \t");
        double payZoo = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Therme per year?");
        System.out.print("> \t");
        double payTherme = input.nextDouble();

        System.out.println("---------------------------------------------");
        System.out.println("What do you pay for Vacation per year?");
        System.out.print("> \t");
        double payVacation = input.nextDouble();

        System.out.println("Your salary Brutto " + salary);

        //Tax % per Salary
        double taxForSalary1 = 0;
        double taxForSalary2 = 0.20;
        double taxForSalary3 = 0.35;
        double taxForSalary4 = 0.42;
        double taxForSalary5 = 0.48;
        double taxForSalary6 = 0.50;
        double taxForSalary7 = 0.55;


        double totalTax = 0;
        // 90000 <= 11000
        if (salary <= 11000) {
            totalTax = (11000 * 0);
            System.out.println("Salary 11000 and below have: " + taxForSalary1);
        } else if (salary <= 18000) {
            totalTax = (11000 * 0) + ((salary - 11000) * 0.2);
            System.out.println("Salary from 11001 to 18000 have: " + taxForSalary2);
        } else if (salary <= 31000) {
            totalTax = (11000 * 0) + ((18000 - 11000) * 0.2) + ((salary - 18000) * 0.35);
            System.out.println("Salary from 18001 to 31000 have: " + taxForSalary3);
        } else if (salary <= 60000) {
            totalTax = (11000 * 0) + ((18000 - 11000) * 0.2) + ((31000 - 18000) * 0.35) + ((salary - 31000) * 0.42);
            System.out.println("Salary from 31001 to 60000 have: " + taxForSalary4);
        } else if (salary <= 90000) {
            totalTax = (11000 * 0) + ((18000 - 11000) * 0.2) + ((31000 - 18000) * 0.35) + ((60000 - 31000) * 0.42) + ((salary - 60000) * 0.48);
            System.out.println("Salary from 60001 to 90000 have: " + taxForSalary5);
        } else if (salary <= 1000000) {
            totalTax = (11000 * 0) + ((18000 - 11000) * 0.2) + ((31000 - 18000) * 0.35) + ((60000 - 31000) * 0.42) + ((90000 - 60000) * 0.48) + ((salary - 90000) * 0.50);
            System.out.println("Salary from 90001 to 1000000 have: " + taxForSalary6);
        } else if (salary > 1000000) {
            totalTax = (11000 * 0) + ((18000 - 11000) * 0.2) + ((31000 - 18000) * 0.35) + ((60000 - 31000) * 0.42) + ((90000 - 60000) * 0.48) + ((salary - 90000) * 0.50) + ((salary - 1000001) * 0.55);
            System.out.println("Salary above 1000000 have: " + taxForSalary7);
        }


        double netSalary = salary - totalTax;

        System.out.println("You need to pay tax per year " + totalTax);
        System.out.println("We have netSalary " + netSalary);
        double expense = ((payRent + payHeating + payWater + payEletricity + payWiFi + payGym + payGym + payFoot + payPhone + payUtilites + payInsurance + payEntertaiment) * year) + payUBahn + payZoo + payTherme + payVacation;
        System.out.println("Life expense " + expense);
        double saving = netSalary - expense;
        System.out.println("Saving " + saving);
    }
}