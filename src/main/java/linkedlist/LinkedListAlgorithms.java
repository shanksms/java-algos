package linkedlist;

import java.util.List;

public class LinkedListAlgorithms {


    public static boolean detectLoop(LinkedList llist) {
        LinkedListNode slow = llist.getHead();
        LinkedListNode fast = llist.getHead();
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

    public LinkedListNode addAtASpecificPosition(int position, LinkedListNode head, int data) {

        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode current = head;
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

    public LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {
        //Dummy node is created for edge case where we have to remove head node;
        //[1] linked list
        //1 position from end
        LinkedListNode dummy = new LinkedListNode(0);
        dummy.next = head;
        LinkedListNode fast = dummy;
        LinkedListNode slow = dummy;
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
