import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IgnoreCaseTest {

    @Test
    void test(){
        String input = "AaAaa";
        String expected = "AaAaa";
        String result = new IgnoreCase().modify(input);
        assertEquals(expected, result);
    }

}