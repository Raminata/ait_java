import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LettersTest {

    @Test
    public void testFileNotExist() {
        String actualOutput = Letters.readFileToString("test1.txt");
        assertEquals(null, actualOutput);
    }

    @Test
    public void testFileExist() {
        String expect = "a b c\n";
        String actualOutput = Letters.readFileToString("test.txt");
        assertEquals(expect, actualOutput);
    }

}
