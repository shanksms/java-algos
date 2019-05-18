package recursion;

public class GCD {

  public int gcdRecursive(int a, int b) {
    if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }
    if (b % a == 0) return a;
    return gcdRecursive(b % a, a);
  }



}
