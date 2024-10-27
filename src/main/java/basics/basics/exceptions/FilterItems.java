package basics.basics.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code FilterItems} class filters a list of strings, retaining only those
 * that pass the validation specified in {@link CheckString#checkString(String)}.
 *
 * @version 1.0
 * @author Yassin Sohim
 */
public class FilterItems {

    /**
     * Filters the input list of strings, retaining only those that pass
     * validation in {@code CheckString.checkString}.
     *
     * @param strings the list of strings to be filtered
     * @return a list of validated strings
     */
    public static List<String> filterItems(List<String> strings) {
        List<String> filteredItems = new ArrayList<>();
        for (String string : strings) {
            try {
                CheckString.checkString(string);
                filteredItems.add(string);
            } catch (ParseException e) {
                // Ignoring invalid strings as per requirements
            }
        }
        return filteredItems;
    }
}
