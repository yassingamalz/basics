package basics.basics.generics;

/**
 * The {@code IterableToString} class provides a utility method to convert any {@code Iterable}
 * into a formatted string representation, where each element is separated by a comma.
 * Useful for debugging or displaying collections in a readable format.
 *
 * Example usage:
 * <pre>
 *     List<Integer> numbers = Arrays.asList(1, 2, 3);
 *     String result = IterableToString.iterableToString(numbers);
 * </pre>
 *
 * @param <E> the type of elements in the iterable source
 * @return a comma-separated {@code String} of elements in the iterable
 * @author Yassin Sohim
 */
public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder stringBuilder = new StringBuilder();
        for (E e : src) stringBuilder.append(e.toString()).append(", ");
        return stringBuilder.toString();
    }
}
