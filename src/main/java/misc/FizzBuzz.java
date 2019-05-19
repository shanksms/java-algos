package misc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

  public List<String> fizzBuzz(int n) {
    //System.out.println(IntStream.range(1, n + 1).boxed().collect(Collectors.toList()));
    return IntStream.range(1, n +1).mapToObj(e -> decode(e)).collect(Collectors.toList());
  }

  private String decode(Integer e) {
    System.out.println(e);
    if (e % 3 == 0 && e % 5 == 0) return "FizzBuzz";
    else if (e % 3 == 0) return "Fizz";
    else if (e % 5 == 0) return "Buzz";
    else return e +"";
  }

  public static void main(String[] args) {
    System.out.println(new FizzBuzz().fizzBuzz(15));
  }

}
