package searching;

import java.util.List;

public class FirstOccurrenceOfKInASortedArray {

  public int firstOccurrence(List<Integer> list, int key) {

    int s = 0; int e = list.size() - 1;
    int result = -1;
    while (s <= e) {
      int m = s + (e - s) / 2;

      if (list.get(m) > key) {
        e = m - 1;
      } else if (list.get(m) < key) {
        s = m + 1;
      } else {
        result = m;
        e = m - 1;
      }
    }

    return result;
  }

}
