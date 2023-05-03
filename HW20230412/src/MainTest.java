import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCountLetters() {
        String expect = "3a3b1c2d";
        String actualOutput = Main.countLetters("aaabbbcdd");
        assertEquals(expect, actualOutput);
    }

}