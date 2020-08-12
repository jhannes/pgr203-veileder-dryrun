package no.kristiania.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shouldReturnIforOne() {
        assertEquals("I", Roman.convert(1));
    }

    @Test
    void shouldReturnIIforTwo() {
        assertEquals("II", Roman.convert(2));
    }
}
