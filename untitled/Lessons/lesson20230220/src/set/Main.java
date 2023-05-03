package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //SET - множество
        //HashSet

        //HashSet methods
        //.add()
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Yellow");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red");
        System.out.println(hashSet);

        boolean isAdded = hashSet.add("Brown");
        System.out.println(isAdded);
        isAdded = hashSet.add("Brown");
        System.out.println(isAdded);
        System.out.println(hashSet);

        //forEach
        for (String str : hashSet) {
            System.out.println(str);
        }

        //.remove()
        hashSet.remove("Brown");
        System.out.println(hashSet);

        //.clear()
        //hashSet.clear();

        //.size()
        System.out.println(hashSet.size());

        //.isEmpty() - check if set ia empty or not
        System.out.println(hashSet.isEmpty());
        //false

        //contains() - check if set contains a given element
        boolean containsBlue = hashSet.contains("Blue");
        System.out.println(containsBlue);

        //addAll = adds all elements from another set
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.addAll(setA);
        System.out.println(setB);

        //.removeAll() - remove all elements in the set which are also present
        //another set (difference)
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");

        Set<String> strings2 = new HashSet<>();
        strings2.add("three");
        stringSet.removeAll(strings2);
        System.out.println("The different between the sets is " + stringSet);

        //.retainAll() - retains(сохраняет) all elements presents in another set
        Set<String> stringSet3 = new HashSet<>();
        stringSet3.add("one");
        stringSet3.add("two");
        stringSet3.add("three");

        Set<String> strings4 = new HashSet<>();
        strings4.add("three");
        strings4.add("four");
        stringSet3.retainAll(strings4);
        System.out.println(stringSet3);
        //Intersection between two sets is [three] - (сохраняет одно общее)

        //.TreeSet()
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(17);

        System.out.println(treeSet);
        Set<Integer> treeSet1 = Set.of(5, 1, 7, 0);

        //LinkedHat

    }

}
