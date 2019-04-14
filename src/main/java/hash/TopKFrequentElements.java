package hash;

import lombok.EqualsAndHashCode;

import java.util.*;

/**
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 * Note:
 *
 * You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int num : nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }

       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));
       List<Integer> ls = new ArrayList<>(map.keySet());
       for (int i = 0; i < ls.size(); i++) {
           pq.add(ls.get(i));
           if (pq.size() > k) {
               pq.poll();
           }
       }


       return new ArrayList<>(pq);
    }

    public static void main(String[] args) {
        System.out.println(new TopKFrequentElements().topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    }
}

