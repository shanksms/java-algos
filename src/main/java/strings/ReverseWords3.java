package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWords3 {
  public String reverseWords(String s) {
    String [] sA = s.split(" ");
    List<String> ls = Arrays.stream(sA)
        .map(word -> new StringBuilder(word))
        .map(sb -> sb.reverse())
        .map(sb -> sb.toString())
        .collect(Collectors.toList());
    return String.join(" ", ls);

  }

  public static void main(String[] args) {
    System.out.println(new ReverseWords3().reverseWords("Let's take LeetCode contest"));
  }

}
