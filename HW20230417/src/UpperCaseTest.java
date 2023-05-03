import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    @Test
    void test(){
        String input = "aaa";
        String expected = "AAA";
        String result = new UpperCase().modify(input);
        assertEquals(expected, result);
    }

}