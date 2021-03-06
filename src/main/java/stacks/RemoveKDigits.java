package stacks;

import java.util.Stack;

/**
 * Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 *
 * Note:
 * The length of num is less than 10002 and will be ≥ k.
 * The given num does not contain any leading zero.
 * Example 1:
 *
 * Input: num = "1432219", k = 3
 * Output: "1219"
 * Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
 * Example 2:
 *
 * Input: num = "10200", k = 1
 * Output: "200"
 * Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
 * Example 3:
 *
 * Input: num = "10", k = 2
 * Output: "0"
 * Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 * Accepted
 * 59,098
 * Submissions
 * 223,018
 */
public class RemoveKDigits {
  public String removeKdigits(String num, int k) {
    Stack<Character> stack = new Stack<>();
    int len = num.length();
    int i = 0;
    //Keep removing element from stack if next element in the array is greater than
    //the last added element in stack
    while (i < len) {
      while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
        stack.pop();
        k--;
      }
      stack.push(num.charAt(i));
      i++;

    }

    while (k > 0) {
      stack.pop();
      k--;
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    sb.reverse();


    while(sb.length()>1 && sb.charAt(0)=='0')
      sb.deleteCharAt(0);
    return sb.length() == 0 ? "0" : sb.toString();
  }

}
