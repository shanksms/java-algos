package linkedlist;

public class AddTwoNumbers {

  public ListNode addTwoNumbersApproach1(ListNode l1, ListNode l2) {
    int sum = 0; int carry = 0; ListNode h = new ListNode(-1); ListNode curr = h;
    ListNode n = null;
    ListNode l = null;
    while (l1 != null && l2 != null) {
      n = new ListNode((l1.data + l2.data + carry) % 10);
      carry = (l1.data + l2.data + carry) / 10;
      curr.next = n;
      curr = n;
      l1 = l1.next; l2 = l2.next;
    }
    if (l1 == null && l2 == null && carry != 0) {
      n = new ListNode(carry);
      curr.next = n;
      curr = n;
      carry = 0;
    }
    if (l1 == null) l = l2;
    else l = l1;

    while (l != null) {
      n = new ListNode((l.data + carry) % 10);
      carry = (l.data + carry) / 10;
      curr.next = n;
      curr = n;
      l = l.next;
    }

    if (carry != 0) {
      n = new ListNode(carry);
      curr.next = n;
      curr = n;
    }


    h = h.next;
    return h;

  }

  public ListNode addTwoNumbersApproach2(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode current = head;
    int carry = 0; int sum = 0;
    ListNode node = null;
    while (l1 != null || l2 != null || carry != 0) {
      sum = (l1 == null ? 0 : l1.data) + (l2 == null ? 0 : l2.data) + carry;
      node = new ListNode(sum % 10);
      current.next = node;
      current = node;
      carry = sum / 10;
      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }
    head = head.next;
    return head;
  }



}
