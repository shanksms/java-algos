package searching;

/**
 * Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
 *
 * Example 1:
 *
 * Input:
 * N = 4 , M = 4
 * Arr[][] = {{0, 1, 1, 1},
 *            {0, 0, 1, 1},
 *            {1, 1, 1, 1},
 *            {0, 0, 0, 0}}
 * Output: 2
 * Explanation: Row 2 contains 4 1's (0-based
 * indexing).
 *
 * Example 2:
 *
 * Input:
 * N = 2, M = 2
 * Arr[][] = {{0, 0}, {1, 1}}
 * Output: 1
 * Explanation: Row 1 contains 2 1's (0-based
 * indexing).
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function rowWithMax1s() which takes the array of booleans arr[][], n and m as input parameters and returns the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.
 *
 *
 * Expected Time Complexity: O(N+M)
 * Expected Auxiliary Space: O(1)
 *
 *
 * Constraints:
 * 1 ≤ N, M ≤ 103
 * 0 ≤ Arr[i][j] ≤ 1
 *
 *
 */
public class MAxNoOfOnes {
  int rowWithMax1s(int arr[][], int n, int m) {
    int result = -1;
    int currentMax = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {

      int start = 0; int end = m - 1;
      int startingIndexOne = -1;
      int numberOfOnes = -1;
      while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[i][mid] == 1) {
          end = mid - 1;
          startingIndexOne = mid;
        } else {
          start = mid + 1;
        }
      }
      if (startingIndexOne != -1) {
        numberOfOnes = m - startingIndexOne;
        if (currentMax < numberOfOnes) {
          result = i;
          currentMax = numberOfOnes;
        }
      }


    }

    return result;
  }
  /**
   * m + n solution
   *
   */

  public int betterSolution(int arr[][], int n, int m) {

    if (arr.length == 0) {
      return -1;
    }
    int currentMinIndexOfOne = m - 1;
    int currentRowIndex = -1;
    for (int i = 0; i < n; i++) {
      if (currentMinIndexOfOne >=1 && arr[i][currentMinIndexOfOne-1] == 0) {
        continue;
      } else {
        while (currentMinIndexOfOne-1 >= 0 && arr[i][currentMinIndexOfOne-1] == 1) {
          currentMinIndexOfOne -= 1;
          currentRowIndex = i;
        }
      }

    }


    return currentRowIndex;
  }
}
