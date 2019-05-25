package dp;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
 *              because they are adjacent houses.
 * Example 2:
 *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 */
public class HouseRobber2 {

  /**
   * this can be divided in to 2 problems:
   * from house 1 to n -1 find max
   * from house 2 to n find max
   * maximum of above two values will be the result
   * @param nums
   * @return
   */
  public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];
    int result1 = helper(nums, 0, nums.length - 1);
    int result2 = helper(nums, 1, nums.length);

    return Math.max(result1, result2);
  }

  private int helper(int [] nums, int start, int end) {
    int prevMax = 0; int currMax = 0;
    for (int i = start; i<end; i++) {
      int temp = currMax;
      currMax = Math.max(currMax, prevMax + nums[i]);
      prevMax = temp;
    }
    return currMax;
  }

}
