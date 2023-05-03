/*##  Homework
### Задание 1

Создайте массив нечетных чисел от 1 до 97.
После создания выведите все элементы массива в консоль.
После чего выведите этот же массив, но в обратном порядке.

### Задание 2

Создайте массив из строк (String), выведите его в консоль.
Элементы массив сделайте по образцу: {"Step 75", "Step 74", "Step 73",..., "Step 10", "Step 9"}
(Числа от 75 до 9 включительно).*/

public class Homework2 {

    public static void main(String[] args) {
        //
        int[] numbers = new int[49];

        // we have manual index which tracks where we are with array
        // 0 1 2 3
        int index = 0;

        // we have for loop (i) which goes trough all numbers from 1 - 97
        for (int i = 0; i < 97; i++) {
            // if odd
            if (i % 2 != 0) {
                // add number to index position of array
                numbers[index] = i;
                // increase the manual tracking index
                index++; // <-------------------------------------------- LINE 30
            }
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("---------------------------------");

        // we have to start from index where we stopped ( example 47) and we have to
        // redeuce it by 1 because we did NOT USE the last index // check line 30
        // and we go from 47 to 0 INCLUDING 0
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}