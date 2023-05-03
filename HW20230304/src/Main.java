import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /**
         * Дана Map map, написать метод, который вернет мапу, такую, что если в
         * исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
         * с суммой значений от ключей a и b в качестве значения. Если нет, ничего
         * не менять
         * Примеры:
         * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
         * mapAB({"a": "Hi"}) → {"a": "Hi"}
         * mapAB({"b": "There"}) → {"b": "There"}
         *
         * Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где
         * каждая строка является ключем, а значением является true если строка в
         * массиве встречается больше одного раза и false, если только один раз.
         * Примеры:
         * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
         * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
         * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
         *
         * Дан список имен, где некоторые имена повторяются. Написать метод,который
         * по имени вернет количество вхождений этого имени в список.
         * Пример: nameToNumberOccurence(List list, String name)
         * Vasia -> 3
         */
        Map<String, String> res1 = mapAB(Map.of("a", "Hi", "b", "There"));
        Map<String, String> res2 = mapAB(Map.of("a", "Hi"));
        Map<String, String> res3 = mapAB(Map.of("b", "There"));

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        Map<String, Boolean> res4 = wordMultiple(new String[]{"a", "b", "a", "c", "b"});
        Map<String, Boolean> res5 = wordMultiple(new String[]{"c", "b", "a"});
        Map<String, Boolean> res6 = wordMultiple(new String[]{"c", "c", "c", "c"});

        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);

        int res7 = nameToNumberOccurence(List.of("Vasia", "Maria", "Vasia", "Katia", "Vasia"), "Vasia");
        System.out.println(res7);
    }

    /**
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"}
     * mapAB({"b": "There"}) → {"b": "There"}
     */
    public static Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        if (map.containsKey("a") && map.containsKey("b")) {
            copy.put("ab", map.get("a") + map.get("b"));
        }

        return copy;
    }

    /**
     * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
     * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
     * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    /**
     * Vasia -> 3
     */
    public static int nameToNumberOccurence(List<String> list, String name) {
        int count = 0;
        for (String s : list) {
            if (s.equals(name)) {
                count++;
            }
        }
        return count;
    }

}


