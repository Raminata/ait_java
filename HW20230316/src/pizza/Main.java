package pizza;

public class Main {
    public static void main(String[] args) {
        Order customerA = new Order(PizzaType.HAWAII);
        Order customerB = new Order(PizzaType.MOZZARELLA);
        Order customerC = new Order(PizzaType.SALAMI);

        PizzaFactory.processOrder(customerA);
        System.out.println("_____________________________");
        PizzaFactory.processOrder(customerB);
        System.out.println("_____________________________");
        PizzaFactory.processOrder(customerC);
    }
}