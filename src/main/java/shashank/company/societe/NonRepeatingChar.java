package shashank.company.societe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingChar {

  public static String firstNonRepeatingLetter( String str ) {
    boolean [] caseArr = new boolean[str.length()];

    Map<Character, Integer> map = new LinkedHashMap<>();
    char [] cA = str.toCharArray();
    for (int i = 0; i < str.toCharArray().length; i++) {
      map.put(Character.toLowerCase(cA[i]), map.getOrDefault(Character.toLowerCase(cA[i]), 0) + 1);
      caseArr[i] = Character.isUpperCase(cA[i]);
    }

    Character result = null;

    for (Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        result = entry.getKey();
        break;
      }

    }

    for (int i = 0; i < cA.length; i++) {
      if (result != null && Character.toLowerCase(cA[i])  == result) {
        if (caseArr[i]) {
          result = Character.toUpperCase(result);
        }
      }
    }

    return result == null ? "" : Character.toString(result);

  }

  static  class CharCase {
    char ch;
    boolean isUpperCase;
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeatingLetter("sstt"));
  }

}
