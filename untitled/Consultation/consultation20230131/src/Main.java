public class Main {
    public static void main(String[] args) {
        int i = -5;
        int abs = i >= 0 ? i : -i;
        System.out.println("for number " + i + " it's absolute value is " + abs);

        /* 1. Написать программу, определяющую яв-ся ли целое число положительным,
        отрицательным или нулем и выводящую соответствующее собщение на экран*/
        int n = 0;
        n = 34;
        if (n > 0) {
            System.out.println("number is positive");
        } else if (n < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
        /*2. Напишите программу, которая принимает три числа и выводит на экран
        "All numbers are different", "Some numbers are equal"  в
        соответствующих случаях */
        int x = 5;
        int y = 8;
        int z = 0;
        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if ((x == y) || (x == z) || (z == y)) {
            System.out.println("Some numbers are equal");
        } else {
            System.out.println("All numbers are different");
        }
        /*3. Напишите программу, которая определяет в каком порядке введены
        числа . Выводит на экран increasing если числа возрастают (1,2,3) ,
        decreasing если убывают (3,2,1)   и "neither decreasing no increasing"
        в остальных случаях */

    }
}