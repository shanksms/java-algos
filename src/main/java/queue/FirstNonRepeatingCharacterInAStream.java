package queue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
/**
 * iven an input stream of N characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If no non repeating element is found print -1.
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the stream. Then in the next line are x characters which are inserted to the stream.
 *
 * Output:
 * For each test case in a new line print the first non repeating elements separated by spaces present in the stream at every instinct when a character is added to the stream, if no such element is present print -1.
 *
 * Constraints:
 * 1 <= T <= 200
 * 1 <= N <= 500
 *
 * Example:
 * Input:
 * 2
 * 4
 * a a b c
 * 3
 * a a c
 *
 * Output:
 * a -1 b b
 * a -1 c
 *
 * Explanation:
 * Test Case 1: a a b c
 * The step wise first non-repeating elements are made bold:
 * a (print a)
 * a a (no non-repeating element, print -1)
 * a a b (print b)
 * a a b c (print b)
 * Result: a -1 b b
 *
 * Test Case 2: a a c
 * a (print a)
 * a a (no non-repeating element, print -1)
 * a a c (print c)
 * Result: a -1 c
 */
public class FirstNonRepeatingCharacterInAStream {

  private Queue<Character> q;
  private Map<Character, Integer> m;

  public FirstNonRepeatingCharacterInAStream() {
    this.q = new ArrayDeque<>();
    this.m = new HashMap<>();
  }
  public String returnFirstNonRepeatingCharacter(Character toAppend) {
    q.offer(toAppend);
    m.put(toAppend, m.getOrDefault(toAppend, 0) + 1);
    while(!q.isEmpty() && m.get(q.peek()) > 1) {
      q.poll();
    }
    if (!q.isEmpty()) {
      return q.peek() + "";
    } else {
      return "-1";
    }

  }




}
