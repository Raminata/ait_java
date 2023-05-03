package arrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
    public  static  void  main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        Character[] chars = {'H', 'E', 'A'};
        printArray(ints);
        System.out.println();
        printArray(chars);

        //ArrayList
        ArrayList<Integer> listInt = new ArrayList<>();
        List<Integer> listInt1 = new ArrayList<>(); //так писать ПРАВИЛЬНЕЕ!
        List<String> listNames = new ArrayList<>();
        List<Boolean> listBool = new ArrayList<>();
        //ArrayList methods:
        //add() - adds element at the end of the list
        listNames.add("Raminata");
        listNames.add("Marko");
        listNames.add("Bola");
        listNames.add("Umita");
        System.out.println(listNames);
        System.out.println("----------------");

        //add (3(index), "Raminata"(name)) This adds "Raminata" at  the fourth position
listNames.add(3,"Ramina");
        System.out.println(listNames);
        System.out.println("----------------");

        //set(index, "name") - changes element's value at index
        listNames.set(3,"Raminata");
        System.out.println(listNames);

        //remove() - removes element - удаляет элемент
        listNames.remove(2); //removed by index
        System.out.println(listNames);
        listNames.remove("Raminata"); //removed by name
        System.out.println(listNames);
        System.out.println("---------------");

        listNames.add("Gregor Clegane");
        listNames.add("Tyrion Lannister");
        for (String name : listNames) {
            System.out.println(name);

            //size() - arrayList size
            int size = listNames.size();
            System.out.println("list names size is " + size);

            //get() = get element by index
            String lannister = listNames.get(4);
            System.out.println(lannister);
            System.out.println("-----------------");

            for (int index = 0; index < listNames.size(); index++) {
                System.out.println(listNames.get(index));
            }
            //indexOf() - gives index by element's name or -1 if the element does not exist
            int indexRaminata = listNames.indexOf("Raminata"); //finds index "Raminata"
            System.out.println("index Raminata is " + indexRaminata);

            int indexNonExist = listNames.indexOf("Andrew");
            System.out.println("the name does not exist " + indexNonExist);

            /*contains() - проверяет существует ли данные обьект в списке. Если да,
            возвращает true if not false */
            boolean raminataIsPresent = listNames.contains("Raminata");
            System.out.println(raminataIsPresent);
        }

    }
    /*
    * Классы оберстки
    * int -> Integer
    * long -> Long
    * boolean -> Boolean
    * */
    //Generics
    public static <E> void printArray (E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
        System.out.println("----------------");
    }
}
