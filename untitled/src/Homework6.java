/*Homework

### Задание 1

Создайте массив из 37 элементов. Заполните его случайными числами
(из диапазона от 3 до 19 включительно).
Выведите массив на печать.*/

public class Homework6 {
    public static void main(String[] args) {
        int[] arr = new int[37];
        // massive ide od 0 ......36  potomu mora biti < 37 36 < 37  ak stavis <= 37 onda exception
        for (int i = 0; i < arr.length; i++) {
            createRandomNumber(arr, i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr[" + i + "] = " + arr[i]);
        }
    }
    public static void createRandomNumber(int[] arr, int pos) {
        int max = 19;
        int min = 3;
        int y = (int) (min + Math.random() * (max - min + 1));
        arr[pos] = y;
        System.out.print(y + "\t");
    }
}