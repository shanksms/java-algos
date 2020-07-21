package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExamples {

  public static void main(String[] args) {
    System.out.println(new CollectorsExamples().calculateWordFrequency(Arrays.asList("Bangalore", "Chennai", "Bangalore")));
  }
  private  Map<String, Integer> calculateWordFrequency(List<String> words) {

    return words.stream().collect(Collectors.groupingBy(s -> s, Collectors.summingInt( s -> 1)));
  }

}
