package basics.basics.strings;

/**
 * This class contains a method to determine if the number of occurrences
 * of the substring "is" is equal to the number of occurrences of the substring "not"
 * within a given string.
 */
public class EqualIsNot {

    /**
     * Checks if the number of "is" occurrences is equal to the number of "not" occurrences in the string.
     *
     * @param string the input string to check
     * @return true if the count of "is" equals the count of "not", false otherwise
     */
    public static boolean equalIsNot(String string) {
        if (string == null || string.isEmpty())
            return true;
        else {
            int isCount = string.indexOf("is");
            int notCount = string.indexOf("not");

            // Traverse the string and find all occurrences of "is" and "not"
            while (isCount != -1 && notCount != -1) {
                isCount = string.indexOf("is", isCount + 2);  // Move past "is"
                notCount = string.indexOf("not", notCount + 3);  // Move past "not"
            }

            // Return true if both counts match, false otherwise
            return isCount == notCount;
        }
    }
}
