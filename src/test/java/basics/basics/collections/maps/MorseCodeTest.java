package basics.basics.collections.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    @Test
    void morseCode() {
        assertEquals(".... . ._.. ._.. ___", MorseCode.morseCode("hello"));
        assertEquals(".__ ___ ._. ._.. _..", MorseCode.morseCode("world"));
        assertEquals(".__ _____ ._. ._.. _..", MorseCode.morseCode("w0rld"));
        assertEquals("", MorseCode.morseCode(""));
        assertThrows(IllegalArgumentException.class, () -> MorseCode.morseCode("w$rld"));
    }
}