package arrays;

/**
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 *
 * You may assume that the intervals were initially sorted according to their start times.
 *
 * Example 1:
 *
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * Example 2:
 *
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * https://leetcode.com/problems/insert-interval/
 *
 */

import java.util.LinkedList;

public class InsertInterval {

  public int[][] insert(int[][] intervals, int[] newInterval) {

    LinkedList<int[]> output = new LinkedList<>();
    int index = 0;
    // add all intervals starting before newInterval

    while (index < intervals.length && newInterval[0] > intervals[index][0]){
      output.add(intervals[index]);
      index++;
    }

    int[] interval = new int[2];
    // if there is no overlap, just add the interval
    if (output.isEmpty() || output.getLast()[1] < newInterval[0])
      output.add(newInterval);
      // if there is an overlap, merge with the last interval
    else {
      int[] last = output.removeLast();
      interval[0] = last[0];
      interval[1] = Math.max(interval[1], newInterval[1]);
      output.add(interval);
    }

    // add next intervals, merge with newInterval if needed
    while(index < intervals.length){
      if (output.getLast()[1] < intervals[index][0]) {
        output.add(intervals[index]);
      } else {
        interval = output.removeLast();
        interval[1] = Math.max(interval[1], intervals[index][1]);
      }
      index++;
    }

    return output.toArray(new int[output.size()][]);
  }

}
