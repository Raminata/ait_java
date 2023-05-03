package employee;

/**
 * Создать класс Employee , содержащий следующие поля и методы:
 * <p>
 * поле имя,
 * поле зарплата,
 * поле количество рабочих часов в день,
 * конструктор
 * метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника
 * меньше 500
 * <p>
 * метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество
 * рабочих часов в день больше 6.
 * <p>
 * Создать несколько экземпляров класса с различными параметрами и вывести на
 * экран результат работы методов
 */
public class Employee {
    String name;
    double salary;
    int workHours;

    public Employee(String name, double salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }


    public void addSalary() {
        //salary = 0;
        if (salary < 500) {
            salary += 10;
        }
    }


    public void addForWork() {
        if (workHours > 6) {
            salary += 5;
        }
    }
}
