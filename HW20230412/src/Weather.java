/**
 * Написать метод, возвращающий слова в строке в обратном порядке.
 * * Использовать StringBuilder. Слова разделяются пробелом.
 * * Пример: "The weather today is great" -> "great is today weather The "
 * * Write a method to reverse words in a String. Use StringBuilder
 */
public class Weather {
    public static void main(String[] args) {
        System.out.println(reverseWords("The weather today is great"));
    }

    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
}
