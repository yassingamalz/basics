package basics.basics.generics;

import java.util.List;

/**
 * The {@code Reverse} class provides a utility method to reverse the order of elements
 * in a list.
 *
 * Example usage:
 * <pre>
 *     List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
 *     Reverse.reverse(numbers); // numbers becomes [5, 4, 3, 2, 1]
 * </pre>
 *
 * @param <T> the type of elements in the list
 *
 * @throws NullPointerException if {@code list} is {@code null}
 *
 * @author Yassin Sohim
 */
public class Reverse {
    public static <T> void reverse(List<T> list) {
        int size = list.size();
        for (int i = 0; i < Math.floor((double) size / 2); i++) {
            T tmp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, tmp);
        }
    }
}
