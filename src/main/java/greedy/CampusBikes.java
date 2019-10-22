package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * https://leetcode.com/problems/campus-bikes/
 * On a campus represented as a 2D grid, there are N workers and M bikes, with N <= M. Each worker and bike is a 2D coordinate on this grid.
 *
 * Our goal is to assign a bike to each worker. Among the available bikes and workers, we choose the (worker, bike) pair with the shortest Manhattan distance between each other, and assign the bike to that worker. (If there are multiple (worker, bike) pairs with the same shortest Manhattan distance, we choose the pair with the smallest worker index; if there are multiple ways to do that, we choose the pair with the smallest bike index). We repeat this process until there are no available workers.
 *
 * The Manhattan distance between two points p1 and p2 is Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|.
 *
 * Return a vector ans of length N, where ans[i] is the index (0-indexed) of the bike that the i-th worker is assigned to.
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: workers = [[0,0],[2,1]], bikes = [[1,2],[3,3]]
 * Output: [1,0]
 * Explanation:
 * Worker 1 grabs Bike 0 as they are closest (without ties), and Worker 0 is assigned Bike 1. So the output is [1, 0].
 * Example 2:
 *
 *
 *
 * Input: workers = [[0,0],[1,1],[2,0]], bikes = [[1,0],[2,2],[2,1]]
 * Output: [0,2,1]
 * Explanation:
 * Worker 0 grabs Bike 0 at first. Worker 1 and Worker 2 share the same distance to Bike 2, thus Worker 1 is assigned to Bike 2, and Worker 2 will take Bike 1. So the output is [0,2,1].
 *
 *
 * Note:
 *
 * 0 <= workers[i][j], bikes[i][j] < 1000
 * All worker and bike locations are distinct.
 * 1 <= workers.length <= bikes.length <= 1000
 */
public class CampusBikes {

  /**
   * As the question states, there are n workers and m bikes, and m > n.
   * We are able to solve this question using a greedy approach.
   *
   * initiate a priority queue of bike and worker pairs. The heap order should be Distance ASC, WorkerIndex ASC, Bike ASC
   * Loop through all workers and bikes, calculate their distance, and then throw it to the queue.
   * Initiate a set to keep track of the bikes that have been assigned.
   * initiate a result array and fill it with -1. (unassigned)
   * poll every possible pair from the priority queue and check if the person already got his bike or the bike has been assigned.
   * early exist on every people got their bike.
   */

  public int[] assignBikes(int[][] workers, int[][] bikes) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {

      int result = o1[0] - o2[0];
      if (result == 0) {
        if (o1[1] - o2[1] == 0) {
          return o1[2] - o2[2];
        }
        return o1[1] - o2[1];
      }
      return result;
    });

    for (int i = 0; i < workers.length; i++) {

      for (int j = 0; j < bikes.length; j++) {
        int distance = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
        pq.offer(new int[] {distance, i, j});

      }
    }

    Set<Integer> assignedBikes = new HashSet<>();
    int [] result = new int[workers.length];
    Arrays.fill(result, -1);

    while (assignedBikes.size() < workers.length) {
      int [] bikeWorkerPair = pq.poll();

      if (result[bikeWorkerPair[1]] == -1
          && !assignedBikes.contains(bikeWorkerPair[2])) {
        result[bikeWorkerPair[1]] = bikeWorkerPair[2];
        assignedBikes.add(bikeWorkerPair[2]);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    CampusBikes campusBikes =  new CampusBikes();
    int [] [] workers =   {
        {0,0},
        {2,1}
    };

    int [] [] bikes = {
        {1, 2},
        {3, 3}
    };
    int [] result = campusBikes.assignBikes(workers, bikes);
    System.out.println(Arrays.toString(result));
  }



}
