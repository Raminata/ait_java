package our.interfaces.interfaces;

public class Main {
    //Interfaces
    //interface can extends another interface, and realized their method-s
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
        myClass.method3();
        MyClassImplementInterface m = new MyClassImplementInterface();
        //m.getUserID();
    }
}
