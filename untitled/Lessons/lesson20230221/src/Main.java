import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Map
        Map map = new HashMap();
        //HashMap<K,V> = new HashMap<K,V>();
        HashMap<Integer, String> ourMap = new HashMap<>();
        //добавление элементов в мапу. метод.put()
        ourMap.put(10, "Red");
        ourMap.put(5, "Green");
        ourMap.put(20, "Yellow");
        ourMap.put(21, "Brown");
        System.out.println(ourMap);
        ourMap.put(null, "Black");
        System.out.println(ourMap);

        //поучить элемент по ключу. метод .get()
        System.out.println("element with key = 5 is " + ourMap.get(5));

        String result = ourMap.get(5);
        System.out.println(result);

        //получить значение или вернуть заранее отпределенное нами значние по
        // умолчанию  .getOrDefault()

        System.out.println(ourMap.getOrDefault(17, "Pink"));
        System.out.println(ourMap.getOrDefault(20, "Pink"));

        //проверить существование ключа в мапе .containsKey()
        System.out.println(ourMap.containsKey(10));
        System.out.println(ourMap.containsKey(18));

        //проверить наличие значения в мапе  .containsValue()
        boolean hasValue = ourMap.containsValue("Green");
        System.out.println(hasValue);

        hasValue = ourMap.containsValue("Pink");
        System.out.println(hasValue);

        hasValue = ourMap.containsValue("green");
        System.out.println(hasValue);
        System.out.println(ourMap);
        ourMap.remove(null);

//перебор по ключам мапы в цикле
        System.out.println("our map values in the loop:");
        for (int key : ourMap.keySet()) {
            System.out.println(ourMap.get(key));
        }
        for (int key : ourMap.keySet()) {
            System.out.println("Key is " + key + " and value is " + ourMap.get(key));
        }
        //перебор по знаечениям в цикле
        System.out.println("our map values by values in the loop");
        for (String value : ourMap.values()) {
            System.out.println(value);
        }
        //удаление по ключу .remove()
        System.out.println("ourMap before remove " + ourMap);
        ourMap.remove(5);
        System.out.println("ourMap after remove " + ourMap);

        //даление всех значений .clear()
        //заменить значение по ключу .replace()
        ourMap.put(20, "Brown");
        System.out.println(ourMap);

        ourMap.replace(20,"Orange");
        System.out.println(ourMap);

        ourMap.put(80, "White");
        ourMap.put(81, null);
        System.out.println(ourMap);
        ourMap.replace(90, "Purple");
        System.out.println(ourMap);

        //получить кол-во элементов в мапе .size()
        int entryCount = ourMap.size();
        System.out.println("map size is " + entryCount);

        //проверить пустая ли мапа .isEmpty()
        System.out.println("is our map is empty? " + ourMap.isEmpty());
        ourMap.clear();
        System.out.println("is our map is empty? " + ourMap.isEmpty());
        System.out.println(ourMap);

        //TreeMap example
        TreeMap<Integer, String>treeMap = new TreeMap<>();
        treeMap.put(2,"Value1");
        treeMap.put(1,"Value1");
        treeMap.put(100,"Value1");
        treeMap.put(23,"Value1");
        treeMap.put(9,"Value1");
        System.out.println(treeMap);

        Map<String, String>mapAB = new HashMap<>();
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        System.out.println(ab(mapAB));

    }
    /**
     * /Дана Map<String,String>map написать метод, который вернет мапу, такую
     * что если в исходной мапе есть ключи "a" и "b", то нужно создать новый
     * элемент с ключом "ab" и с суммой значений  от ключей a и b
     * в качестве значения. Если таких ключей нет, то ничего не менять
     * AB {"a":"Hi" , "b": "There"} -> {"a":"Hi", "ab":"HiThere", "b":"There"}
     * AB {"a":"Hi"} ->  {"a":"Hi"}
     * AB {b:There} -> {b:There}
     */
    public static Map<String, String> ab(Map<String, String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            String key = "ab";
            String value = mapAB.get("a").concat(mapAB.get("b"));

            mapAB.put(key, value);
        }
        return mapAB;
    }
}