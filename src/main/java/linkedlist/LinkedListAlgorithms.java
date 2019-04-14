package linkedlist;

public class LinkedListAlgorithms {


    public static boolean detectLoop(LinkedList llist) {
        ListNode slow = llist.getHead();
        ListNode fast = llist.getHead();
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

   // public static LinkedList reverse(LinkedList llist) {

    //}

    public static void testDetectLoop() {
        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.getHead().next.next.next.next = llist.getHead();

        System.out.println(detectLoop(llist));
    }

    public ListNode addAtASpecificPosition(int position, ListNode head, int data) {

        ListNode node = new ListNode(data);
        ListNode current = head;
        if (head == null) {
            return node;
        }

        while (position != 1 && current != null) {
            current = current.next;
        }

        node.next = current.next;
        current.next = node;

        return head;

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Dummy node is created for edge case where we have to remove head node;
        //[1] linked list
        //1 position from end
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int i = 0;
        for (; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }
    public static void main(String args[])
    {



    }

}
