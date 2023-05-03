package stream.stream_empty;

import java.util.*;
import java.util.stream.*;

public class Main {
    //способы создани сримов

    /**
     * Stream.empty() - пустой стрим
     * list.stream() - стрим из списка
     * map.entrySet().stream() - стрим из мапы
     * Arrays.stream(array) - стрим из массива
     * Stream.of(1,2,3,4,5) - стрим из элементов
     */

    /*
    В потоке есть промежуточные (intermediate) элементы и терминальные (terminal).
    Промежуточные - обрабатывают поступающие элементы из потока  и возвращают тоже стрим.
    Промежуточных элементов может быть много.

    Теримнальные - обрабатывают поступающие к ним  элементы    и завершают работу потока.
    Терминальный оператор может быть только один
    Промежуточные операторы - "ленивые", т.е. обработка не начинается пока не будет вызван терминальный
    оператор
    Экземпляр стрима можно использовать только один раз.

    Промежуточные операторы
     */
    public static void main(String[] args) {
        //range - диапозон
        IntStream intStream = IntStream.range(1, 3);//генерирует поток упорядоченных
        //элементов от первого до последнего, не вкл-я последний

        LongStream longStream = LongStream.rangeClosed(1, 3);//генерирует поток с
        //шагом 1 упорядоченных первого до последнего, вкл-я последний

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);//поток из слечайных чисел

        //Terminal operator
        Stream<String> names = Stream.of("Jack", "John", "Bill", "Jill", "Barbara", "Helen");

        //метод forEach() - яв-ся терминальным, используется для перебора эл-ов в
        // стриме
        names.forEach(s -> System.out.println(s));
        //names.forEach(System.out::println);//method reference
        System.out.println();

        //Intermediate
        //1. .filter() - принимает условие в виде предикаты и возвращает поток из этих
        //эл-ов, которые удовлетворяют этому условию
        Stream<String> names1 = Stream.of("Jack", "John", "Bill", "Jill", "Barbara", "Helen");
        names1.filter(s -> s.length() == 4).forEach(System.out::println);
        System.out.println();

        Person person = new Person("Jack", 45);
        Person person1 = new Person("John", 35);
        Person person2 = new Person("Helen", 25);
        Person person3 = new Person("Barbara", 15);
        List<Person> namesOfPersons = List.of(person, person1, person2, person3);
        namesOfPersons.stream()
                .filter(p -> p.getAge() < 30)
                .forEach(p -> System.out.println(p.getName()));

        //2. .map() - (mapping - принадлежать) - служит для преобразования одного
        //обекта в другой. принимает Function
        System.out.println("Printing names only");
        namesOfPersons.stream()
                .map(p -> p.getName())
                //.map(Person::getName)
                .forEach(n -> System.out.println(n));
        //.forEach(System.out::println);

        //flapMap - при работе с массивом списком и т.д стримов, преобразует
        //их в один стрим
        //[stream1, stream2, stream 3] -> stream
        //map преобразует стреам стримов : [stream1, stream2, stream3] ->
        // Streams of (stream1, stream2, stream3)

        //flapMapToInt
        Stream.of(2, 3, 1)
                .flatMapToInt(num -> IntStream.range(0, num))
                .forEach(System.out::println);

        // map
        System.out.println();
        System.out.println("for map:");
        Stream.of(2, 3, 1) // стрим целых чисел
                .map(num -> IntStream.range(0, num))  // стримы целых чисел в диапазоне до num
                .forEach(System.out::print);  //010120

        //сортировка  sorted()
        System.out.println("Sorted");
        List<String> namesSort = new ArrayList<>();
        Collections.addAll(namesSort, "Jack", "Ann", "Bill", "Harry", "Barbara");
        namesSort.stream()
                .filter(name -> name.length() < 7)
                .sorted()
                .forEach(System.out::println);


//distinct() - возв-ет не повторяющиеся элементы
        namesSort.add("Ann");
        namesSort.add("Jack");
        System.out.println(namesSort);
        namesSort.stream()
                .distinct()
                .forEach(name -> System.out.println(name));

        //skip(long n) - исп-ся для пропуска n элементов. Возвращает стрим, в котором
        //пропущены первые n элементов
        //limit(long n) - выбирает первые n элементов из стрима
        namesSort.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //Terminal operator
        //count -  возв-ет кол-во эл-ов в потоке
        long count = namesSort.stream().count();
        System.out.println(count);

        //findFirst - извлекает первый эл-нт
        //findAny - извлекает слуайный эл-нт
        Optional<String> first = namesSort.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = namesSort.stream().findAny();
        System.out.println(any.get());

        //alMatch, anyMatch, noneMatch
        //allMatch - true - если все эл-ты потока удовлет-ют условию
        //anyMatch - true - если хотябы один эл-нт потока удовлет-ют условию
        //nineMatch - true - если один из эл-ов потока удовлет-ют условию
        namesSort.stream().anyMatch(name -> name.length() == 4);
        namesSort.stream().allMatch(name -> name.length() < 40);
        namesSort.stream().noneMatch(name -> name.equals("Evgeny"));

        //method collect
        List<String> namesFiltered = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toList());
        System.out.println(namesFiltered);


        Set<String> namesToSet = namesSort.stream()
                .filter(name -> name.length() <= 5)
                .collect(Collectors.toSet());
        System.out.println(namesToSet);


    }
}
