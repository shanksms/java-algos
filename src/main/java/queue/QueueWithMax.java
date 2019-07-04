package queue;


import com.google.common.base.Preconditions;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueWithMax  <T extends Comparable<T>> {

  private Queue<T> queue;
  private Deque<T> maxCandidates;

  public QueueWithMax(LinkedList<T> queue, Deque<T> maxCandidates) {
    Preconditions.checkNotNull(queue, "queue must be Not null");
    Preconditions.checkNotNull(maxCandidates, "dequeue must  be not null");
    this.queue = queue;
    this.maxCandidates = maxCandidates;
  }

  public void enqueue(T element) {
    Preconditions.checkNotNull(element, "Can not add null element");
    queue.add(element);
    while (!maxCandidates.isEmpty()) {
      if (maxCandidates.getLast().compareTo(element) >= 0) {
        break;
      }
      maxCandidates.removeLast();
    }
    maxCandidates.addLast(element);

  }

  public T dequeue() {
    if (queue.isEmpty()) {
      throw new NoSuchElementException("No element in the queue");
    }
    T element = queue.remove();
    if (element == maxCandidates.getFirst()) maxCandidates.removeFirst();

    return element;
  }

  public T max() {
    if (maxCandidates.isEmpty()) throw new NoSuchElementException();
    return maxCandidates.getFirst();
  }



}
