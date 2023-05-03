import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Найти и вывести на экран сумму двух целых чиселб значение которых
        выводятся с клавиатуры */
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter first number >> ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number >>");
        int num2 = scanner.nextInt();
        System.out.println("The sum of two numbers is " + (num1 + num2));*/

        /* 2. написать программу, которая находит площадь и периметр круга,
        радиус вводится с клавиатуры
        perimetr = 2*PI*radius
        area = pi radius^2 */
        /*System.out.println("Enter radius >>");
        int radius = scanner.nextInt();
        double perimetr = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("for radius " + radius + " perimetr is "
                + perimetr + " and area is " + area);*/

        // 3.найти минимальное из двух чисел, введенных с клавиатуры
        // без учета знака
        // (использовать методы  класса Math)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int min = Math.min(absA, absB);
        System.out.println(min);

    }
}