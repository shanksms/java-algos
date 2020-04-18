package heap;

import java.util.PriorityQueue;

public class KthLargestElement {

  long thirdLargest(Long a[])
  {
    // Your code here
    if (a.length < 3) return -1;
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for (int i = 0; i < a.length; i++) {
      pq.offer(a[i]);
      while (pq.size() > 3) {
        pq.remove();
      }
    }
    return pq.peek();


  }
}
