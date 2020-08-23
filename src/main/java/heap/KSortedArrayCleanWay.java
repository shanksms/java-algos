package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArrayCleanWay {

  public List<Integer> mergeSortedArrays(List<List<Integer>> listOfList) {

    List<Iterator<Integer>> iterators = new ArrayList<>();
    for (List<Integer> ls : listOfList) {
      iterators.add(ls.iterator());
    }
    PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.element));

    for (int i = 0; i < iterators.size(); i++) {
      minHeap.offer(new ArrayEntry(iterators.get(i).next(), i));
    }

    List<Integer> result = new ArrayList<>();
    while (!minHeap.isEmpty()) {
      ArrayEntry arrayEntry = minHeap.poll();
      result.add(arrayEntry.element);
      if (iterators.get(arrayEntry.arrayIndex).hasNext()) {
        minHeap.offer(new ArrayEntry(iterators.get(arrayEntry.arrayIndex).next(), arrayEntry.arrayIndex));
      }

    }

    return result;
  }

}
