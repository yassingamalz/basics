package basics.basics.generics;

import java.util.List;

/**
 * The {@code Append} class provides a utility method to append all elements
 * from a source list to a destination list, preserving the original order.
 *
 * Example usage:
 * <pre>
 *     List<String> dest = new ArrayList<>(List.of("Hello"));
 *     List<String> src = List.of("World", "!");
 *     Append.append(dest, src); // dest becomes ["Hello", "World", "!"]
 * </pre>
 *
 * @param <T> the type of elements in the lists
 * @param dst the destination list to which elements from {@code src} will be added
 * @param src the source list of elements to be appended to {@code dst}
 *
 * @throws NullPointerException if {@code dst} or {@code src} is {@code null}
 *
 * @author Yassin Sohim
 */
public class Append {

    public static <T> void append(List<T> dst, List<T> src) {
        dst.addAll(src);
    }
}
