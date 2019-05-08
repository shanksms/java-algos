package linkedlist;

import java.util.PriorityQueue;

public class SortLinkedList {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> x - y);
        while (head != null) {
            heap.offer(head.val);
            head = head.next;
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while(!heap.isEmpty()) {
            ListNode n = new ListNode(heap.poll());
            curr.next = n;
            curr = n;
        }
        return dummyHead.next;

    }
}
