import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Задача 1 С помощью цикла For написать метод, возвращаюший сумму всех
        четных целых чисел от 1 до заданного числа n */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number >> ");
        int n = scanner.nextInt();
        System.out.println("Even number sum " + sum(n));
        System.out.println("-------------------------");
        multiplyTable();
        multiplyTableAsTable();

    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /*Задача 2(*) С помощью вложенного цикла For (цикл в цикле) вывести на экран
таблицу умножения */
    public static void multiplyTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("-------------------------------");
        }
        System.out.println("***********************************");
    }

    public static void multiplyTableAsTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("***********************************");
    }
}