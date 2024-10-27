package basics.basics.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code FilterLists} class filters a list of lists of strings, retaining only
 * the lists in which all strings pass validation as per {@link CheckString#checkString(String)}.
 *
 * @version 1.0
 * author Yassin Sohim
 */
public class FilterLists {

    /**
     * Filters the input list of lists of strings, retaining only those lists in which
     * all strings pass validation in {@code CheckString.checkString}.
     *
     * @param lists the list of lists of strings to be filtered
     * @return a list of lists where each inner list is validated successfully
     */
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> filteredList = new ArrayList<>();
        for (List<String> list : lists) {
            try {
                for (String string : list) {
                    CheckString.checkString(string);
                }
                filteredList.add(list);
            } catch (ParseException e) {
                // Ignoring lists with any invalid strings as per requirements
            }
        }
        return filteredList;
    }
}
