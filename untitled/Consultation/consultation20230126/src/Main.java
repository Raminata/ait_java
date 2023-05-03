import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        /* Есть строка. Написать прог-му, выводящую на экран целое число, равное
        двойной длине этой строки */
        /* Дана строка четкой длины. Написать прог-му, выводящую

         */
        String str = "Hello";
        System.out.println(str.length() * 2);

        String str1 = "Evgeny";
        System.out.println(str1.substring(0,str1.length()-2));

        String str2 = "Hello";
        System.out.println();

        String str3 = "ABCD";
        System.out.println(str3);
        String split = str3.substring(1) + str3.substring(0,1);
        System.out.println(split);

        String substr2 = str1.substring(0, str1.length() - 1);
        char begin = str1.charAt(str1.length() - 1);
        String result = begin + substr2;
        System.out.println("string " + str1 + " - last symbol to begin: " + result);

    }
}