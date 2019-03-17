package heap;

import java.util.PriorityQueue;

public class KthLargestelementInArray {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargestelementInArray(int [] nums, int k) {
        this.pq = new PriorityQueue<>();
        this.k = k;
        for (int num : nums) {
            pq.offer(num);
        }
    }

    /*
    ** this method adds an element and then returns the kth largest element in the queue
     */
    public int add(int element) {
        this.pq.offer(element);
        while (k < pq.size()) {
            this.pq.poll();
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        KthLargestelementInArray obj = new KthLargestelementInArray(new int[] {4,5,8,2}, 3);
        System.out.println(obj.add(3));
    }

}
