public class Main {
    public static void main(String[] args) {
        /*Задача 1. Написать программу, выводящую на экран результат
        деления двух целых чисел 25 и 3. Результат не должен быть
        округлен до целых. Посчитать также остаток от деления этих чисел.*/

        int a = 25;
        int b = 3;
        double sum = (double) a / b;
        System.out.println(sum);
        int sum1 = a % b;
        System.out.println(sum1);

         /*Задача 2. Написать программу, выводящую на экран значение
         переменной типа инт в квадрате. Предварительно обьявите эту
         переменную и задайте ее значение.*/

        int x = 8;
        int square = x * x;
        System.out.println("Square " + square);

    }
}