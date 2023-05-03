

package employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EmployeeTest {
    Employee john;
    Employee marc;

    void init() {
        john = new Employee(9, "John", 21, 2000);
        marc = new Employee(8, "Marc", 30, 3500);
    }

    @Test
    void testCompareTo() {
        Assertions.assertTrue(john.compareTo(marc) > 0);
    }

    @Test
    void testComparatorAge() {
        AgeComparator ac = new AgeComparator();
        Assertions.assertTrue(ac.compare(john, marc) < 0);
    }

    @Test
    void testComparatorName() {
        NameComparator nc = new NameComparator();
        Assertions.assertTrue(nc.compare(john, marc) > 0);
    }

    @Test
    void testComparatorSalary() {
        SalaryComparator sc = new SalaryComparator();
        Assertions.assertTrue(sc.compare(john, marc) > 0);
    }

    @Test
    void testComparatorAgeName() {

        Assertions.assertTrue(new compare(john, marc) < 0);
    }
}
