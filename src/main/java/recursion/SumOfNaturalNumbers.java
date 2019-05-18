package recursion;

public class SumOfNaturalNumbers {

  public int sum(int n) {
    if (n == 0 || n == 1) return n;
    return n + sum(n - 1);
  }

}
