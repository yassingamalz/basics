package basics.basics.generics;

import java.util.List;

/**
 * The {@code AppendBounded} class provides a utility method to append all elements
 * from a source list to a destination list. The source list can contain elements
 * that are a subtype of the destination list's element type.
 *
 * Example usage:
 * <pre>
 *     List<Number> dest = new ArrayList<>(List.of(1, 2, 3));
 *     List<Integer> src = List.of(4, 5);
 *     AppendBounded.append(dest, src); // dest becomes [1, 2, 3, 4, 5]
 * </pre>
 *
 * @param <T> the type of elements in the destination list
 * @param dst the destination list to which elements from {@code src} will be added
 * @param src the source list of elements to be appended to {@code dst}, which can be a subtype of {@code T}
 *
 * @throws NullPointerException if {@code dst} or {@code src} is {@code null}
 *
 * @author Yassin Sohim
 */
public class AppendBounded {

    public static <T> void append(List<T> dst, List<? extends T> src) {
        dst.addAll(src);
    }
}
