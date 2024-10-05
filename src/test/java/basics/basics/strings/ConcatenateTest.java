package basics.basics.strings;

import org.junit.Test;
import java.time.Duration;
import static org.junit.Assert.assertEquals;

public class ConcatenateTest {
    @Test
    public void concatenateSlow() {
        long start = System.nanoTime();
        assertEquals("Hello World!", Concatenate.concatenateSlow(new String[]{"Hello", " ", "World", "!"}));
        assertEquals("Hello World!", Concatenate.concatenateSlow(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate.concatenateSlow(new String[]{"Hello World", "!"}));
        long end = System.nanoTime();

        System.out.println(Duration.ofNanos(end - start).toNanos() + "ns");
    }

    @Test
    public void concatenateFast() {
        long start = System.nanoTime();
        assertEquals("Hello World!", Concatenate.concatenateFast(new String[]{"Hello", " ", "World", "!"}));
        assertEquals("Hello World!", Concatenate.concatenateFast(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate.concatenateFast(new String[]{"Hello World", "!"}));
        long end = System.nanoTime();

        System.out.println(Duration.ofNanos(end - start).toNanos() + "ns");
    }
}