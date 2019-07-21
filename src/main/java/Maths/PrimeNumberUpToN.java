package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberUpToN {

  public List<Integer> findAllPrimeNumbers(int number) {

    List<Boolean> result =
        Arrays.stream(new Boolean[number + 1]).map(element -> true).collect(Collectors.toList());

    for (int i = 2; i*i <= number; i++) {
      if (result.get(i)) {
        for (int j = i * i; j <= number; j += i) {
          result.set(j, false);
        }

      }


    }

    List<Integer> finalResult = new ArrayList<>();
    for (int i = 2; i <= number; i++) {
      if (result.get(i)) {
        finalResult.add(i);
      }
    }

    return finalResult;
  }

  public static void main(String[] args) {
    System.out.println(new PrimeNumberUpToN().findAllPrimeNumbers(23));
  }

}
