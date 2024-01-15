package basics.algorithms;

/**
 * Author: Yassin Gamal
 * LeetCode Problem 136: Single Number
 *
 * Description:
 * Given an array of integers where every element appears twice except for one, find that single element.
 *
 * Algorithm Explanation:
 * We use the XOR (^) bitwise operation, exploiting its properties. XORing the same number
 * twice cancels out (A ^ A = 0), and XORing with 0 does not change the value (A ^ 0 = A).
 * By XORing all elements in the array, the duplicates cancel each other, leaving only
 * the unique element.
 *
 * Complexity Analysis:
 * Time Complexity: O(n) - where n is the length of the input array. We iterate through
 *                   the entire array once.
 * Space Complexity: O(1) - The algorithm uses a constant amount of extra space.
 */

public class SingleNumber {
    public int singleNumber(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result ^ numbers[i];
        }
        return result;
    }
}

