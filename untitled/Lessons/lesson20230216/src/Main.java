import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new LinkedList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        //LinkedList methods
        //add element to LinkedList
        stringLinkedList.add("Jim");
        System.out.println(stringLinkedList);

        //addFirst - добавляет элемент последним в списке
        stringLinkedList.addLast("Carl");
        System.out.println(stringLinkedList);

        //add(index, "Steve") - добавляет элемент по индексу
        stringLinkedList.add(1, "Rick");
        System.out.println(stringLinkedList);
        stringLinkedList.add(0, "Megan");
        System.out.println(stringLinkedList);

        //Removing elements from LinkedList
        //removing first element
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println(stringLinkedList);

        //remove by index
        stringLinkedList.remove(1);
        stringLinkedList.remove("Jim");
        System.out.println(stringLinkedList);

        //addAll - adds all elements of the specified list to our list
        List<String> namesToAdd = new LinkedList<>();
        namesToAdd.add("Jack");
        namesToAdd.add("Clara");
        System.out.println(namesToAdd);

        stringLinkedList.addAll(namesToAdd);
        System.out.println(stringLinkedList);

        //adds all elements of the specifide list to our list from specified index
        List<String> moreToAdd = List.of("Andrew", "Tom");
        stringLinkedList.addAll(1, moreToAdd);
        System.out.println(stringLinkedList);

        //clear all elements of list
        System.out.println("namesToAdd before clear " + namesToAdd);
        namesToAdd.clear();
        System.out.println("namesToAdd after clear " + namesToAdd);

        //remove() removes 0 element
        stringLinkedList.remove();
        System.out.println(stringLinkedList);

        //contains(item) checks if the given item is present in our list
        boolean isPresent = stringLinkedList.contains("Clara");
        System.out.println(isPresent);

        //get element by index
        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(1));
        stringLinkedList.add("Andrew");
        stringLinkedList.add("Michael");
        System.out.println(stringLinkedList);

        //remove methods
        //remove() - removes the first element in the list
        //remove(int index) - removes the element by specified index
        //remove(name) - removes the specified element
        stringLinkedList.remove("Clara");
        System.out.println(stringLinkedList);

        //set() - updates the element at the specified index witch the given volue
        stringLinkedList.set(2, "Mary");
        System.out.println(stringLinkedList);

        //size() _ returns the number of element in the list
        System.out.println(stringLinkedList.size());

        /*Есть список с именами Jack, Andrew, Michael, Klara, John.
        Написать метод, который вернет список, в котором не содержатся имена
        исходного списка длиной 4
        [Jack, Andrew, Michael,John, Klara]  -> [Andrew, Michael, Klara] */

        List<String> list = List.of("Jack", "Andrew", "Michael", "John", "Klara");
        System.out.println(list);
    }

    public static List<String> removesNamesLength4(List<String> list) {
        List<String> result = new LinkedList<>();
        for (String s : list) {
            if (s.length() != 4) {
                result.add(s);
            }
        }
        return result;
    }

}