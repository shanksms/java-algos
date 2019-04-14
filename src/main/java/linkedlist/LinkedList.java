package linkedlist;

import lombok.Data;

@Data
public class LinkedList {

    private ListNode head;

    //adds to the head of node
    public void push(int data) {
        ListNode node = new ListNode(data);

        node.next = head;
        head = node;

    }




}
