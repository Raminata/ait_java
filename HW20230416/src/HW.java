import java.util.function.*;

/**
 * Переписать лямбда-выражения для интерфейсов Checkable,Printable,Producible,
 * StringConcate,Transformable из домашнего задания и с урока на стандартных
 * функциональных интерфейсах Java.
 */
public class HW {
    public static void main(String[] args) {
        //checkable==predicate
        Predicate<String> isLength3 = s -> s.length() == 3;
        System.out.println(isLength3.test("bok"));

        //printable==consumer
        Consumer<String> consumer = s -> System.out.println("!" + s + "!");
        consumer.accept("Hello");

        //producible==supplier
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        //StringConcat==Function
        Function<Integer, String> concat = (a) -> Integer.toString(a);
        System.out.println(concat.apply(3));

        //Transformable== UnaryOperator
        UnaryOperator<String> transforable = (s) -> s.length() == 4 ? "****" : s;
        System.out.println(transforable.apply("book"));
        System.out.println(transforable.apply("bok"));
    }

}
