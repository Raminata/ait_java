package relationship;

public class Main {
    //Has-A relationship
    public static void main(String[] args) {
        Address address = new Address("Berlin",
                "MarilienStr",
                5,
                "Germany");
        Address address1 = new Address("Berlin",
                "FrauenStr",
                7,
                "Germany");

        Student jack = new Student(1,"Jack", address);
        Student jill = new Student(1,"Jill", address1);

        System.out.println(jack);
        System.out.println(jill);
    }
}
