package basics.basics.generics;

/**
 * The {@code Pair} class represents a generic pair of objects,
 * allowing for the storage of two related values.
 *
 * @param <K> the type of the first element (key)
 * @param <V> the type of the second element (value)
 *
 * @author Yassin Sohim
 */
public class Pair<K, V> {
    private K first;
    private V second;

    /**
     * Constructs a new {@code Pair} with the specified key and value.
     *
     * @param key   the key of the pair
     * @param value the value of the pair
     */
    public Pair(K key, V value) {
        this.first = key;
        this.second = value;
    }

    /**
     * Returns the first element of the pair.
     *
     * @return the key
     */
    public K getFirst() {
        return first;
    }

    /**
     * Sets the first element of the pair.
     *
     * @param first the new key
     */
    public void setFirst(K first) {
        this.first = first;
    }

    /**
     * Returns the second element of the pair.
     *
     * @return the value
     */
    public V getSecond() {
        return second;
    }

    /**
     * Sets the second element of the pair.
     *
     * @param second the new value
     */
    public void setSecond(V second) {
        this.second = second;
    }
}
