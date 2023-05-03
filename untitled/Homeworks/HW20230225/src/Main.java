import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Написать метод, который принимает список имен и их анаграмм и имя, по которому
         * он выдает список всех анаграмм этого имени, включая само имя
         * [vani, ivan, petr,terp,navi, maria],ivan -> vani,ivan,navi
         */
        List<String> names = List.of("vani", "ivan", "terp", "navi", "maria");

        System.out.println(anagramList("ivan", names));
        //System.out.println(anagramList("petr", names));
        //System.out.println(anagramList("maria", names));
        //System.out.println(anagramList("Nick", names));

    }

    public static List<String> anagramList(String name, List<String> strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strings) {
            String sortedKey = sortAnagram(s); //ainv
            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(name), Arrays.asList("No such name in the list"));
    }

    private static String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}