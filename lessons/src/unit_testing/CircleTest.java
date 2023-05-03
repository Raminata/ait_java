package unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = Circle.calculateArea(1d); //1.0
        double expectedArea = Math.PI;
        assertEquals(expectedArea, actualArea);
    }

}
