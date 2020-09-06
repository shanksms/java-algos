package cookbook.functional.programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * cat line.txt | sort | uniq | wc -l
 *
 */
public class WordCount {

  public void wordCount() throws IOException {

    String path = "C:\\Users\\shashaank\\IdeaProjects\\java-algos\\src\\main\\java\\cookbook\\functional\\programming\\words.txt";
    Map<String, Long> wordCountMap = Files.lines(Paths.get(path))
        .flatMap(line -> Arrays.stream(line.split(" +")))
        .collect(Collectors.groupingBy(s -> s.toLowerCase(), Collectors.counting()));
    List<String> top = wordCountMap.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
        .map(entry -> entry.getKey())
        .limit(1)
        .collect(Collectors.toList());
    System.out.println(top);
  }

  public static void main(String[] args) throws  IOException{
    new WordCount().wordCount();
  }



}
