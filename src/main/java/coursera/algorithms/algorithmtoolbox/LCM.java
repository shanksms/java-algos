package coursera.algorithms.algorithmtoolbox;

import java.util.Scanner;

public class LCM {
  private static long lcm(int a, int b) {
    int gcd = Integer.MIN_VALUE;
    if (a > b) {
      gcd = gcd(b, a);
    } else {
      gcd = gcd(a, b);
    }
    long multiplication = (long) a * b;

    return multiplication / gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }

  private static int gcd(int a, int b) {

    if (b % a == 0) return  a;

    return gcd(b % a, a);
  }
}
