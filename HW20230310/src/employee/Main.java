package employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 499, 8);
        System.out.println("Name " + employee.name);
        System.out.println("Salary " + employee.salary);
        System.out.println("WorkHours " + employee.workHours);

        employee.addSalary();
        employee.addForWork();

        System.out.println("Get salary bonus " + employee.salary);

        System.out.println();

        Employee employee1 = new Employee("Bill", 550, 6);
        System.out.println("Name " + employee1.name);
        System.out.println("Salary " + employee1.salary);
        System.out.println("WorkHours " + employee1.workHours);
        System.out.println("Get salary bonus " + employee1.salary);

    }


}
