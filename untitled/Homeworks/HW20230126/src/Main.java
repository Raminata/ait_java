
public class Main {
    public static void main(String[] args) {
        /*Даны две строки. Написать программу, выводящую в консоль строки,
        соединенные вместе, но без первых букв. Пример: Hello There -> ellohere */
        String str1 = "Hello";
        String str2 = "There";
        String res1 = str1.substring(1) + str2.substring(1);
        System.out.println("Now - " + str1 + " " + str2);
        System.out.println("After - " + res1);
    }
}