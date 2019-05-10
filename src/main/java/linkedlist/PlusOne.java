package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-negative integer represented as non-empty a singly linked list of digits, plus one to the integer.
 *
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * Example :
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 */
public class PlusOne {

  public ListNode plusOne_approach1(ListNode head) {
    List<Integer> ls = new ArrayList<>();
    while (head != null) {
      ls.add(head.val);
      head = head.next;
    }
    Collections.reverse(ls);

    int n = ls.size();
    int c = (ls.get(0) + 1) / 10;
    int add = (ls.get(0) + 1 ) % 10;
    ls.set(0, add);
    int i = 1;

    while (i < n && c != 0) {
      int tmp = ls.get(i);
      add = (tmp + c ) % 10;
      c = (tmp + c) / 10;
      ls.set(i, add);
      i++;
    }

    if (c != 0) ls.add(c);


    ListNode result = null;
    for (int element : ls) {
      ListNode node = new ListNode(element);
      node.next = result;
      result = node;
    }

    return result;


  }

  /**
   * Better implementation
   * @param head
   * @return
   */
  public ListNode plusOne_approach2(ListNode head) {
    //this is to handle number like 9999
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode n1 = dummy;
    ListNode n2 = dummy;
    while (n2 != null) {
      if (n2.val != 9) n1 = n2;
      n2 = n2.next;

    }
    //n1 will point to last non nine number
    n1.val += 1;
    n1 = n1.next;
    while(n1 != null) {
      n1.val = 0;
      n1 = n1.next;
    }

    if (dummy.val == 0) dummy = dummy.next;

    return dummy;
  }

}
