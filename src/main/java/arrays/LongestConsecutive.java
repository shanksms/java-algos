package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * Your algorithm should run in O(n) complexity.
 *
 * Example:
 *
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
public class LongestConsecutive {
  public int longestConsecutive_sortingMethod(int[] nums) {
    if (nums.length == 0) return 0;
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int currentLength = 1;
    int maxLength = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] + 1 == nums[i + 1]) {
        currentLength++;
      } else if (nums[i] == nums[i + 1]) {
        //this is to cover input like [-1, 0, 1, 1, 2]
        //do nothing
      } else {
        maxLength = Math.max(currentLength, maxLength);
        currentLength = 1;
      }

    }
    maxLength = Math.max(currentLength, maxLength);


    return maxLength;
  }

  public int longestConsecutive_hashSetMethod(int[] nums) {
    Set<Integer> numSet = new HashSet<>();
    //maxLen is 0 to cover for the blank array boundary case
    int maxLen = 0;
    for (int num : nums) {
      numSet.add(num);
    }
    for (int num : numSet) {

      if (!numSet.contains(num - 1)) {
        int currNum = num;
        int currLen = 1;
        while (numSet.contains(currNum + 1)) {
          currLen += 1;
          currNum += 1;
        }
        maxLen = Math.max(currLen, maxLen);
      }

    }



    return maxLen;
  }

  }
