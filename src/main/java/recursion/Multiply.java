package recursion;

public class Multiply {

  public int multiply(int a, int b) {
    if (a == 0 || b == 0) return 0;
    if (a == 1) return b;

    return b + multiply(a - 1, b);
  }

}
