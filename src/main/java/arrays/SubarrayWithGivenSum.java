package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubarrayWithGivenSum {

  public static void main(String[] args) {

  }

  public List<Integer> maxSumSubArray(int [] input, int sum) {
    int currentSum = 0;
    LinkedList<Integer> result = new LinkedList<>();
    for (int i = 0; i < input.length; i++) {

      if (currentSum == sum) {
        return result;
      } else if (currentSum < sum) {
        currentSum += input[i];
        result.add(i);
      } else {
        int j = 0;
        while (currentSum > sum) {
          currentSum -= input[ result.removeFirst()];
          j++;

        }

      }

    }


    return result;
  }


}
