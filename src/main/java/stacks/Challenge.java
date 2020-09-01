package stacks;

import java.util.LinkedList;
import java.util.Stack;

class Challenge {
  public static double calc( String expression ) {
    Stack<Double> nums = new Stack<>();
    Stack<Character> chars = new Stack<Character>();
    char [] cArr = expression.toCharArray();

    for (int i = 0; i < cArr.length; ) {
      if (cArr[i] == ' ') continue;

      if (Character.isDigit(cArr[i])) {
        StringBuilder sb = new StringBuilder();
        while (i < cArr.length && Character.isDigit(cArr[i])) {
          sb.append(cArr[i++]);
        }
        nums.push(Double.parseDouble(sb.toString()));
        continue;
      }
      if (cArr[i] == '(') {
        chars.push(cArr[i]);
        i++;
        continue;
      }
      if (cArr[i] == ')') {
        while(chars.peek() != '(') {
          nums.push(helper(nums.pop(), nums.pop(), chars.pop()));
        }
        chars.pop();
      }
      if (cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '*' || cArr[i] == '/') {
        chars.push(cArr[i]);
        i++;
      }

    }

    while (!chars.isEmpty()) {
      nums.push(helper(nums.pop(), nums.pop(), chars.pop()));
    }

    return nums.pop();
  }
  private static double helper(double num2, double num1 , char op) {
    if (op == '+') {
      return num1 + num2;
    } else if (op == '-') {
      return num1 - num2;
    } else if (op == '*') {
      return num1 * num2;
    } else  {
      return num1 / num2;
    }


  }


}