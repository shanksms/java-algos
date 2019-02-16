package queue;

import lombok.AllArgsConstructor;
import lombok.Data;

public class QueueClass <T> {
    private QueueNode<T> first;
    private QueueNode<T> last;



    @Data
    @AllArgsConstructor
    private class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

    }

    public void add(T data) {
        QueueNode<T> node = new QueueNode<T>(data, null);
        if (last != null) {
            last.next = node;
            last = node;
            return;
        }
        //if first equals null that means queue is empty
        first = node;
        last = first;

    }

    public T remove() {
        if (first == null) {
            throw new EmptyQueueException();
        }

        T toReturn = last.data;
        first = first.next;
        //if first becomes null, that means queue is not empty. So make last null as well
        if (first == null) {
            last = null;
        }
        return  toReturn;
    }

}
