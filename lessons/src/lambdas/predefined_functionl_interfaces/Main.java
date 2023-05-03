package lambdas.predefined_functionl_interfaces;

import java.util.function.*;

public class Main {
    //predefined functional interfaces
    //стандартные функцмональные интерфейсы
    /**
     * 1. Function<T, R> - это метод преобразующий обект типа Т в обьект типа R
     * public interfaces Function <T, R> {
     *     R apply (T ob); //object
     * }
     *
     * 1a. BiFinction<T, U, R> - это метод, принимающий обьекты типа Т1б Т2 и
     * преобразующий их в обьект типа R
     * public interface BiFunction<T, U, R>{
     * R apply (T ob, U ob);
     *    }
     *
     * 2. Predicate <T> - проверяет некоторое условие. Если условие
     * выполняется возв-ет true -/false
     * public interface Predicate<T> {
     * boolean test(T ob); //object
     * }
     *
     * 3. Consumer <T> - принимает обьект, но ничего не возвращает
     * public interface Consumer<T> {
     *     void accept(T ob); //object
     * } //method printable
     *
     * 4. Supplier <T> - ничего не принимает, но возв-ет обьект типа Т
     * public interface Supplier<T> {
     *     T get();
     * } //producible
     *
     * 5. BinaryOperator<T> - принимает два обьекта типа Т и
     * возв-ет обьект типа Т
     * public interface BinaryOperator<T> {
     *     T apply (T ob1, T ob2);
     * }
     *
     * 6. UnaryOperator<T> - аналок Function, для случая когда на входе и на выходе
     * один тип
     * public interface UnaryOperator<T> {
     *     T apply(T ob);
     * }
     */

    public static void main(String[] args) {
        Function<Integer, String > intToString = String::valueOf;
        intToString.apply(2); //переопределяет метод напр. с int to String

        Predicate<Integer> isPositive = num -> num > 0;
        isPositive.test(3);

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");

        Supplier<String> supplier = () -> "Hello world";

        BinaryOperator<Integer> sum = Integer::sum; //-> = num1 + num2
        sum.apply(1,2);

        UnaryOperator<Integer> isSquare = num -> num * num;
        isSquare.apply(2);
    }


}
