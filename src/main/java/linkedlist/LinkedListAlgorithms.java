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

    public static void main(String args[])
    {

    }

}
