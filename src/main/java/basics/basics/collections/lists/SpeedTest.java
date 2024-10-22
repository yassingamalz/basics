package basics.basics.collections.lists;

import java.util.List;

/**
 * The {@code SpeedTest} class provides utility methods to measure the time taken to insert
 * elements at the beginning and at the end of a list. This is useful for comparing the
 * performance of different list implementations, such as {@code LinkedList} and {@code ArrayList},
 * for these types of operations.
 *
 * Example usage:
 * <pre>
 *     List<String> list = new LinkedList<>();
 *     long timeForBeginning = SpeedTest.insertBeginning(list, "test", 1000);
 *     long timeForEnd = SpeedTest.insertEnd(list, "test", 1000);
 * </pre>
 *
 * Both methods return the time taken in nanoseconds for the specified number of insertions.
 *
 * @author Yassin Sohim
 */
public class SpeedTest {

    /**
     * Inserts an item at the beginning of the list multiple times and measures the time taken.
     *
     * @param list the list in which items will be inserted
     * @param item the item to be inserted
     * @param times the number of times the item should be inserted
     * @return the time taken in nanoseconds for all insertions
     */
    public static long insertBeginning(List<String> list, String item, int times) {
        long start = System.nanoTime();
        for (int i = 0; i < times; i++)
            list.add(0, item);  // Corrected method to insert at the beginning
        return System.nanoTime() - start;
    }

    /**
     * Inserts an item at the end of the list multiple times and measures the time taken.
     *
     * @param list the list in which items will be inserted
     * @param item the item to be inserted
     * @param times the number of times the item should be inserted
     * @return the time taken in nanoseconds for all insertions
     */
    public static long insertEnd(List<String> list, String item, int times) {
        long start = System.nanoTime();
        for (int i = 0; i < times; i++)
            list.add(item);  // Using add() for appending to the end
        return System.nanoTime() - start;
    }
}
