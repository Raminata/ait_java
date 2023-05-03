package shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    @Test
    void givenShapeCalculator_whenAllCircle_thenCorrectArea() {
        // given
        List<Shape> list = new ArrayList<>();
        list.add(new Circle(1));
        list.add(new Circle(2));
        list.add(new Circle(3));

        // when
        double result = ShapeCalculator.totalSquare(list);

        // then
        assertEquals(43.982297150257104, result);
    }

    @Test
    void givenShapeCalculator_whenAllRectangle_thenCorrectArea() {
        // given
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(5,7));
        list.add(new Rectangle(2,5));
        list.add(new Rectangle(10,17));

        // when
        double result = ShapeCalculator.totalSquare(list);

        // then
        assertEquals(215.0, result);
    }

    @Test
    void givenShapeCalculator_whenAllDifferent_thenCorrectArea() {
        // given
        List<Shape> list = new ArrayList<>();
        list.add(new Circle(5));
        list.add(new Rectangle(100, 150));

        // when
        double result = ShapeCalculator.totalSquare(list);

        // then
        assertEquals(15078.539816339744, result);
    }

}