package hw20230417;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransformerTest {
    private Transformer transformer;
    String input;
    Predicate<String> predicate;
    Function<String, String> function;

    @BeforeEach
    public void init() {
        transformer= new Transformer();
        input = "AAA BBBB dEF cDkls bBb";
    }
    @Test
    public  void test_empty() {
        input = "";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();
        assertEquals(input, transformer.transformering(input,predicate,function));
    }
    @Test
    public void test_3_toLowerCase() {
        String expected = "aaa BBBB def cDkls bbb";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();
        assertEquals((expected), transformer.transformering(input, predicate, function));
    }
    @Test
    public void test_4_toLowerCase() {
        String expected = "aaa bbbb def cDkls bbb";
        predicate = s -> s.length() == 4;
        function = s -> s.toLowerCase();
        assertEquals((expected),transformer.transformering(input, predicate, function));
    }

    @Test
    public void test_4_toUpperCase() {
        String expected = "aaa BBBB def cDkls bbb";
        predicate = s -> Boolean.parseBoolean(s.toUpperCase());
        assertEquals((expected),transformer.transformering(input, predicate, function));
    }

    @Test
    public void test_5Stars() {
        String expected = "aaa bbbb def ***** bbb";
        predicate = s -> s.length() == 5;
        function = s -> s = "*****";
        assertEquals((expected),transformer.transformering(input, predicate, function));
    }

    @Test
    public void test_nothingChanged() {
        input = " aa bbbbbbbbbbbbb";
        predicate = s -> s.length() == 5;
        function = s -> s = "*****";
        assertEquals((input), transformer.transformering(input, predicate, function));
    }
}
