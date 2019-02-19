package linkedlist;

import lombok.Data;

@Data
public class LinkedList {

    private LinkedListNode head;

    //adds to the head of node
    public void push(int data) {
        LinkedListNode node = new LinkedListNode(data);

        node.next = head;
        head = node;

    }




}
