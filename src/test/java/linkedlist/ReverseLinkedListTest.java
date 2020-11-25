package linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {
  private ReverseLinkedList reverseLinkedList;

  @Before
  public void setUp() throws Exception {
    reverseLinkedList = new ReverseLinkedList();
  }

  @Test
  public void reverseListRecursive() {
    ListNode l1 = new ListNode(3);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(1);

    l2.next = l1;
    l3.next = l2;

    reverseLinkedList.reverseListRecursive(l3);
  }
}