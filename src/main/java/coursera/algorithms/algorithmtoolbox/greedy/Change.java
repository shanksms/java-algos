package coursera.algorithms.algorithmtoolbox.greedy;

import java.util.Scanner;

/**
 * Problem Description Task. The goal in this problem is to find the minimum number of coins needed to change the input value
 *
 * (an integer) into coins with denominations 1, 5, and 10. Input Format. The input consists of a single integer m. Constraints.
 * 1 ≤ m ≤ 103. Output Format. Output the minimum number of coins with denominations 1, 5, 10 that changes m.
 * Sample 1. Input: 2 Output: 2 2 = 1 + 1.
 * Sample 2. Input: 28 Output: 6
 * 28 = 10 + 10 + 5 + 1 + 1 + 1.
 */
public class Change {
  private static int getChange(int m) {
    //write your code here
    int [] coins = {10, 5, 1};
    int n = 0;
    for (int coin : coins) {
      while (m > 0 && m >= coin) {
        m -= coin;
        n++;
      }

    }

    return n;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    System.out.println(getChange(m));

  }
}
