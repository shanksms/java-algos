package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * https://leetcode.com/problems/subarray-sum-equals-k/solution/
 *
 */
public class SubarraySumEquals {
    public int subarraySumMethod1(int[] nums, int k) {
        int sums [] = new int[nums.length + 1];
        int sum = 0;
        int c  = 1;
        for (int num : nums) {
            sums[c] = sums[c - 1] + num;
            c++;
        }
        System.out.println(Arrays.toString(sums));
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (k == sums[j] - sums[i]) {
                    count++;
                }
            }
        }

        return count;

    }

    /**
     * O(n) complexity solution
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumMethod2(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}
