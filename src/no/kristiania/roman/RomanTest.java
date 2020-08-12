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

    @Test
    void shouldReturnIIIforThree() {
        assertEquals("III", Roman.convert(3));
    }

    @Test
    void shouldReturnIVforFour() {
        assertEquals("IV", Roman.convert(4));
    }

    @Test
    void shouldReturnVforFive() {
        assertEquals("V", Roman.convert(5));
    }

    @Test
    void shouldReturnVIforSix() {
        assertEquals("VI", Roman.convert(6));
    }

    @Test
    void shouldReturIXforNine() {
        assertEquals("IX", Roman.convert(9));
    }
}
