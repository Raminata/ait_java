import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Задача2
 * Используя стримы написать метод, принимающий строку, состоящую из слов,
 * разделенных пробелом и букву и возвращающий количество слов, начинающихся с этой буквы.
 * long countWords (String input, String letter)
 * <p>
 * пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 ,
 * т.к. слово, начинающееся на a встречается 4 раза
 */

public class Main {
    public static void main(String[] args) {
        long a = countWords("aaa ffff aa bbbb a bb aaa gggggggggggggg", "a");
        System.out.println(a);

    }

    public static long countWords(String input, String letter) {
        String[] list = input.split(" ");
        //Stream.of(input.split(" "));
        return Arrays
                .stream(list)
                .filter(s -> s.startsWith(letter))
                .count();


    }
}
