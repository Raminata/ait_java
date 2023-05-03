package hw20230417;

import java.util.function.Function;
import java.util.function.Predicate;

public class Transformer {
    public static void main(String[] args) {
        Transformer transformer = new Transformer();
        String input = "AAA BBBB dEF cDkls bBb";
        Predicate<String> predicate = s -> s.length() == 3;
        Function<String, String> function = s -> s.toLowerCase();

        System.out.println(transformer.transformering(input, predicate, function));
        //aaa BBBB def cDkls bbb
    }

    public String transformering(String input, Predicate<String> predicate, Function<String, String> function) {
        String[] words = input.split(" ");//превратили в array[AAA BBBB dEF cDkls bBb] разделенный пробелом(space)
        for (int i = 0; i < words.length; i++) {
            if (predicate.test(words[i])) {
                words[i] = function.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}
