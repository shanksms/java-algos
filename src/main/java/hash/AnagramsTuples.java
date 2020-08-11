package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * given a list of words, return the group of anagrams
 */
public class AnagramsTuples {

  public List<List<String>> findAnagrams(List<String> words) {

    Map<String, List<String>> map = new HashMap<>();
    for (String word : words) {
      char [] cArr = word.toCharArray();
      Arrays.sort(cArr);
      String key = new String(cArr);
      map.putIfAbsent(key, new ArrayList<>());
      map.get(key).add(word);
    }
    List<List<String>> result = new ArrayList<>();
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      if (entry.getValue().size() >= 2) {
        result.add(entry.getValue());

      }
    }

    return result;
  }
}
