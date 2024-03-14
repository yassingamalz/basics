package basics.basics;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sLetters = new HashMap();
        Map<Character, Integer> tLetters = new HashMap();

        char[] charArrayInS = s.toCharArray();
        char[] charArrayInT = t.toCharArray();

        for (int i = 0; i < charArrayInS.length; i++)
            if (sLetters.containsKey(charArrayInS[i]))
                sLetters.put(charArrayInS[i], sLetters.get(charArrayInS[i]) + 1);
            else
                sLetters.put(charArrayInS[i], 1);

        for (int i = 0; i < charArrayInT.length; i++)
            if (tLetters.containsKey(charArrayInT[i]))
                tLetters.put(charArrayInT[i], tLetters.get(charArrayInT[i]) + 1);
            else
                tLetters.put(charArrayInT[i], 1);

        return true;
    }
}