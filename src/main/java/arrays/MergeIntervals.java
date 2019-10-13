package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/
 *
 */
public class MergeIntervals {
  public int[][] merge(int[][] intervals) {
    //sort the array by first index of subarrays
    Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
    LinkedList<int [] > mergedList = new LinkedList<>();
    for (int [] interval : intervals) {
      if (mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
        //no overlap. Add to the merged list
        mergedList.add(interval);
      } else {
        mergedList.getLast()[1] = Math.max(interval[1], mergedList.getLast()[1]);
      }

    }

    int [] [] result = new int[mergedList.size()][2];
    int count = 0;
    for (int [] interval : mergedList) {
      result[count][0] = interval[0];
      result[count][1] = interval[1];
      count++;
    }
    return result;
  }

  public static void main(String[] args) {
    MergeIntervals mergeIntervals = new MergeIntervals();
    int [] [] result = mergeIntervals.merge(new int[][]{
        {1, 3},
        {2, 6},
        {8, 10},
        {15, 18}
    });

    System.out.println(Arrays.deepToString(result));
  }
}
