package basics.basics.arrays;

import java.util.Arrays;

/**
 * Utility class for sorting arrays using the Bubble Sort algorithm.
 * Author: Yassin Sohim
 */
public class BubbleSort {

    /**
     * Sorts the original int[] array using the Bubble Sort algorithm.
     *
     * @param v The array to be sorted.
     */
    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int tmp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Returns a sorted copy of the original int[] using the Bubble Sort algorithm.
     *
     * @param v The array to be copied and sorted.
     * @return A new int[] containing the sorted elements of the original array.
     */
    public static int[] bubbleSortCopy(int[] v) {
        int[] ordered = Arrays.copyOf(v, v.length);
        bubbleSort(ordered);
        return ordered;
    }

    public static void bubbleSortFaster(int[] v) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    changed = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
    }
}
