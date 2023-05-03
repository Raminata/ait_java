public class Main {
    public static void main(String[] args) {
        //int = 10;
        //int num = 5;
        int num = 61;
        if (num < 50) {
            System.out.println("number is less than 50");
            if (num > 10) {
                System.out.println("number is greater than 10");
            } else {
                System.out.println("number is less than 10");
            }
        } else {
            System.out.println("number is greater than 50");
        }

        //if-else-if ladder (лестница)
        int x = 6;
        if (x == 1) {
            System.out.println("x is one");
        } else if (x == 2) {
            System.out.println("x is two");
        } else if (x == 3) {
            System.out.println("x is three");
        } else if (x == 4) {
            System.out.println("x is four");
        } else {
            System.out.println("x is not between 1 and 4");
        }
        /* Ternary operator
       variable = Condition ? Expression1 : Expression2
         */
        //int age = 10; //1
        int age = 19; //2
        //boolean isAdult = age >= 18 ? true : false;
        String isAbult;
        if (age >= 18) {
            isAbult = "can vote: true";
        } else {
            isAbult = "too young";
        }
        System.out.println("isAdult for classical if else: " + isAbult);
        String isAdultTernary = age >= 18 ? "can vote" : "too young";
        System.out.println("isAdultTernary: " + isAdultTernary);

        String caseWord = "uppercase";
        String name = caseWord.equals("uppercase") ? "Evgeny" : "evgeny";

        //int sum = a != b ? a + b : (a + b) * 2;
        String str = null;
        String value = str != null ? str.toLowerCase() : null;
        System.out.println("value is: " + value);

        int value1 = 5;
        int value2 = 8;
        int max = value1 >= value2 ? value1 : value2;
        System.out.println("max is: " + max);

        int value3 = -10;
        int abs = value3 >= 0 ? value3 : -value3;
        System.out.println("abs value of: " + value3 + " is " + abs);

        /* есть целое положительное число. Нужно вывести на экран кол-во его
        цифр если их не больше четырех в след.виде:
        3 -> "It is a one digit number
        10 -> "It is a two digit number
        368 -> "It is a three digit number
        6785 -> "It is a four digit number
        если же кол-во цифр числа больше 4 ещ вывести надпись ->
        "the number is too big for me" */
        int digit = 10000;
        if (digit >= 0 && digit < 10) {
            System.out.println("It is a one digit number");
        } else if (digit >= 10 && digit < 100) {
            System.out.println("It is a two digit number");
        } else if (digit >= 100 && digit < 1000) {
            System.out.println("It is a three digit number");
        } else if (digit >= 1000 && digit < 10000) {
            System.out.println("It is a four digit number");
        } else {
            System.out.println("The digit is a not between 0 and 999");
        }

        /* Найти макс-ое из трех чисел используя какой либо из вариантов
        else if */
        int number1 = 40;
        int number2 = 40;
        int number3 = 30;
        /*if (number1 >= number2 && number1 >= number3) {
            System.out.println("Number 1 is bigger: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Number 2 is bigger: " + number2);
        } else {
            System.out.println("Number 3 is bigger: " + number3);
        }*/
        if (number1 >= number2) {
            if (number1 >= number3) {
                System.out.println(number1 + " is a largest");
            } else {
                System.out.println(number3 + " is the largest");
            }
        } else {
            if (number2 >= number3) {
                System.out.println(number2 + " is the largest");
            } else {
                System.out.println(number3 + " is a largest");
            }
        }

    }
}