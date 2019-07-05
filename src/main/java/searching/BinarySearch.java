package searching;

import java.util.List;

public class BinarySearch {

  public int search(int toSearch, List<Integer> list) {

    int start = 0; int end = list.size() - 1;

    while(start <= end) {
      int mid = start + (end - start) / 2;
      if (list.get(mid) == toSearch) {
        return mid;
      } else if (list.get(mid) > toSearch) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

}
