package pizza;

public class PizzaHawaii extends Pizza {

    private String name = "Hawaii";

    @Override
    public void prepare() {
        System.out.println("Preparing pizza " + name);
        System.out.println("Adding cheese");
        System.out.println("Adding pineapple slice");
        System.out.println("Adding corn");
        System.out.println("Adding tomato sauce");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza " + name);
        System.out.println("For 5 minutes");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza " + name);
    }
}
