import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test() {
        String input = "aAa BBBB dEF cDkls bBb";
        String[] expected = new String[]{"AAA", "bbbb", "DEF", "*****", "BBB"};
        String[] result = Main.tester(input);
        assertArrayEquals(expected, result);
    }
}