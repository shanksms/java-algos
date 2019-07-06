package arrays;

import java.util.Arrays;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8
Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int n = 0;
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if(++n == nums[i]) continue;
            else return n;
        }
        return ++n;


    }

    public int missingNumberMathApproach(int [] nums) {

        int n = nums.length;
        int sum1 = Arrays.stream(nums).sum();
        int sum2 = (n * (n + 1))/ 2;

        return sum2 - sum1;
    }
    /*
    * Algorithm

Because we know that nums contains nn numbers and that
it is missing exactly one number on the range [0..n-1][0..n−1],
we know that nn definitely replaces the missing number in nums.
Therefore, if we initialize an integer to nn and XOR it with every index and value,
 we will be left with the missing number.
  Consider the following example (the values have been sorted for intuitive convenience, but need not be):

Index	0	1	2	3
Value	0	1	3	4

=4∧(0∧0)∧(1∧1)∧(2∧3)∧(3∧4)
=(4∧4)∧(0∧0)∧(1∧1)∧(3∧3)∧2
=0∧0∧0∧0∧2
=2
​



     */

    public static int missingNumberXorApproach(int [] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 2}));
    }
}
