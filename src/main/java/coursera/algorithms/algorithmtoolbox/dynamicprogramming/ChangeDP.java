package coursera.algorithms.algorithmtoolbox.dynamicprogramming;

import java.util.Scanner;

public class ChangeDP {
  private static int getChange(int m) {
    if (m == 0) return 0;
    //write your code here
    int [] coins = {1, 3, 4};
    int result [] = new int[m + 1];
    result[0] = 0;
    for (int i = 1; i <= m; i++) {
      result[i] = Integer.MAX_VALUE;
        for (int coin : coins) {
          if (i - coin >= 0) {
            result[i] = Math.min(result[i - coin] + 1, result[i]);
          }
        }

    }

    return result[m];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));

  }
}
