public class Boolean {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Some text");
        System.out.println(34);
        int a=10; //INTEGER
        System.out.println(a);
        System.out.println("Variable a is " + a + " Some new Text here " + a*10);

        intro();
        System.out.println("Vasili");
        intro();
        System.out.println("Petr");
        intro();
        System.out.println("Elena");

        double b=3.14; // Double +- = floats digits with .
        System.out.println("Here is double " + b);

        boolean d= true;
        boolean c= false;
        System.out.println("Here is boolean D "+ d);
        System.out.println("Here is boolean C "+ c);
        boolean e = a >= b;
        System.out.println(e);
        double vasya1 = 30;
        double petya1 = 12;
        petya1=changeCoffee(petya1);
        System.out.println("Petya has in main function " + petya1);


    }
    public static double changeCoffee(double amount){
        double priceCoffee = 3.1; // Coffee price
        double change = amount - priceCoffee;
        System.out.println("Here is your coffee");
        System.out.println(" Your change is " + change);
        return change;
    }

    public static void intro(){
        System.out.println("Hello my name is ");
    }
}