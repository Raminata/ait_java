import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch = 'a';
        ch = 'a';
        switch (ch) {
            case 'd':
                System.out.println("case d");
                break;
            case 'c':
                System.out.println("case c");
                break;
            case 'a':
                System.out.println("case a");
            default:
                System.out.println("another case");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Help on");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("enter number");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The IF:");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case 2:
                System.out.println("Traditional Switch:");
                System.out.println("switch (expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println("}");
                break;
            default:
                System.out.println("Your selection is not found");
        }
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number >> ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number >> ");
        num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, /, * >> ");
        char operator = scanner.next().charAt(0);
        sc.close();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case'-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
    }
}