import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherTest {

    @Test
    public void testReverseWords() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expectedOutput = "dog lazy the over jumps fox brown quick The";
        String actualOutput = Weather.reverseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

}
