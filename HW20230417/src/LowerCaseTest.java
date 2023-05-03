import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowerCaseTest {

    @Test
    void test(){
        String input = "AaA";
        String expected = "aaa";
        String result = new LowerCase().modify(input);
        assertEquals(expected, result);
    }

}