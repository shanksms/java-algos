package searching;

import java.util.List;

public class LastOccurrenceOfKInASortedArray {

  public int lastOccurrence(List<Integer> list, int key) {

    int left = 0; int right = list.size() - 1;
    int result = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (list.get(mid) > key) {
        right = mid - 1;
      } else if (list.get(mid) < key) {
        left = mid + 1;
      } else {
        result = mid;
        left = mid + 1;
      }
    }
    return  result;
  }

}
