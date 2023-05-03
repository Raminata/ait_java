package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Создать класс Employee c полями id, name, age, salary.
         * Сделать его Comparable по id
         * Создать дополнительные возможности сортировки по: salary, age, name
         * а также по ageAndThenName, т.е. если возраст одинаковый, то
         * сортировать по имени.
         * Создать в классе Main список сотрудников и отсортировать его всеми
         * этими способами
         */
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(9, "Marc", 22, 2000));
        employees.add(new Employee(3, "Nic", 29, 2560));
        employees.add(new Employee(5, "John", 29, 3500));
        employees.add(new Employee(6, "David", 43, 3000));

        System.out.println("print list");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---------------");

        System.out.println("Sorting by id");
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---------------");

        System.out.println("Sorting by name");
        Collections.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---------------");

        System.out.println("Sorting by age");
        Collections.sort(employees, new AgeComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---------------");

        System.out.println("Sorting by Salary");
        Collections.sort(employees, new SalaryComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---------------");

        System.out.println("Sorting by Age And Name");
        Collections.sort(employees, new AgeAndNameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}