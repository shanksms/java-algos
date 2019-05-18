package heap;

import java.util.PriorityQueue;

public class KClosestsPointToOrigin {

  public int[][] kClosest(int[][] points, int K) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] * y[0] + y[1] * y[1] - x[0] * x[0] - x[1] * x[1]);
    for (int[] p : points) {
      pq.offer(p);
      if (pq.size() > K) { pq.poll(); } // poll out the farthest among the K + 1 points.
    }
    int[][] ans = new int[K][2];
    while (K-- > 0) { ans[K] = pq.poll(); }
    return ans;
  }

}
