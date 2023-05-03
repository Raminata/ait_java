public class Main {
    public static void main(String[] args) {
        int a1, b1;
        a1 = 9;
        b1 = 3;
        boolean result = (a1 == 10 || b1 == 10 || (a1 + b1 == 10));
        System.out.println(result);

        /*Написать программу, определяющую является ли год високосным.
        год яв-ся високосным, если год делится на 4.
        Но при этом год, который делится без остатка на 100 яв-ся високосным
        только если он без остатка делится на 400.*/
        int year = 2012;
        boolean leapYear = (year % 4 == 0) || (year % 100 == 0 && year % 400 == 0);
        System.out.println(year + " is the year leap? " + leapYear);

        int year1;
        year1 = 1900;

        boolean a2 = (year1 % 4) == 0;
        boolean b2 = (year1 % 100) != 0;
        boolean c2 = (year1 % 100 == 0) && (year1 % 400 == 0);
        System.out.println(year1 + " year is a leap: " + (a2 && (b2 || c2)));

        /* 1. a | (b & c) = (a | b) & (a | c)
        2. a & (b | c) = (a & b) | (a & c)
        3. !(a | b) = !a & !b
        4. !(a & b) = !a | !b
         */
        boolean a, b, c;
        a = b = c = true;
        System.out.println("1 " + (a | (b & c) == (a | b) & (a | c)));
        System.out.println("2 " + (a & (b | c) == (a & b) & (a & c)));
        System.out.println("3 " + (!(a & b) == !a | !b));
        System.out.println("4 " + ((!a | !b) == (!a & !b)));


    }
}