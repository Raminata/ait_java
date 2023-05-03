import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //replace method in String class replace (old char, new char)
        String string = new String("hekko");
        System.out.println("String after replacement of k with l: " + string);
        System.out.println(string.replace('k', 'l'));
        //replaceFirst() method replace thr part of a string with a new speciefed string
        System.out.println("replaces first k with l: ");
        System.out.println(string.replaceFirst("k", "l"));

        /*if - оператор ветвления
        1. if statement
        2. nested if statement
        3. if-else statement
        4. if-else-if statement */

        //if
        int num = 165;
        if (num < 100) {
            System.out.println("number is less than 100");
        }
       /* char ch;
        char answer = 'A';
        System.out.println("Guess a letter between A and Z >> ");
        ch = (char)System.in.read();
        if(ch == answer) {
            System.out.println("You are right!");
        }*/

        //if-else
        num = 190;
        if (num < 100) {
            System.out.println("num is less than 100");
        } else {
            System.out.println("num is greater than or equal 100");
        }

        //Guess a letter game - modified
        /*char ch;
        char answer = 'A';
        System.out.println("Guess a letter between A and Z >> ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("You are right!");
        } else {
            System.out.println("You are wrong");
        }*/

        //nested if statement
        num = 70;
        num = 30;
        System.out.println("your number " + num);
        if (num < 100) {
            System.out.println("number is less than 100");
            if (num > 50) {
                System.out.println("number is greater than 50");
            }
        }
        //nested if-else statement
        int i = 10;
        int a, b, c, d, j, k;
        a = 0;
        j = 19;
        b = 9;
        k = 80;
        d = 900;
        c = 3;
        if (i == 10) {
            if (j < 20) a = b; // a = 9
            if (k > 99) c = d;
            else a = c; //a = 3 //этот else относится к if (k > 99)
        } else a = d; //этот else относится к if (i == 10)
        System.out.println("if 'i' == 10 'a' must be 3. The answer is: " + a);

        //if i != 10
        i = 9;
        if (i == 10) {
            if (j < 20) a = b; // a = 9
            if (k > 99) c = d;
            else a = c; //a = 3 //этот else относится к if (k > 99)
        } else a = d; //этот else относится к if (i == 10)
        System.out.println("if 'i' != 10 'a' must be 900. The answer is: " + a);

        char ch;
        char answer = 'k';
        System.out.println("Guess a letter between A and Z >> ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("You are right!");
        } else {
            System.out.println("Sorry, You ");
            if (ch < answer)
                System.out.println("entered a letter BEFORE the secret letter");
            else
                System.out.println("entered a letter AFTER the secret letter");
        }
        System.out.println("Game is over");
    }
}