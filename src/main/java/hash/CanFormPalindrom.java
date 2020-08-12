package hash;

import java.util.HashMap;
import java.util.Map;

public class CanFormPalindrom {

  public boolean canFormPalindrom(String strToCheck) {

    Map<Character, Integer>  frequencyCounter = new HashMap<>();

    for (char ch : strToCheck.toCharArray()) {
      frequencyCounter.put(ch, frequencyCounter.getOrDefault(ch, 0) + 1);
    }

    int oddCount = 0;
    for (Map.Entry<Character, Integer> entry : frequencyCounter.entrySet())  {
      if (entry.getValue() % 2 != 0 && ++oddCount > 1) {
        return false;
      }
    }

    return true;
  }



}
