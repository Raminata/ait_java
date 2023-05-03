import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void test1() {
        StringConcate connect = ((a, b) -> "" + a + "" + b);
        assertEquals("53", connect.concat(5, 3));
    }

    @Test
    void test2() {
        Checkable isThree = a -> a.length() == 3;
        assertTrue(isThree.check("Hey"));
    }

}