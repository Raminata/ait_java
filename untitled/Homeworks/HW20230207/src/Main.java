import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        /*Написать метод, выводящий на экран все четные числа в диапазоне от 1
        до 10 с использованием цикла for и оператора continue */
        evenNumbers(10);
        triangle(6);
    }

    public static void evenNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*************************");
    }

/*Задача 2()*
Написать метод, выводящий на экран треугольник из 6 строк такого вида:
1
22
333
4444
55555
666666 */

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}