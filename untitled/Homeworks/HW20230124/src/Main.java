import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("Hi!");
        String s = scanner.nextLine();
        System.out.println(s);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name, pleas >> ");
        String str1 = scanner1.nextLine();
        System.out.println("Your name is: " + str1);
        //scanner1.close();
        //scanner.close();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your lastname >> ");
        String lastname = scanner2.nextLine();
        System.out.println("your lastname is: " + lastname);
        System.out.println("Enter your age >> ");
        int age = scanner2.nextInt();
        System.out.println("age: " + age);
        //scanner2.close();
    }
}