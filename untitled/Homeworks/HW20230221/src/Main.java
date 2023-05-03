import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         * Есть не пустой массив строк. Написать метод, возвращающий мапу Map
         * где каждая строка является ключом, а значением является true если
         * строка в массиве встречается больше одного раза и false если только
         * один раз.
         * Map mapStringBoolean( String[] strings)
         * Примеры:
         * [a,b,a,c,b] -> {a:true, b: true, c: false}
         *  [a,b,c,] -> {a:false, b: false, c: false}
         *  [c,c,c,] -> {c: true}
         */
        String[] map = {"a", "b", "c", "b", "c"};
        System.out.println(mapStringBoolean(map));

    }

    public static Map<String, Boolean> mapStringBoolean(String[] strings) {

        Map<String, Boolean> nameToBoolean = new HashMap<>();
        for (String s : strings) {
            if (nameToBoolean.containsKey(s)) {
                nameToBoolean.put(s, true);
            } else {
                nameToBoolean.put(s, false);
            }
        }
        return nameToBoolean;


    }
}