package list.tasks.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTasks {
    //Есть лист с именами. Написать метод возв-ий лист без имен длиной 4 символа
    public List<String> removeNamesLength(List<String> names) {
        List<String> res = new ArrayList<>();
        for (String name : names) {
            if (name.length() != 4) res.add(name);
        }
        return res;
    }

    /**
     * Есть два списка одинаковой длинны с целыми числами. Написать метод, который
     * возвращает список с элементами Yes или No, где значение на I-том месте зависит
     * от того , равны ли элементы двух списков под номер i
     * [2,  4,   6, 8]
     * [5,  4,   6, 9]
     * [No Yes Yes No]
     */
    public List<String> compareYesNo(List<Integer> ints1, List<Integer> ints2) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < ints1.size(); i++) {
            if (ints1.get(i) == ints2.get(i))
            res.add("Yes");
            else
            res.add("No");
        }
        return res;
    }
    public List<Integer> reversed (List<Integer> ints){
        Collections.reverse(ints);
        return ints;
    }
}
