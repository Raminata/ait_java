/*Homework

### Задание 3 (дополнительное)

Создайте метод, который бы наполнял любой массив произвольной
длинны случайными целыми значениями. (Метод работает только с массивами чисел)*/

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("___________________");
        System.out.print("> \t");
        int x = input.nextInt();

        int[] arr = new int[x];

        fillArrayRandom(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void fillArrayRandom(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (0 + Math.random() * (100 - 0 + 1));
        }
    }
}