package shashank.company.paytm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * input (a(bc)d) output: dbca
 * input a(bc)d output acbd
 *
 */
public class StringReversal {

  public String reverse(String input) {

    Stack<Character> stack = new Stack<>();
    char [] cA = input.toCharArray();
    for (int i = 0; i < cA.length; i++) {
      if (cA[i] == ')') {
        List<Character>  ls = new ArrayList<>();
          while (stack.peek() != '(') {
            ls.add(stack.pop());
          }
          stack.pop();
        stack.addAll(ls);

      } else {
        stack.push(cA[i]);
      }

    }
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
      result.append(stack.pop());
    }
    return result.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(new StringReversal().reverse("(a(bc)d)"));
    System.out.println(new StringReversal().reverse("a(bc)d"));

  }

}
