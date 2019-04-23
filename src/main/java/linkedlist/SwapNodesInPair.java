package linkedlist;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 *
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPair {
  public ListNode swapPairsRecursiveSolution(ListNode head) {
    if (head == null) return null;
    if (head.next == null) return head;
    ListNode tmp = head.next.next;
    ListNode newHead = head.next;
    head.next.next = head;
    head.next = swapPairsRecursiveSolution(tmp);
    return newHead;
  }


}
