import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printSmth();
        sum();
        sumReturn();
        System.out.println(sumReturn());
        int receiveReturn = sumReturn();
        System.out.println("receiveReturn is " + receiveReturn);
        int receiveReturnPar = sumReturnWithParameters(4,6);
        System.out.println("result vor 4 + 6 is: " + receiveReturnPar);
        System.out.println("result for 7 + 7 is: " + sumReturnWithParameters(7,7));

        String wordForMethod = "Hello";
        int numberForMethod = 1;
        System.out.println(returnSmth(wordForMethod, numberForMethod));

    }

    public static void printSmth() {
        System.out.println("I am printing");
    }

    public static void sum() {
        int a = 1;
        int b = 2;
        int aPlusB = a + b;
        if (aPlusB != 3) {
            return;
        }
        System.out.println("a + b = " + aPlusB);
    }

    public static int sumReturn() {
        int a = 1;
        int b = 2;
        int aPlusB = a + b;
        return aPlusB;
    }
    // передача в метод параметров
    public static int sumReturnWithParameters(int a, int b) {
        int aPlusB = a + b;
        return aPlusB;
        //return a + b;
    }
    public static String returnSmth(String word, int num) {
        String result = word + num;
        return result;
    }
    public static String returnStringDigits (int a, int b) {
        String res = "Hello" + a + b;
        return res;
    }


}