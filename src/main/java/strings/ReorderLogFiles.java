package strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/reorder-data-in-log-files/discuss/193872/Java-Nothing-Fancy-15-lines-5ms-all-clear.
 * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
 * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 */
public class ReorderLogFiles {

  public String [] reorderLogFiles(String [] logs) {

    Arrays.sort(logs, (o1, o2) -> {
      String[] split1 = o1.split(" ", 2);
      String[] split2 = o2.split(" ", 2);

      boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
      boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

      if (!isDigit1 && !isDigit2) {
        int cmpResult = split1[1].compareTo(split2[1]);
        if (cmpResult == 0) {
          return split1[0].compareTo(split2[0]);
        } else {
          return cmpResult;
        }
      } else if (isDigit1 && !isDigit2) {
        return 1;
      } else if (!isDigit1 && isDigit2) {
        return -1;
      } else {
        return 0;
      }
    });

    return logs;

  }
}
