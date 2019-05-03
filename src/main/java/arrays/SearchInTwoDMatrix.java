package arrays;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * Example 1:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 * Example 2:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 */

public class SearchInTwoDMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int row = matrix.length;
        int column = matrix[0].length;

        int left = 0; int right = row * column - 1;
        /**
         * This is nothing but binary search over 2D sorted array
         */
        while (left <= right) {
            int mid = left + (right - left)/ 2;
            int midElement = matrix[mid / column] [mid % column];
            if (midElement == target) return true;
            else if (midElement > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }


}
