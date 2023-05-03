import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Написать метод, принимающий строку, содержащую слова разделенные пробелом и два функциональных интерфейса - function и predicate. Метод возвращает строку. Он должен предоставлять возможность реализации следующих действий:
 * 1. при длине слова= 3, изменить все буквы этого слова на строчные и вернуть измененную строку
 * 2. при длине слова= 4, изменить все буквы слова на заглавные и вернуть измененную строку
 * 3. при длине слова= 5, изменить все буквы слова на звездочки и вернуть измененную строку
 * (т.е. должен работать таким образом при передаче в него соотвествующих лямбда выражений для каждого случая).
 * Протестировать.
 * Пример: есть строка AAA BBBB dEF cDkls bBb
 * Условие: если длина слова = 3 то заменить буквы этого слова на маленькие.
 * На выходе будет: aaa BBBB def cDkls bbb
 *
 * Это задача со звездочкой
 */

public class Main {

    public static final Predicate<String> PRED_FOR_3 = s -> s.equals("aaa BBBB def cDkls bbb");
    public static final Predicate<String> PRED_FOR_4 = s -> s.equals("AAA BBBB dEF cDkls bBb");
    public static final Predicate<String> PRED_FOR_5 = s -> s.equals("AAA BBBB dEF ***** bBb");

    // Function<input, output>
    public static final Function<String, String> FUNC_FOR_3 = (text) -> {
        // input text
        // AAA BBBB dEF cDkls bBb

        String[] words = text.split(" ");
        // words = [AAA,BBBB,dEF...]

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            // AAA -> aaa
            if (currentWord.length() == 3) {
                String toLowerCase = currentWord.toLowerCase();
                sb.append(toLowerCase);
            } else {
                sb.append(currentWord);
            }

            // we use indexed for loop in order to know when we are on the last WORD
            // and NOT TO append the space at the end `...currentWord.` instead of `...currentWord .`
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    };

    public static final Function<String, String> FUNC_FOR_4 = (text) -> {
        String[] words = text.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() == 4) {
                String toUpperCase = currentWord.toUpperCase();
                sb.append(toUpperCase);
            } else {
                sb.append(currentWord);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    };

    public static final Function<String, String> FUNC_FOR_5 = (text) -> {
        String[] words = text.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.length() == 5) {
                sb.append("*****");
            } else {
                sb.append(currentWord);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    };

}