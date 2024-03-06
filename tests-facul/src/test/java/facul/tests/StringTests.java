package facul.tests;

import facul.tests.calc.Strings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTests {

    @Test
    void testValidarEmail() {
        assertTrue(Strings.validarEmail("example@example.com"));
        assertTrue(Strings.validarEmail("user123@gmail.com"));
        assertFalse(Strings.validarEmail("user@example"));
        assertFalse(Strings.validarEmail("user123gmail.com"));
        assertFalse(Strings.validarEmail("user@"));
        assertFalse(Strings.validarEmail("user@.com"));
    }

    @Test
    void testContarCaracteres() {
        assertEquals(5, Strings.contarCaracteres("Hello"));
        assertEquals(0, Strings.contarCaracteres(""));
        assertEquals(8, Strings.contarCaracteres("Welcome!"));
    }

    @Test
    void testInverterString() {
        assertEquals("!dlroW olleH", Strings.inverterString("Hello World!"));
        assertEquals("", Strings.inverterString(""));
        assertEquals("54321", Strings.inverterString("12345"));
    }

    @Test
    void testConverterParaMaiusculas() {
        assertEquals("HELLO", Strings.converterParaMaiusculas("Hello"));
        assertEquals("WORLD", Strings.converterParaMaiusculas("World"));
        assertEquals("", Strings.converterParaMaiusculas(""));
        assertEquals("12345", Strings.converterParaMaiusculas("12345"));
    }
}
