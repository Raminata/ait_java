import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        /* Дано трехзначное числою
        1. Вывести на экран все цифры этого числа.
        2. Получить новое число, образованное перестановкой единиц и сотен
        365 -> 3,6,5,   365 -> 563 */
        int num = 3;
        int num1 = 6;
        int num2 = 5;
        //System.out.println(num + "" + num1 + "" + num2);
        //System.out.println(num + "," + num1 + "," + num2);
        //System.out.println(num2 + "" + num1 + "" + num);

        int sum = 365;
        int a = sum / 100;
        int b = sum % 10;
        int c = sum / 10 % 10;
        System.out.println(sum);
        System.out.println("____________________");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //решение учителя
        int n = 365;
        int ones, tens, hundreds;
        ones = n % 10;
        tens = n / 10 % 10;
        hundreds = n / 10 / 10;
        int reversed = ones * 100 + tens * 10 + hundreds;

        System.out.println("Digits of " + n + " are: " + hundreds + "," + tens + "," + ones);
        System.out.println(n + " reversed is " + reversed);
    }
}