package coursera.algorithms.algorithmtoolbox;

import java.util.*;

public class GCD {
  private static int gcd(int a, int b) {

    if (b % a == 0) return  a;

    return gcd(b % a, a);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a > b) {
      int c = 0;
      c = a;
      a = b;
      b = c;
    }

    System.out.println(gcd(a, b));
  }
}
