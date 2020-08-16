package linkedlist;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

public class CycleInLinkedListTest {
  private CycleInLinkedList cycleInLinkedList;

  @Before
  public void setUp() throws Exception {
    cycleInLinkedList = new CycleInLinkedList();
  }

  @Test
  public void isCyclic() {
    ListNode head1 =  new ListNode(1);

    ListNode head2 =  new ListNode(1);
    head2.next = head2;

    MatcherAssert.assertThat(cycleInLinkedList.isCyclic(head1), CoreMatchers.equalTo(false));
    MatcherAssert.assertThat(cycleInLinkedList.isCyclic(head2), CoreMatchers.equalTo(true));
    MatcherAssert.assertThat(cycleInLinkedList.isCyclic(null), CoreMatchers.equalTo(false));


  }

  @Test
  public void lengthOfCycle() {
    /**
     * 1 --> 2 --
     * |         |
     * |         |
     *  ---------
     *  here length of cycle is 2
     */
    ListNode head =  new ListNode(1);
    ListNode node = new ListNode(2);
    head.next = node;
    node.next = head;
    MatcherAssert.assertThat(cycleInLinkedList.lengthOfCycle(head), CoreMatchers.equalTo(2));

  }
}