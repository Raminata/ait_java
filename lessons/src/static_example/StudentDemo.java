package static_example;


public class StudentDemo {

    public static void main(String[] args)
    {
        Student john = new Student("John", "Berlin, FridrigStr 1");
        Student bill= new Student("Bill", "Berlin, FrauenStr 3");
        System.out.println("Name is: " + john.name);
        System.out.println("Address is: " + john.address);
        System.out.println();
        System.out.println("Name is: " + bill.name);
        System.out.println("Address is: " + bill.address);
        System.out.println("Number of students is: " + Student.numberOfStudents);

        Student mary = new Student("Mary", "Berlin, FridrigStr 5");
        System.out.println("Name is: " + mary.name);
        System.out.println("Address is: " + mary.address);
    }
}
