package heap;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class MinimumSum {
  String solve(int[] arr, int n) {
    // code here
    PriorityQueue<Integer> minH = new PriorityQueue<>();
    for (int num : arr) {
      minH.offer(num);
    }
    
    boolean toggle = true;

    BigDecimal num1 = BigDecimal.ZERO;
    BigDecimal num2 = BigDecimal.ZERO;;
    while (!minH.isEmpty()) {
      if (toggle) {
        num1 = num1.multiply(BigDecimal.TEN).add(BigDecimal.valueOf(minH.poll()));
        toggle = false;
      } else {
        num2 = num2.multiply(BigDecimal.TEN).add(BigDecimal.valueOf(minH.poll()));
        toggle = true;
      }

    }

    BigDecimal num = num1.add(num2);
    return num.toString();

  }

}
