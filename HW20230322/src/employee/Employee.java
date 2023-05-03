package employee;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee employee) {
        if (getId() < employee.getId()) {
            return -1;
        } else if (getId() > employee.getId()) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}
