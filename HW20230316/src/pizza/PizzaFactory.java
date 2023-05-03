package pizza;

public class PizzaFactory {
    public static Pizza processOrder(Order o) {
        Pizza pizza = getPizza(o);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    private static Pizza getPizza(Order o) {
        switch (o.getType()) {
            case SALAMI -> {
                return new PizzaSalami();
            }
            case MOZZARELLA -> {
                return new PizzaMozzarella();
            }
            case HAWAII -> {
                return new PizzaHawaii();
            }
            default -> {
                return null;
            }
        }
    }
}
