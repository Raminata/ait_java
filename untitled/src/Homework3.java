/*##  Homework
### Задание 1

Создайте массив нечетных чисел от 1 до 97.
После создания выведите все элементы массива в консоль.
После чего выведите этот же массив, но в обратном порядке.

### Задание 2

Создайте массив из строк (String), выведите его в консоль.
Элементы массив сделайте по образцу: {"Step 75", "Step 74", "Step 73",..., "Step 10", "Step 9"}
(Числа от 75 до 9 включительно).*/

public class Homework3 {

    public static void main(String[] args) {
        String[] a = new String[75-8];

        int index = 0;

        for(int i = 75 ; i >= 9 ; i--){
            a[index] = "Step " + i;
            index++;
        }

        for(int i = index-1 ; i >= 0 ; i--){
            System.out.println(a[i]);
        }

        System.out.println("----------------");

        for(int i = 0 ; i < index ; i++){
            System.out.println(a[i]);
        }
    }
}