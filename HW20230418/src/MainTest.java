
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test1() {
        String expected = "aaa ffff aa bbbb a bb aaa gggggggggggggg";
        long a = Main.countWords(expected, "a");
        assertEquals(a, 4);
    }

}