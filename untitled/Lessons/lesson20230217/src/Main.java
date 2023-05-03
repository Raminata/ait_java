import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Mary");
        names.add("Andrew");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

        //посчитать сумму значений элементов листа целых чисел
        List<Integer> numbers = List.of(9, 8, 5);
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
            System.out.println(i);
        }
        System.out.println("enhanced For");
        for (int number : numbers) {
            System.out.println(number);
        }
        List<Integer> number = List.of(9, 8, 5, 8, 7);
        withoutElementsMoreThanN(number, 7);
        System.out.println(withoutElementsMoreThanN(number, 7));
    }

    /**
     * Написать метод, который вернет список без элементов больше заданного
     * [4, 1, 8, 9] если заданное число 8, то результат [4, 1, 8]
     * public static List <Integer> withoutElementsMoreThanN (List<Integer>input, int n)
     */
    public static List<Integer> withoutElementsMoreThanN(List<Integer> input, int n) {
        List<Integer> withoutMoreThan = new LinkedList<>();
        for (int number : input) {
            if (number <= n) {
                withoutMoreThan.add(number);
            }
        }
        return withoutMoreThan;

    }
    /** 2.Есть лист стрингов, в котором длины всех стрингов различны и он не пустой.
     Написать метод, возврашающий элемент(строку), который встречается раньше в
     листе: самый короткий или самый длинный

     List<String>=["aa" "bbb" "cccc" "d" ] -> cccc
     List<String>=["aa" "d" "bbb" "cccc" ] -> d
     */

}