public class Main {
    public static void main(String[] args) {
        /* Написать программу, проверяющую является ли число четным или
        нечетным. Решить задачу двумя способами -через оператор if и через
        тернарный оператор. */
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        System.out.println("Number " + number + " is " + (number % 2 == 0 ? "even" : "odd"));
    }
}