package linkedlist;

public class LinkedList {

    private LinkedListNode head;

    //adds to the head of node
    public void push(int data) {
        LinkedListNode node = new LinkedListNode(data);

        node.next = head;
        head = node;

    }

    public boolean detectLoop() {
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        System.out.println(llist.detectLoop());
    }



}
