package stream.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Bill", 23, "Address"),
                new Person("Jack", 63, "Address"),
                new Person("Ann", 27, "Address"),
                new Person("Harry", 23, "Address"));
        persons.stream()
                .sorted(new PersonComparatorAge())
                .forEach(person -> System.out.println(person.getName()));

        //min() & max() - возвращают соответственно минимальное или максимальное значение.
        //принимают компаратор и возвращают ответ обернутый в Optional
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Optional<Integer> min = ints.stream().min(Integer::compare);
        System.out.println(min);
        Optional<Integer> max = ints.stream().max(Integer::compare);
        System.out.println(max);

        //reduce() - сокращать
        OptionalInt reduce = IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println(reduce.getAsInt());
        //reduced = 1 + 2 + 3
        int reduce1 = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reduce1);
        //reduced = 10 + 1 + 2 + 3

        //collect()
        Food product = new Food("Bread", 4);
        Food product1 = new Food("sugar", 4);
        Food product2 = new Food("orange", 10);
        Food product3 = new Food("salt", 10);

        //
        String collect = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining());
        System.out.println(collect);

        //
        String collect1 = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining(":"));

        //
        String collect2 = Stream.of("h", "e", "l", "l", "o").collect(Collectors.joining(":", "<", ">"));

        //groupingBy
        List<Food> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product);

        Map<Integer, List<Food>> groupFood = products.stream().collect(Collectors.groupingBy(Food::getPrice));
        System.out.println(groupFood);
        //output: {4=[sugar'4, Bread'4], 10=[orange'10, salt'10]}

        //partitioningBy() - деление
        Map<Boolean, List<Food>> mapDivided = products.stream().collect(Collectors.partitioningBy(p -> p.getPrice() > 9));
        System.out.println(mapDivided);
        //output: {false=[sugar'4, Bread'4], true=[orange'10, salt'10]}

        //
        Double price = products.stream().collect(Collectors.averagingInt(Food::getPrice));
        System.out.println(price);

        Integer sum = products.stream().collect(Collectors.summingInt(Food::getPrice));
        System.out.println(sum);

        //Parallel streams
        //parallelStream()
        List<String> names = Arrays.asList("Jack", "Tom", "Jill", "Kate");
        System.out.println(names);
        System.out.println("Stream");
        names.stream().filter(n -> n.length() == 4).forEach(System.out::println);

        System.out.println();
        System.out.println("Parallel stream");
        names.parallelStream().filter(n -> n.length() == 4).forEach(System.out::println);


    }

}
