package arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

  public int[] plusOne(int[] digits) {
    int carry = 1;
    int i = digits.length - 1;
    while (i >= 0) {
      if (digits[i] != 9) {
        digits[i] = digits[i] + carry;
        carry = 0;
        break;
      } else {
        digits[i] = 0;
        carry = 1;
        i--;
      }
    }
    if (carry == 0) {
      return digits;
    } else {
      int [] result = new int[digits.length + 1];
      result[0] = 1;
      System.arraycopy(digits, 0, result, 1, digits.length);
      return result;
    }

  }

  public int[] plusOneBetterSolution(int[] digits) {

    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
      if(digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      digits[i] = 0;
    }

    int[] newNumber = new int [n+1];
    newNumber[0] = 1;

    return newNumber;
  }
}
