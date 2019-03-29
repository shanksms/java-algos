package stacks;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */

public class ValidParentheses {
    public static boolean isValid(String s) {
        //empty string should return true. Clarify with interviewer
        if (s.length() == 0) return true;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                //if stack is empty at this point, then it means, symbols are not balanced.
                if (st.isEmpty()) return false;
                if (ch == ')' && st.pop() != '(') return false;
                if (ch == '}' && st.pop() != '{') return false;
                if (ch == ']' && st.pop() != '[') return false;

            }


        }

        if (st.size() == 0) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("(}"));
    }


}
