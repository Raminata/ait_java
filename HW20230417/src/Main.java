import java.util.List;

public class Main {
    public static void main(String[] args) {
        String x = "aAa BBBB dEF cDkls bBb";
        tester(x);
    }

    public static String[] tester(String x){
        String[] words = x.split(" ");

        System.out.println("Before " + List.of(words));

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            AbstractCase modifier = getModifier(word);
            words[i] = modifier.modify(word);
        }

        System.out.println("After " + List.of(words));
        return words;
    }

    private static AbstractCase getModifier(String word) {
        if (word.length() == 3) {
            return new UpperCase();
        } else if (word.length() == 4) {
            return new LowerCase();
        } else if (word.length() == 5) {
            return new AsterixCase();
        }

        return new IgnoreCase();
    }
}