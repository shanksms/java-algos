package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * Example 1:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 *
 * Input:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * https://leetcode.com/problems/spiral-matrix/
 * https://www.youtube.com/watch?v=siKFOI8PNKM&feature=player_embedded
 *
 */
public class SpiralMatrix {
  public List< Integer > spiralOrder(int[][] matrix) {


    if (matrix.length == 0) return Collections.emptyList();
    int top = 0; int bottom = matrix.length - 1;
    int left = 0; int right = matrix[0].length - 1;
    List<Integer> result = new ArrayList<>();
    int direction = 0;
    while(top <= bottom && left <= right) {
      if (direction == 0) {
        for (int k = left; k <= right; k++) {
          result.add(matrix[top][k]);
        }
        top++;
      }
      if (direction == 1) {
        for (int k = top; k <= bottom; k++) {
          result.add(matrix[k][right]);
        }
        right--;
      }

      if (direction == 2) {
        for (int k = right; k >= left; k--) {
          result.add(matrix[bottom][k]);
        }
        bottom--;
      }

      if (direction == 3) {
        for (int k = bottom; k >= top; k--) {
          result.add(matrix[k][left]);
        }
        left++;
      }
      direction = (direction + 1) % 4;

    }
    return result;
  }

}
