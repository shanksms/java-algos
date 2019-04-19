package linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists {

  public ListNode mergeKLists(ListNode[] lists) {
    if (lists != null && lists.length == 0) return null;

    ListNode head = new ListNode(0);
    ListNode current = head;
    PriorityQueue<ListNode> pq =
        new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

    for (ListNode node : lists) {
      if (node != null)  pq.add(node);
    }

    while (!pq.isEmpty()) {
      ListNode node = pq.poll();
      current.next =  node;
      current = node;
      if (current.next != null) {
        pq.add(current.next);
      }

    }
    return head.next;
  }
}
