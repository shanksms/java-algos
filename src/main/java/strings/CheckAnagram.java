package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

    /**
     * idea is simple.
     * we create an array of int. at 0th index stores count of a's, 1st index stores count of b's etc.
     * we traverse both strings in the same loop. while traversing, character of first string is used to increment the count.
     * while character of the second sting is used to decrement the count.
     * if both strings are anagram, all the elements of the array should be 0.
     * @param s
     * @param t
     * @return
     */
    public static boolean checkAnagramForLowerCaseAsciiAndUpperCaseChars(String s, String t) {
        //52 is used to make sure, we can cover both upper case and lower case characters
        int [] cMap = new int[52];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            cMap[s.charAt(i) - 'A']++;
            cMap[t.charAt(i) - 'A']--;

        }


        return Arrays.stream(cMap).allMatch(e -> e == 0);
    }

    /**
     * Below method will work for all characters
     * @param s
     * @param t
     * @return
     */
    public static boolean checkAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return map1.equals(map2);
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("Ba", "aB"));
    }

}
