package strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
  public void reverseString(char[] s) {
    helper(0, s.length - 1, s);
  }

  private void helper(int i, int j, char [] s) {
    if (i > j) return;
    char tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;
    helper(i + 1, j - 1, s);
  }


}
