package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalsTraingle {
  public List<List<Integer>> generate(int numRows) {
    if (numRows == 0) return Collections.EMPTY_LIST;
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    //base case
    result.get(0).add(1);


    for  (int row = 1; row < numRows; row++) {
      List<Integer> previousRow = result.get(row - 1);
      result.add(new ArrayList<>());
      //base case for this row
      result.get(row).add(1);
      for (int c = 1; c < row; c++) {
        int cellValue = previousRow.get(c - 1) + previousRow.get(c);
        result.get(row).add(cellValue);
      }

      //base case for this row
      result.get(row).add(1);
    }

    return result;

  }


}
