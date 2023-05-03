package lambdas.lesson20230414;

public class Main {
    public static void main(String[] args) {
        /**
         * написать лямбда выражение такое, что если длина строки = 4, то
         * вернуть четыре звездочки иначе вернуть
         * строку без изменений
         * написать лямбда выражение такое, что будет печататься "Hello World"
         */
        //my
        System.out.println("my");
        Transformable isFour = a -> String.valueOf(a.length() == 4);
        isFour.modify("Hello");
        System.out.println("****");
        //another
        System.out.println("Dmitro");
        Transformable transformable = (in) -> (in.length() == 4 ? "****" : in);
        System.out.println(transformable.modify("hello"));
        System.out.println(transformable.modify("hi"));
        //teacher
        System.out.println("teacher");
        Transformable tr = (in) -> (in.length() == 4 ? "****" : in);
        System.out.println(tr.modify("hello"));
        System.out.println(tr.modify("hi"));

        System.out.println("Producible");
        Producable producable = () -> ("Hello world");
        System.out.println(producable.produce());

        SomeTest<Integer> isFactor = (a, b) -> (a % b) == 0;
        System.out.println(isFactor.test(200, 4));

        SomeTest<Double> isFactorD = (a, b) -> (a % b) == 0;
        System.out.println(isFactorD.test(200.0, 4.0));

        SomeTest<String> isPart = (s1, s2) -> (s1.contains(s2));
        System.out.println(isPart.test("abs", "bc"));

        int[] ints = {1, 50, 80, 10, 3, 9};
        Checkable moreThanTen = n -> n > 10;
        System.out.println("some of elements more then 10 =  " + sum(ints, moreThanTen));
    }

    //lambda can be parameter in method
    public static int sum(int[] ints, Checkable checkable) {
        int sum = 0;
        for (int num : ints) {
            if (checkable.check(num))
                sum += num;
        }
        return sum;
    }
}
