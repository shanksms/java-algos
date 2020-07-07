package Maths;

/**
 * Given an integer x. The task is to find the square root of x. If x is not a perfect square, then return floor(√x).
 *
 * Input:
 * First line of input contains number of testcases T. For each testcase, the only line contains the number x.
 *
 * Output:
 * For each testcase, print square root of given integer.
 *
 * User Task:
 * The task is to complete the function floorSqrt() which should return the square root of given number x.
 *
 * Constraints:
 * 1 ≤ T ≤ 1000
 * 1 ≤ x ≤ 107
 *
 * Example:
 * Input:
 * 2
 * 5
 * 4
 * Output:
 * 2
 * 2
 *
 * Explanation:
 * Testcase 1: Since, 5 is not perfect square, so floor of square_root of 5 is 2.
 * Testcase 2: Since, 4 is a perfect square, so its square root is 2.
 *
 */
public class SquareRoot {

  public static int floorSqrt(int x)
  {
    // Base Cases
    if (x == 0 || x == 1)
      return x;

    // Do Binary Search for floor(sqrt(x))
    int start = 1, end = x, ans=0;
    while (start <= end)
    {
      int mid = (start + end) / 2;

      // If x is a perfect square
      if (mid*mid == x)
        return mid;

      // Since we need floor, we update answer when mid*mid is
      // smaller than x, and move closer to sqrt(x)
      if (mid*mid < x)
      {
        start = mid + 1;
        ans = mid;
      }
      else   // If mid*mid is greater than x
        end = mid-1;
    }
    return ans;
  }

}
