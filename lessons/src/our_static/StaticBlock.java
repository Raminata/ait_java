package our_static;
//static block example
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    //statick block
    static {
        System.out.println("Inside staticBlock");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String message) {
        System.out.println(message);
    }
    //static final variables - статические переменные final (константы)
    public static final int MY_INT = 20;
}
