
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*написать программу, принимающую с клавиатуры 2 числа и выводящую их на экран
        // c переставленными местами значениями
        //int  num1 = 10
        // int num2 = 5
        //.........
        //  на выходе должно быть : num1=5  num2 = 10*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 >>");
        int num1 = scanner.nextInt();
        System.out.println("you entered num1 as " + num1);
        System.out.println("Enter num2 >>");
        int num2 = scanner.nextInt();
        System.out.println("you entered num2 as " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("and now num1 is " + num1 + " and num2 is " + num2);

        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("now x is " + x + " and y is " + y);

    }
}