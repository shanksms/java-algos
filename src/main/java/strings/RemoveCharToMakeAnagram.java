package strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveCharToMakeAnagram {

  // function to calculate minimum numbers of characters
// to be removed to make two strings anagram
  public int remAnagram(String str1, String str2)
  {

    Map<Character, Integer> map1 = buildCharCountMap(str1);
    Map<Character, Integer> map2 = buildCharCountMap(str2);

    int result = 0;
    result += getResult(map1, map2);
    result += getResult(map2, map1);


    return result;
  }

  private int getResult(Map<Character, Integer> map1, Map<Character, Integer> map2) {
    int result = 0;
    for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
      Character key = entry.getKey();
      Integer value = entry.getValue();
      if ( map2.get(entry.getKey()) != null) {
        if (value.equals(map2.get(key))) {
          continue;
        } else {
          result += Math.abs(value - map2.get(key));
          //Remove common character. Otherwise algo will double count
          map2.remove(key);
        }
      } else {
        //this is the case of Singtetons
        result += value;
      }
    }
    return result;
  }

  private Map<Character, Integer> buildCharCountMap(String str1) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str1.length(); i++) {
      map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
    }
    return map;
  }

}
