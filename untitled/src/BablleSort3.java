import java.util.Scanner;

public class BablleSort3 {
    public static void main(String[] args) {
        String word1 = "Bob";
        String word2 = shout(word1);
        String word3 = whisper(word1);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        String word4 = "   carrot   ";
        System.out.println(word4);
        String word5 = cypher(word4);
        System.out.println(word5);
        String word6 = change(word4);
        System.out.println(word6);
        String word7 = change1(word4);
        System.out.println(word7);

        String word8 = "Hello";
        String word9 = subInUpper(word8);
        System.out.println(word9);
        String word10 = subInUpper1(word9);
        System.out.println(word10);

        //// задание
        //        // напишите метод subInUpper, который принимает строку и два int start,
        //        // finish и возвращает новую строку
        //        // которая является фрагментом исходного текса(от start до finish) в upperCase
        //        // например subInUpper("Hello", 1,3)  вернет нам "EL"

        // задание
        // напишите метод cypher, который принимает String - возвращает новый String
        // Он убирает пробелы в начале и конце строки
        // Он меняет все буквы 'r' на буквы 'l'
        // Он меняет все буквы 'c' на буквы 's'
        // и возвращает то, что получилось
        // если передадим в него строку "   carrot   " - он вернет нам "sallot"
    }
    public static String subInUpper1(String change) {
        return change.toUpperCase();
    }
    public static String subInUpper(String change) {
        return change.substring(1,3);
    }
    public static String change1(String change) {
        return change.replace("c", "s");
    }

    public static String change(String change) {
        return change.replace("r", "l");
    }
    public static String cypher(String text) {
        return text.trim();
    }



    public static String shout(String text) {
        return text.toUpperCase();
    }
    public static String whisper(String text) {
        return text.toLowerCase();
    }
}






