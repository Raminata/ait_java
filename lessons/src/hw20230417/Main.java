package hw20230417;

import java.lang.module.FindException;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //concat strings a and b
        BiFunction<Integer, Integer, String> stringBiFunction = (a, b) -> Integer.toString(a) + b;
        stringBiFunction.apply(10,24);
        //checkable
        Predicate<String > predicate = s -> s.length() == 3;
        predicate.test("abc");

        //printable
        Consumer<String> consumer = s -> System.out.println("!" + s + "!");
        consumer.accept("Hello");

        //transformable --> String to --> "****"
        Function<String, String> function = s -> s.length() == 4 ? s = "****" : s;
        function.apply("Hello");
        function.apply("Hi");

        //producible
        Supplier<String > supplier = () -> "Hello world";
        System.out.println(supplier.get());
    }
}
