package recursion;

public class Factorial {

  public int fact(int num) {
    if (num == 0 || num == 1) return 1;
    return num * fact(num - 1);
  }



}
