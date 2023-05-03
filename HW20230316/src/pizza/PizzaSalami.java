package pizza;

public class PizzaSalami extends Pizza {

    private String name = "Salami";

    @Override
    public void prepare() {
        System.out.println("Preparing pizza " + name);
        System.out.println("Adding cheese");
        System.out.println("Adding salami slice");
        System.out.println("Adding tomato sauce");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza " + name);
        System.out.println("For 11 minutes");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza " + name);
    }
}
