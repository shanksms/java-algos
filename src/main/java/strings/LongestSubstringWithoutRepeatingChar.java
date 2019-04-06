package strings;

import java.util.*;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingChar {

    public int lengthOfLongestSubstringSlidingWindow(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int len = s.length();
        int max = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Integer.max(max, j - i);
            } else {
                set.remove(s.charAt(i++));
            }

        }

        return max;


    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingChar().lengthOfLongestSubstringSlidingWindow("pwwkew"));
        Arrays.asList(1, 2, 3);
    }



}
