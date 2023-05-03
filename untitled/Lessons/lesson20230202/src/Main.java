public class Main {
    public static void main(String[] args) {
        //циклы while
        //syntax of While loop
        //while(condition){
        //statement(s) }
       /* int i = 1;
        while (i <= 10) {
            System.out.println(i);
            //i = i +1;
            i++;
        }
        System.out.println("end of while loop");
    }*/
        int i = 10;
        while (i > 1) {
            //System.out.println(i);
            i--;
        }
        //вывести в консоль строки с помощью цикла while
        String hello = "Hello";
        System.out.print(hello.charAt(0));
        System.out.print(hello.charAt(1));
        System.out.print(hello.charAt(2));
        System.out.print(hello.charAt(3));
        System.out.print(hello.charAt(4));
        System.out.print("-------------");
        int index = 0;
        int length = hello.length(); //5
        while (index < length) {
            System.out.print(hello.charAt(index));
            index++;
        }
        //do - while
        i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while (i > 1);
        /*используя цикл while написать программу, выводящую на экран сумму цифр от 1 до 5
        // 1+2+3+4+5 =15
        //sum=15
        // "sum of digits from 1 to 5 is " + sum*/
        int n = 10;
        int i1 = 1;
        int sum = 0;
        while (i1 <= 5) {
            sum = sum + 1; // sum = 0+1=1
            System.out.println("i1 = " + i1);
            System.out.println("sum = " + sum);
            i1++;
        }
        System.out.println("sum of digits from 1 to 5 is " + sum);

    }
}