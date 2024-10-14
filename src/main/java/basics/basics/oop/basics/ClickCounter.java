package basics.basics.oop.basics;

/**
 * A simple click counter class that keeps track of how many times the click() method is called.
 * It provides methods to click, undo, reset, and retrieve the current value of the counter.
 *
 * @author Yassin Sohim
 */
public class ClickCounter {
    private int value = 0;

    /**
     * Increments the counter value by 1.
     */
    public void click() {
        value++;
    }

    /**
     * Decrements the counter value by 1, but prevents it from going below 0.
     */
    public void undo() {
        value = Math.max(value - 1, 0);
    }

    /**
     * Returns the current value of the counter.
     *
     * @return the current value of the counter
     */
    public int getValue() {
        return value;
    }

    /**
     * Resets the counter value to 0.
     */
    public void reset() {
        value = 0;
    }

    /**
     * Returns a string representation of the ClickCounter object.
     *
     * @return a string representation of the counter value
     */
    @Override
    public String toString() {
        return "ClickCounter{" + "counter=" + value + '}';
    }
}
