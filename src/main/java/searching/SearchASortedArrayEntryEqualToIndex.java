package searching;

import java.util.List;

public class SearchASortedArrayEntryEqualToIndex {

  public int searchEntryEqualToItsIndex(List<Integer> list) {

    int left = 0;
    int right = list.size() - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (list.get(mid) == mid) {
        return mid;
      } else if (list.get(mid) > mid) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return  -1;
  }
}
