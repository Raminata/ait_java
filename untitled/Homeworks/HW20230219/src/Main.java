import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Есть лист стрингов, в котором длины всех элементов различны и он не пустой.
         * Написать метод, возврашающий элемент(строку), который встречается раньше в листе:
         * самый короткий или самый длинный.
         *
         * Пример: ["aa" "bbb" "cccc" "d" ] ->ответ cccc так как сссс самое длинное слово и
         * встречается раньше самого короткого слова d
         * ["aa" "d" "bbb" "cccc" ] ->ответ d, так как здесь d самое короткое слово и оно
         * встречается раньше самого длинного
         *
         * public static String findShortestOrLongest(Listlist)
         */
        List<String> listA = new ArrayList<>();

        listA.add("aa");
        listA.add("d");
        listA.add("bbb");
        listA.add("cccc");
        // listA.add("d");

        String shortestOrLongest = findShortestOrLongest(listA);
        System.out.println(shortestOrLongest);


    }

    public static String findShortestOrLongest(List<String> list) {
        String max = list.get(0);
        String min = list.get(0);
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            String currentElement = list.get(i);
            if (currentElement.length() > max.length()) {
                max = currentElement;
                maxIndex = i;
            }
            if (currentElement.length() < min.length()) {
                min = currentElement;
                minIndex = i;
            }
        }

        if (maxIndex < minIndex) {
            return max;
        } else {
            return min;
        }
    }
}