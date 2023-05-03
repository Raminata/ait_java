public class IfElse {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 5;

        if (a > 5) {
            System.out.println("A more then 5");
        } else {
            System.out.println("A less or == then 5");
        }

        int b = 10;
        if (a < 5 && b == 10) {
            System.out.println("A<5 b==10");
        } else {
            System.out.println("a > or ==5 & b");
        }

        printHello(15);
        printOddNumbers(100);
        printStars(25, 5);

    }
    // Hello 1 times
    // Hello 2 times
    // Hello 3 times

    public static void printHello(int number) {
        int counter = 0;
        while (number != 0) {
            counter++;
            System.out.println("Hello " + counter + " times");
            number--;
        }
    }
    // 123456 ->
//    public static int sumDigits(int number){
//        int res;
//         for( int i=0; i<10; i++)
//
//        for (res=0; number!=0; number=number/10){   // 123 4 5 6
//            res=res+number%10;
//        }
//        return res;
//    }

    public static void printOddNumbers(int number) {
        // i - 1st counter j - 2 counter
        for (int i = 1; i <= number; i += 2) {    // i=i+2;
            System.out.println(i);
        }
    }
    // print Stars
    // int number -> 100
    // int starsInRow -> 5

    public static void printStars(int number, int starsInRow) {
        int i = 1; // Counter for all amount of stars
        int j = 1; // Counter for stars in row
        while (i <= number) {  // We start ou Loop from 1 till number
            if (j < starsInRow) { // if counter j < stars in row -> sout *
                System.out.print("*");
                j++;
            } else {
                System.out.println("*");
                j = 1;
            }
            i++;
        }

    }

}



