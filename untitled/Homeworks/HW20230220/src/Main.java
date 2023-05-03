
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /**
         * Написать метод, проверяющий что в слове все буквы уникальные
         * (не повторяются). Строка состоит только из букв, без пробелов.
         * При решении использовать HashSet.
         * public static boolean isUnique (String word)
         * Hello -> false
         * World -> true
         */
        List<String> words = new ArrayList<>(List.of("H", "e", "l", "l", "o"));
        System.out.println("Hello " + isUnique(words));
    }

    public static boolean isUnique(List<String> word) {
        Set<String> set = new HashSet<>(word);
        return word.size() == set.size();
    }
}