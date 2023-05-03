import java.util.Scanner;

public class Victorina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создали объект класса сканер

        System.out.println("Какого цвета небо? \n");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("голубого")) {
            System.out.println("правильно");
        }  else {
            System.out.println("неправильно");
        }

        System.out.println("Введите сколько месяцев в году");
        int answer1 = sc.nextInt();
        if (answer1 == 12) {
            System.out.println("правильно");
        }  else {
            System.out.println("неправильно");
        }

        System.out.println("Напишите любимый фрукт обезьян");
        sc.nextLine();
        String answer3 = sc.next();
        if (answer3.equalsIgnoreCase("банан")) {
            System.out.println("правильно");
        }  else {
            System.out.println("неправильно");
        }

        System.out.println("Введите цену кг банана в Lidl");
        double number2 = sc.nextDouble();
        if (number2 == 1.99) {
            System.out.println("правильно");
        }  else {
            System.out.println("неправильно");
        }

        System.out.println("Что для вас ближе true/false");
        boolean bool1 = sc.nextBoolean();
        if (bool1 == true) {
            System.out.println("правильно");
        }  else {
            System.out.println("false");
        }


    }
}



