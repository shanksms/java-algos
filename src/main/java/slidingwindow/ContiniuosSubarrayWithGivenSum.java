package slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 *
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.
 *
 * Output:
 * For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 107
 * 1 <= Ai <= 1010
 *
 * Example:
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * Output:
 * 2 4
 * 1 5
 *
 * Explanation :
 * Testcase1: sum of elements from 2nd position to 4th position is 12
 * Testcase2: sum of elements from 1st position to 5th position is 15
 */
public class ContiniuosSubarrayWithGivenSum {

  public int [] solution1(int [] arr, int sum) {

    Map<Integer, Integer> map = new HashMap<>();
    Map<Integer, Integer> reverseMap = new HashMap<>();
    int currentSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currentSum = currentSum + arr[i];
      map.put(currentSum, i);
      reverseMap.put(i, currentSum);
      if (currentSum == sum) return new int[] {0, i};
    }

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(reverseMap.get(i) - sum)) {
        return new int[] { map.get(reverseMap.get(i) - sum), i};
      }

    }

    return new int[]{-1, -1};
  }

  public int [] solution2(int [] arr, int sum) {
    int currentSum = 0;
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      currentSum += arr[i];
      //this means, sub-array starts at index 0
      if (sum == currentSum) return new int[]{0, i};
      if (map.containsKey(currentSum - sum)) {
        return new int[]{map.get(currentSum - sum), i};
      } else {
        map.put(currentSum, i);
      }

    }

    return new int[]{-1, -1};

  }

  }
