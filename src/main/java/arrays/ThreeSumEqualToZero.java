package arrays;


import java.util.Arrays;

public class ThreeSumEqualToZero {

  public int solution(int [] array) {

    Arrays.sort(array);
    int result = 0;

    for (int i = 0; i < array.length - 2; i++) {
      int l = i + 1;
      int r = array.length - 1;
      while (l < r) {
        int a = -array[i];
        int b = array[l] + array[r];
        if (b > a) {
          r--;
        } else if (b < a) {
          l++;
        } else {
          result++;
          l++;r--;
        }
      }
    }

    return result;
  }

}
