import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsterixCaseTest {

    @Test
    void test(){
        String input = "AaAaa";
        String expected = "*****";
        String result = new AsterixCase().modify(input);
        assertEquals(expected, result);
    }

}