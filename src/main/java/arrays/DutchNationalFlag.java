package arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Follow up:
 *
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 * Could you come up with a one-pass algorithm using only constant space?
 */
public class DutchNationalFlag {
    public void sortColors_ApproachOne(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for (int num : nums) {
            if (num == 0) zeroes++;
            if (num == 1) ones++;
            if (num == 2) twos++;
        }
        int i = 0;
        while (zeroes != 0 || ones != 0 || twos != 0) {
            if (zeroes != 0) {
                nums[i] = 0;
                zeroes--;
            }
            else if (ones != 0) {
                nums[i] = 1;
                ones--;
            } else {
                nums[i] = 2;
                twos--;
            }
            i++;
        }
    }
}
