package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 */
public class PascalsTraingleSecondVariation {
  public List<Integer> getRow(int rowIndex) {

    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    //base case
    result.get(0).add(1);


    for  (int row = 1; row < rowIndex + 1; row++) {
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

    return result.get(rowIndex);

  }

}
