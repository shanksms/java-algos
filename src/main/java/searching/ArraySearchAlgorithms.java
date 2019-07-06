package searching;

import java.util.List;

public class ArraySearchAlgorithms {

  /**Elements in the array are distinct
   *
   * Following two observations are important to design algorithm based on binary search
   * if m is the mid element index
   * if A[m] > A[n-1] then minimum will be in the range [m, n-1]
   * if A[m] < A[n-1] then minimum will not be in the range [m+1, n-1]
   * A[m] != A[n-1] since all the  elements are distinct
   * @param list
   * @return
   */
  public int searchMinElementInCyclicallySortedArray(List<Integer> list) {
    int left = 0; int right = list.size() - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (list.get(mid) > list.get(right)) {
        //think again why left = mid + 1. because mid index will not be minimum
        left = mid + 1;
      } else {
        //here mid index could hold minimum
        right = mid;
      }
    }

    //loop breaks when left == right
    return left;
  }

  /**
   *
   *
   * @param list . this list is strictly ascending and then strictly descending.
   * @return
   */
  public int searchMaxElementInStrictlyAscendingThenStrictlyDescendingList(List<Integer> list) {
    int left = 0; int right = list.size() - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (list.get(mid) > list.get(right)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    //loop breaks when left == right
    return left;

  }
}
