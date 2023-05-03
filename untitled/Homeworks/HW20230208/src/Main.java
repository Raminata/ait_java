public class Main {
    public static void main(String[] args) {
        /*Задача 1 Написать метод, который находит количество четных элементов в
        массиве целых чисел. Метод должен принимать массив целых чисел в качестве
        параметра и возвращать это число.
public static int countEven( int[] numbers)
пример: {1,2,4,5,8}-> результат 3, т.к. в массиве 3 числа четные */
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = countEven(numbers);
        System.out.println("even count is " + sum);
        System.out.println("____________________");
        int[] ints = {4, 2, 5, 8};
        int dif = countDif(ints);
        System.out.println("diff is " + dif);
    }

    public static int countEven(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum++;
                System.out.println("Even numbers in array " + numbers[i]);
            }
        }
        return sum;
    }

    /*Задача 2 Дан массив целых чисел. Написать метод, возвращающий разность
    между наибольшим и наименьшим элементами массива.
public static int countDif(int[] ints)
пример: {4,2,5,8} -> результат 6, т.к. 8 (максимальный)- 2(минимальный)=6*/
    public static int countDif(int[] ints) {
        int max = ints[0];
        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            System.out.println("Element[" + i + "]=" + ints[i]);
            if (ints[i] > max) {
                max = ints[i];
            } else if (ints[i] < min) {
                min = ints[i];
            }
        }

        System.out.println("Max element is " + max);
        System.out.println("Min element is " + min);

        int dif = max - min;
        return dif;
    }
}