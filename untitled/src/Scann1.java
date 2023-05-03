import java.util.Scanner;

public class Scann1 {
    public static void main(String[] args) {
        String text = "Lemon and I \nheyhey blaba \nWinter is always cold";
        System.out.println(text);
        Scanner sc = new Scanner(text);
        System.out.println(sc.next());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.next());

    }
}



