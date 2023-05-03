package pizza;

public class Order {
    private PizzaType type;

    public Order(PizzaType type) {
        this.type = type;
    }

    public PizzaType getType() {
        return type;
    }
}
