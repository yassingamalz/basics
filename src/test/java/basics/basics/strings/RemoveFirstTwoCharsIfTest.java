package basics.basics.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveFirstTwoCharsIfTest {
    @Test
    public void removeFirstTwoCharsIfCharAt() {
        assertEquals("Hello World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("Y"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt("H"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfCharAt(""));
    }
    @Test
    public void removeFirstTwoCharsIfStringBuilder() {
        assertEquals("Hello World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("Y"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder("H"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIfStringBuilder(""));
    }
}
