package basics.basics.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveFirstTwoCharsTest {
    @Test
    public void removeFirstTwoChars() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoChars("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("Y"));
    }    @Test
    public void removeFirstTwoCharsCharAt() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsCharAt("Y"));
    }
    @Test
    public void removeFirstTwoCharsStringBuilder() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoCharsStringBuilder("Y"));
    }
}
