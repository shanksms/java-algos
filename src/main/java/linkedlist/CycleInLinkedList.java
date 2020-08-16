package linkedlist;

public class CycleInLinkedList {

  public boolean isCyclic(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        return true;
      }

    }

    return false;
  }

  public int lengthOfCycle(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        //cycle exist

        int len = 0;
        do {
          len++;
          fast = fast.next;

        }while (fast != slow);

        return len;

      }

    }


    return 0;
  }

  public ListNode startNodeOfCycle(ListNode head) {


    return null;
  }

}
