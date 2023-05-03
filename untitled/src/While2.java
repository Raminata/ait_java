public class While2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        haharin(100);

        double a=3;
        int b=4;

        double resInMain=powXY(a, b);
        System.out.println("Res in main = " + resInMain);

    }

    public static double powXY(double x, int y){  //x- число которое мы зотим возвести в степень
        //y - степень
        double res =1;
        int counter=1;
        while(counter<=y){
            res = res * x;              // ^2 a*a  ^3 pow2*a
            counter++;
        }
        return res;
    }

    public static void haharin(int input){
        int counter = input;         // счетчик
        while (counter>=1){
            System.out.println(counter);
            counter--;
            // counter= counter -1; //decrement
        }
        System.out.println("Go to Space");
    }



}

        /*
        синтаксический сахар
        a = a + 1  --> a += 1
        a = a + 2  --> a += 2
        a = a - 1  --> a -= 1
        a = a * 2  --> a *= 2
        a = a / 2  --> a /= 2
        b = b + "hehe" --> b +="hehe"
         */

