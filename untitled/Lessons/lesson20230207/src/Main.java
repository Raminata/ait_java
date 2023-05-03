import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//break statement
        for (int i = 100; i >= 10; i--) {
            System.out.println("i: " + i);
            if (i == 95) {
                break;
            }
        }
        System.out.println("We are out of loop");

        //CONTINUE statement
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
        Scanner scanner = new Scanner(System.in);

        String str;
        for (; ; ) {
            System.out.println("\nEnter any word or 'exit' to end the program >> ");
            str = scanner.nextLine();
            if (str.equalsIgnoreCase("exit"))
                break;
        }
        System.out.println("You entered 'exit'");

        //break inside nested loops
        for (int i = 0; i < 3; i++) {
            System.out.println("outer loop count: " + i);

            System.out.print("inner loop count: ");
            int j = 0;
            while (j < 20) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
        System.out.println("Completed");

        //break label;
        for (int i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        //this is never reached
                        System.out.println("it will not print");
                    }
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for loop");
        printTriangle(6);
    }
    public static void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=i;j++);
            System.out.println(i);
        }
        System.out.println();
    }
}