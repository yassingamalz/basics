package basics.basics.generics;

/**
 * The {@code PairSameType} class represents a generic pair of objects
 * of the same type, allowing for the storage and manipulation of two related values.
 *
 * @param <E> the type of the elements in the pair
 *
 * @author Yassin Sohim
 */
public class PairSameType<E> {
    private E first;
    private E second;

    /**
     * Constructs a new {@code PairSameType} with the specified elements.
     *
     * @param first  the first element of the pair
     * @param second the second element of the pair
     */
    public PairSameType(E first, E second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Returns the first element of the pair.
     *
     * @return the first element
     */
    public E getFirst() {
        return first;
    }

    /**
     * Sets the first element of the pair.
     *
     * @param first the new first element
     */
    public void setFirst(E first) {
        this.first = first;
    }

    /**
     * Returns the second element of the pair.
     *
     * @return the second element
     */
    public E getSecond() {
        return second;
    }

    /**
     * Sets the second element of the pair.
     *
     * @param second the new second element
     */
    public void setSecond(E second) {
        this.second = second;
    }

    /**
     * Swaps the elements of the pair.
     */
    public void swap() {
        E tmp = this.first;
        setFirst(getSecond());
        setSecond(tmp);
    }
}
