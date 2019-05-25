package dp;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 *              Total amount you can rob = 2 + 9 + 1 = 12.
 *
 *              Algorithm
 *
 * It could be overwhelming thinking of all possibilities on which houses to rob.
 *
 * A natural way to approach this problem is to work on the simplest case first.
 *
 * Let us denote that:
 *
 * f(k) = Largest amount that you can rob from the first k houses.
 * Ai = Amount of money at the ith house.
 *
 * Let us look at the case n = 1, clearly f(1) = A1.
 *
 * Now, let us look at n = 2, which f(2) = max(A1, A2).
 *
 * For n = 3, you have basically the following two options:
 *
 * Rob the third house, and add its amount to the first house's amount.
 *
 * Do not rob the third house, and stick with the maximum amount of the first two houses.
 *
 * Clearly, you would want to choose the larger of the two options at each step.
 *
 * Therefore, we could summarize the formula as following:
 *
 * f(k) = max(f(k – 2) + Ak, f(k – 1))
 */
public class HouseRobber {
  public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];
    int [] result = new int[nums.length];
    result[0] = nums[0];
    result[1] = Math.max(nums[1], nums[0]);
    for (int i = 2; i < nums.length; i++) {
      result[i] = Math.max(result[i - 2] + nums[i], result[i - 1]);
    }

    return result[nums.length - 1];
  }

  /**
   * we just need last 2 maximum values to calculate current max value;
   *
   * @param nums
   * @return
   */
  public int rob_anotherSolution(int[] nums) {
    int prevMax = 0; int currMax = 0;
    for (int num : nums) {
      int tmp = prevMax;
      currMax = Math.max(currMax, num + prevMax);
      prevMax = currMax;
    }
    return currMax;
  }



}
