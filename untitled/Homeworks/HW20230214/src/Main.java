import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*Поймать исключение (с выводом на экран его типа),которое возникает при
        выполнении следующего кода int a = 40/0 */
        try {
            int a = 40 / 0;
            System.out.println(a);
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero is forbidden");
        }
        /*Поймать исключение (с выводом на экран его типа),которое возникает
        при выполнении следующего кода String s =null; String m = s.toLowerCase() */
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException exception) {
            System.out.println("Method can't called on null");
        }
        /*Поймать исключение (с выводом на экран его типа),которое возникает при
        выполнении следующего кода int[] m = new int[2] m[8]=5  */
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}