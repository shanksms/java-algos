package Maths;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 * 2^31 = 2147483648
 * for 32 bit signed int range will from -2147483648 to 2147483647
 */
public class ReverseInteger {

  public int reverse(int x) {
    int rev = 0;
    while (x != 0 ) {
      int rem = x % 10;
      if (rev > Integer.MAX_VALUE/10
          || (rev == Integer.MAX_VALUE/10 && rem > 7)) return 0;
      if (rev < Integer.MIN_VALUE/10
          || (rev == Integer.MIN_VALUE/10 && rem < -8)) return 0;

      rev = rev * 10 + rem;
      x /= 10;

    }

    return rev;
  }

}
