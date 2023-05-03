import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static final String TEST_STRING = "AAA BBBB dEF cDkls bBb";

    @Test
    void testFunctionFor3() {
        String result = Main.FUNC_FOR_3.apply(TEST_STRING);
        assertTrue(Main.PRED_FOR_3.test(result));
        assertEquals("aaa BBBB def cDkls bbb", result);

        List<String> integers = List
                .of(1,2,3,4,5,1,2,3,4,5,1,1,2,3,2)
                .stream()
                .filter(i -> i == 2)
                .map(i -> i + 2)
                .map(i -> "privet" + i)
                .map(s -> s.toUpperCase())
                .limit(3)
                .toList();

        System.out.println(integers);
    }

    @Test
    void testFunctionFor4() {
        String result = Main.FUNC_FOR_4.apply(TEST_STRING);
        assertTrue(Main.PRED_FOR_4.test(result));
        assertEquals(TEST_STRING, result);
    }

    @Test
    void testFunctionFor5() {
        String result = Main.FUNC_FOR_5.apply(TEST_STRING);
        assertTrue(Main.PRED_FOR_5.test(result));
        assertEquals("AAA BBBB dEF ***** bBb", result);
    }

}