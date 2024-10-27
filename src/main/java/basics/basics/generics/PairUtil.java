package basics.basics.generics;

/**
 * The {@code PairUtil} class provides utility methods for working with
 * {@link Pair} objects.
 *
 * @author Yassin Sohim
 */
public class PairUtil {

    /**
     * Swaps the elements of the given pair.
     *
     * @param src the pair to swap
     * @param <K> the type of the first element in the pair
     * @param <V> the type of the second element in the pair
     * @return a new pair with the elements swapped
     */
    public static <K, V> Pair<V, K> swap(Pair<K, V> src) {
        return new Pair<>(src.getSecond(), src.getFirst());
    }
}
