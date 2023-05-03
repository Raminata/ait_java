package lambdas;

public class Main {
    /**
     * Lambda expressions & Functional interfaces
     * Лямбда выражениия и функциональные интерфайсы
     * ->  символ лямбда выражения
     * parameters -> lambda body
     */
    public static void main(String[] args) {

        MyValue myValue = () -> 56.3;
        System.out.println(myValue.getValue());

        MyValueParam myValueParam = (n) -> 1.0 / n; //or = n -> 1.0 / n; = (var n) -> 1.0 / n;
        System.out.println(myValueParam.getValue(4.0));

        //эта лямбда проверяет делится ли число без остатка
        TestNumbers isFactor = (a, b) -> (a % b) == 0;
        System.out.println(isFactor.test(10, 2));//true
        System.out.println(isFactor.test(10, 3));//false

        //это лямбда выражение проверяет больше ли одно число другого
        TestNumbers lessThan = (a, b) -> (a < b);
        System.out.println(lessThan.test(15, 10));

        // отпределяет равенство абсолютных значений
        TestNumbers absEqual = (a, b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        System.out.println(absEqual.test(10, -10));

        isFactor = (a, b) -> (a > b);
        isFactor.test(21, 5);

        StringTest isPart = (a, b) -> a.indexOf(b) != -1;
        System.out.println(isPart.test("Hello world", "word"));
        System.out.println(isPart.test("Hello world", "Java"));

        Calculate square = n -> {
            int res = n * n;
            return res;
        };


    }
}





