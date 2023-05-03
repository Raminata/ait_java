import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word >> ");
        String str = sc.nextLine();
        System.out.println("Enter the first letter >> ");
        char ch = (char)System.in.read();

        int garbage = System.in.read();
        System.out.println("the garbage symbol is " + garbage);

        System.out.println("Enter the second letter >> ");
        char ch1 = (char)System.in.read();

        int chIndex = str.indexOf(ch);
        int ch1Index = str.indexOf(ch1);

        if (chIndex == -1 || ch1Index == -1)
            System.out.println("There is no such letter in the word");


    }
}