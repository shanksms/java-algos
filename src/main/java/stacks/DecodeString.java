package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;
import javax.xml.stream.events.Characters;

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 *
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 *
 * Examples:
 *
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * https://leetcode.com/problems/decode-string/discuss/87556/Java-short-and-easy-understanding-solution-using-stack
 *
 */
public class DecodeString {
  public String decodeString(String s) {

    Deque<StringBuilder> result = new ArrayDeque<>();
    Deque<Integer> multipliers = new ArrayDeque<>();
    result.push(new StringBuilder());
    result.push(new StringBuilder());

    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        count = count * 10 + (s.charAt(i) - '0');
      } else if (s.charAt(i) == '[') {
        multipliers.push(count);
        count = 0;
        result.push(new StringBuilder());
      } else if (s.charAt(i) == ']') {
        int multiplier = multipliers.pop();
        String stringToMultiply = result.pop().toString();
        StringBuilder multipliedString = new StringBuilder();
        for (int j = 0; j < multiplier; j++) {
          multipliedString.append(stringToMultiply);
        }
        result.push(result.pop().append(multipliedString));
      } else {
        result.push(result.pop().append(s.charAt(i)));
      }

    }



    return result.pop().toString();
  }



}
