package basics.algorithms;

/**
 * Author: Yassin Gamal
 * LeetCode Problem 202: Happy Number
 *
 * Description:
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number
 * equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 *
 * Algorithm Explanation:
 * The algorithm uses Floyd's cycle detection algorithm, also known as the "tortoise and hare" approach.
 * We maintain two pointers, one moving at twice the speed of the other. If there is a cycle, the faster
 * pointer will eventually catch up with the slower one. If the cycle contains the number 1, the sequence
 * is considered happy; otherwise, it is not.
 *
 * Complexity Analysis:
 * Time Complexity: O(log n) - The time complexity is determined by the cycle detection process.
 * Space Complexity: O(1) - The algorithm uses a constant amount of extra space.
 */
public class FloydCycleDetection {

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getDigitsSquare(slow);
            fast = getDigitsSquare(getDigitsSquare(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private int getDigitsSquare(int n) {
        int value = 0;
        while (n > 0) {
            int digit = n % 10;
            value += digit * digit;
            n /= 10;
        }
        return value;
    }
}
