
/**
 * /* Есть строка, состоящая только из маленьких букв. Используя StringBuilder
 * написать метод,подсчитывающий количество повторений буквы и возвращающий
 * новую строку такого вида: aaaabbccccd -> 4a2b4cd
 * Write a method to convert a string of lowercase letters into a string counting the
 * number of these letters for each letter aaaabbccccd -> 4a2b4cd Это задача со звездочкой,
 * не обязательная
 */
public class Main {
    public static void main(String[] args) {
        //3
        String input = "aaaabbccccd";
        String output = countLetters(input);
        System.out.println(output);  // Output: "4a2b4c1d"
    }

    public static String countLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                count++;
            } else {
                sb.append(count).append(current);
                current = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(current);
        return sb.toString();
    }

}