package linkedlist;

/**
 * Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in the linked list.
 *
 * Example 1:
 *
 * Input:
 * LinkedList: 1->2->2->4->5->6->7->8
 * K = 4
 * Output: 4 2 2 1 8 7 6 5
 * Example 2:
 *
 * Input:
 * LinkedList: 1->2->3->4->5
 * K = 3
 * Output: 3 2 1 5 4
 * Your Task:
 * The task is to complete the function reverse() which should reverse the linked list in group of size k and return the head of the modified linked list.
 *
 * Expected Time Complexity : O(n)
 * Expected Auxilliary Space : O(1)
 */
public class ReverseKNodes {

  ListNode reverse(ListNode head, int k)
  {
    ListNode current = head;
    ListNode next = null;
    ListNode prev = null;

    int count = 0;

    /* Reverse first k ListNodes of linked list */
    while (count < k && current != null)
    {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      count++;
    } 
  
       /* next is now a pointer to (k+1)th ListNode  
          Recursively call for the list starting from current. 
          And make rest of the list as next of first ListNode */
    if (next != null)
      head.next = reverse(next, k);

    // prev is now head of input list 
    return prev;
  }



}