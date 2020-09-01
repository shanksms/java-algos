package shashank.company.societe;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public static String fizzBuzz( Integer n ) {
    if (n < 1) return "Invalid";
    StringBuilder result = new StringBuilder();
    List<String> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        list.add("FizzBuzz");
      } else if (i % 5 == 0) {
        list.add("Buzz");
      } else if (i % 3 == 0 ) {
        list.add("Fizz");
      } else {
        list.add("" + i);
      }

    }

    return String.join("\n", list);
  }

  public static void main(String[] args) {
    System.out.println(fizzBuzz(200));
  }

}
