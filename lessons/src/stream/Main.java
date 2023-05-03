package stream;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Optional
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isEmpty());
        String str = "Hello";
        Optional<String> str1 = Optional.of(str);

        System.out.println();
        //String str1 = null;
        Optional.of(str1);
        //Optional<String> opt = Optional.ofNullable(str1);
        //System.out.println("Optional of nullable for opt is " + opt);
    }
    
    
    
}
