package basics.basics.oop.basics;

import java.util.Arrays;

/**
 * A class representing an enhanced resizable array that allows for dynamic resizing
 * and provides various methods to manipulate the array elements.
 * This class provides functionality to get and set values, check for the presence of
 * a value, fill the array with a specific value, and convert the array to a standard
 * array.
 *
 * Example usage:
 * <pre>
 *     EnhancedResizableArray array = new EnhancedResizableArray();
 *     array.set(0, 10);
 *     array.set(1, 20);
 *     boolean containsValue = array.contains(10); // Returns true
 *     int[] copiedArray = array.toArray(); // Returns a copy of the internal array
 * </pre>
 *
 * @author Yassin Sohim
 */
public class EnhancedResizableArray {
    private int[] array;
    private final int DEFAULT_CAPACITY = 4;

    /**
     * Creates an EnhancedResizableArray with a default initial capacity.
     */
    public EnhancedResizableArray() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    /**
     * Retrieves the value at the specified index in the array.
     *
     * @param index the index of the element to retrieve
     * @return the value at the specified index
     * @throws ArrayIndexOutOfBoundsException if the index is larger than the current array length
     */
    public int get(int index) {
        if (index < array.length) return array[index];
        throw new ArrayIndexOutOfBoundsException("index is larger than the array length");
    }

    /**
     * Sets the value at the specified index in the array.
     * If the index is out of bounds, the array is resized to accommodate the new index.
     *
     * @param index the index at which to set the value
     * @param value the value to set
     */
    public void set(int index, int value) {
        if (index < array.length) array[index] = value;
        else {
            int[] newArray = new int[index * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[index] = value;
            array = newArray;
        }
    }

    /**
     * Checks if the specified value is present in the array.
     *
     * @param value the value to search for
     * @return true if the value is found, false otherwise
     */
    public boolean contains(int value) {
        for (int i : array)
            if (value == i) return true;
        return false;
    }

    /**
     * Fills the entire array with the specified value.
     *
     * @param value the value to fill the array with
     */
    public void fill(int value) {
        Arrays.fill(array, value);
    }

    /**
     * Returns the current length of the array.
     *
     * @return the length of the array
     */
    public int length() {
        return array.length;
    }

    /**
     * Converts the internal array to a standard array and returns a copy.
     *
     * @return a copy of the internal array
     */
    public int[] toArray() {
        return Arrays.copyOf(array, array.length);
    }
}
