import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * 1- Написать метод, копирующий все элементы из одной мапы в другую мапу
         * 2.Написать метод, проверяющий содержит ли мапа
         * Map<Integer,String> заданный элемент
         * 3. Написать, метод проверяющий содержит ли мапа данный ключ
         * 4. Написать, метод проверяющий содержит ли мапа данное значение
         * 5** Написать метод, который принимает список имен и их анаграмм и имя, по которому  он выдает
         * список всех анаграмм этого имени, включая само имя
         * [vani, ivan, petr,terp,navi, maria],ivan -> vani,ivan,navi
         */
        Map<Integer, String> friendsMap1 = new HashMap<>();
        Map<Integer, String> friendsMap2 = new HashMap<>();
        friendsMap1.put(1, "Raminata");
        friendsMap1.put(2, "Marko");
        friendsMap1.put(3, "Bola");
        friendsMap1.put(4, "Umita");
        System.out.println(friendsMap1);
        friendsMap2.put(4, "Raminata");
        friendsMap2.put(5, "Betul");
        friendsMap2.put(6, "Attila");
        friendsMap2.put(7, "Janna");
        System.out.println("map2: " + friendsMap2);

        System.out.println(copyMap(friendsMap1, friendsMap2));
        boolean hasValue = friendsMap1.containsValue("Raminata");
        System.out.println(hasValue);
        if (friendsMap1.isEmpty()) {
            System.out.println("Is empty");
        } else {
            System.out.println(friendsMap1);
        }

    }
    public static Map<Integer, String> copyMap(Map<Integer, String> mapA, Map<Integer, String> mapB) {
        mapB.putAll(mapA);
        return mapB;
    }
}