package basics.basics.generics;

/**
 * The {@code BinarySearch} class provides a method for performing binary
 * search on an array of elements that implement the {@code Comparable}
 * interface.
 *
 * @param <T> the type of elements in the array
 * @author Yassin Sohim
 */
public class BinarySearch {

    /**
     * Performs a binary search on the given array for a specified key.
     *
     * @param array the array to search
     * @param key the element to search for
     * @param <T> the type of elements in the array
     * @return the index of the key if found, otherwise -1
     */
    public static <T extends Comparable<T>> int find(T[] array, T key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    /**
     * A helper method to perform binary search recursively.
     *
     * @param array the array to search
     * @param key the element to search for
     * @param left the left index of the search range
     * @param right the right index of the search range
     * @param <T> the type of elements in the array
     * @return the index of the key if found, otherwise -1
     */
    private static <T extends Comparable<T>> int binarySearch(T[] array, T key, int left, int right) {
        if (left > right)
            return -1;

        int median = left + right >>> 1;
        int compare = key.compareTo(array[median]);

        if (compare == 0)
            return median;

        else if (compare > 0)
            return binarySearch(array, key, median + 1, right);
        else
            return binarySearch(array, key, left, median - 1); // Corrected to use 'left' instead of '0'
    }
}
