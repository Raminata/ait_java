package pizza;

public class PizzaMozzarella extends Pizza {

    private String name = "Mozzarella";

    @Override
    public void prepare() {
        System.out.println("Preparing pizza " + name);
        System.out.println("Adding mozzarella");
        System.out.println("Adding tomato sauce");
        System.out.println("Adding extra cheese");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza " + name);
        System.out.println("For 8 minutes");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza " + name);
    }
}