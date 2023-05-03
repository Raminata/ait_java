public class IfElse3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // height = 160 ->
        // (==) равно
        // (>) больше
        // (<) меньше
        // (>=) больше либо равно
        // (<=) меньше либо равно
        // (!=) не равно
        // (||) or или  Наш рост >160 cm или <180 см
        // (&&) and и Наш рост 160cm и вес 86 кг

        int height = 180;
        //if - если
        if (height >= 180) {
            System.out.println("I'm super tall");
        }
        // else - иначе
        else {
            System.out.println("Ordinary height");
        }
        System.out.println("My height is " + height);

        int height2 = 160;
        if (height2 < 160) {
            System.out.println("I'm dwarf");
        } else {
            System.out.println("I'm Guliver");
        }

        int a = 5;
        if (a == 3) {
            System.out.println("It is correct");
        } else {
            System.out.println("It is not correct");
        }
        // && - логическое И (когда выполняется оба условия)
        // || - логическое ИЛИ (когда выполняется хотябы одно условие)
        int digit = 5;
        boolean f = true;
        if (digit > 5 && f == true) {
            System.out.println("Some 1st action");
        } else {
            System.out.println("Some 2nd action");
        }

        int digit2 = 130;
        boolean g = false;
        if (digit2 < 100 || g != true) {
            System.out.println("some action 3");
        } else {
            System.out.println("some action 4");
        }

        // method max -> 5 and 4
        double result = max(56, -187);
        System.out.println("Result max method " + result);

        double result2 = min(34, 88);
        System.out.println("Result in min method " + result2);

        double result3 = min2(32, 89);
        System.out.println("Result in min2 method " + result3);

        checkWork(66);
        // return  1 -если это положительное число return -1 если это отрицательное число return 0==0

        double res5 = sign(-135);
        System.out.println("Print res 5 " + res5);

        checkToWork2(16, true);
        // male true female false

        // height->
        // <0 -> Pls check you r height
        // 0-120 -> Go home
        // 121-140 -> Go to walk
        // 141-180 -> Go NBA
        // 181+ -> You alien go to cosmos

        checkHeight(-13);


    }

    public static void checkHeight(int height) {
        //if(height<0){
        //  System.out.println("Check your height again");
        //}
        if (height >= 0 && height <= 120) {
            System.out.println("Go home");
        }
        if (height > 120 && height <= 140) {
            System.out.println("Go to walk");
        }
        if (height > 140 && height <= 180) {
            System.out.println("Go to NBA");
        }
        if (height > 180) {
            System.out.println("You are alien");
        } else {
            System.out.println(" ELSe");
        }
    }

    public static void checkToWork2(int age, boolean sex) {
        if (age >= 18 && age <= 65 && sex == true) {
            // if(sex==true){
            System.out.println("Go to work");
        } else {
            System.out.println("Go to fun");
        }

    }

    public static double sign(double digit) {
        if (digit > 0) {
            return 1;
        }
        if (digit == 0) {
            return 0;
        }
        return -1;
    }

    public static void checkWork(int age) {
        if (age >= 18 && age <= 65) {
            System.out.println("Go to work");
        } else {
            System.out.println("Go have fun!");
        }
    }


    public static double max(double x, double y) {
        double res = 0;
        if (x > y) {
            res = x;
        } else {
            res = y;
        }
        return res;
    }

    public static double min(double x, double y) {
        double res = 0;
        if (x < y) {
            res = x;
        } else {
            res = y;
        }
        return res;
    }

    public static double min2(double x, double y) {
        if (x < y) {
            return x;
        }
        return y;
    }


}