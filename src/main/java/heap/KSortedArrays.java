package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArrays {

  public List<Integer> mergeKSortedArrays(int [] [] input, int k) {

    PriorityQueue<ArrayIndexHolder> priorityQueue = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      ArrayIndexHolder arrayIndexHolder = new ArrayIndexHolder(0, input[i]);
      priorityQueue.offer(arrayIndexHolder);
    }
    List<Integer> result = new ArrayList<>();
    while (!priorityQueue.isEmpty()) {
      ArrayIndexHolder arrayIndexHolder = priorityQueue.poll();
      result.add(arrayIndexHolder.getArray()[arrayIndexHolder.getCurrentIndex()]);
      arrayIndexHolder.setCurrentIndex(arrayIndexHolder.getCurrentIndex() + 1);
      if (arrayIndexHolder.getCurrentIndex() < arrayIndexHolder.getArray().length) {
        priorityQueue.offer(arrayIndexHolder);
      }

    }


    return result;
  }

}
class ArrayIndexHolder implements Comparable<ArrayIndexHolder> {
  private int currentIndex;
  private int [] array;

  public int getCurrentIndex() {
    return currentIndex;
  }

  public int[] getArray() {
    return array;
  }

  public ArrayIndexHolder(int currentIndex, int[] array) {
    this.currentIndex = currentIndex;
    this.array = array;
  }

  public void setCurrentIndex(int currentIndex) {
    this.currentIndex = currentIndex;
  }

  @Override
  public int compareTo(ArrayIndexHolder o) {
    if (this.array[currentIndex]== o.array[o.currentIndex])
      return 0;
    else if (this.array[currentIndex] > o.array[o.currentIndex]) {
      return 1;
    } else {
      return -1;
    }

  }
}
