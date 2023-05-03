import java.util.Arrays;

public class Main3 {
    public static void main(String [] args) {
        Person[] array = {
                new Person("John", 30),
                new Person("Nick", 36),
                new Person("Ann", 23),
                new Person("Oleg", 29),
                new Person("Jack", 22),
        };
        sort(array);
        System.out.println(Arrays.toString(array));
        }
    }
}
