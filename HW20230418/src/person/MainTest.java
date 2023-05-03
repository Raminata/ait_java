package person;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test() {
        Address a = new Address("Street1", 5);
        Person p = new Person("Jack", 21, a);

        Address a1 = new Address("Street2", 5);
        Person p1 = new Person("John", 17, a1);

        Address a2 = new Address("Street3", 5);
        Person a4 = new Person("Jack", 16, a2);

        List<Person> list = List.of(p, a4, p1);
        List<Address> addresses = Main.getAddresses(list);

        assertEquals(addresses, List.of(a));
    }

}