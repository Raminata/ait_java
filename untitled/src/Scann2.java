import java.util.Scanner;

public class Scann2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько зубов у панды?");
        int answer1 = sc.nextInt();
        if (answer1 == 38) {
            System.out.println("Правильно, молодец, ты настояций пандовед!");
        } else {
            System.out.println("Являются ли панды медведями?");
            String answer2 = sc.next();
            if (answer2.equalsIgnoreCase("да")) {
                System.out.println("Пвнды могли бы вами гордиться");
            } else {
                System.out.println("Панды пытаються скрыть слезы, но не получантся");
            }
        }
    }
}



