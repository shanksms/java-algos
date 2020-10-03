package coursera.algorithms.algorithmtoolbox.divideandconquer;

import java.util.*;

/**
 * This is quite a bit late, but maybe it will save someone some time:
 *
 * additional array b is used as a temporary storage for elements that you use during merge procedure -
 * copy values from left idx to right idx to this additional array b and change the values in the original freely with values from the b without
 * worrying about invalid data in the original array at any point during the procedure;
 *
 * there is no overlap since, as it was metioned earlier, the right index is exclusive, which is why original call the the method uses indices [0, a.length).
 * https://www.youtube.com/watch?v=I6ygiW8xN7Y&list=PLXFMmlk03Dt7Q0xr1PIAriY5623cKiH7V&index=15
 * 
 */

public class Inversions {

  private static long getNumberOfInversions(int[] a, int[] b, int left, int right) {


    return mergeSortAndCount(a, left, right - 1);
  }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] b = new int[n];
    System.out.println(getNumberOfInversions(a, b, 0, a.length));
  }
  private static int mergeAndCount(int[] arr, int l, int m, int r)
  {

    // Left subarray
    int[] left = Arrays.copyOfRange(arr, l, m + 1);

    // Right subarray
    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

    int i = 0, j = 0, k = l, swaps = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        arr[k++] = left[i++];
      else {
        arr[k++] = right[j++];
        swaps += (m + 1) - (l + i);
      }
    }
    return swaps;
  }

  // Merge sort function
  private static int mergeSortAndCount(int[] arr, int l, int r)
  {

    // Keeps track of the inversion count at a
    // particular node of the recursion tree
    int count = 0;

    if (l < r) {
      int m = (l + r) / 2;

      // Total inversion count = left subarray count
      // + right subarray count + merge count

      // Left subarray count
      count += mergeSortAndCount(arr, l, m);

      // Right subarray count
      count += mergeSortAndCount(arr, m + 1, r);

      // Merge count
      count += mergeAndCount(arr, l, m, r);
    }

    return count;
  }


}