import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);

        LinkedList<String> result = yesOrNo(list1, list2);
        LinkedList<Integer> result2 = joinList(list1, list2);

        for (String i : result) {
            System.out.println(i);
        }

        for (Integer i : result2) {
            System.out.println(i);
        }
    }

    /**
     * Задача 1
     * Есть два списка одинаковой длины с целыми числами. Написать метод,
     * который возвращает список с элементами Yes или No, где значение на i-ом
     * месте зависит от того, равны ли элементы двух списков под номером i.
     * Например, [1,2,3,4] и [5,2,3,8] -> [No,Yes,Yes,No]
     * public static List yesOrNo(Listlist1,Listlist2)
     */
    public static LinkedList<String> yesOrNo(List<Integer> list1, List<Integer> list2) {
        LinkedList<String> result = new LinkedList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        return result;
    }

    /**
     * Задача 2 Написать метод, обьединяющий два списка целых чисел в один.
     * public static List joinTwoLists(List list1, List list2)
     */
    public static LinkedList<Integer> joinList(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }
}