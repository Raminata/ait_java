import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Есть ArrayList целых чисел. Написать метод, возвращающий сумму
        значений всех его элементов.*/
        List<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);

        int sum = sumArray(arrInt);
        System.out.println(sum);
    }

    public static int sumArray(List<Integer> x) {
        int sum = 0;
        for (Integer i : x) {
            sum += i;
        }
        return sum;
    }

}