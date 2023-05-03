package relationship;

public class Student {
    int number;
    String name;
    //создается связь HAS-A c классом Address
    Address address; //this is Has-A
    public Student(int number, String name, Address address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
